package br.com.ws.cursomc;

import br.com.ws.cursomc.domain.*;
import br.com.ws.cursomc.domain.enums.EstadoPagamento;
import br.com.ws.cursomc.domain.enums.TipoCliente;
import br.com.ws.cursomc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
	ProdutoRepository produtoRepository;

	@Autowired
	EstadoRepository estadoRepository;

	@Autowired
	CidadeRepository cidadeRepository;

	@Autowired
	EnderecoRepository enderecoRepository;

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	PagamentoRepository pagamentoRepository;

	@Autowired
	ItemPedidoRepository itemPedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Adicionando ItemPedido

//		Optional<Pedido> pedido1 = pedidoRepository.findById(1L);
//		Optional<Pedido> pedido2 = pedidoRepository.findById(2L);
//		Optional<Produto> produto1 = produtoRepository.findById(1L);
//		Optional<Produto> produto2 = produtoRepository.findById(2L);
//		Optional<Produto> produto3 = produtoRepository.findById(3L);
//
//		ItemPedido itemPedido1 = new ItemPedido(pedido1.get(),produto1.get(),BigDecimal.ZERO,2,produto1.get().getPreco());
//		ItemPedido itemPedido2 = new ItemPedido(pedido1.get(),produto3.get(),BigDecimal.ZERO,2,produto3.get().getPreco());
//		ItemPedido itemPedido3 = new ItemPedido(pedido2.get(),produto2.get(),new BigDecimal("100.00"),1,produto2.get().getPreco());

//		pedido1.get().getItens().addAll(Arrays.asList(itemPedido1,itemPedido2));
//		pedido2.get().getItens().add(itemPedido3);
//
//		produto1.get().getItens().add(itemPedido1);
//		produto2.get().getItens().add(itemPedido3);
//		produto3.get().getItens().add(itemPedido2);

		itemPedidoRepository.saveAll(Arrays.asList(itemPedido1,itemPedido2,itemPedido3));


//		Adicionando instancias de pedido
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
//		Cliente maria = clienteRepository.getById(1L);
//
//		Pedido pedido1 = new Pedido(null,sdf.parse("30/09/2017 10:45"), maria , enderecoRepository.getById(1L));
//		Pedido pedido2 = new Pedido(null,sdf.parse("10/10/2017 10:45"), maria , enderecoRepository.getById(2L));
//
//		Pagamento pagamento1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO,pedido1,3);
//		pedido1.setPagamento(pagamento1);
//		Pagamento pagamento2 = new PagamentoComBoleto(null,EstadoPagamento.PENDENTE,pedido2,sdf.parse("10/12/2017 23:59"),null);
//		pedido2.setPagamento(pagamento2);
//
//		maria.setPedidos(Arrays.asList(pedido1,pedido2));
//
//		pedidoRepository.saveAll(Arrays.asList(pedido1,pedido2));
//		pagamentoRepository.saveAll(Arrays.asList(pagamento1,pagamento2));
//		clienteRepository.save(maria);



//		Adicionando cliente e endereço
//		Cliente pedro = new Cliente(null,"Pedro", "pedro@email.com","12394565", TipoCliente.PESSOA_FISICA);
//		pedro.getTelefones().addAll(Arrays.asList("123456"));
//
//		Endereco e1 = new Endereco(null, "rua tres","1611","bloco 0852","jardim2","38450854",pedro,cidadeRepository.getById(6L));
//		Endereco e2 = new Endereco(null, "Avenida Matos 23","10543","","centro2","387210025",pedro,cidadeRepository.getById(5L));
//
//		pedro.getEnderecos().addAll(Arrays.asList(e1,e2));
//
//		clienteRepository.save(pedro);
//		enderecoRepository.saveAll(Arrays.asList(e1,e2));

//		instanciando cidades e estados
//		Estado mg = new Estado(null, "Minas Gerais");
//		Estado sp = new Estado(null, "São Paulo");
//
//		Cidade campinas = new Cidade(null,"Campinas",sp);
//		Cidade saoPaulo = new Cidade(null,"São Paulo",sp);
//		Cidade uberlandia = new Cidade(null,"Uberlândia",mg);
//
//		mg.getCidades().addAll(Arrays.asList(uberlandia));
//		mg.getCidades().addAll((Arrays.asList(campinas, saoPaulo)));
//
//		estadoRepository.saveAll(Arrays.asList(mg,sp));
//		cidadeRepository.saveAll(Arrays.asList(campinas, saoPaulo, uberlandia));



//      instanciando produto e categoria;
//		Optional<Produto> p1 = produtoRepository.findById(1L);
//		Optional<Produto> p2 = produtoRepository.findById(2L);
//		Optional<Produto> p3 = produtoRepository.findById(3L);
//
//
//		Optional<Categoria> cat1 = categoriaRepository.findById(1L);
//		Optional<Categoria> cat2 = categoriaRepository.findById(2L);

//		cat1.get().setProdutos(Arrays.asList(p1.get(),p2.get(),p3.get()));
//		cat2.get().setProdutos(Arrays.asList(p2.get()));
//
//		p1.get().setCategorias(Arrays.asList(cat1.get()));
//		p2.get().setCategorias(Arrays.asList(cat1.get(),cat2.get()));
//		p3.get().setCategorias(Arrays.asList(cat1.get()));
//
//		categoriaRepository.saveAll(Arrays.asList(cat1.get(),cat2.get()));
//		produtoRepository.saveAll(Arrays.asList(p1.get(),p2.get(),p3.get()));

	}
}
