import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener
{
private TextField firstNumberField, secondNumberField, resultField;
private Button addButton, subtractButton, multiplyButton, divideButton;
private Label firstNumberLabel, secondNumberLabel, resultLabel;

calculator()
{
firstNumberField = new TextField();
secondNumberField = new TextField();
resultField = new TextField();
firstNumberLabel = new Label("Enter first Number: ");
secondNumberLabel = new Label("Enter second Number: ");
resultLabel = new Label("Result: ");
addButton = new Button("+");
subtractButton = new Button("-");
multiplyButton = new Button("*");
divideButton = new Button("/");

add(firstNumberField);
add(secondNumberField);
add(resultField);
add(addButton);
add(subtractButton);
add(multiplyButton);
add(divideButton);
add(firstNumberLabel);
add(secondNumberLabel);
add(resultLabel);

setLayout(null);

firstNumberLabel.setBounds(30, 50, 190, 30);
firstNumberField.setBounds(180, 50, 100, 30);
secondNumberLabel.setBounds(30, 80, 190, 30);
secondNumberField.setBounds(180, 80, 100, 30);
addButton.setBounds(35, 120, 50, 28);
subtractButton.setBounds(95, 120, 50, 28);
multiplyButton.setBounds(155, 120, 50, 28);
divideButton.setBounds(215, 120, 50, 28);
resultLabel.setBounds(30, 155, 35, 28);
resultField.setBounds(180, 155, 100, 30);


addButton.addActionListener(this);
subtractButton.addActionListener(this);
multiplyButton.addActionListener(this);
divideButton.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
try
{
double firstNumber = Double.parseDouble(firstNumberField.getText());
double secondNumber = Double.parseDouble(secondNumberField.getText());

Object source = ae.getSource();
double result = 0;

if (source == addButton)
{
result = firstNumber + secondNumber;
}
else if (source == subtractButton)
{
result = firstNumber - secondNumber;
}
else if (source == multiplyButton)
{
result = firstNumber * secondNumber;
}
else if (source == divideButton)
{
if (secondNumber != 0)
{
result = firstNumber / secondNumber;
}
else
{
resultField.setText("Error: Division by zero");
return;
}
}

resultField.setText(String.valueOf(result));
} catch (NumberFormatException e) {
resultField.setText("Invalid input");
}        
}

public static void main(String args[])
{
calculator cal = new calculator();
cal.setBackground(Color.pink);
cal.setTitle("Calculator");
cal.setSize(300, 200);
cal.setVisible(true);
}
}