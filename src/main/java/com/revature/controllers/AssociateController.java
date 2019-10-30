package com.revature.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Associate;
import com.revature.entities.Trainer;
import com.revature.services.AssociateService;
import com.revature.services.TrainerService;

@Component
@RestController
public class AssociateController {
	
	@Autowired
	AssociateService as;
	
	// 			CREATE
	// Create new associate
	@RequestMapping(value = "/associates", method = RequestMethod.POST)
	public Associate createAssociate(@RequestBody Associate associate) {
		associate = as.createAssociate(associate);
		return associate;
	}
	
	// 			READ
	// Get associate by id
	@RequestMapping(value = "/associates/:{id}", method = RequestMethod.GET)
	public Associate getAssociateById(@PathVariable int id) {
		Associate associate = as.getAssociateById(id);
		return associate;
	}
	
	// Login associate
	
	// Get all associates by trainer id
	@RequestMapping(value = "/associates?t_id={id}", method = RequestMethod.GET)
	public Set<Associate> getAssociatesByTrainerId(@PathVariable int id) {
		Set<Associate> associates = as.getAllAssociatesByTrainerId(id);
		return associates;
	}
	
	// Get all purchases my by specific associate
	
	// Get purchase by id
	
	// Get all rewards
	
	// Get reward by id
	
	// 			UPDATE
	// Update associate by id
	@RequestMapping(value = "/associates/:{id}", method = RequestMethod.PUT)
	public Associate updateAssociateById(@RequestBody Associate associate) {
		associate = as.updateAssociate(associate);
		return associate;
	}
	
	
	
	// 			DELETE
	// Delete associate by id
}
