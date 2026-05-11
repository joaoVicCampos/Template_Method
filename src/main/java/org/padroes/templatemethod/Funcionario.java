package org.padroes.templatemethod;

public abstract class Funcionario {

    private int id;
    protected String nome;
    private double salarioBruto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    // Template Method — define o esqueleto do algoritmo
    public final double calcularSalarioLiquido() {
        double descontos = calcularDescontos();
        return this.salarioBruto - descontos;
    }

    // Passo variável — cada subclasse implementa suas próprias regras de desconto
    protected abstract double calcularDescontos();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", salarioBruto=" + String.format("%.2f", this.salarioBruto) +
                ", salarioLiquido=" + String.format("%.2f", this.calcularSalarioLiquido()) +
                '}';
    }
}

