package aula11;

public class Telefone {
    public String ddd;
    public String numero; 
     
    public Telefone(String numero, String ddd){   
        this.ddd = ddd;
        this.numero = numero;   
    }
    
    public String getTelefone(){   
        return "(" + ddd + ") "+ numero;
    }
}
