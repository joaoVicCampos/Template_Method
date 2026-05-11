package org.padroes.templatemethod;

/**
 * Estagiário: isento de INSS e IRRF — sem descontos.
 */
public class Estagiario extends Funcionario {

    @Override
    protected double calcularDescontos() {
        return 0.0;
    }

    @Override
    public String getTipo() {
        return "Estagiario";
    }
}

