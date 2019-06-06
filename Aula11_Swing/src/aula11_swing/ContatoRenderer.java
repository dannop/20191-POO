package aula11_swing;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ContatoRenderer extends JLabel implements ListCellRenderer<Contato>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Contato> list, Contato value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getNome());
         
        return this;
    }
    
}
