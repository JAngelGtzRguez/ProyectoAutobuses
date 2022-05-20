package com.autobuses.buscame;

public class Autobus {
    private int id;
    private String ruta;
    private String empresa;
    private String conductor;
    private String placa;
    
    public Autobus()
    {
        this.id = 0;
        this.ruta = "";
        this.empresa = "";
        this.conductor = "";
        this.placa = "";
    }
    public Autobus(int id, String ruta, String empresa, String conductor, String placa) 
    {
        this.id = id;
        this.ruta = ruta;
        this.empresa = empresa;
        this.conductor = conductor;
        this.placa = placa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getConductor() {
        return conductor;
    }
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
}
