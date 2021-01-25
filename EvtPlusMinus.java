package kuis_sem_3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EvtPlusMinus extends JFrame implements ActionListener{

	private JButton btnPlus,btnMinus;
	private JLabel lblValue;
	private int value=0;
	private static JPanel p1,p2;
	
	public EvtPlusMinus(){
		btnPlus = new JButton("++");
		btnMinus = new JButton("--");
		lblValue = new JLabel("0");
		p1 = new JPanel();
		p2 = new JPanel();
		p1.add(btnPlus);
		p1.add(btnMinus);
		p2.add(lblValue);
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==btnPlus) {
			value++;
			lblValue.setText(""+value);
		}
		
		else if(obj==btnMinus) {
			value--;
			lblValue.setText(""+value);
		}
	}
	
	public static void main(String[] args) {
		
	JFrame frame1 = new EvtPlusMinus();
	frame1.setLayout(new BorderLayout());
	frame1.add(p1,BorderLayout.NORTH);
	frame1.add(p2,BorderLayout.SOUTH);
	
	frame1.setTitle("Button Event");
	frame1.setSize(250,130);
	frame1.setLocation(300,200);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setVisible(true);
	}

}
