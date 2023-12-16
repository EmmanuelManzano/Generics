package com.manzano.app.generics.cargadores;

import com.manzano.app.generics.celulares.CelularSamsung;

public class CargadorRapidoSamsung implements ISamsungCargador{
    @Override
    public void cargar(CelularSamsung celular) {
        System.out.println("Soy un cargador Samsung de carga rapida y la capacidad del cargador es de 85 watts");
        System.out.println("Estoy cargando un celular Samsung");
        System.out.println("Tiempo de carga: " + celular.getCapacidadBateria() * 2.2);
        System.out.println("--------------");
    }
}
