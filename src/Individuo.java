public class Individuo {
    private String nome;
    private EstadoCivil estadoCivil;
    private Individuo conjuge;
    public Individuo() {
        nome = "João";
        estadoCivil = EstadoCivil.SOLTEIRO;
        conjuge = null;
    }

    public Individuo(String nome, EstadoCivil estadoCivil, Individuo conjuge) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.conjuge = conjuge;
    }

    public void casar(Individuo conjuge, String sobrenome){
        estadoCivil = EstadoCivil.CASADO;
        this.conjuge = conjuge;
        nome += " " + sobrenome;
    }

    public void casar(Individuo conjuge) {
        estadoCivil = EstadoCivil.CASADO;
        this.conjuge = conjuge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isBlank() && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Individuo getConjuge() {
        return conjuge;
    }

    public void setConjuge(Individuo conjuge) {
        this.conjuge = conjuge;
    }

    public static Individuo individuoDivorciado(String nome) {
        return new Individuo(nome, EstadoCivil.DIVORCIADO, null);
    }
}
