package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Contact {


    private String Name;
    private String Email;


     @SerializedName("name")
    public String getName() {
        return Name;
    }

    @SerializedName("email")
    public String getEmail() {
        return Email;
    }
}
