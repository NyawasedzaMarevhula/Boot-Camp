import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String results;
        results = JOptionPane. showInputDialog(null, "what is your name?");
        JOptionPane.showMessageDialog(null, " Hello" + results + " !");
    }
}
