import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?"); //this is the first line of code

        JOptionPane.showMessageDialog(null, "Hello " +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"you are " + age + "years old" );
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"you are " + height + "cm tall" );
    }
}
