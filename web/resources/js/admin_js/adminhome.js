$(function(){
    'use strict'
    // $('#logout').click(log_out_admin)
    //
    // function log_out_admin(){
    //
    // }

    $(".admin").click(getList);

    function getList() {
        // alert( this.value + " is clicked")
        var act = this.value;
        const doc = 'doctors';
        const ser = 'services';

       let admin_home = {action: act};

        if(act === doc){
            $.get("admin_home", {button_action: JSON.stringify(admin_home)}, process_doc_list, "json")

        }else if (act === ser) {
            $.get("admin_home", {button_action: JSON.stringify(admin_home)}, process_ser_list, "json")
        }

    }

    function process_ser_list(data) {
        $('#tbl_list').css("display", "none");
        $('#serv_list').css("display", "block");


        data.forEach(sers => {
            console.log("data recieved from Ajax " + sers.clinicServiceName);

            let td_clinicserviceId = $('<td>').text(sers.clinicserviceId);
            let td_clinicServiceName = $('<td>').text(sers.clinicServiceName);
            let td_description = $('<td>').text(sers.description);
            let td_delete = $('<button id="serdel" id=' + sers.clinicserviceId +'/>').text('Delete').click(delete_service(sers.clinicserviceId));
            let tr = $('<tr>').append(td_clinicserviceId).append(td_clinicServiceName).append(td_description).append(td_delete);

            $('#data_ser_list').append(tr);

        })

    }
    function delete_service(service_id) {

        return function() {
            // alert('hi ' + service_id);
            $("#data_ser_list tr").remove();
            const act = 'delete_service';
            let admin_home = {action: act, id: service_id};
            $.get("admin_home", {button_action: JSON.stringify(admin_home)}, process_ser_list, "json")
        }
    }

    function process_doc_list(data) {
        $('#tbl_list').css("display", "block");
        $('#serv_list').css("display", "none");

        data.forEach(docs => {

            let td_id = $('<td>').text(docs.id);
            let td_firstName = $('<td>').text(docs.first_name);
            let td_LastName = $('<td>').text(docs.last_name);
            let td_Email = $('<td>').text(docs.email);
            let td_phone = $('<td>').text(docs.phone_number);
            let td_delete = $('<button id="docdel" id=' + docs.id +'/>').text('Delete').click(delete_doc(docs.id));
            let tr = $('<tr>').append(td_id).append(td_firstName).append(td_LastName).append(td_Email).append(td_phone).append(td_delete);

            $('#data_list').append(tr);
        })
    }

    function delete_doc(doc_id) {

        return function() {
            // alert('hi ' + service_id);
            $("#data_list tr").remove();
            const act = 'delete_doc';
            let actButton = {action: act, id: doc_id};
            $.get("admin_home", {button_action: JSON.stringify(actButton)}, process_doc_list, "json")
        }
    }


})