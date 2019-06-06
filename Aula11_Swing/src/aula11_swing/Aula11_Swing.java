package aula11_swing;

//author: Camila Camilo, Daniel Lessa, Maria Clara Mussi, Matheus Machado

public class Aula11_Swing {

    public static void main(String[] args) {
        Agenda a = new Agenda();
        UI ui = new UI();
        ui.initUI(a);
        ui.setVisible(true);
    }
    
}
