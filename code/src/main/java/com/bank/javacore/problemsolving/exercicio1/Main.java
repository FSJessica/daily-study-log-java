package main.java.com.bank.javacore.problemsolving.exercicio1;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Cachorro();

        animal.emitirSom(3);

        int[] numeros = {1, 2, 3, 4};

        for (int i = 0; i <= numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
