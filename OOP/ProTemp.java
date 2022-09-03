package OOP;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProTemp extends JFrame{
	// Declare the element
	JRadioButton celcius = new JRadioButton("Celcius");
	JRadioButton fahrenheit = new JRadioButton("Fahrenheit");
	JTextField temperature = new JTextField(10);
	JTextArea result = new JTextArea(7,25);

	//declare the panel
	static JPanel num1 =new JPanel();
	static JPanel num2 =new JPanel();
	static JPanel num3 =new JPanel();

	ProTemp(){
	//to select only option
	ButtonGroup select = new ButtonGroup();
	select.add(celcius);
	select.add(fahrenheit);

	//for entery field
	num1.add(new JLabel("Enter Temperature: "));
	num1.add(temperature);

	//radio button declaration
	num2.setLayout(new FlowLayout());
	num2.add(new JLabel("Select :"));
	num2.add(celcius);
	num2.add(fahrenheit);

	//Result field
	num3.add(result);

	//add action listener to radio button
	fahrenheit.addActionListener(new calculate());
	celcius.addActionListener(new calculate());

	}

	public static void main(String[] args) {

		//program interface and location
		ProTemp test = new ProTemp();
		test.setLayout(new BorderLayout());
		test.add(num1,BorderLayout.NORTH);
		test.add(num2,BorderLayout.CENTER);
		test.add(num3,BorderLayout.SOUTH);

		//to make program visible and set size program
		test.setVisible(true);
		test.setSize(340,250);

		//title program
		test.setTitle("Temperature Converter");

		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//location program appear
		test.setLocation(500, 200);
		}
		// action listener class
		class calculate implements ActionListener{

		public void actionPerformed(ActionEvent e)  {

		double temp=Double.parseDouble(temperature.getText());
		Object obj = e.getSource();

		if(obj==celcius) {
		result.setText("In Celcius is: "+temp+"\n\nIn Fahrenheit is: "+tofahrenheit(temp));
		}
		else if(obj==fahrenheit) {
		result.setText("In Fahrenheit is: "+temp+"\n\nIn Celcius is: "+tocelcius(temp));
		}
		}
		//method for to convert to celcius
		public double tocelcius(double fahrenheit) {
		return (int)(Math.round((fahrenheit - 32) * (5.0 / 9.0)));
		}
		//method for to convert to fahrenheit
		public double tofahrenheit(double celcius) {
		return (int)(Math.round(celcius * 1.8 + 32));
		}
		}

	}
