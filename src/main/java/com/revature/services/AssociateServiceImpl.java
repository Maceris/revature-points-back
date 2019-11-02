package com.revature.services;

import com.revature.entities.Associate;
import com.revature.repositories.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
	public Associate authenticateAssociate(String username, String password) {
		Set<Associate> associates = this.ar.findByUsername(username);
		for (Associate associate : associates) {
			if (associate.getPassword().equals(password)) {
				return associate;
			}
		}
		return null;
	}

	@Override
	public Associate createAssociate(Associate associate) {
		return this.ar.save(associate);
	}

	@Override
	public boolean deleteAssociate(Associate associate) {
		try {
			this.ar.delete(associate);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public Set<Associate> getAllAssociates() {
		Set<Associate> associates = new HashSet<>();
		this.ar.findAll().forEach((elem) -> {
			associates.add(elem);
		});
		return associates;
	}

	@Override
	public Set<Associate> getAllAssociatesByTrainerId(int id) {
		Set<Associate> associates = new HashSet<>(this.ar.findByTrainerId(id));
		return associates;
	}

	@Override
	public Associate getAssociateById(int id) {
		// TODO Deal with the exception when id is not found.
		Associate associate = this.ar.findById(id).get();
		return associate;
	}

	@Override
	public Associate getAssociateByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Associate> getAssociatesAbovePointValue(int pointValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Associate getTopAssociate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Associate updateAssociate(Associate associate) {
		return this.ar.save(associate);
	}
}
