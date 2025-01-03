import javax.swing.*;

public class Main extends JFrame
{

    Main()
    {
        super("Snake Game");
        add(new Board());
        pack();

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Main();
}
}