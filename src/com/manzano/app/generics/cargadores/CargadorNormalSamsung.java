package com.manzano.app.generics.cargadores;

import com.manzano.app.generics.celulares.CelularSamsung;

public class CargadorNormalSamsung implements ISamsungCargador{
    @Override
    public void cargar(CelularSamsung celular) {
        System.out.println("Soy un cargador samsung normal y la capacidad del cargador es de 45 watts");
        System.out.println("Estoy cargando un celular samsung");
        System.out.println("Tiempo de carga: " + celular.getCapacidadBateria() * 4.5);
        System.out.println("--------------");

    }
}
