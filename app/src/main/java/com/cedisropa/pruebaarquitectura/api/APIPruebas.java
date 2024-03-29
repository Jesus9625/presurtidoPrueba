package com.cedisropa.pruebaarquitectura.api;

import com.cedisropa.pruebaarquitectura.entities.StructureResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface APIPruebas {

    @GET("validarSurtidor/{ip}/{numTerminal}/{numArea}/{numSurtidor}")
    Call<StructureResponse<JsonObject>> validarSurtidor(
        @Path("ip") String ip,
        @Path("numTerminal") int numTerminal,
        @Path("numArea") int numArea,
        @Path("numSurtidor") int numSurtidor);
}
