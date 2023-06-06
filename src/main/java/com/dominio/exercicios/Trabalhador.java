package com.dominio.exercicios;

import com.enums.exercicios.NivelTrabalho;
import java.util.ArrayList;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelTrabalho nivel;
    private double salario;
    private Departamento departamento;
    List<Contrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalho nivel, double salario, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nDepartamento: " + departamento +"\n";
    }

    public void addContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        contratos.remove(contrato);
    }

    public double calcularRenda(int ano, int mes) {

        //Percorrer todos os contratos
        double rendimento = 0.0d;

        for (Contrato contrato : contratos) {
            if (contrato.getData().getYear() == ano && contrato.getData().getMonthValue() == mes) {
                rendimento += contrato.valorTotal();
            }
        }

        return salario + rendimento;
    }

}
