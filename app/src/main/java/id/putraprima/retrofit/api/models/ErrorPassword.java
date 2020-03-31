package id.putraprima.retrofit.api.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorPassword {

    @SerializedName("password,password_confirmation")
    @Expose

    private List<String> password = null;
    private List<String> password_confirmation = null;

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
                "password = '"+ password + '\'' +
                "password_confirmation = '"+ password_confirmation + '\'' +
                "}"
                ;
    }

}