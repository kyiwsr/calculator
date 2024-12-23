import javax.swing.*;

public class Button {
    
    private JButton button;

    public Button(){
        button = new JButton();
    }

    public void buttonAttributes()
    {
        button.setBounds(150,200,100,100);
        button.setText("symbol");
        button.setVisible(true);
    }

    public JButton getButton(){
        return button;
    }
}
