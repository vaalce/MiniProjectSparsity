import javax.swing.*;
import java.awt.*;


public class SparGUI {
    private JTextField dimensionality;
    private JTextField peerID;
    private JButton saveButton;
    private JTextPane textPane1;
    private JTextField vectorValue;
    private JButton searchButton;
    private JPanel panelMain;
    private JButton connectButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("SparGUI");
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setContentPane(new SparGUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}