//View: GUI
import javax.swing.*;

public class CalcView {

    JFrame frame;
    private Button button;
    private Screen screen;
    private String[] list = {"C","%","/","*","7","8","9","-","4","5","6","+","1","2","3","=","0","."};
    public int positionX = 15;
    public int positionY = 200;
    public int width = 84;
    public int height = 84;
    public int space = 10;
    public int k = 100;

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
        
        for(int i = 0; i < list.length; i++)
        {
        
            button = new Button();
            button.buttonAttributes();
            button.getButton().setText(list[i]);

            if(list[i] == "="){
                button.getButton().setBounds(positionX,positionY,width,178);
            }
            else if (list[i] == "0" || list[i] == "." ) {
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
