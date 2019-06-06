package aula11_swing;

public class Contato {
    protected String nome;
    protected String telefone;
    protected String detalhes;

    public Contato() {
        nome = "";
        telefone = "";
        detalhes = "";
    }

    public Contato(String nome, String telefone, String detalhes) {
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}