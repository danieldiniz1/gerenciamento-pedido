package br.com.ws.cursomc;

import br.com.ws.cursomc.domain.Categoria;
import br.com.ws.cursomc.domain.Cidade;
import br.com.ws.cursomc.domain.Estado;
import br.com.ws.cursomc.domain.Produto;
import br.com.ws.cursomc.repositories.CategoriaRepository;
import br.com.ws.cursomc.repositories.CidadeRepository;
import br.com.ws.cursomc.repositories.EstadoRepository;
import br.com.ws.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;
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

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



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
