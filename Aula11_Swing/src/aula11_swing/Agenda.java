package aula11_swing;

import javax.swing.DefaultListModel;

public class Agenda {
    private final DefaultListModel<Contato> contatos;

    public Agenda() {
        contatos = new DefaultListModel();
    }

    public void inserir(Contato c) {
        contatos.addElement(c);
    }
    
    public void remover(Contato c) {
        contatos.removeElement(c);
    }
    
    public void atualizar(Contato c) {
        contatos.set(0, c);
    }
    
    public DefaultListModel<Contato> getContatos() {
        return contatos;
    }

    public int getQuantidade() {
        return contatos.size();
    }
}
