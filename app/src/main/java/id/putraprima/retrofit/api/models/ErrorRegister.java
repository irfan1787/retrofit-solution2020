package id.putraprima.retrofit.api.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorRegister {

    @SerializedName("name, email ,password,password_confirmation")
    @Expose
    private List<String> name = null;
    private List<String> email = null;
    private List<String> password = null;
    private List<String> password_confirmation = null;

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getPassword() {
        return password;
    }

    public void setPassword(List<String> password) {
        this.password = password;
    }

    public List<String> getPassword_confirmation() {
        return password_confirmation;
    }

    public void getPassword_confirmation(List<String> password_confirmation) {
        this.password_confirmation = password_confirmation;
    }

    @Override
    public String toString(){
        return "Error {" +
                "name = '"+ name + '\'' +
                "email = '"+ email + '\'' +
                "password = '"+ password + '\'' +
                "password_confirmation = '"+ password_confirmation + '\'' +
                "}"
                ;
    }

}