package com.gabrielcamp.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielcamp.workshopmongo.domain.User;
import com.gabrielcamp.workshopmongo.dto.UserDTO;
import com.gabrielcamp.workshopmongo.repository.UserRepository;
import com.gabrielcamp.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Registro não encontrado no Banco de Dados."));
	}
	
	public User insert(UserDTO obj) {
		User res = FromDTO(obj);
		res = repo.save(res);
		return res;
	}

	public static User FromDTO(UserDTO obj) {
		User resp = new User();
		
		resp.setId(obj.getId());
		resp.setName(obj.getName());
		resp.setEmail(obj.getEmail());
		
		return resp;
	}
	
}
