package org.padroes.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioCLTTest {

    @Test
    void deveCalcularSalarioLiquidoComDescontos() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBruto(5000.0);
        // INSS 11% + IRRF 15% = 26% de desconto => liquido = 3700.00
        assertEquals(3700.0, funcionario.calcularSalarioLiquido(), 0.001);
    }

    @Test
    void deveCalcularDescontosCorretamente() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBruto(4000.0);
        // liquido = 4000 - 26% = 2960.00
        assertEquals(2960.0, funcionario.calcularSalarioLiquido(), 0.001);
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setId(1);
        funcionario.setNome("Carlos");
        funcionario.setSalarioBruto(5000.0);
        assertEquals(
            "FuncionarioCLT{id=1, nome='Carlos', salarioBruto=5000,00, salarioLiquido=3700,00}",
            funcionario.getInfo()
        );
    }
}

