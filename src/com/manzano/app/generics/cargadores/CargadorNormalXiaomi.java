package com.manzano.app.generics.cargadores;

import com.manzano.app.generics.celulares.CelularSamsung;
import com.manzano.app.generics.celulares.CelularXiaomi;

public class CargadorNormalXiaomi implements IXiaomiCargador{

    @Override
    public void cargar(CelularXiaomi celular) {
            System.out.println("Soy un cargador Xiaomi de carga normal y la capacidad del cargador es de 45 watts");
            System.out.println("Estoy cargando un celular Xiaomi");
            System.out.println("Tiempo de carga: " + celular.getCapacidadBateria() * 2.11);
            System.out.println("--------------");
    }
}
