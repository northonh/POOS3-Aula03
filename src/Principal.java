public class Principal {
    public static void main(String[] args) {
/*        Pessoa joao = new Pessoa();

        joao.nome = "Marcelo";
        System.out.println("joao = " + joao);
        System.out.println("joao.nome = " + joao.nome);
        System.out.println("joao.estadoCivil = " + joao.estadoCivil);
        System.out.println("joao.conjuge = " + joao.conjuge);

        // Antes de se conhecerem
        Pessoa romeu = new Pessoa("Romeu Montecchio", EstadoCivil.SOLTEIRO, null);
        System.out.println("romeu = " + romeu);
        System.out.println("romeu.nome = " + romeu.nome);
        System.out.println("romeu.estadoCivil = " + romeu.estadoCivil);
        System.out.println("romeu.conjuge = " + romeu.conjuge);

        Pessoa julieta = new Pessoa("Julieta Capuleto", EstadoCivil.SOLTEIRO, null);
        System.out.println("julieta = " + julieta);
        System.out.println("julieta.nome = " + julieta.nome);
        System.out.println("julieta.estadoCivil = " + julieta.estadoCivil);
        System.out.println("julieta.conjuge = " + julieta.conjuge);

        // Se a história fosse diferente
        romeu.casar(julieta, "Capuleto");
        julieta.casar(romeu, "Montecchio");

        System.out.println("romeu.nome = " + romeu.nome);
        System.out.println("romeu.estadoCivil = " + romeu.estadoCivil);
        System.out.println("romeu.conjuge = " + romeu.conjuge);

        System.out.println("julieta.nome = " + julieta.nome);
        System.out.println("julieta.estadoCivil = " + julieta.estadoCivil);
        System.out.println("julieta.conjuge = " + julieta.conjuge);

        Pessoa maria = new Pessoa("Maria", EstadoCivil.SOLTEIRO, null);
        joao.casar(maria);
        maria.casar(joao);*/

        Individuo mario = new Individuo("Mario", EstadoCivil.DIVORCIADO, null);
        System.out.println("mario = " + mario);
        //mario.nome = "Joao Mario";
        //System.out.println("mario.nome = " + mario.nome);
        System.out.println("mario.nome = " + mario.getNome());
        mario.setNome("Luigi");
        System.out.println("mario.nome = " + mario.getNome());

/*        Individuo divorciado;
        divorciado = Individuo.individuoDivorciado("José");
        System.out.println("divorciado.estadoCivil = " + divorciado.getEstadoCivil());
        System.out.println("divorciado.conjuge = " + divorciado.getConjuge());*/
    }
}
