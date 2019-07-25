package br.com.cezarcruz;

public class Main {

    public static void main(final String[] args) {
        final PessoaLombok p = PessoaLombok.builder().idade(10).nome("Pessoa").build();
        final PessoaLombok p2 = p.toBuilder().nome("Pessoa 2").build();

        System.out.println(p);
        System.out.println(p2);
    }
}
