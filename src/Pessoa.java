enum EstadoCivil {SOLTEIRO, CASADO, DIVORCIADO, VIUVO}
public class Pessoa {
    String nome;
    EstadoCivil estadoCivil;
    Pessoa conjuge;
    public Pessoa() {
        nome = "João";
        estadoCivil = EstadoCivil.SOLTEIRO;
        conjuge = null;
    }

    public Pessoa(String nome, EstadoCivil estadoCivil, Pessoa conjuge) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.conjuge = conjuge;
    }

    public void casar(Pessoa conjuge, String sobrenome){
        estadoCivil = EstadoCivil.CASADO;
        this.conjuge = conjuge;
        nome += " " + sobrenome;
    }

    public void casar(Pessoa conjuge) {
        estadoCivil = EstadoCivil.CASADO;
        this.conjuge = conjuge;
    }
}
