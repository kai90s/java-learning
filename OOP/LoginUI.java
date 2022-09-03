package OOP;
import javax.swing.*;
import java.awt.*;
public class LoginUI extends JFrame{
public LoginUI(){
Container pane = getContentPane();
pane.setBackground(Color.white);
pane.setLayout(new FlowLayout());
pane.add(new JLabel("Name: "));
pane.add(new JTextField("Enter name here",10));
pane.add(new JLabel("Matric no: "));
pane.add(new JTextField(5));
pane.add(new JLabel("Password: "));
pane.add(new JPasswordField(10));
pane.add(new JButton("Login"));
}
public static void main(String[] args){
LoginUI frame = new LoginUI();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("LoginUI");
frame.setSize(300,200);
frame.setVisible(true);
}
}

