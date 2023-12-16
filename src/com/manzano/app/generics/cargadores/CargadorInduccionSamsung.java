package com.manzano.app.generics.cargadores;

import com.manzano.app.generics.celulares.CelularSamsung;

public class CargadorInduccionSamsung implements ISamsungCargador{
    @Override
    public void cargar(CelularSamsung celular) {
        System.out.println("Soy un cargador Samsung de induccion y la capacidad del cargador es de 110 watts");
        System.out.println("Estoy cargando un celular Samsung");
        System.out.println("Tiempo de carga: " + celular.getCapacidadBateria() * .97);
        System.out.println("--------------");
    }
}
