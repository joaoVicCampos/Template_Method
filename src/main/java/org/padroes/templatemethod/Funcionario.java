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

    public final double calcularSalarioLiquido() {
        double descontos = calcularDescontos();
        return this.salarioBruto - descontos;
    }


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

