//View: GUI
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class CalcView {

    JFrame frame;
    private Screen screen;
    private String[] buttonList = {"C","%","÷","x","7","8","9","-","4","5","6","+","1","2","3","=","0","."};
    private int positionX = 15, positionY = 200, width = 84, height = 84, space = 10;

    public CalcView(){

    }

    public void programe()
    {
        frame = new JFrame("Colourful Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(410,708);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        screen = new Screen();
        screen.screenAttributes();
        frame.add(screen.getscreen());

        addButtons();
        
    }

    private void addButtons(){
        for(int i = 0; i < buttonList.length; i++)
        {
            Button button = new Button();
            button.buttonAttributes();
            button.getButton().setText(buttonList[i]);
            button.getButton().setFont(new Font("Arial", Font.BOLD, 14));
            button.getButton().setBackground(Color.LIGHT_GRAY);

            if(buttonList[i].equals("=")){
                button.getButton().setBounds(positionX,positionY,width,178);
                positionX += 178 + space;
            }
            else if (buttonList[i].equals("0") || buttonList[i].equals(".") ) {
                button.getButton().setBounds(positionX + 95,positionY,width,height);
            }
            else{
                button.getButton().setBounds(positionX,positionY,width,height);
            }

            positionX += + width + space; 
            if((i + 1) % 4 == 0)
            {
                positionX = 15;
                positionY += height + space;
            }

            frame.add(button.getButton());
        }
    }   
}
