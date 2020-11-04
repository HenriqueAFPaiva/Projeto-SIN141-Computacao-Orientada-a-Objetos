package projeto;

import java.io.*;

public class Arquivos {

    private File dadosAvião1;
    private File dadosAvião2;
    private File dadosAvião3;
    private File dadosAvião4;

    public Arquivos(File diretorio) {
        dadosAvião1 = new File(diretorio, "Avião1.txt");
        dadosAvião2 = new File(diretorio, "Avião2.txt");
        dadosAvião3 = new File(diretorio, "Avião3.txt");
        dadosAvião4 = new File(diretorio, "Avião4.txt");
    }

    public void criaArquivoAvião1(Avioes[] aviões) {

        FileWriter fw;
        BufferedWriter bw;

        try {
            fw = new FileWriter(dadosAvião1);
            bw = new BufferedWriter(fw);

            bw.write("Avião: ");
            bw.write(aviões[0].nome);
            bw.write('\n');
            bw.write('\n');
            bw.write("Código do voo: ");
            bw.write(Integer.toString(aviões[0].numeroDoVoo));
            bw.write('\n');
            bw.write('\n');
            bw.write("Destino: ");
            bw.write(aviões[0].destino.getNomeDest());
            bw.write('\n');
            bw.write('\n');
            bw.write("Hora de saída: ");
            bw.write(aviões[0].getHoraDeSaida());
            bw.write('\n');
            bw.write("Hora estimada de chegada: ");
            bw.write(aviões[0].getHoraEstimadaChegada());
            bw.write('\n');
            bw.write("Quantidade de passageiros / Quantidade máxima de passageiros: ");
            bw.write(Integer.toString(aviões[0].quantidadePassageiros));
            bw.write("/");
            bw.write(Integer.toString(aviões[0].quantidadeMaxPassageiros));
            bw.write('\n');
            bw.write('\n');
            bw.write("Códigos das malas presentes no avião: ");

            for (int i = 0; i < aviões[0].codigoMalas.length; i++) {
                if (aviões[0].codigoMalas[i] != 0) {
                    bw.write(Integer.toString(aviões[0].codigoMalas[i]));
                    bw.write(" ");
                }
            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println();
            System.out.println(e);
        }
    }

    public void criaArquivoAvião2(Avioes[] aviões) {

        FileWriter fw;
        BufferedWriter bw;

        try {
            fw = new FileWriter(dadosAvião2);
            bw = new BufferedWriter(fw);

            bw.write("Avião: ");
            bw.write(aviões[1].nome);
            bw.write('\n');
            bw.write('\n');
            bw.write("Código do voo: ");
            bw.write(Integer.toString(aviões[1].numeroDoVoo));
            bw.write('\n');
            bw.write('\n');
            bw.write("Destino: ");
            bw.write(aviões[1].destino.getNomeDest());
            bw.write('\n');
            bw.write('\n');
            bw.write("Hora de saída: ");
            bw.write(aviões[1].getHoraDeSaida());
            bw.write('\n');
            bw.write("Hora estimada de chegada: ");
            bw.write(aviões[1].getHoraEstimadaChegada());
            bw.write('\n');
            bw.write("Quantidade de passageiros / Quantidade máxima de passageiros: ");
            bw.write(Integer.toString(aviões[1].quantidadePassageiros));
            bw.write("/");
            bw.write(Integer.toString(aviões[1].quantidadeMaxPassageiros));
            bw.write('\n');
            bw.write('\n');
            bw.write("Códigos das malas presentes no avião: ");

            for (int i = 0; i < aviões[1].codigoMalas.length; i++) {
                if (aviões[1].codigoMalas[i] != 0) {
                    bw.write(Integer.toString(aviões[1].codigoMalas[i]));
                    bw.write(" ");
                }
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println();
            System.out.println(e);
        }
    }

    public void criaArquivoAvião3(Avioes[] aviões) {

        FileWriter fw;
        BufferedWriter bw;

        try {
            fw = new FileWriter(dadosAvião3);
            bw = new BufferedWriter(fw);

            bw.write("Avião: ");
            bw.write(aviões[2].nome);
            bw.write('\n');
            bw.write('\n');
            bw.write("Código do voo: ");
            bw.write(Integer.toString(aviões[2].numeroDoVoo));
            bw.write('\n');
            bw.write('\n');
            bw.write("Destino: ");
            bw.write(aviões[2].destino.getNomeDest());
            bw.write('\n');
            bw.write('\n');
            bw.write("Hora de saída: ");
            bw.write(aviões[2].getHoraDeSaida());
            bw.write('\n');
            bw.write("Hora estimada de chegada: ");
            bw.write(aviões[2].getHoraEstimadaChegada());
            bw.write('\n');
            bw.write("Quantidade de passageiros / Quantidade máxima de passageiros: ");
            bw.write(Integer.toString(aviões[2].quantidadePassageiros));
            bw.write("/");
            bw.write(Integer.toString(aviões[2].quantidadeMaxPassageiros));
            bw.write('\n');
            bw.write('\n');
            bw.write("Códigos das malas presentes no avião: ");

            for (int i = 0; i < aviões[2].codigoMalas.length; i++) {
                if (aviões[2].codigoMalas[i] != 0) {
                    bw.write(Integer.toString(aviões[2].codigoMalas[i]));
                    bw.write(" ");
                }
            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println();
            System.out.println(e);
        }
    }

    public void criaArquivoAvião4(Avioes[] aviões) {

        FileWriter fw;
        BufferedWriter bw;

        try {
            fw = new FileWriter(dadosAvião4);
            bw = new BufferedWriter(fw);

            bw.write("Avião: ");
            bw.write(aviões[3].nome);
            bw.write('\n');
            bw.write('\n');
            bw.write("Código do voo: ");
            bw.write(Integer.toString(aviões[3].numeroDoVoo));
            bw.write('\n');
            bw.write('\n');
            bw.write("Destino: ");
            bw.write(aviões[3].destino.getNomeDest());
            bw.write('\n');
            bw.write('\n');
            bw.write("Hora de saída: ");
            bw.write(aviões[3].getHoraDeSaida());
            bw.write('\n');
            bw.write("Hora estimada de chegada: ");
            bw.write(aviões[3].getHoraEstimadaChegada());
            bw.write('\n');
            bw.write("Quantidade de passageiros / Quantidade máxima de passageiros: ");
            bw.write(Integer.toString(aviões[3].quantidadePassageiros));
            bw.write("/");
            bw.write(Integer.toString(aviões[3].quantidadeMaxPassageiros));
            bw.write('\n');
            bw.write('\n');
            bw.write("Códigos das malas presentes no avião: ");

            for (int i = 0; i < aviões[3].codigoMalas.length; i++) {
                if (aviões[3].codigoMalas[i] != 0) {
                    bw.write(Integer.toString(aviões[3].codigoMalas[i]));
                    bw.write(" ");
                }
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println();
            System.out.println(e);
        }
    }
}
