package com.nttd.ms.gasto.tarjeta.credito.service;

import com.nttd.ms.gasto.tarjeta.credito.entity.Cargo;

import java.util.List;

public interface CargoService {

    List<Cargo> findByNumeroCuenta(String numeroCuenta);

}
