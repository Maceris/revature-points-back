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
	
	// Create
	@RequestMapping(value = "/associates", method = RequestMethod.POST)
	public Associate createAssociate(@RequestBody Associate associate) {
		associate = as.createAssociate(associate);
		return associate;
	}
	
	// Read
	@RequestMapping(value = "/associates/:{id}", method = RequestMethod.GET)
	public Associate getAssociateById(@PathVariable int id) {
		Associate associate = as.getAssociateById(id);
		return associate;
	}
	
	@RequestMapping(value = "/associates?t_id={id}", method = RequestMethod.GET)
	public Set<Associate> getAssociatesByTrainerId(@PathVariable int id) {
		Set<Associate> associates = as.getAllAssociatesByTrainerId(id);
		return associates;
	}
	
	// Update
	@RequestMapping(value = "/associates/:{id}", method = RequestMethod.PUT)
	public Associate updateAssociateById(@RequestBody Associate associate) {
		associate = as.updateAssociate(associate);
		return associate;
	}
	
	// Delete
}
