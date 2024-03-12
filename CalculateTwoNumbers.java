import javax.swing.JOptionPane;
public class CalculateTwoNumbers{
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ");

        strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "Sum: " + Double.toString(num1+num2));
        JOptionPane.showMessageDialog(null, "Difference: " + Double.toString(num1-num2));
        JOptionPane.showMessageDialog(null, "Product: " + Double.toString(num1*num2));
        JOptionPane.showMessageDialog(null, "Quotient: " + Double.toString(num1/num2));
        System.exit(0);
    }
}