package com.doug;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Doug on 9/9/16.
 */

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer > {

	public Stock findBySymbol(String symbol);



}
