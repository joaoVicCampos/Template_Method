package org.padroes.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioPJTest {

    @Test
    void deveCalcularSalarioLiquidoComDesconto() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBruto(10000.0);
        // ISS 6% => liquido = 9400.00
        assertEquals(9400.0, funcionario.calcularSalarioLiquido(), 0.001);
    }

    @Test
    void deveCalcularDescontoParaSalarioBaixo() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setSalarioBruto(3000.0);
        // ISS 6% => liquido = 2820.00
        assertEquals(2820.0, funcionario.calcularSalarioLiquido(), 0.001);
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setId(2);
        funcionario.setNome("Ana");
        funcionario.setSalarioBruto(10000.0);
        assertEquals(
            "FuncionarioPJ{id=2, nome='Ana', salarioBruto=10000,00, salarioLiquido=9400,00}",
            funcionario.getInfo()
        );
    }
}

