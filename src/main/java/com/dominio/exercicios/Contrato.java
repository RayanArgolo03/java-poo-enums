
package com.dominio.exercicios;

import java.time.LocalDate;


public class Contrato {
    
    private LocalDate data;
    private double valorPorHora;
    private int horas;
    
    
    public Contrato(LocalDate data, double valorPorHora, int horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Contrato{" + "data=" + data + ", valorPorHora=" + valorPorHora + ", horas=" + horas + '}';
    }
    
    public double valorTotal(){
        return valorPorHora * horas;
    }
    
}
