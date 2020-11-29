package com.josemiguel.prosthesisapp.ServicioWeb;


import com.josemiguel.prosthesisapp.Modelo.*;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface ServiceWeb {

    @GET("ClientesAll.php")
    Call<ClientesAll> listClientes(@QueryMap Map<String, String> params);

    @GET("ClientesID.php")
    Call<ClientesAll> listClienteiD(@QueryMap Map<String, String> params);


}
