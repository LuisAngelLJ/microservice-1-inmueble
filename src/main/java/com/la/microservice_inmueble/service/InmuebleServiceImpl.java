package com.la.microservice_inmueble.service;

import com.la.microservice_inmueble.model.Inmueble;
import com.la.microservice_inmueble.repository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService{
    @Autowired
    private InmuebleRepository inmuebleRepository;

    @Override
    public Inmueble saveInmueble(Inmueble inmueble){
        inmueble.setFechaCreacion(LocalDateTime.now());
        return this.inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long inmuebleId) {
        this.inmuebleRepository.deleteById(inmuebleId);
    }

    @Override
    public List<Inmueble> findAllInmueble() {
        return this.inmuebleRepository.findAll();
    }
}
