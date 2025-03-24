package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    //atributos
    public double lado1, lado2, area, perimetro;

    //Importa o scanner//
    Scanner scanner = new Scanner(System.in);

    /*** Metodo para cadastrar Retangulo ***/
    public void cadastrarRetangulo() {
        System.out.println("/***********************/");
        System.out.println("/* Cadastro Retangulo */");
        System.out.println("/***********************/");
        System.out.println("/* Informe o lado 1: */");
        lado1 = scanner.nextDouble();
        System.out.println("/* Informe o lado 2: */");
        lado2 = scanner.nextDouble();
        System.out.println("Retanguo cadastrado com sucesso !");
        System.out.println("/*************************");

    }

    public void CalularArea(){
        System.out.println("/********************************");
        System.out.println(" Calculando Area ");
        System.out.println("/********************************/");

        area = lado1 * lado2;
        System.out.println("A Area é: " + area);
        System.out.println("/********************************/");
    }

    public void CalcularPerimetro(){
        System.out.println("/*****************************/");
        System.out.println(" Calcular Perimetro ");
        System.out.println("/*****************************/");

        perimetro = (2 * lado1) + (2 * lado2);

        System.out.println("O Perimetro é: " + perimetro);
        System.out.println("/*****************************/");
    }

    public void exibirInromações(){
        System.out.println("/*********************************/");
        System.out.println(" Informações Retangulo ");
        System.out.println("O lado 1 é: " + lado1);
        System.out.println("O lado 2 è: " + lado2);
        System.out.println("A Area é: " + area);
        System.out.println("O Perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }
}
