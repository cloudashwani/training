package ducat.training.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class mylayout extends JFrame implements ActionListener {
	JMenuBar mb;
	JMenu layout,cardlayout;
	JMenuItem mi1,mi2,mi3,mii3,mi4,mi5,mi6;
	JPanel p,north;
	JButton b1,b2,b3,b4,b5;
	JButton flow,grid,border;
	mylayout(){
		mb = new JMenuBar();
		layout = new JMenu("Layout");
		cardlayout = new JMenu("CardLayout");
		cardlayout.setEnabled(false);
		mi1 = new JMenuItem("Flow Layout");
		mi2 = new JMenuItem("Border Layout");
		mi3 = new JMenuItem("Grid Layout");
		mii3 = new JMenuItem("Card Layout");
		mi4 = new JMenuItem("Next");
		mi5 = new JMenuItem("Previous");
		mi6 = new JMenuItem("Show");
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mii3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
		
		layout.add(mi1);
		layout.add(mi2);
		layout.add(mi3);
		layout.add(mii3);
		cardlayout.add(mi4);
		cardlayout.add(mi5);
		cardlayout.add(mi6);
		mb.add(layout);
		mb.add(cardlayout);
		setJMenuBar(mb);
		
		p = new JPanel();
		north = new JPanel();
		flow = new JButton("Flow");
		grid = new JButton("Grid");
		border = new JButton("Border");
		north.add(flow);
		north.add(grid);
		north.add(border);
		add(north,BorderLayout.SOUTH);
		add(p,BorderLayout.CENTER);
		
		flow.addActionListener(this);
		grid.addActionListener(this);
		border.addActionListener(this);
		
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		b5 = new JButton("Button5");
		setSize(500,500);
		setVisible(true);
			
	}
	void setmylayout(LayoutManager lay) {
		setSize(499,499);
		setSize(500,500);
		p.setLayout(lay);
		if(lay instanceof FlowLayout)
		{
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		}
		if(lay instanceof BorderLayout)
		{
			
			p.add(b1,BorderLayout.NORTH);
			p.add(b2,BorderLayout.SOUTH);
			p.add(b3,BorderLayout.EAST);
			p.add(b4,BorderLayout.WEST);
			p.add(b5,BorderLayout.CENTER);
			
		}
		if(lay instanceof GridLayout)
		{
			
			p.add(b1);
			p.add(b2);
			p.add(b3);
			p.add(b4);
			p.add(b5);
		
		}
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == mii3)
		{
			cardlayout.setEnabled(true);
		}
		if(e.getSource() == flow || e.getSource() == mi1)
		{
			setmylayout(new FlowLayout(FlowLayout.CENTER,10,10));
		}
		if(e.getSource() == grid || e.getSource() == mi3)
		{
			setmylayout(new GridLayout(2,2,10,10));
		}
		if(e.getSource() == border || e.getSource() == mi2)
		{
			setmylayout(new BorderLayout(10,10));	
		}
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new mylayout();
	}

}


