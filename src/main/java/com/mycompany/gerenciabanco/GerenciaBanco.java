package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class GerenciaBanco {
    
    //Poderia ter sido colocado em uma classe destinada a representar o banco.
    public static void menu(){
        System.out.println("-----MENU-----");
        System.out.println("Selecione uma opcao:");
        System.out.println("[1]Consultar Saldo\n[2]Realizar Deposito\n[3]Realizar Saque\n[4]Encerrar Menu");
    }

    public static void main(String... args) {
        Cliente c1 = new Cliente("Nome do cliente", "123456789");
            
        Scanner n = new Scanner(System.in);
        
        
        menu();
        int opcao = n.nextInt();
        int iteracao = 1;

        while (iteracao == 1) {

            switch (opcao) {
                case 1 ->
                    c1.consultarSaldo();
                case 2 ->
                    c1.deposito();
                case 3 ->
                    c1.saque();
                case 4 -> {
                    System.out.println("Fechando Menu...");
                    System.out.println("Volte sempre!");
                    iteracao = 0;
                }
                default ->
                    System.out.println("Valor inválido, tente novamente");
            }
            if (iteracao != 0) {
                System.out.println("Selecione uma opcao:");
                System.out.println("[1]Consultar Saldo\n[2]Realizar Deposito\n[3]Realizar Saque\n[4]Encerrar Menu");
                opcao = n.nextInt();
            }
        }
        n.close();
    }
}
