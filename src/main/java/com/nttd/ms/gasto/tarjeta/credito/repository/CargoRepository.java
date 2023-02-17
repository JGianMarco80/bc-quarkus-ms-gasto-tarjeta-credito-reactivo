package com.nttd.ms.gasto.tarjeta.credito.repository;

import com.nttd.ms.gasto.tarjeta.credito.entity.Cargo;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CargoRepository implements PanacheMongoRepository<Cargo> {
}
