package com.la.microservice_inmueble.service;

import com.la.microservice_inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService{
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmueble();
}
