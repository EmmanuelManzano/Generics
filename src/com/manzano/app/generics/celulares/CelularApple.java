package com.manzano.app.generics.celulares;

import com.manzano.app.generics.enums.Color;

public class CelularApple {

    // ATRIBUTOS

    private String modelo;
    private String imei;
    private Float memoriaRam;
    private Float memoriaRom;
    private boolean botonSilencioEstado;
    private Float capacidadBateria;
    private Color color;


//    METODOS

    public void realizarLlamada(){
        System.out.println("soy un celular apple y hago una llamada");
    }



//    GETTERS AND SETTERS


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Float getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Float memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Float getMemoriaRom() {
        return memoriaRom;
    }

    public void setMemoriaRom(Float memoriaRom) {
        this.memoriaRom = memoriaRom;
    }

    public boolean isBotonSilencioEstado() {
        return botonSilencioEstado;
    }

    public void setBotonSilencioEstado(boolean botonSilencioEstado) {
        this.botonSilencioEstado = botonSilencioEstado;
    }

    public Float getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(Float capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
