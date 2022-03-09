package br.com.ws.cursomc.services;

import br.com.ws.cursomc.domain.Pedido;
import br.com.ws.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido buscar(Long id){
        return pedidoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(
                "Pedido com id: " + id + "não foi encontrado no sistema" +
                        "Classe: " + Pedido.class.getName()
        ));
    }
}
