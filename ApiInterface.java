package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    Call<List<Contact>> getContacts();

}
