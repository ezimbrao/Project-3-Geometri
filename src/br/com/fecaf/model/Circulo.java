package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    public double raio, area, perimetro, diametro;

    Scanner scanner = new Scanner(System.in)

    public void cadastrarCirculo(){
        System.out.println("/***********************/");
        System.out.println(" Cadastrar Circulo ");
        System.out.println("/***********************/");
        System.out.println("Informe o Raio:");
        raio = scanner.nextDouble();
        System.out.println("Circulo cadastrado com sucesso!");
        System.out.println("/************************/");
    }

    public void calcularArea(){
        System.out.println("/************************/");
        System.out.println(" Calcular Area ");
        System.out.println("/************************/");
        area = Math.PI * (raio * raio);
        System.out.println("A area do circulo é:" + area);
        System.out.println("/************************/");
    }

    public void calcularPerimetro(){
        System.out.println("/*************************/");
        System.out.println(" Calculando Perimetro ");
        System.out.println("/*************************/");
        perimetro = 2 * Math.PI * raio;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*************************/");
    }

    public void exibirCirculo(){
        System.out.println("/*************************/");
        System.out.println( "Informações Circulo" );
        System.out.println("/*************************/");
        System.out.println("O raio é: " + raio);
        System.out.println("A Area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/************************/");
    }
}
