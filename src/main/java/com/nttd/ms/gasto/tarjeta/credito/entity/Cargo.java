package com.nttd.ms.gasto.tarjeta.credito.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@MongoEntity(collection = "tarjeta_credito_cargo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cargo {

    private ObjectId id;

    private String numeroCuenta;

    private Integer cuotasAPagar;

    private Integer cuotasPagadas;

    private Double montoCargado;

    private Double montoAPagar;

    private LocalDate fecha;

    private String descripcion;
}
