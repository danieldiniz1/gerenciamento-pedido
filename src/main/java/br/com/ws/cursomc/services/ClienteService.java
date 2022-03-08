package br.com.ws.cursomc.services;

import br.com.ws.cursomc.domain.Categoria;
import br.com.ws.cursomc.domain.Cliente;
import br.com.ws.cursomc.repositories.ClienteRepository;
import br.com.ws.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente buscarPorId(Long id){
        return clienteRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id:" + id + ", Tipo: " + Categoria.class.getName()));
    }
}
