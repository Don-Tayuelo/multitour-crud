package com.turismo.multitour.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turismo.multitour.model.ToursDto;
import com.turismo.multitour.persistence.ToursRepositorio;

@CrossOrigin
@RestController
@RequestMapping("/multitour")
public class ToursController {

	@Autowired
	private ToursRepositorio toursRepositorio;
	
	@GetMapping("/tours")
	public List<ToursDto> getTours(){
		return toursRepositorio.findAll();
	}
	
	@GetMapping("/tours/{id}")
	public Optional<ToursDto> getTour(@PathVariable(value = "id") String _id) {
		return toursRepositorio.findById(_id);
	}
	
	@PostMapping("/tours")
	public void addTour(@RequestBody ToursDto dto) {
		toursRepositorio.save(dto);
	}
	
	@PutMapping("/tours/edit/{id}")
	public void editTour(@PathVariable(value = "id") String _id, @Valid @RequestBody ToursDto dto) {
		toursRepositorio.findById(_id).map(newTour -> {
			newTour.setTourName(dto.getTourName());
			newTour.setTourDetails(dto.getTourDetails());
			newTour.setTourPrice(dto.getTourPrice());
			return toursRepositorio.save(newTour);
		});
	}
	
	@DeleteMapping("/tours/delete/{id}")
	public void deleteTour(@PathVariable(value = "id") String _id) {
		toursRepositorio.deleteById(_id);
	}
}
