package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {

    // Atributos
    public double lado1, lado2, area, perimetro;

    /** Importa Teclado */
    Scanner scanner = new Scanner(System.in);

    /** Metodo para cadastrar Retangulo*/
    public boolean cadastrarRetangulo (){
        System.out.println("/**********************/");
        System.out.println("/* Cadastro Retangulo */");
        System.out.println("/*********************/");
        System.out.println("/* Informe o lado 1: /");
        lado1 = scanner.nextDouble();
        System.out.println("/* Informe o lado 2: /");
        lado2 = scanner.nextDouble();
        System.out.println("Retangulo cadastrado com sucesso !");
        System.out.println("/***********************/");
        return true;
    }

    public void calcularArea(){
        System.out.println("/*****************/");
        System.out.println("/* Calculando Area */");
        System.out.println("/*****************/");
        area = lado1 * lado2;
        System.out.println("A area é: " + area);
        System.out.println("/*******************/");
    }

    public void calcularPerimetro (){
        System.out.println("/*****************/");
        System.out.println("/* Calculando Perimetro */");
        System.out.println("/*****************/");
        perimetro = (2 * lado1) + (2 * lado2);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/***********************/");
    }

    public void exibirInformacoes(){
        System.out.println("/*********************/");
        System.out.println("/* Informações Retângulo */");
        System.out.println("/*********************/");
        System.out.println("O lado 1 é: " + lado1);
        System.out.println("O lado 2 ´2: " + lado2);
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " +perimetro);
        System.out.println("/***********************/");
    }

    public boolean validarQuadrado (){
        if (lado1 == lado2){
            System.out.println("É um quadrado");
            return true;
        } else{
            System.out.println("Não é um quadrado");
            return false;
        }

    }
}