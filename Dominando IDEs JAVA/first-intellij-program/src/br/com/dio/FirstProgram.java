package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class FirstProgram {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro("Random Book Name", 300);
        System.out.println(livro);
        /*int a = 5;''
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}
