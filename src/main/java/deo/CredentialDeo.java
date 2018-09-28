package deo;

import model.DocCredential;

import java.util.HashMap;

public class CredentialDeo {
   private static HashMap<String,DocCredential> users = new HashMap<>();


static {
        users.put("1001",new DocCredential("1001","c1001"));
        users.put("1002",new DocCredential("1002","c1002"));
        users.put("1003",new DocCredential("1003","c1003"));
        users.put("1004",new DocCredential("1004","c1004"));
        users.put("1005",new DocCredential("1005","c1005"));
        users.put("1006",new DocCredential("1006","c1006"));
        users.put("1007",new DocCredential("1007","c1007"));
        users.put("1008",new DocCredential("1008","c1008"));
        users.put("1009",new DocCredential("1009","c1009"));
        users.put("1010",new DocCredential("1010","c1010"));
        users.put("1011",new DocCredential("1011","c1011"));
        users.put("1012",new DocCredential("1012","c1012"));
        users.put("1013",new DocCredential("1013","c1013"));
        users.put("1014",new DocCredential("1014","c1014"));
        users.put("1015",new DocCredential("1015","c1015"));
    }

    public static HashMap<String, DocCredential> getUsers() {
        return users;
    }

    public static void setUsers(HashMap<String, DocCredential> users) {
        CredentialDeo.users = users;
    }
}
