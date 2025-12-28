import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 extends JFrame {
      private JTextField textField;
      private String value = "";

       public static void main(String[] args) 
	{
                Calculator2 frame = new Calculator2();
                frame.setVisible(true);
         }

        public Calculator2() {
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 600);
        JPanel contentPane = new JPanel();
       // contentPane.setLayout(null);
       // setContentPane(contentPane);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
        textField.setBounds(20, 20, 340, 50);
        textField.setEditable(false);
        contentPane.add(textField);

        String[] buttonLabels = {
                "C", "/", "*", "-", "7", "8", "9", "+",
                "4", "5", "6", "1", "2", "3", "0", "="
        };

        int x = 20, y = 100, width = 80, height = 50, gap = 10;

        for (int i = 0; i < buttonLabels.length; i++) {
            JButton button = new JButton(buttonLabels[i]);
            button.setFont(new Font("Tahoma", Font.BOLD, 18));
            button.setBounds(x, y, width, height);
            contentPane.add(button);

            if (i % 4 == 3) { // Move to next row
                x = 20;
                y += height + gap;
            } else {
                x += width + gap;
            }

            button.addActionListener(new ButtonClickListener(buttonLabels[i]));
        }
    }

    private class ButtonClickListener implements ActionListener {
        private final String label;

        public ButtonClickListener(String label) {
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (label.equals("C")) 
		{
                value = "";
                textField.setText(value);
            } 
		else if (label.equals("=")) 
		{
                       value = evaluateExpression(value);
                    textField.setText(value);
                } 
            
		else 
		{
               	 	value += label;
                	textField.setText(value);
            }
        }
    }

    private String evaluateExpression(String expression)  {
        String[] operators = {"+", "-", "*", "/"};
        for (String op : operators) 
		{
            if (expression.contains(op))
		 {
                String[] parts = expression.split("\\" + op);
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                return switch (op)
			 {
                    case "+" -> String.valueOf(num1 + num2);
                    case "-" -> String.valueOf(num1 - num2);
                    case "*" -> String.valueOf(num1 * num2);
                    case "/" -> String.valueOf(num1 / num2);
                     };
            }
        }
        
    }
}
