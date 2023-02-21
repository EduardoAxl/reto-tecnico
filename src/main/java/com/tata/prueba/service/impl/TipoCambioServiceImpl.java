package com.tata.prueba.service.impl;

import com.tata.prueba.dto.TipoCambioDTO;
import com.tata.prueba.model.TipoCambio;
import com.tata.prueba.repository.TipoCambioRepository;
import com.tata.prueba.request.ActualizarTipoCambioRequest;
import com.tata.prueba.request.ObtenerMontoTipoCambioRequest;
import com.tata.prueba.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {

    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    @Override
    public List<TipoCambio> listarTodos() {
        return (List<TipoCambio>) tipoCambioRepository.findAll();
    }

    @Override
    public TipoCambioDTO obtenerMontoTipoCambio(ObtenerMontoTipoCambioRequest request) {

        TipoCambio tipoCambioOrigen = tipoCambioRepository.findByAbreviatura(request.getMonedaOrigen());
        TipoCambio tipoCambioDestino = tipoCambioRepository.findByAbreviatura(request.getMonedaDestino());

        TipoCambioDTO tipoCambioDTO = new TipoCambioDTO();
        tipoCambioDTO.setMonto(request.getMonto());
        tipoCambioDTO.setMonedaOrigen(request.getMonedaOrigen());
        tipoCambioDTO.setMonedaDestino(request.getMonedaDestino());

        BigDecimal tipoCambio = tipoCambioDestino.getValor().divide(tipoCambioOrigen.getValor(), 4, RoundingMode.HALF_UP);
        tipoCambioDTO.setTipoCambio(tipoCambio.setScale(4, RoundingMode.HALF_UP));

        BigDecimal montoTipoCambio = tipoCambio.multiply(tipoCambioDTO.getMonto());
        tipoCambioDTO.setMontoTipoCambio(montoTipoCambio.setScale(2, RoundingMode.HALF_UP));

        return tipoCambioDTO;
    }

    @Override
    public TipoCambio actualizarValorTipoCambio(Integer idTipoCambio, ActualizarTipoCambioRequest request) {

        TipoCambio tipoCambio = tipoCambioRepository.findById(idTipoCambio).orElse(null);
        if (tipoCambio == null) {
            return null;
        }
        tipoCambio.setValor(request.getValor());
        return tipoCambioRepository.save(tipoCambio);
    }
}
