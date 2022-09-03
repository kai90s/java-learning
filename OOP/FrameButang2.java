package OOP;
import javax.swing.*;
import java.awt.*;
public class FrameButang2 extends JFrame{
public FrameButang2(){
Container pane = getContentPane();
pane.setBackground(Color.white);
pane.setLayout(new FlowLayout());
pane.add(new JLabel("Choose Your Language : "));
pane.add(new JCheckBox("Java",true));
pane.add(new JCheckBox("C"));
pane.add(new JCheckBox("C++"));
pane.add(new JCheckBox("Phyton"));
pane.add(new JCheckBox("Ruby"));
pane.add(new JButton("OK"));		}
public static void main(String[] args){
FrameButang2 frame = new FrameButang2();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("Aplikasi Frame Butang");
frame.setSize(300,200);
frame.setVisible(true);
}				
}


