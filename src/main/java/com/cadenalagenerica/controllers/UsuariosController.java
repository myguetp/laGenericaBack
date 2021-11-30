package com.cadenalagenerica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cadenalagenerica.models.UsuariosDTO;
import com.cadenalagenerica.repositories.IUsuariosDAO;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/usuarios")
public class UsuariosController {

	@Autowired
	private IUsuariosDAO repository;
	
	@GetMapping("/listar/{u}")
	public UsuariosDTO listarusuario(@PathVariable("u") String u) {
		return repository.findByUsuario(u);
	}

	@PostMapping("/create")
	public void create(@RequestBody UsuariosDTO usuario) {
		repository.save(usuario);
	}

	@GetMapping("/read")
	public List<UsuariosDTO> readAll() {
		return repository.findAll();
	}
	
	@GetMapping("/read/{id}")
	public Optional<UsuariosDTO> readId(@PathVariable("id") Integer id){
		return repository.findById(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody UsuariosDTO usuario) {
		repository.save(usuario);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
		
}