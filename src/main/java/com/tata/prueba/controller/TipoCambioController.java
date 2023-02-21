package com.tata.prueba.controller;

import com.tata.prueba.dto.TipoCambioDTO;
import com.tata.prueba.model.TipoCambio;
import com.tata.prueba.request.ActualizarTipoCambioRequest;
import com.tata.prueba.request.ObtenerMontoTipoCambioRequest;
import com.tata.prueba.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tipo-cambio/v0")
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @PostMapping("/tipo-cambio/obtener-monto")
    public ResponseEntity<?> obtenerMontoTipoCambio(
            @Valid @RequestBody ObtenerMontoTipoCambioRequest request) {

        TipoCambioDTO response = tipoCambioService.obtenerMontoTipoCambio(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/tipo-cambio/{id}")
    public ResponseEntity<?> actualizarValorTipoCambio(
            @PathVariable Integer id,
            @Valid @RequestBody ActualizarTipoCambioRequest request) {

        TipoCambio response = tipoCambioService.actualizarValorTipoCambio(id, request);
        if (response == null) {
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/tipo-cambio")
    public ResponseEntity<?> listarTipoDeCambio() {

        List<TipoCambio> response = tipoCambioService.listarTodos();

        if (CollectionUtils.isEmpty(response)) {
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
