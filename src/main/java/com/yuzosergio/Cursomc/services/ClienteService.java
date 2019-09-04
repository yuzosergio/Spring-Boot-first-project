package com.yuzosergio.Cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzosergio.Cursomc.domain.Cliente;
import com.yuzosergio.Cursomc.repositories.ClienteRepository;
import com.yuzosergio.Cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

		@Autowired
		private ClienteRepository repo;
		 
		public Cliente find(Integer id) {
			Optional<Cliente> obj = repo.findById(id);
			
			return obj.orElseThrow(() ->new ObjectNotFoundException("Objeto não encontrado! id: " + id
						+", Tipo: "+ Cliente.class.getName()));
			}
		
		}

