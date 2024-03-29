package com.cedisropa.pruebaarquitectura.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("count")
    @Expose
    private Integer count;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
