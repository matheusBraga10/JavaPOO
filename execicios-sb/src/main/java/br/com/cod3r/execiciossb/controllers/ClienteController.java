package br.com.cod3r.execiciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.execiciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
}
