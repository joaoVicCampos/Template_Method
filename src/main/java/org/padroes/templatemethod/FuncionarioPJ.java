package org.padroes.templatemethod;

/**
 * Funcionário PJ: sofre apenas desconto de ISS (6%).
 */
public class FuncionarioPJ extends Funcionario {

    private static final double ALIQUOTA_ISS = 0.06;

    @Override
    protected double calcularDescontos() {
        return this.getSalarioBruto() * ALIQUOTA_ISS;
    }

    @Override
    public String getTipo() {
        return "FuncionarioPJ";
    }
}

