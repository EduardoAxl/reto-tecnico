package com.tata.prueba.repository;

import com.tata.prueba.model.TipoCambio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCambioRepository extends CrudRepository<TipoCambio, Integer> {

    TipoCambio findByAbreviatura(String abreviatura);
}
