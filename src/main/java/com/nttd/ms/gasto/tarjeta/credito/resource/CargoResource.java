package com.nttd.ms.gasto.tarjeta.credito.resource;

import com.nttd.ms.gasto.tarjeta.credito.entity.Cargo;
import com.nttd.ms.gasto.tarjeta.credito.service.CargoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/tarjeta-credito-cargo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CargoResource {

    @Inject
    CargoService cargoService;

    @GET
    public List<Cargo> findByNumeroCuenta(@QueryParam("numeroCuenta") String numeroCuenta) {
        return cargoService.findByNumeroCuenta(numeroCuenta);
    }
}
