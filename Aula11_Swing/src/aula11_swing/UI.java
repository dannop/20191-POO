package aula11_swing;

import javax.swing.*;
//import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class UI extends JFrame {
   
    public final void initUI(Agenda a) {
       JPanel mainPanel = new JPanel();
       JList contactList = new JList(a.getContatos());
       JScrollPane scroll = new JScrollPane(contactList);
       JPanel dataPanel = new JPanel();
       JPanel buttons = new JPanel();
       JLabel nameLabel = new JLabel("Nome: ");
       JTextField nameField = new JTextField(20);
       JLabel phoneLabel = new JLabel("Telefone: ");
       JTextField phoneField = new JTextField(20);
       JLabel detailsLabel = new JLabel("Detalhes: ");
       JTextArea detailsField = new JTextArea(5, 20);
       
       JButton addButton = setButton("Adiciona", "Adiciona contato na agenda", a);
       JButton rmvButton = setButton("Remove", "Remove contato da agenda", a);
       JButton updtButton = setButton("Atualiza", "Atualiza contato da agenda", a);
       
       addButton.addActionListener((ActionEvent event) -> {
           Contato c = new Contato();
           c.setNome(nameField.getText());
           c.setTelefone(phoneField.getText());
           c.setDetalhes(detailsField.getText());
           
           a.inserir(c);
       });
       
       rmvButton.addActionListener((ActionEvent event) -> {
           Contato c = (Contato) contactList.getSelectedValue();
           
           a.remover(c);
           
           nameField.setText("");
           phoneField.setText("");
           detailsField.setText("");
       });
       
       updtButton.addActionListener((ActionEvent event) -> {
           Contato c = (Contato) contactList.getSelectedValue();
           c.setNome(nameField.getText());
           c.setTelefone(phoneField.getText());
           c.setDetalhes(detailsField.getText());
           
           a.atualizar(c);
       });
       
       MouseListener mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Contato c = (Contato) contactList.getSelectedValue();
                nameField.setText(c.nome);
                phoneField.setText(c.telefone);
                detailsField.setText(c.detalhes);
            }
       };
       contactList.setCellRenderer(new ContatoRenderer());
       contactList.addMouseListener(mouseListener);
       
       mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
       getContentPane().add(mainPanel);
       
       contactList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       scroll.setMinimumSize(new Dimension(300, 400));
       mainPanel.add(scroll);
       
       dataPanel.setLayout(new GridLayout(0,2));
       dataPanel.setMaximumSize(new Dimension(500, 400));
       nameLabel.setHorizontalTextPosition(JLabel.LEFT);
       
       phoneLabel.setHorizontalTextPosition(JLabel.LEFT); 
       detailsLabel.setHorizontalTextPosition(JLabel.LEFT);
       buttons.setLayout(new BorderLayout());
       buttons.add(addButton, BorderLayout.WEST);
       buttons.add(rmvButton, BorderLayout.CENTER);
       buttons.add(updtButton, BorderLayout.EAST);
       
       dataPanel.add(nameLabel);
       dataPanel.add(nameField);
       dataPanel.add(phoneLabel);
       dataPanel.add(phoneField);
       dataPanel.add(detailsLabel);
       dataPanel.add(detailsField);
       dataPanel.add(buttons);  
       
       mainPanel.add(dataPanel);
       
       setTitle("Agenda");
       setSize(800, 400);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       //pack();
    }
    
    public static JButton setButton(String name, String toolTip, Agenda a){
       JButton button = new JButton(name);
       button.setToolTipText(toolTip); 
       button.setVerticalTextPosition (AbstractButton.CENTER);
       button.setHorizontalTextPosition (AbstractButton.CENTER);
       
       return button; 
    }
}