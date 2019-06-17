package com.turismo.multitour.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turismo.multitour.model.ToursDto;

public interface ToursRepositorio extends MongoRepository<ToursDto, String> {

}
