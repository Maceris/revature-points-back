package com.revature.services;

import java.util.Set;

import com.revature.entities.Associate;

public interface AssociateService {
	// Create
		Associate createAssociate(Associate associate);
		
		// Read
		Associate getAssociateById(int id);
		Associate getAssociateByName(String name);
		Associate getTopAssociate();
		Set<Associate> getAssociatesAbovePointValue(int pointValue);
		Set<Associate> getAllAssociates();
		Set<Associate> getAllAssociatesByTrainerId(int id);
		
		// Update
		Associate updateAssociate(Associate associate);
		
		// Delete
		boolean deleteAssociate(Associate associate);
}
