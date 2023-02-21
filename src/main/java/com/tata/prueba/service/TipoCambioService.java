package com.tata.prueba.service;

import com.tata.prueba.dto.TipoCambioDTO;
import com.tata.prueba.model.TipoCambio;
import com.tata.prueba.request.ActualizarTipoCambioRequest;
import com.tata.prueba.request.ObtenerMontoTipoCambioRequest;

import java.util.List;

public interface TipoCambioService {

    List<TipoCambio> listarTodos();
    TipoCambioDTO obtenerMontoTipoCambio(ObtenerMontoTipoCambioRequest request);
    TipoCambio actualizarValorTipoCambio(Integer idTipoCambio, ActualizarTipoCambioRequest request);

}
