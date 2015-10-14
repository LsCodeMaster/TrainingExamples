package com.sapient.client.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class Listener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		if (src instanceof JButton) {
			JButton srcBtn = (JButton) src;
			JOptionPane.showMessageDialog(null, srcBtn.getText()
					+ " Clicked", "Sapient",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm = new JFrame();
		frm.setVisible(true);
		frm.setBounds(200, 100, 400, 200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnSave = new JButton("Save");
		JButton btnExit = new JButton("Exit");

		btnSave.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object src = e.getSource();
				if (src instanceof JButton) {
					JButton srcBtn = (JButton) src;
					JOptionPane.showMessageDialog(null, srcBtn.getText()
							+ " Clicked", "Sapient",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});;
		btnExit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object src = e.getSource();
				if (src instanceof JButton) {
					JButton srcBtn = (JButton) src;
					JOptionPane.showMessageDialog(null, srcBtn.getText()
							+ " Clicked", "Sapient",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});;
		JPanel topPanel = new JPanel();

		topPanel.add(btnSave);
		topPanel.add(btnExit);

		frm.getContentPane().add("South", topPanel);
	}

}
