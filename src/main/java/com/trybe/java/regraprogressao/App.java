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
    }

    input.close();
  }
}
