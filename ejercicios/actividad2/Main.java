package ejercicios.actividad2;
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame{
    private static final long serialVersionUID = 1L;
    public Main()
    {
        this.setSize(900,600);
        this.setVisible(true);
    }
    public static void main(String args[])
    {
        Main window = new Main();
        window.addWindowListener((WindowListener) new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}