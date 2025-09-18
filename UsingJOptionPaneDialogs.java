import javax.swing.*;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog("Enter your name:");
            if (name == null) {
                break;
            }
            int response = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;
            }
        }
    }
}
