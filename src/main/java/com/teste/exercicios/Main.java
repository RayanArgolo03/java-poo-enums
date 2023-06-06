package com.teste.exercicios;

import com.enums.exercicios.NivelTrabalho;
import com.dominio.exercicios.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter dtfGeral = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departamento = sc.next();

        System.out.println("Dados do trabalhador: ");

        System.out.print("Nome ");
        String nome = sc.next();

        System.out.print("Nível de cargo: ");
        String nivel = sc.next().toUpperCase();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        //Trabalhador
        Trabalhador t = new Trabalhador(nome, NivelTrabalho.valueOf(nivel), salario, new Departamento(departamento));

        System.out.print("Quantos contratos? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do #" + i + " contrato: ");

            System.out.print("Data: (DD/MM/YYYY)");
            LocalDate data = LocalDate.parse(sc.next(), dtfGeral);
            
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();

            //Adicionando contratos a lista de contratos
            t.addContrato(new Contrato(data, valorPorHora, horas));
        }

        System.out.println("Digite o mês e o ano que deseja calcular a renda:  (MM/YYYY)");
        String aux = sc.next();

        int mes = Integer.valueOf(Integer.parseInt(aux.substring(1, 2)));
        int ano = Integer.valueOf(Integer.parseInt(aux.substring(3, 7)));;
        
        System.out.println(t.toString());
        System.out.println("Rendimento para" + aux + ": " + String.format("%.2f", t.calcularRenda(ano, mes)));

        sc.close();
    }

}
