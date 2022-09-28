package entidades;

import java.time.LocalDate;

public class PessoaFisica {
    private String nome;
    private Endereco endereco;
    private Documento documento;
    private Contato contato;
    private LocalDate dataNascimento;
    
    // Construtor
    public PessoaFisica(String cpf){
        setDocumento(new Documento(cpf));
        setEndereco(new Endereco(null));
        Contato contato = new Contato();
        setContato(contato);
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }
    /**
     * Método que permite alterar o nome
     * @param nome
     */

    public Endereco getEndereco() {
        return endereco;
    }
    /**
     * Método que permite alterar o endereço
     * @param endereco
     */


    public Documento getDocumento() {
        return documento;
    }
    public Contato getContato() {
        return contato;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getDocumento().getCpf() + "\nData de nascimento: " + getDataNascimento() + "\nEndereço: " + getEndereco().toString() + "\nContato: " + getContato().toString();
    }

    public String toJson() {
        return "{\n\t\"nome\": \"" + getNome() + "\",\n\t\"documentos\":" + getDocumento().toJson() + "\n\t\"dataNascimento\": \"" + getDataNascimento() + "\",\n\t\"endereco\": " + getEndereco().toJson() + ",\n\t\"contato\": " + getContato().toJson() + "\n";
    }
    
}
