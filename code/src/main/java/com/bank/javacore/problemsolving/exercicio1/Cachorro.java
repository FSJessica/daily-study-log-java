package main.java.com.bank.javacore.problemsolving.exercicio1;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        System.out.println("Cachorro criado");
    }

    @Override
    public void emitirSom(int quantidade) {
        for (int i = 0; i <= quantidade; i++) {
            if (i == 2) {
                continue;
            }

            System.out.println("Au au");
        }
    }
}