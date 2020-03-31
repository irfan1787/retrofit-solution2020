package id.putraprima.retrofit.api.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorProfile {

    @SerializedName("name,email")
    @Expose

    private List<String> name = null;
    private List<String> email = null;

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


    @Override
    public String toString(){
        return "Error {" +
                "name = '"+ name + '\'' +
                "email = '"+ email + '\'' +
               "}"
                ;
    }

}