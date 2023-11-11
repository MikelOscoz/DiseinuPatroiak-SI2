package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import businessLogic.BLFacade;
import domain.User;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaulaGertaerakGUI extends JFrame {

	private User us;

	/**
	 * Create the frame.
	 */
	public TaulaGertaerakGUI(User u) {
		UserModelAdapter uma =new UserModelAdapter(u);        
		
		JFrame j=new JFrame();
		JTable table = new JTable(uma);
		 j.add(new JScrollPane(table));
         table.removeAll();
	     j.setTitle(u.getIzena()+"-ren apostuak");
	     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	     j.pack();
	     j.setVisible(true);
	}
}