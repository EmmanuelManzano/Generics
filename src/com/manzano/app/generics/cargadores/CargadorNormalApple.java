package com.manzano.app.generics.cargadores;

import com.manzano.app.generics.celulares.CelularApple;

public class CargadorNormalApple implements IAppleCargador{
    @Override
    public void cargar(CelularApple celular) {
        System.out.println("Soy un cargador normal de apple y la capacidad del cargador es de 65 watts");
        System.out.println("Estoy cargando un celular iphone");
        System.out.println("tiemo de carga: " + celular.getCapacidadBateria() * 2.6);
        System.out.println("--------------");
    }
}
