package com.tata.prueba.dto;

import java.math.BigDecimal;

public class TipoCambioDTO {

    private BigDecimal monto;
    private BigDecimal montoTipoCambio;
    private String monedaOrigen;
    private String monedaDestino;
    private BigDecimal tipoCambio;

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMontoTipoCambio() {
        return montoTipoCambio;
    }

    public void setMontoTipoCambio(BigDecimal montoTipoCambio) {
        this.montoTipoCambio = montoTipoCambio;
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

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TipoCambioDTO{");
        sb.append("monto=").append(monto);
        sb.append(", montoTipoCambio=").append(montoTipoCambio);
        sb.append(", monedaOrigen='").append(monedaOrigen).append('\'');
        sb.append(", monedaDestino='").append(monedaDestino).append('\'');
        sb.append(", tipoCambio=").append(tipoCambio);
        sb.append('}');
        return sb.toString();
    }
}
