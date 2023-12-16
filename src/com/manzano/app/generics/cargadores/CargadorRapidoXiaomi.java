package com.manzano.app.generics.cargadores;

import com.manzano.app.generics.celulares.CelularXiaomi;

public class CargadorRapidoXiaomi implements IXiaomiCargador{
    @Override
    public void cargar(CelularXiaomi celular) {
        System.out.println("Soy un cargador Xiaomi de carga rápida y la capacidad del cargador es de 85 watts");
        System.out.println("Estoy cargando un celular Xiaomi");
        System.out.println("Tiempo de carga: " + celular.getCapacidadBateria() * 1.11);
        System.out.println("--------------");
    }
}
