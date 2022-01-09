package ducat.training.gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(3,3,10,10));
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenuItem fileNew = new JMenuItem("New");
		JMenuItem fileOpen = new JMenuItem("Open");
		JMenuItem fileSave = new JMenuItem("Save");
		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		
		JMenuItem editCopy = new JMenuItem("Cut");
		JMenuItem editCut = new JMenuItem("Copy");
		JMenuItem editPaste = new JMenuItem("Paste");
		edit.add(editCopy);
		edit.add(editCut);
		edit.add(editPaste);
		
		menu.add(file);
		menu.add(edit);
		f.setJMenuBar(menu);
		
		
		
		f.setSize(300,300);
		f.setVisible(true);
	}

}
