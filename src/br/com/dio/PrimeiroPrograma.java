package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    private static Object Livro;

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro = new Livro("O Hobbit", 350);
        System.out.println(Livro);

        /*int a= 5;
        int b= 3;
        System.out.println("hello world! " + (a+b));*/


    }
}

class Livro {
    private String nome;
    private Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}

