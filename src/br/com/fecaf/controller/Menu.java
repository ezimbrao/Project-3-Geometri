package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    public void executarMenu() {


        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while(!exit){

            System.out.println("/************************/");
            System.out.println("/*         Menu         */");
            System.out.println("/************************/");
            System.out.println("1 - Retangulo");
            System.out.println("2 - Circulo");
            System.out.println("3 - Triangulo");
            System.out.println("4 - Sair");
            System.out.println("/************************/");

            System.out.println("Informe a opção desejada: ");

            int userOption = scanner.nextInt();

            switch (userOption) {
                case 1:

                    Retangulo retangulo = new Retangulo();

                    boolean exitRetangulo = false;

                    boolean validaRetangulo = false;


                    while (!exitRetangulo) {


                        System.out.println("/************************/");
                        System.out.println("/*       Retangulo      */");
                        System.out.println("/************************/");
                        System.out.println("/* 1 - Cadastrar        */");
                        System.out.println("/* 2 - Calcular area    */");
                        System.out.println("/* 3 - Calcular perimetro */");
                        System.out.println("/* 4 - Validar Quadrado    */");
                        System.out.println("/* 5 - Sair             */");
                        System.out.println("/************************/");

                        System.out.println("Informe a opção desejada: ");

                        int userOptionRetangulo = scanner.nextInt();

                        switch (userOptionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if(validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um retangulo");
                                }
                                break;
                            case 3:
                                if(validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um retangulo");
                                }
                                break;
                            case 4:
                                if(validaRetangulo) {
                                    retangulo.validarQuadrado();
                                } else {
                                    System.out.println("Cadastre um retangulo");
                                }
                                break;
                            case 5:
                                System.out.println("retornando ao Menu");
                                exitRetangulo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção valida");

                        }
                    }
                    break;
                case 2:
                    Circulo circulo = new Circulo();

                    boolean exitCirculo = false;

                    boolean validaCirculo = false;


                    while (!exitCirculo) {


                        System.out.println("/************************/");
                        System.out.println("/*       Circulo      */");
                        System.out.println("/************************/");
                        System.out.println("/* 1 - Cadastrar        */");
                        System.out.println("/* 2 - Calcular area    */");
                        System.out.println("/* 3 - Calcular perimetro */");
                        System.out.println("/* 4 - Exibir Informações */");
                        System.out.println("/* 5 - Sair             */");
                        System.out.println("/************************/");

                        System.out.println("Informe a opção desejada: ");

                        int userOptionCirculo = scanner.nextInt();

                        switch (userOptionCirculo) {
                            case 1:
                                validaCirculo = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if(validaCirculo) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 3:
                                if(validaCirculo) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 4:
                                if(validaCirculo){
                                    circulo.exibirCirculo();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                            case 5:
                                System.out.println("retornando ao Menu");
                                exitCirculo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção valida");

                        }
                    }
                    break;
                case 3:
                    Triangulo triangulo = new Triangulo();

                    boolean exitTriangulo = false;

                    boolean validaTriangulo = false;

                    while(!exitTriangulo){

                        System.out.println("/************************/");
                        System.out.println("/*       Triangulo      */");
                        System.out.println("/************************/");
                        System.out.println("/* 1 - Cadastrar        */");
                        System.out.println("/* 2 - Calcular area    */");
                        System.out.println("/* 3 - Calcular perimetro */");
                        System.out.println("/* 4 - Definir tipo */");
                        System.out.println("/* 5 - Validar Triangulo Retangulo*/");
                        System.out.println("/* 6 - Sair             */");
                        System.out.println("/************************/");

                        System.out.println("Informe a opção desejada: ");

                        int userOptionTriangulo = scanner.nextInt();

                        switch (userOptionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if(validaTriangulo) {
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                                break;
                            case 3:
                                if(validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                                break;
                            case 4:
                                if(validaTriangulo){
                                    triangulo.definirTipo();
                                } else {
                                    System.out.println("Cadastre um Triangulo");
                                }
                            case 5:
                                if(validaTriangulo){
                                    triangulo.ValidarTrianguloRetangulo();
                                } else System.out.println("cadastre um Triangulo");
                            case 6:
                                System.out.println("retornando ao Menu");
                                exitTriangulo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção valida");

                        }
                    }

                    break;
                case 4:
                    System.out.println("Saindo");
                    exit = true;
                    break;


                default:
                    System.out.println("Escolha uma opção valida");


            }


        }





    }
}
