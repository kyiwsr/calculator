//View: GUI
import javax.swing.*;

public class CalcView {

    JFrame frame;
    private Button button;
    private String[] list = {"C","%","/","*","7","8","9","-","4","5","6","+","1","2","3","=","0","."};
    public int positionX = 10;
    public int positionY = 10;
    public int width = 100;
    public int height = 100;
    public int space = 10;


    public CalcView(){

    }

    public void programe()
    {
        frame = new JFrame("Colourful Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(463,700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        
        for(int i = 0; i < list.length; i++)
        {
        
            button = new Button();
            button.buttonAttributes();
            button.getButton().setText(list[i]);

            if(list[i] == "="){
                button.getButton().setBounds(positionX,positionY,width,210);
            }
            else if (list[i] == "0" || list[i] == "." ) {
                button.getButton().setBounds(positionX + 112,positionY,width,height);
            }
            else{
                button.getButton().setBounds(positionX,positionY,width,height);
            }

            positionX += + width + space; 
            if((i + 1) % 4 == 0)
            {
                positionX = 10;
                positionY += height + space;
            }

            frame.add(button.getButton());
        }
       

        

 
    }  
        
}
