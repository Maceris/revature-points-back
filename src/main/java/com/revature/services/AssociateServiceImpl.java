package com.revature.services;

import com.revature.entities.Associate;
import com.revature.repositories.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * An implementation of the {@link AssociateService}.
 */
@Component
public class AssociateServiceImpl implements AssociateService {

	/**
	 * The associate repository to be injected by Spring.
	 */
	@Autowired
	AssociateRepository ar;

	@Override
	public Associate createAssociate(Associate associate) {
		return ar.save(associate);
	}

	@Override
	public Associate getAssociateById(int id) {
		// TODO Deal with the exception when id is not found.
		Associate associate = ar.findById(id).get();
		return associate;
	}

	@Override
	public Associate authenticateAssociate(String username, String password) {
		Set<Associate> associates = ar.findByUsername(username);
		for (Associate associate : associates) {
			if (associate.getPassword().equals(password)) {
				return associate;
			}
		}
		return null;
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
		Set<Associate> associates =
			new HashSet<>((Collection<? extends Associate>) ar.findAll());
		return associates;
	}

	@Override
	public Associate updateAssociate(Associate associate) {
		return ar.save(associate);
	}

	@Override
	public boolean deleteAssociate(Associate associate) {
		try {
			ar.delete(associate);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public Set<Associate> getAllAssociatesByTrainerId(int id) {
		Set<Associate> associates = new HashSet<>(ar.findByTrainerId(id));
		return associates;
	}
}
