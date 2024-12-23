import javax.swing.*;

public class Screen {

    private JTextField screen;

    public Screen(){
        screen = new JTextField();
    }
    
    public void screenAttributes(){
        screen.setBounds(10, 10, 376, 170);
    }

    public JTextField getscreen(){
        return screen;
    }
}
