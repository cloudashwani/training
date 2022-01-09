import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;


public class drawing extends JFrame implements ActionListener{
	JPanel p1,left;
	JButton b1,b2,b3;
	JButton red,green,blue;
	JButton red1,green1,blue1;
	myPanel myp;
	
	drawing()
	{
		myp = new myPanel();
		left = new JPanel();
		left.setLayout(new GridLayout(8,1,5,5));
		
		red = new JButton("Red");
		red.setBackground(Color.red);
		
		
		green = new JButton("green");
		green.setBackground(Color.green);
		
		blue = new JButton("blue");
		blue.setBackground(Color.blue);
		
		red1 = new JButton("black");
		red1.setBackground(Color.black);
		
		
		green1 = new JButton("orange");
		green1.setBackground(Color.orange);
		
		blue1 = new JButton("yellow");
		blue1.setBackground(Color.YELLOW);
		
		left.add(red);
		left.add(green);
		left.add(blue);
		left.add(red1);
		left.add(green1);
		left.add(blue1);
		
		p1= new JPanel();
		b1= new JButton("Rect");
		b2= new JButton("Circle");
		b3= new JButton("Line");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		add(myp,BorderLayout.CENTER);
		add(p1,BorderLayout.SOUTH);
		add(left,BorderLayout.WEST);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		red1.addActionListener(this);
		green1.addActionListener(this);
		blue1.addActionListener(this);
		setSize(500,500);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() ==b1) myPanel.flag="rectangle";
		if(e.getSource() ==b2) myPanel.flag="circle";
		if(e.getSource() ==b3) myPanel.flag="line";
		if(e.getSource() ==red) myPanel.color="red";
		if(e.getSource() ==green) myPanel.color="green";
		if(e.getSource() ==blue) myPanel.color="blue";
		if(e.getSource() ==red1) myPanel.color="red1";
		if(e.getSource() ==green1) myPanel.color="green1";
		if(e.getSource() ==blue1) myPanel.color="blue1";
			
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			drawing d = new drawing();
	}

}
class myPanel extends JPanel implements MouseListener
{
	Color c ;
	int x,y,x1,y1;
	int width,height;
	static String flag="rectangle";
	static String color="red";
	JButton b3;
	
	myPanel()
	{
	addMouseListener(this);	
	repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x= e.getX();
		y= e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1= e.getY();
		repaint();
	}
	

	public void paint(Graphics g){
		if(color.equals("red"))c= Color.red;
		if(color.equals("green"))c=Color.green;
		if(color.equals("blue"))c=Color.blue;
		if(color.equals("red1"))c= Color.black;
		if(color.equals("green1"))c=Color.orange;
		if(color.equals("blue1"))c=Color.yellow;
		
		
		if(flag.equals("rectangle"))
		{
			g.setColor(c);
			g.fillRect(x,y,x1-x,y1-y);
		}
		
		if(flag.equals("line"))
		{
			g.setColor(c);
			g.drawLine(x,y,x1,y1);
		}
		
		if(flag.equals("circle"))
		{
			g.setColor(c);
			g.fillOval(x,y,x1-x,y1-y);
		}
		
		x=0;
		y=0;
		x1=0;
		y1=0;
		
		
	}
	
	
}

