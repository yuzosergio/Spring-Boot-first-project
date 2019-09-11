package com.yuzosergio.Cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzosergio.Cursomc.domain.Pedido;
import com.yuzosergio.Cursomc.repositories.PedidoRepository;
import com.yuzosergio.Cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

		@Autowired
		private PedidoRepository repo;
		 
		public Pedido find(Integer id) {
			Optional<Pedido> obj = repo.findById(id);
			
			return obj.orElseThrow(() ->new ObjectNotFoundException("Objeto não encontrado! id: " + id
						+", Tipo: "+ Pedido.class.getName()));
			}
		
		}

