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
      peso.add(input.nextInt());
      System.out.println("Digite a nota obtida para " + atividadeAtual + ": ");
      notas.add(input.nextInt());
    }

    input.close();
  }
}
