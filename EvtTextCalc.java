package kuis_sem_3;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

	public class EvtTextCalc extends JFrame implements ActionListener {

	private JTextField txtnum1,txtnum2;

	private JLabel lblAnswer= new JLabel();
	private static JPanel p1= new JPanel();
	private static JPanel p2= new JPanel();

	public EvtTextCalc (){
	txtnum1= new JTextField(8);
	txtnum2= new JTextField(8);
	new JLabel();

	p1.add(new JLabel("First Number :"));
	p1.add(txtnum1);
	p1.add(new JLabel("Second Number :"));
	p1.add(txtnum2);
	p2.add(new JLabel("Total Summation :"));
	p2.add(lblAnswer);

	txtnum1.addActionListener(this);
	txtnum2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {

	String str;
	int val1, val2, total;

	str = txtnum1.getText();
	if(str.equals(""))
	val1 = 0;
	else
	val1 = Integer.parseInt(str);

	str = txtnum2.getText();
	if(str.equals(""))
	val2 = 0;
	else
	val2 = Integer.parseInt(str);

	total = val1+val2;
	lblAnswer.setText(""+total);
	}
	public static void main (String[] args){

	JFrame frame1=new EvtTextCalc();
	frame1.setLayout(new BorderLayout());
	frame1.add(p1,BorderLayout.NORTH);
	frame1.add(p2,BorderLayout.SOUTH);

	frame1.setTitle("Sum Calculation");
	frame1.setSize(500,300);
	frame1.setLocation(500,300);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setVisible(true);
	}
	}

