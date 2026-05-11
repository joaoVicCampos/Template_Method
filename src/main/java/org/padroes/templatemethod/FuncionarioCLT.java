package org.padroes.templatemethod;

/**
 * Funcionário CLT: sofre desconto de INSS (11%) e IRRF (15%).
 */
public class FuncionarioCLT extends Funcionario {

    private static final double ALIQUOTA_INSS = 0.11;
    private static final double ALIQUOTA_IRRF = 0.15;

    @Override
    protected double calcularDescontos() {
        double inss = this.getSalarioBruto() * ALIQUOTA_INSS;
        double irrf = this.getSalarioBruto() * ALIQUOTA_IRRF;
        return inss + irrf;
    }

    @Override
    public String getTipo() {
        return "FuncionarioCLT";
    }
}

