package Exercicio03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Imforme nome");
        String nome = sc.next();
        System.out.println("Imforme endereco");
        String endereco = sc.next();
        System.out.println("Imforme telefone");
        int telefone = sc.nextInt();
        Pessoa pessoa01 = new Pessoa();

        pessoa01.setNome(nome);
        pessoa01.setEndereco(endereco);
        pessoa01.setTelefone(telefone);
        pessoa01.exebir();



    }
}
