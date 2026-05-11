package org.padroes.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {

    @Test
    void deveTerSalarioLiquidoIgualAoBruto() {
        Estagiario estagiario = new Estagiario();
        estagiario.setSalarioBruto(1500.0);
        // Sem descontos => liquido = bruto
        assertEquals(1500.0, estagiario.calcularSalarioLiquido(), 0.001);
    }

    @Test
    void naoDeveTerDescontos() {
        Estagiario estagiario = new Estagiario();
        estagiario.setSalarioBruto(800.0);
        assertEquals(800.0, estagiario.calcularSalarioLiquido(), 0.001);
    }

    @Test
    void deveRetornarInformacoes() {
        Estagiario estagiario = new Estagiario();
        estagiario.setId(3);
        estagiario.setNome("Lucas");
        estagiario.setSalarioBruto(1500.0);
        assertEquals(
            "Estagiario{id=3, nome='Lucas', salarioBruto=1500,00, salarioLiquido=1500,00}",
            estagiario.getInfo()
        );
    }
}

