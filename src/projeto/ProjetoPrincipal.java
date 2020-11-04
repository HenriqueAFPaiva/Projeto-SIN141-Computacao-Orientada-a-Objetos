package projeto;

import java.io.*;
import java.util.*;

public class ProjetoPrincipal {

    public static void main(String[] args) {

        String c = null;

        Passageiro passag = new Passageiro();

        int cm = 0;
        int opção = 50;
        int a = 0;
        //CONTROLE

        boolean continuar = true;
        boolean removida = true;
        boolean malaEncontrada = false;
        boolean alterado = false;
        //CONTROLE

        Scanner sc = new Scanner(System.in);

        ArrayList<Passageiro> passageiro = new ArrayList<Passageiro>();
        //COLEÇÃO DE PASSAGEIROS ARRAYLIST

        Avioes[] aviões = new Avioes[4];

        File diretorio = new File("src/Arquivos");

        Arquivos arquivo = new Arquivos(diretorio);

        Destino dest1 = new Destino("Florida", 8336);
        Destino dest2 = new Destino("Lisboa", 7455);
        Destino dest3 = new Destino("São Paulo", 585);
        Destino dest4 = new Destino("Brasília", 730);
        //CRIAÇÃO DOS DESTINOS

        Hora hora1s = new Hora(8, 0, 0);
        Hora hora1c = new Hora(20, 12, 0);
        Hora hora2s = new Hora(10, 0, 0);
        Hora hora2c = new Hora(21, 25, 0);
        Hora hora3s = new Hora(9, 30, 0);
        Hora hora3c = new Hora(11, 25, 0);
        Hora hora4s = new Hora(11, 0, 0);
        Hora hora4c = new Hora(12, 35, 0);
        //CRIAÇÃO DOS HORÁRIOS DOS AVIÕES

        aviões[0] = new AviaoInternacional("A300-600", 5964, dest1, hora1s, hora1c, 266, 14923, "Estados Unidos");
        aviões[1] = new AviaoInternacional("A300-600", 5968, dest2, hora2s, hora2c, 266, 14923, "Portugal");
        aviões[2] = new AviaoComercial("A318", 5959, dest3, hora3s, hora3c, 109, 10028);
        aviões[3] = new AviaoComercial("A318", 5988, dest4, hora4s, hora4c, 109, 10028);
        //POLIMORFISMO

        do {

            do {

                try {

                    System.out.println("\n\nEscolha uma opção:");
                    System.out.println("-----Gerenciar passageiros-----");
                    System.out.println("1 - Cadastrar passageiro");
                    System.out.println("2 - Remover passageiro");
                    System.out.println("3 - Alterar dados de um passageiro\n");
                    System.out.println("---------Imprimir dados--------");
                    System.out.println("4 - Imprimir dados pessoais dos pasageiros");
                    System.out.println("5 - Imprimir dados pessoais de um passageiro pelo CPF");
                    System.out.println("6 - Imprimir dados dos aviões");
                    System.out.println("7 - Imprimir todos codigos das malas de um avião\n");
                    System.out.println("---------Pesquisar mala--------");
                    System.out.println("8 - Pesquisar alguma mala pelo código\n");
                    System.out.println("0 - Sair\n");
                    //MENU

                    int x = sc.nextInt();

                    if (x < 0 || x > 10) { //FILTRA A ENTRADA DOS DADOS

                        throw new IllegalArgumentException();

                    } else {

                        opção = x;
                        continuar = false;

                    }

                } catch (InputMismatchException q1) {

                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Dados digitados inválidos!");
//                    System.err.println(q1);                                  ---- imprime fora de ordem
//                    System.err.println("ERRO: Dados digitados inválidos!");  ---- imprime fora de ordem
                    sc.next();

                } catch (IllegalArgumentException q1) {

                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Opção inválida!");
//                    System.err.println(q1);
//                    System.err.println("ERRO: Opção inválida!");

                }

                sc.nextLine();

            } while (continuar);

            continuar = true;

            if (opção == 0) {

                diretorio.mkdir();

                arquivo.criaArquivoAvião1(aviões);
                arquivo.criaArquivoAvião2(aviões);
                arquivo.criaArquivoAvião3(aviões);
                arquivo.criaArquivoAvião4(aviões);
                //CRIAÇÃO DOS ARQUIVOS DO AVIÃO ANTES DO PROGRAMA FINALIZAR

                System.out.println("\nFinalizando...");
                System.out.println("\nGravando arquivos...");
                System.out.println("\nArquivos gravados com sucesso!");

                break;

            } else if (opção == 1) {

                passageiro.add(passag.cadastrarPassageiro(aviões, dest1, dest2, dest3, dest4));
                //CHAMA A FUNÇÃO DE CADASTRAR PASSAGEIROS E ADICIONA MAIS UM PASSAGEIRO NO ARRAYLIST

            } else if (opção == 2) {

                do {

                    try {

                        System.out.println("\nEscreva o CPF da pessoa à ser removida:");

                        c = sc.nextLine();

                        continuar = false;

                        for (int i = 0; i < c.length(); i++) {

                            Character caractere = c.charAt(i);

                            if (Character.isLetter(caractere)) {

                                throw new NumberFormatException();

                            } else {

                                continuar = false;

                            }

                        }
                        //VERIFICAÇÃO DOS CARACTERES DIGITADOS

                    } catch (NumberFormatException q1) {

                        continuar = true;
                        System.out.println();
                        System.out.println(q1);
                        System.out.println("Por favor, digite apenas números!");

                    }

                } while (continuar);

                Iterator<Passageiro> it = passageiro.iterator();

                while (it.hasNext()) {

                    Passageiro pess = it.next();

                    if (c.equals(pess.dados.getCPF())) {

                        it.remove();
                        System.out.println("\nPessoa sendo removida: " + pess.dados.getNome());
                        removida = true;
                        break;

                    }

                    removida = false;

                }
                //PERCORRE O ARRAYLIST PROCURANDO O CPF DIGITADO E CASO O CPF FOR ENCONTRADO, O PASSAGEIRO É REMOVIDO

                if (removida) {

                    System.out.println("\nRemovida com sucesso!");

                } else {

                    System.out.println("\nPessoa não encontrada!");

                }

                continuar = true;

            } else if (opção == 3) {

                do {

                    try {
                        System.out.println("\nEscreva o CPF da pessoa que deseja alterar os dados:");

                        c = sc.nextLine();

                        continuar = false;

                        for (int i = 0; i < c.length(); i++) {

                            Character caractere = c.charAt(i);

                            if (Character.isLetter(caractere)) {

                                throw new NumberFormatException();

                            } else {

                                continuar = false;

                            }

                        }

                    } catch (NumberFormatException q1) {

                        continuar = true;
                        System.out.println();
                        System.out.println(q1);
                        System.out.println("Por favor, digite apenas números!");

                    }

                } while (continuar);

                Iterator<Passageiro> it = passageiro.iterator();

                while (it.hasNext()) {

                    Passageiro pess = it.next();

                    if (c.equals(pess.dados.getCPF())) {

                        pess.alterarDados(pess);
                        alterado = true;
                        break;

                    } else {

                        alterado = false;

                    }

                }

                if (alterado) {

                    System.out.println("\nDados alterados com sucesso!");

                } else {

                    System.out.println("\nPessoa não encontrada!");

                }

                continuar = true;

            } else if (opção == 4) {

                Iterator<Passageiro> it = passageiro.iterator();

                while (it.hasNext()) {

                    Passageiro pess = (Passageiro) it.next();

                    System.out.print(pess.imprimirDados());
                }

                continuar = true;

            } else if (opção == 5) {

                do {

                    try {

                        System.out.println("\nEscreva o CPF da pessoa à ser pesquisada:");

                        c = sc.nextLine();

                        continuar = false;

                        for (int i = 0; i < c.length(); i++) {

                            Character caractere = c.charAt(i);

                            if (Character.isLetter(caractere)) {

                                throw new NumberFormatException();

                            } else {

                                continuar = false;

                            }

                        }

                    } catch (NumberFormatException q1) {

                        continuar = true;
                        System.out.println();
                        System.out.println(q1);
                        System.out.println("Por favor, digite apenas números!");

                    }

                } while (continuar);

                Iterator<Passageiro> it = passageiro.iterator();

                while (it.hasNext()) {

                    Passageiro pess = (Passageiro) it.next();

                    if (c.equals(pess.dados.getCPF())) {

                        System.out.println("\nPessoa pesquisada: " + pess.dados.getNome());
                        System.out.print(pess.imprimirDados());
                        break;

                    }

                }

                continuar = true;

            } else if (opção == 6) {

                for (int i = 0; i < aviões.length; i++) {

                    System.out.print(aviões[i].imprimeDados());
                    System.out.println();
                    System.out.print(aviões[i].imprimeRota());

                }

                continuar = true;

            } else if (opção == 7) {

                do {

                    try {

                        System.out.println("\nEscolha o avião: ");
                        System.out.println("\n1 - " + aviões[0].nome + " Codigo do Voo:" + aviões[0].numeroDoVoo);
                        System.out.println("\n2 - " + aviões[1].nome + " Codigo do Voo:" + aviões[1].numeroDoVoo);
                        System.out.println("\n3 - " + aviões[2].nome + " Codigo do Voo:" + aviões[2].numeroDoVoo);
                        System.out.println("\n4 - " + aviões[3].nome + " Codigo do Voo:" + aviões[3].numeroDoVoo);
                        System.out.println();

                        a = sc.nextInt();

                        continuar = false;

                    } catch (InputMismatchException q1) {

                        continuar = true;
                        sc.next();
                        System.out.println();
                        System.out.println(q1);
                        System.out.println("Por favor, digite apenas números!");

                    }

                    if (a == 1) {

                        Iterator<Passageiro> it = passageiro.iterator();

                        System.out.println("\nCodigo das malas no avião: ");

                        while (it.hasNext()) {

                            Passageiro pess = (Passageiro) it.next();

                            if (pess.getDest().equals(dest1)) {

                                for (int i = 0; i < 10; i++) {

                                    if (pess.getCodigoMalas(i) != 0) {

                                        System.out.printf(" " + pess.getCodigoMalas(i));

                                    }

                                }

                            }

                        }

                        System.out.println();
                        //IMPRIME TODOS OS CODIGOS DE MALAS EXISTENTES NAQUELE AVIÃO ATRAVES DOS PASSAGEIROS

                    } else if (a == 2) {

                        Iterator<Passageiro> it = passageiro.iterator();

                        System.out.println("\nCodigo das malas no avião: ");

                        while (it.hasNext()) {

                            Passageiro pess = (Passageiro) it.next();

                            if (pess.getDest().equals(dest2)) {
                                for (int i = 0; i < 10; i++) {
                                    if (pess.getCodigoMalas(i) != 0) {
                                        System.out.printf(" " + pess.getCodigoMalas(i));
                                    }

                                }

                            }

                        }

                        System.out.println();

                    } else if (a == 3) {

                        Iterator<Passageiro> it = passageiro.iterator();

                        System.out.println("\nCodigo das malas no avião: ");

                        while (it.hasNext()) {

                            Passageiro pess = (Passageiro) it.next();

                            if (pess.getDest().equals(dest3)) {
                                for (int i = 0; i < 10; i++) {
                                    if (pess.getCodigoMalas(i) != 0) {
                                        System.out.printf(" " + pess.getCodigoMalas(i));
                                    }

                                }

                            }

                        }

                        System.out.println();

                    } else if (a == 4) {

                        Iterator<Passageiro> it = passageiro.iterator();

                        System.out.println("\nCodigo das malas no avião: ");

                        while (it.hasNext()) {

                            Passageiro pess = (Passageiro) it.next();

                            if (pess.getDest().equals(dest4)) {
                                for (int i = 0; i < 10; i++) {
                                    if (pess.getCodigoMalas(i) != 0) {
                                        System.out.printf(" " + pess.getCodigoMalas(i));
                                    }

                                }

                            }

                        }

                        System.out.println();

                    } else {

                        System.out.println("\nOpção inválida!");
                    }

                } while (continuar);

                continuar = true;

            } else if (opção == 8) {

                do {

                    try {

                        System.out.println("\nDigite o codigo da mala a ser pesquisado: ");

                        cm = sc.nextInt();

                        if (cm < 0) {

                            throw new IllegalArgumentException();

                        }

                        continuar = false;

                    } catch (IllegalArgumentException q1) {

                        continuar = true;
                        System.out.println();
                        System.out.println(q1);
                        System.out.println("Por favor, digite um codigo válido!");
                        break;

                    } catch (InputMismatchException q1) {

                        continuar = true;
                        System.out.println();
                        System.out.println(q1);
                        System.out.println("Por favor, digite apenas números!");
                        break;

                    }

                    Iterator<Passageiro> it = passageiro.iterator();

                    while (it.hasNext()) {

                        Passageiro pess = (Passageiro) it.next();

                        for (int i = 0; i < 10; i++) {

                            if (cm == pess.getCodigoMalas(i)) {

                                System.out.println("\nMala pesquisada é do passageiro: " + pess.dados.getNome());
                                malaEncontrada = true;

                                if (pess.getDest().equals(dest1)) {

                                    System.out.println("\nE se encontra no avião: " + aviões[0].nome);
                                    System.out.println("\nCodigo do Voo: " + aviões[0].numeroDoVoo);
                                    break;

                                } else if (pess.getDest().equals(dest2)) {

                                    System.out.println("\nE se encontra no avião: " + aviões[1].nome);
                                    System.out.println("\nCodigo do Voo: " + aviões[1].numeroDoVoo);
                                    break;

                                } else if (pess.getDest().equals(dest3)) {

                                    System.out.println("\nE se encontra no avião: " + aviões[2].nome);
                                    System.out.println("\nCodigo do Voo: " + aviões[2].numeroDoVoo);
                                    break;

                                } else if (pess.getDest().equals(dest4)) {

                                    System.out.println("\nE se encontra no avião: " + aviões[3].nome);
                                    System.out.println("\nCodigo do Voo: " + aviões[3].numeroDoVoo);
                                    break;

                                }

                            }

                        }

                    }

                    if (malaEncontrada) {

                        break;

                    } else {

                        System.out.println("\nMala não encontrada!");

                    }

                    malaEncontrada = false;

                } while (continuar);

                continuar = true;

            } else {

                System.out.println("Opção inválida!");

                continuar = true;

            }

        } while (continuar);

    }

}