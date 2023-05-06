import javax.swing.*;
import java.awt.*;

public class TrafficLight {


    private JPanel jPanelMain;


    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setTitle("stepik traffic light");
        jf.setResizable(true);

        jf.setSize(800, 800);
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

        Color col = new Color(60, 60, 60);

        g.setColor(col);
        g.fillArc(360, 170, 130, 50, 0, 180);


        int[] x = {345, 345, 295};
        int[] y = {230, 280, 230};
        g.fillPolygon(x, y, 3);
        x = new int[]{345, 345, 295};
        y = new int[]{340, 390, 340};
        g.fillPolygon(x, y, 3);
        x = new int[]{345, 345, 295};
        y = new int[]{450, 500, 450};
        g.fillPolygon(x, y, 3);

        x = new int[]{505, 505, 555};
        y = new int[]{230, 280, 230};
        g.fillPolygon(x, y, 3);
        x = new int[]{505, 505, 555};
        y = new int[]{340, 390, 340};
        g.fillPolygon(x, y, 3);
        x = new int[]{505, 505, 555};
        y = new int[]{450, 500, 450};
        g.fillPolygon(x, y, 3);

        g.fillRoundRect(350, 200, 150, 400,20, 20);
        g.fillRoundRect(387, 605, 75, 75,20, 20);

        g.setColor(Color.lightGray);
        g.fillOval(370,210,110, 110);
        g.fillOval(370,335,110, 110);
        g.fillOval(370,460,110, 110);

        g.setColor(col);
        g.fillOval(370,220,110, 110);
        g.fillOval(370,345,110, 110);
        g.fillOval(370,470,110, 110);

        g.setColor(new Color(255, 0, 0)); //red
        g.fillOval(380,230,90, 90);
        g.setColor(new Color(255, 165, 0)); //yellow
        g.fillOval(380,355,90, 90);
        g.setColor(new Color(60, 179, 113)); //green
        g.fillOval(380,480,90, 90);

        //



        //
        //g.fillOval(100,100, 50, 50);

        //System.out.println("Inside paintComponent");

    }

}