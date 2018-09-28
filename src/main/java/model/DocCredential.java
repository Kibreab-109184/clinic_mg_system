package model;

import deo.CredentialDeo;

import java.util.Map;
import java.util.Objects;

public class DocCredential {

    private String username;
    private String password;

    public DocCredential(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static String verifiy_user(DocCredential docCredential) {
        Map<String, DocCredential> credentialList = CredentialDeo.getUsers();

        for (String key: credentialList.keySet()){
            if(docCredential.equals(credentialList.get(key))){
                return key;
            }
        }
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocCredential that = (DocCredential) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
