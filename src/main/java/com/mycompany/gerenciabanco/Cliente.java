package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class Cliente extends Pessoa {

    private float saldo;

    public void consultarSaldo() {
        System.out.printf("\nSaldo atual: %.2f\n\n", this.saldo);
    }

    public Cliente(String nomeCompleto, String CPF) {
        super(nomeCompleto, CPF);
        this.saldo = 0f;
    }

    public float deposito() {
        System.out.println("Digite o valor a ser depositado: ");
        Scanner entradaValor = new Scanner(System.in);
        float n = entradaValor.nextFloat();
        if (n > 0) {
            this.saldo += n;
            System.out.println("Deposito realizado com sucesso!\n");
        } else {
            System.out.println("Valor de deposito invalido! Tente novamente.\n");
        }
        return this.saldo;
    }

    public float saque() {
        System.out.println("Digite o valor a ser sacado: ");
        Scanner entradaValor = new Scanner(System.in);
        float n = entradaValor.nextFloat();
        if (n <= this.saldo) {
            this.saldo -= n;
            System.out.println("Saque realizado com sucesso!\n");
        } else {
            System.out.println("Valor de saque invalido! Tente novamente.\n");
        }
        return this.saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
