package com.tata.prueba.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class ActualizarTipoCambioRequest {

    @NotNull
    @Positive
    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ActualizarTipoCambioRequest{");
        sb.append("valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
