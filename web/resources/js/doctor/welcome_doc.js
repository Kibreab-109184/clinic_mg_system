$(function () {
    'use strict'
    $('#pat_view').click(display_patients);

    function display_patients() {

        $.get("patients", process_patient_list)
    }

    function process_patient_list(data) {
        $("#tbl_list").css("display", "block");
     data = JSON.parse(data);
    console.log(data)
        data.forEach(docs => {
        // for (let i=0; i<docs.length; i++){

            let td_firstName = $('<td>').text(docs.first_name);
            let td_LastName = $('<td>').text(docs.last_name);
            let td_Email = $('<td>').text(docs.email);
            let td_phone = $('<td>').text(docs.phone_number);

            let tr = $('<tr>').append(td_firstName).append(td_LastName).append(td_Email).append(td_phone);

            $('#data_list').append(tr);
        })

    }
})