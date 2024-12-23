import javax.swing.*;

public class Button {
    
    private JButton button;

    public Button(){
        button = new JButton();
    }

    public void buttonAttributes()
    {
        button.setVisible(true);
    }

    public JButton getButton(){
        return button;
    }
}
