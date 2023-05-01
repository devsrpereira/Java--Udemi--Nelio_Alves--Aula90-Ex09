package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nQuantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] nameVect = new String[n];
        int[] oldVect = new int[n];
        String nameVelho = null;
        int maiorOld = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: %n",(i+1));
            System.out.print("Nome: ");
            nameVect[i] = sc.next();
            System.out.printf("Idade: ");
            oldVect[i] = sc.nextInt();

            nameVelho = oldVect[i] > maiorOld ? nameVect[i]  : nameVelho;
            maiorOld = oldVect[i] > maiorOld ? oldVect[i]  : maiorOld;
        }

        System.out.printf("PESSOA MAIS VELHA: %s",nameVelho);

        System.out.println();
        sc.close();
    }
}
