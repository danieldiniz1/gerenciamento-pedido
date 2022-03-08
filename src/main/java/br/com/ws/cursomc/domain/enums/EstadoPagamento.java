package br.com.ws.cursomc.domain.enums;

import net.bytebuddy.implementation.bytecode.Throw;

public enum EstadoPagamento {

    PENDENTE(1, "PAGAMENTO_PENDENTE"),
    QUITADO(2,"PAGAMENTO_QUITADO"),
    CANCELADO(3,"PAGAMENTO_CANCELADO");

    private Integer cod;
    private String descricao;

    EstadoPagamento(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer cod){
        if (cod == null){
            return null;
        }

        for (EstadoPagamento estadoPagamento : EstadoPagamento.values()) {
            if (estadoPagamento.getCod().equals(cod)){
                return estadoPagamento;
            }
        }
        throw new IllegalArgumentException("Código : " + cod + " é inválido, tente novamente!");
    }
}
