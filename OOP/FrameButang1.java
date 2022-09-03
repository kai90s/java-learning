package OOP;
import javax.swing.*;
import java.awt.*;
public class FrameButang1 extends JFrame{
public FrameButang1(){
Container pane = getContentPane();
pane.setBackground(Color.white);
pane.setLayout(new FlowLayout());
pane.add(new JButton("Merah"));
pane.add(new JButton("Biru"));
pane.add(new JButton("Hijau"));
pane.add(new JButton("Putih"));
}
public static void main(String[] args){
	FrameButang1 frame = new FrameButang1();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("Aplikasi Frame Butang");
frame.setSize(300,200);
frame.setVisible(true);
}		
}


