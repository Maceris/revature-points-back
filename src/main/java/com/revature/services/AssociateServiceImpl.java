package com.revature.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.entities.Associate;
import com.revature.entities.Purchase;
import com.revature.repositories.AssociateRepository;

@Component
public class AssociateServiceImpl implements AssociateService {
	
	@Autowired
	AssociateRepository ar;

	@Override
	public Associate createAssociate(Associate associate) {
		associate = ar.save(associate);
		return associate;
	}

	@Override
	public Associate getAssociateById(int id) {
		Associate associate = ar.findById(id).get();
		return associate;
	}

	@Override
	public Associate getAssociateByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Associate getTopAssociate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Associate> getAssociatesAbovePointValue(int pointValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Associate> getAllAssociates() {
		Set<Associate> associates = new HashSet<Associate>((Collection<? extends Associate>) ar.findAll());
		return associates;
	}

	@Override
	public Associate updateAssociate(Associate associate) {
		associate = ar.save(associate);
		return associate;
	}

	@Override
	public boolean deleteAssociate(Associate associate) {
		try {
			ar.delete(associate);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public Set<Associate> getAllAssociatesByTrainerId(int id) {
		Set<Associate> associates = new HashSet<Associate>((Collection<? extends Associate>) ar.findByTrainerId(id));
		return associates;
	}
}
