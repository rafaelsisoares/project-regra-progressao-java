package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    int somaDosPesos = 0;
    int notaBruta = 0;
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Integer> peso = new ArrayList<Integer>();
    ArrayList<Integer> notas = new ArrayList<Integer>();

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int numeroAtividades = input.nextInt();

    for (int i = 1; i <= numeroAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ": ");
      final String atividadeAtual = input.next();
      input.nextLine();
      System.out.println("Digite o peso da atividade " + i + ": ");
      int pesoAtual = input.nextInt();
      peso.add(pesoAtual);
      somaDosPesos += pesoAtual;
      System.out.println("Digite a nota obtida para " + atividadeAtual + ": ");
      notas.add(input.nextInt());
    }

    if (somaDosPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      for (int i = 0; i < notas.size(); i++) {
        notaBruta += (notas.get(i) * peso.get(i));
      }
      double notaFinal = notaBruta / somaDosPesos;
      if (notaFinal >= 85.0) {
        System.out.println("Parabéns! Você alcançou " + notaFinal
            + "%! E temos o prazer de informar que você obteve aprovação!");
      } else {
        System.out
            .println("Lamentamos informar que, com base na sua pontuação alcançada neste período, "
                + notaFinal
                + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
      }
    }

    input.close();
  }
}
