package entidades;

public class Cliente extends PessoaFisica {    
  
    public Cliente(String cpf){
        super(cpf);
    }    
    
 
    private int scoreCredito;
    
 
    public int getScoreCredito() {
        return scoreCredito;
    }
    public void setScoreCredito(int scoreCredito) {
        this.scoreCredito = scoreCredito;
    }

    public String toString() {
        return super.toString() + "\nScore de crédito: " + getScoreCredito();
    }

    public String toJson() {
        return super.toJson() + "\t\"scoreCredito\": \"" + getScoreCredito() + "\"\n" +
                "}";
    }
}
