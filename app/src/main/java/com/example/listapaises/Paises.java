package com.example.listapaises;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Paises {
    private String titulo;
    private String imagen;

    public Paises() {

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setImagen(String imagen) {
        imagen ="http://www.geognos.com/api/en/countries/flag/"+imagen+".png";
        this.imagen = imagen;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getImagen(){
        return imagen;
    }

}
