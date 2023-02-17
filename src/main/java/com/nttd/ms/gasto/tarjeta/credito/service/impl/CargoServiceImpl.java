package com.nttd.ms.gasto.tarjeta.credito.service.impl;

import com.nttd.ms.gasto.tarjeta.credito.entity.Cargo;
import com.nttd.ms.gasto.tarjeta.credito.repository.CargoRepository;
import com.nttd.ms.gasto.tarjeta.credito.service.CargoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CargoServiceImpl implements CargoService {

    @Inject
    CargoRepository repository;

    @Override
    public List<Cargo> findByNumeroCuenta(String numeroCuenta) {

        List<Cargo> cargos = repository.listAll();

        List<Cargo> cObtenidos = new ArrayList<>();

        for (Cargo c: cargos) {
            if (c.getNumeroCuenta().equals(numeroCuenta)) {
                cObtenidos.add(c);
            }
        }

        return cObtenidos;

    }
}
