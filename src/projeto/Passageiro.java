package projeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Passageiro {

    private int numeroDoVoo;//
    public Pessoa dados;//
    private int quantidadeDeMalasMao;//
    private int quantidadeDeMalasDespachada;//
    public int[] codigoMalas = new int[10];//
    public Destino dest;//
    public Endereço end;//
    private MalaDeMao malasMao[] = new MalaDeMao[5];
    private MalaDespachada malasDespachadas[] = new MalaDespachada[5];

    public Passageiro() {
    }

    public Passageiro(int numeroDoVoo, Pessoa dados, int quantidadeDeMalasMao, int quantidadeDeMalasDespachada, Destino dest, Endereço end, int[] codigoMalas, MalaDeMao malasMao[], MalaDespachada[] malasDespachadas) {
        this.setNumeroDoVoo(numeroDoVoo);
        this.setDado(dados);
        this.setQuantidadeDeMalasMao(quantidadeDeMalasMao);
        this.setQuantidadeDeMalasDespachada(quantidadeDeMalasDespachada);
        this.setDest(dest);
        this.setEnd(end);
        this.setCodigoMalas(codigoMalas);
        this.setMalasMao(malasMao);
        this.setMalasDespachadas(malasDespachadas);
    }

    public Passageiro(int numeroDoVoo, int quantidadeDeMalasMao, int quantidadeDeMalasDespachada, int[] codigoMalas) {
        this.setNumeroDoVoo(numeroDoVoo);
        this.setQuantidadeDeMalasMao(quantidadeDeMalasMao);
        this.setQuantidadeDeMalasDespachada(quantidadeDeMalasDespachada);
        this.setCodigoMalas(codigoMalas);
    }

    public Passageiro(int numeroDoVoo) {
        this.setNumeroDoVoo(numeroDoVoo);
    }

    public Passageiro(int quantidadeDeMalasMao, int quantidadeDeMalasDespachada, int[] codigoMalas) {
        this.setQuantidadeDeMalasMao(quantidadeDeMalasMao);
        this.setQuantidadeDeMalasDespachada(quantidadeDeMalasDespachada);
        this.setCodigoMalas(codigoMalas);
    }

    public Passageiro(Pessoa dado) {
        this.setDado(dado);
    }

    public Passageiro(Destino dest) {
        this.setDest(dest);
    }

    public Passageiro(Endereço end) {
        this.setEnd(end);
    }

    public Passageiro(Pessoa dado, Endereço end) {
        this.setDado(dado);
        this.setEnd(end);
    }

    public void setNumeroDoVoo(int numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public int getNumeroDoVoo() {
        return this.numeroDoVoo;
    }

    public void setDado(Pessoa dado) {
        this.dados = dado;
    }

    public Pessoa getDado() {
        return this.dados;
    }

    public void setQuantidadeDeMalasMao(int quantidadeDeMalasMao) {
        this.quantidadeDeMalasMao = quantidadeDeMalasMao;
    }

    public void setMalasMao(MalaDeMao[] malasMao) {
        this.malasMao = malasMao;
    }

    public void setMalasDespachadas(MalaDespachada[] malasDespachadas) {
        this.malasDespachadas = malasDespachadas;
    }

    public int getQuantidadeDeMalasMao() {
        return this.quantidadeDeMalasMao;
    }

    public void setQuantidadeDeMalasDespachada(int quantidadeDeMalasDespachada) {
        this.quantidadeDeMalasDespachada = quantidadeDeMalasDespachada;
    }

    public int getQuantidadeDeMalasDespachada() {
        return this.quantidadeDeMalasDespachada;
    }

    public void setCodigoMalas(int[] codigoMalas) {
        this.codigoMalas = codigoMalas;
    }

    public int getCodigoMalas(int i) {
        return this.codigoMalas[i];
    }

    public void setDest(Destino dest) {
        this.dest = dest;
    }

    public Destino getDest() {
        return this.dest;
    }

    public void setEnd(Endereço end) {
        this.end = end;
    }

    public Endereço getEnd() {
        return this.end;
    }

    public String imprimirDados() {
        return String.format("\nNome: %s\nCPF: %s\nRG: %s\nTelefone: %s\nRua: %s\nNumero da casa: %d\nBairro: %s\nCEP: %d\nCidade: %s\nEstado: %s\nPaís: %s\nNumero do Vôo: %d\nQuantidade de Malas: %d\nDestino: %s\n", this.dados.getNome(), this.dados.getCPF(), this.dados.getRG(), this.dados.getTelefone(), this.end.getRua(), this.end.getNumeroDaCasa(), this.end.getBairro(), this.end.getCEP(), this.end.getCidade(), this.end.getEstado(), this.end.getPaís(), this.getNumeroDoVoo(), this.getQuantidadeDeMalasMao() + this.getQuantidadeDeMalasDespachada(), this.dest.getNomeDest());
    }

    public Passageiro cadastrarPassageiro(Avioes[] aviões, Destino dest1, Destino dest2, Destino dest3, Destino dest4) {

        Scanner sc = new Scanner(System.in);

        String rua = null;
        String b = null;
        String ci = null;
        String e = null;
        String p = null;
        String t = null;
        String r = null;
        String n = null;
        String c = null;

        int codMalas = 0001;
        int nc = 0;
        int cep = 0;
        int qmm = 0;
        int qmd = 0;
        int des = 0;
        int cm = 0;

        float amm;
        float lmm;
        float cmm;
        float pmm;
        float amd;
        float lmd;
        float cmd;
        float pmd;

        int[] vetCodMalas = new int[10];
        int[] vetCodMalasD = new int[5];
        int[] vetCodMalasM = new int[5];

        boolean continuar = true;

        do {
            try {
                System.out.println("\nEscreva o nome:");

                n = sc.nextLine();

                continuar = false;

                for (int i = 0; i < n.length(); i++) {
                    Character caractere = n.charAt(i);
                    if (Character.isDigit(caractere)) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("ERRO: Digite apenas letras!");
            }

        } while (continuar);

        continuar = true;

        do {
            try {
                System.out.println("\nEscreva o CPF:");

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

        System.out.println("\nEscreva o RG:");
        r = sc.nextLine();

        continuar = true;

        do {
            try {
                System.out.println("\nEscreva o telefone:");

                t = sc.nextLine();

                continuar = false;

                for (int i = 0; i < t.length(); i++) {
                    Character caractere = t.charAt(i);
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

        Pessoa d = new Pessoa(n, c, r, t);
        continuar = true;

        do {
            try {
                System.out.println("\nEscreva a Rua:");

                rua = sc.nextLine();

                continuar = false;

                for (int i = 0; i < rua.length(); i++) {
                    Character caractere = rua.charAt(i);
                    if (Character.isDigit(caractere)) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("ERRO: Digite apenas letras!");
            }
        } while (continuar);

        continuar = true;

        do {
            try {
                System.out.println("\nEscreva o Numero da casa:");

                continuar = false;

                nc = sc.nextInt();

            } catch (InputMismatchException q1) {
                continuar = true;
                sc.next();
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, digite apenas números!");
            }
        } while (continuar);

        continuar = true;

        sc.nextLine();

        do {
            try {
                System.out.println("\nEscreva o Bairro:");

                b = sc.nextLine();

                continuar = false;

                for (int i = 0; i < b.length(); i++) {
                    Character caractere = b.charAt(i);
                    if (Character.isDigit(caractere)) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("ERRO: Digite apenas letras!");
            }
        } while (continuar);

        continuar = true;

        do {
            try {
                System.out.println("\nEscreva o CEP:");

                continuar = false;

                cep = sc.nextInt();

            } catch (InputMismatchException q1) {
                continuar = true;
                sc.next();
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, digite apenas números!");
            }
        } while (continuar);

        continuar = true;

        sc.nextLine();

        do {
            try {
                System.out.println("\nEscreva a Cidade:");

                ci = sc.nextLine();

                continuar = false;

                for (int i = 0; i < rua.length(); i++) {
                    Character caractere = rua.charAt(i);
                    if (Character.isDigit(caractere)) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("ERRO: Digite apenas letras!");
            }
        } while (continuar);

        continuar = true;

        do {
            try {
                System.out.println("\nEscreva o Estado:");

                e = sc.nextLine();

                continuar = false;

                for (int i = 0; i < e.length(); i++) {
                    Character caractere = e.charAt(i);
                    if (Character.isDigit(caractere)) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("ERRO: Digite apenas letras!");
            }
        } while (continuar);

        continuar = true;

        do {
            try {
                System.out.println("\nEscreva o País:");

                p = sc.nextLine();

                continuar = false;

                for (int i = 0; i < p.length(); i++) {
                    Character caractere = p.charAt(i);
                    if (Character.isDigit(caractere)) {
                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("ERRO: Digite apenas letras!");
            }
        } while (continuar);

        Endereço end = new Endereço(rua, nc, b, cep, ci, e, p);

        continuar = true;

        do {
            try {
                System.out.println("\nEscreva a quantidade de malas de mão:");

                continuar = false;

                qmm = sc.nextInt();

                if (qmm < 0 || qmm > 5) {
                    throw new IllegalArgumentException();
                }

                for (int i = 0; i < qmm; i++) {
                    vetCodMalasM[i] = codMalas++;
                }

            } catch (InputMismatchException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, digite apenas números!");
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, escolha entre 0 e 5 malas!");
            }

            for (int i = 0; i < qmm; i++) {
                try {
                    malasMao[i] = new MalaDeMao();

                    System.out.println("\nQual a altura da mala " + (i + 1));

                    continuar = false;

                    amm = sc.nextInt();

                    if (amm < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        malasMao[i].altura = amm;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                try {
                    System.out.println("\nQual a largura da mala " + (i + 1));

                    continuar = false;

                    lmm = sc.nextInt();

                    if (lmm < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        this.malasMao[i].largura = lmm;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                try {
                    System.out.println("\nQual o comprimento da mala " + (i + 1));

                    continuar = false;

                    cmm = sc.nextInt();

                    if (cmm < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        malasMao[i].comprimento = cmm;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                try {
                    System.out.println("\nQual o peso da mala " + (i + 1));

                    continuar = false;

                    pmm = sc.nextInt();

                    if (pmm < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        malasMao[i].peso = pmm;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                malasMao[i].codigo = codMalas++;

                if (malasMao[i].aprovarMala()) {
                    System.out.println("\nMala aprovada!!");
                } else {
                    System.out.println("\nO tamanho ou peso de sua mala não foi aprovado");
                    System.out.println("\nPor favor, escolha outra mala");
                    continuar = true;
                }
            }

            for (int i = 0; i < qmm; i++) {
                vetCodMalasM[i] = malasMao[i].codigo;
            }
            //MANDA O CODIGO DAS MALAS PARA UM VETOR PARA SER ENVIADO AO AVIÃO

        } while (continuar);

        continuar = true;

        do {
            do {
                try {
                    System.out.println("\nEscreva a quantidade de malas de despacho:");

                    continuar = false;

                    qmd = sc.nextInt();

                    if (qmd < 0 || qmd > 5) {
                        throw new IllegalArgumentException();
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha entre 0 e 5 malas!");
                }
            } while (continuar);

            quantidadeDeMalasDespachada = qmd;

            for (int i = 0; i < qmd; i++) {
                try {
                    malasDespachadas[i] = new MalaDespachada();

                    System.out.println("\nQual a altura da mala " + (i + 1));

                    continuar = false;

                    amd = sc.nextInt();

                    if (amd < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        malasDespachadas[i].altura = amd;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                try {
                    System.out.println("\nQual a largura da mala " + (i + 1));

                    continuar = false;

                    lmd = sc.nextInt();

                    if (lmd < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        malasDespachadas[i].largura = lmd;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                try {
                    System.out.println("\nQual o comprimento da mala " + (i + 1));

                    continuar = false;

                    cmd = sc.nextInt();

                    if (cmd < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        malasDespachadas[i].comprimento = cmd;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                try {
                    System.out.println("\nQual o peso da mala " + (i + 1));

                    continuar = false;

                    pmd = sc.nextInt();

                    if (pmd < 0) {
                        throw new IllegalArgumentException();
                    } else {
                        malasDespachadas[i].peso = pmd;
                    }

                } catch (InputMismatchException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, escolha um valor real!");
                }

                malasDespachadas[i].codigo = codMalas++;

                if (malasDespachadas[i].aprovarMala()) {
                    System.out.println("\nMala aprovada!!");
                } else {
                    System.out.println("\nO tamanho ou peso de sua mala não foi aprovado");
                    System.out.println("\nPor favor, escolha outra mala");
                    continuar = true;
                }
            }

            for (int i = 0; i < qmd; i++) {
                vetCodMalasD[i] = malasDespachadas[i].codigo;
            }
            //MANDA O CODIGO DAS MALAS PARA UM VETOR PARA SER ENVIADO AO AVIÃO

        } while (continuar);

        continuar = true;

        do {
            do {
                try {
                    System.out.println("\nEscolha um destino: ");
                    System.out.println("1 - Florida - Estados Unidos");
                    System.out.println("2 - Lisboa - Portugal");
                    System.out.println("3 - São Paulo");
                    System.out.println("4 - Brasília\n");

                    des = sc.nextInt();

                    continuar = false;
                } catch (InputMismatchException q1) {
                    continuar = true;
                    sc.next();
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                }
            } while (continuar);

            System.arraycopy(vetCodMalasM, 0, vetCodMalas, 0, vetCodMalasM.length);

            System.arraycopy(vetCodMalasD, 0, vetCodMalas, vetCodMalasM.length, vetCodMalasD.length);

            System.out.printf("\nCodigo das malas: ");

            for (int i = 0; i < vetCodMalas.length; i++) {
                if (vetCodMalas[i] != 0) {
                    System.out.printf(" - " + vetCodMalas[i]);
                }
            }

            System.out.println();

            if (des == 1) {
                if (aviões[0].quantidadePassageiros >= 266) {
                    System.out.println();
                    System.out.println("Avião lotado!!");
                    continuar = true;
                } else {
                    int nv = 5964;
                    aviões[0].setCodigoMalas(vetCodMalas);
                    aviões[0].quantidadePassageiros++;
                    Passageiro passag;
                    return passag = new Passageiro(nv, d, qmm, qmd, dest1, end, vetCodMalas, malasMao, malasDespachadas);
                }
            } else if (des == 2) {

                if (aviões[1].quantidadePassageiros >= 266) {
                    System.out.println();
                    System.out.println("Avião lotado!!");
                    continuar = true;
                } else {
                    int nv = 5968;
                    aviões[1].setCodigoMalas(vetCodMalas);
                    aviões[1].quantidadePassageiros++;
                    Passageiro passag;
                    return passag = new Passageiro(nv, d, qmm, qmd, dest1, end, vetCodMalas, malasMao, malasDespachadas);
                }
            } else if (des == 3) {

                if (aviões[2].quantidadePassageiros >= 109) {
                    System.out.println();
                    System.out.println("Avião lotado!!");
                    continuar = true;
                } else {
                    int nv = 5959;
                    aviões[2].setCodigoMalas(vetCodMalas);
                    aviões[2].quantidadePassageiros++;
                    Passageiro passag;
                    return passag = new Passageiro(nv, d, qmm, qmd, dest1, end, vetCodMalas, malasMao, malasDespachadas);
                }
            } else if (des == 4) {

                if (aviões[3].quantidadePassageiros >= 109) {
                    System.out.println();
                    System.out.println("Avião lotado!!");
                    continuar = true;
                } else {
                    int nv = 5988;
                    aviões[3].setCodigoMalas(vetCodMalas);
                    aviões[3].quantidadePassageiros++;
                    Passageiro passag;
                    return passag = new Passageiro(nv, d, qmm, qmd, dest1, end, vetCodMalas, malasMao, malasDespachadas);
                }
            } else {
                System.out.println("\nDestino escolhido inválido!");
                continuar = true;
            }

        } while (continuar);

        return null;
    }

    public void alterarDados(Passageiro pass) {
        Scanner sc = new Scanner(System.in);

        int dados = 0;
        int endereço = 0;
        int nc = 0;
        int cep = 0;

        String n = null;
        String c = null;
        String r = null;
        String t = null;
        String rua = null;
        String b = null;
        String ci = null;
        String e = null;
        String p = null;

        boolean continuar = false;
        boolean alteraDados = false;
        boolean alteraEndereço = false;

        Endereço ende = null;
        Pessoa pess = null;
        do {
            try {
                System.out.println("\nDeseja alterar os dados pessoais do passageiro ?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");

                dados = sc.nextInt();

                if (dados < 0 || dados > 2) {
                    throw new IllegalArgumentException();
                } else if (dados == 1) {
                    alteraDados = true;
                } else if (dados == 2) {
                    alteraDados = false;
                }

            } catch (InputMismatchException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, digite apenas números!");
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, escolha 1 ou 2!!");
            }
        } while (continuar);

        sc.nextLine();

        if (alteraDados) {
            do {
                try {
                    System.out.println("\nEscreva o nome:");

                    n = sc.nextLine();

                    continuar = false;

                    for (int i = 0; i < n.length(); i++) {
                        Character caractere = n.charAt(i);
                        if (Character.isDigit(caractere)) {
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Digite apenas letras!");
                }

            } while (continuar);

            continuar = true;

            do {
                try {
                    System.out.println("\nEscreva o CPF:");

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

            System.out.println("\nEscreva o RG:");
            r = sc.nextLine();

            continuar = true;

            do {
                try {
                    System.out.println("\nEscreva o telefone:");

                    t = sc.nextLine();

                    continuar = false;

                    for (int i = 0; i < t.length(); i++) {
                        Character caractere = t.charAt(i);
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

            pess = new Pessoa(n, c, r, t);
        }

        do {
            try {
                System.out.println("\nDeseja alterar o endereço do passageiro ?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");

                endereço = sc.nextInt();

                if (endereço < 0 || endereço > 2) {
                    throw new IllegalArgumentException();
                } else if (endereço == 1) {
                    alteraEndereço = true;
                } else if (endereço == 2) {
                    alteraEndereço = false;
                }

            } catch (InputMismatchException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, digite apenas números!");
            } catch (IllegalArgumentException q1) {
                continuar = true;
                System.out.println();
                System.out.println(q1);
                System.out.println("Por favor, escolha 1 ou 2!!");
            }
        } while (continuar);

        sc.nextLine();

        if (alteraEndereço) {
            do {
                try {
                    System.out.println("\nEscreva a Rua:");

                    rua = sc.nextLine();

                    continuar = false;

                    for (int i = 0; i < rua.length(); i++) {
                        Character caractere = rua.charAt(i);
                        if (Character.isDigit(caractere)) {
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Digite apenas letras!");
                }
            } while (continuar);

            continuar = true;

            do {
                try {
                    System.out.println("\nEscreva o Numero da casa:");

                    continuar = false;

                    nc = sc.nextInt();

                } catch (InputMismatchException q1) {
                    continuar = true;
                    sc.next();
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                }
            } while (continuar);

            continuar = true;

            sc.nextLine();

            do {
                try {
                    System.out.println("\nEscreva o Bairro:");

                    b = sc.nextLine();

                    continuar = false;

                    for (int i = 0; i < b.length(); i++) {
                        Character caractere = b.charAt(i);
                        if (Character.isDigit(caractere)) {
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Digite apenas letras!");
                }
            } while (continuar);

            continuar = true;

            do {
                try {
                    System.out.println("\nEscreva o CEP:");

                    continuar = false;

                    cep = sc.nextInt();

                } catch (InputMismatchException q1) {
                    continuar = true;
                    sc.next();
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("Por favor, digite apenas números!");
                }
            } while (continuar);

            continuar = true;

            sc.nextLine();

            do {
                try {
                    System.out.println("\nEscreva a Cidade:");

                    ci = sc.nextLine();

                    continuar = false;

                    for (int i = 0; i < rua.length(); i++) {
                        Character caractere = rua.charAt(i);
                        if (Character.isDigit(caractere)) {
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Digite apenas letras!");
                }
            } while (continuar);

            continuar = true;

            do {
                try {
                    System.out.println("\nEscreva o Estado:");

                    e = sc.nextLine();

                    continuar = false;

                    for (int i = 0; i < e.length(); i++) {
                        Character caractere = e.charAt(i);
                        if (Character.isDigit(caractere)) {
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Digite apenas letras!");
                }
            } while (continuar);

            continuar = true;

            do {
                try {
                    System.out.println("\nEscreva o País:");

                    p = sc.nextLine();

                    continuar = false;

                    for (int i = 0; i < p.length(); i++) {
                        Character caractere = p.charAt(i);
                        if (Character.isDigit(caractere)) {
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (IllegalArgumentException q1) {
                    continuar = true;
                    System.out.println();
                    System.out.println(q1);
                    System.out.println("ERRO: Digite apenas letras!");
                }
            } while (continuar);

            ende = new Endereço(rua, nc, b, cep, ci, e, p);
        }

        if (alteraDados && alteraEndereço) {
            pass.setDado(pess);
            pass.setEnd(ende);
        } else if (alteraDados) {
            pass.setDado(pess);
        } else if (alteraEndereço) {
            pass.setEnd(ende);
        }
    }
}
