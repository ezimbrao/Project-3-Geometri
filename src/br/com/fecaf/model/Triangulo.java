package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    //atributos
    public double base, lado1, lado2, b, h, p, altura, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo(){
        System.out.println("/**********************/");
        System.out.println("/*      Triangulo     */");
        System.out.println("/**********************/");
        System.out.println("Informe a Base do Triangulo: ");
        base = scanner.nextDouble();
        System.out.println("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o Lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe a altura do Triangulo");
        altura = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com sucesso!!");

        return true;
    }


    public void calcularArea(){
        System.out.println("Calculando area");

        area = (base * altura)/2;
        System.out.println("A Area é: " + area);

    }

    public void calcularPerimetro(){
        System.out.println("Calculando Perimetro");

        perimetro = base + lado1 + lado2;
        System.out.println("O Perimetro é: " + perimetro);

    }

    public void definirTipo(){
        System.out.println("Definir tipo");

        //Equilatero - Isosceles - Escaleno

        if(base == lado1 && base == lado2){
            System.out.println("Esse triangulo é equilatero");

        } else if (base != lado1 && base != lado2 && lado1 != lado2){
            System.out.println("Este triangulo é escaleno");

        } else {
            System.out.println("Este triangulo é Isosceles");
        }

    }
    public void ValidarTrianguloRetangulo(){ //cadastra o triangulo com os dados
        System.out.println("/***********************/");
        System.out.println("/* Triangulo Retangulo */");
        System.out.println("/***********************/");
        System.out.println("Informe a Base do Triangulo: ");
        b = scanner.nextDouble();
        System.out.println("Informe o Perpendicular do Triangulo (oposto à base): ");
        p = scanner.nextDouble();
        System.out.println("Informe a Hipotenusa (a maior reta): ");
        h = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com sucesso!!");
        //recebe os dados de acordo com as partes do triangulo retangulo

        if (h*h==(p*p)+(b*b)){// faz o calculo de pitagoras
            System.out.println("É um triangulo retangulo");
        }
        else{
            System.out.println("Não é um triangulo retangulo");
            //diz se é ou não um triangulo retangulo
        }
    }
}
