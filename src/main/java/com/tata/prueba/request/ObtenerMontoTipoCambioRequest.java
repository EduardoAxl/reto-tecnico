package com.tata.prueba.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class ObtenerMontoTipoCambioRequest {

    @NotNull
    @Positive
    private BigDecimal monto;
    @NotNull
    @NotBlank
    @Size(min = 3, max = 3)
    private String monedaOrigen;
    @NotNull
    @NotBlank
    @Size(min = 3, max = 3)
    private String monedaDestino;

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ObtenerMontoTipoCambioRequest{");
        sb.append("monto=").append(monto);
        sb.append(", monedaOrigen='").append(monedaOrigen).append('\'');
        sb.append(", monedaDestino='").append(monedaDestino).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
