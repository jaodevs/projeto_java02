package entidades;

public class Cliente extends PessoaFisica {    
    // Construtor
    public Cliente(String cpf){
        super(cpf);
    }    
    
    // Atributos especificos da classe cliente
    private int scoreCredito;
    
    // Getters e setters
    public int getScoreCredito() {
        return scoreCredito;
    }
    public void setScoreCredito(int scoreCredito) {
        this.scoreCredito = scoreCredito;
    }

    public String toString() {
        return super.toString() + "\nScore de crédito: " + getScoreCredito();
    }

    // Gerando um JSON
    public String toJson() {
        return super.toJson() + "\t\"scoreCredito\": \"" + getScoreCredito() + "\"\n" +
                "}";
    }
}
