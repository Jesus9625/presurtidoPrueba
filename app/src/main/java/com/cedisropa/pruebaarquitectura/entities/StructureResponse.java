package com.cedisropa.pruebaarquitectura.entities;

import com.cedisropa.pruebaarquitectura.entities.Data;
import com.cedisropa.pruebaarquitectura.entities.Meta;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StructureResponse<T> {
    @SerializedName("meta")
    @Expose
    private Meta meta;

    @SerializedName("data")
    @Expose
    private Data<T> data;

    public Data<T> getData() {
        return data;
    }

    public void setData(Data<T> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
