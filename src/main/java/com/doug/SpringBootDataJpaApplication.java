package com.doug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootDataJpaApplication {


	@Autowired
	StockRepository repo;
	//private EntityManager em;

	@RequestMapping("/stocks/{symbol}")
	public Stock stock(@PathVariable("symbol") String symbol) {
		//public List<Stock> stocks(@PathVariable("symbol") String symbol) {
		//return em.createQuery("select s from Stock s").getResultList();
		return repo.findBySymbol(symbol);
	}

	@RequestMapping("/all")
	public List<Stock> stocks() {
		return repo.findAll();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}
}
