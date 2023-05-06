import javax.swing.*;
import java.awt.*;

public class TrafficLight {


    private JPanel jPanelMain;


    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setTitle("stepik traffic light");
        jf.setResizable(true);

        jf.setSize(1000, 1500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        NewPanel np = new NewPanel();
        jf.getContentPane().add(np);


        jf.setVisible(true);

    }


}

class NewPanel extends JPanel{

    public NewPanel()
    {
        this.setBackground(Color.lightGray);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Hello World!", 100, 100);
        g.drawOval(150, 150, 100, 100);
        g.drawRect(150, 270, 100, 100);
        System.out.println("Inside paintComponent");

    }

}