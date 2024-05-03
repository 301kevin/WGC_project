package mainpage;

import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

import Move.Move;
import Reservaion.ReservationFrame;
import food.Snack;
import login.idFrame;

public class mainFrame extends JFrame implements ActionListener {
	
	Container container = getContentPane();
	
	JPanel mainpanel = new JPanel();
	JPanel buttonpanel = new JPanel();
	JButton movieButton = new JButton("영화 리스트 / 영화검색 기능 ");
	JButton moviechoesButton = new JButton("예매  / 예매확인");
	JButton foodButton = new JButton("음식");
	JButton loginButton = new JButton("로그인");
	
	JPanel namepanel = new JPanel();
	JPanel mainname = new JPanel();
	JLabel mainpage = new JLabel("환영합니다", JLabel.CENTER);
	JLabel pic1 = new JLabel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel lab1 = new JLabel("                                                                        ");
	JLabel lab2 = new JLabel("                                                                        ");

	String imagePath = "img/wgv.gif";
	ImageIcon imageIcon = new ImageIcon(imagePath);

	public mainFrame() {
		setTitle("wgc");
		setSize(1500, 1000);
		init();
		start();
		setLocationRelativeTo(null);
		setVisible(true);
//		setIconImage(ImageIcon.getImage());
	}

	private void init() {
		container.setLayout(new BorderLayout(2,2));
		container.add("North", namepanel);
		container.add("Center", buttonpanel);

		namepanel.setLayout(new GridLayout());
//		pic1.setIcon(imageIcon);
//		namepanel.add(pic1);
		namepanel.add(mainpage);
		mainpage.setFont( new Font("맑은 고딕", Font.BOLD, 40));

		buttonpanel.setLayout(new BorderLayout());
		buttonpanel.add("Center", mainpanel);
		buttonpanel.add("West", panel1);
		buttonpanel.add("East", panel2);
//		panel1.add(lab1);
//		panel2.add(lab2);
		mainpanel.setLayout(new GridLayout(2, 2, 10, 10));
		mainpanel.add(movieButton);
		mainpanel.add(moviechoesButton);
		mainpanel.add(foodButton);
		mainpanel.add(loginButton);

//		namepanel.setLayout(new GridLayout(1, 4, 5, 5));
//		namepanel.add(loginButton);

	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		loginButton.addActionListener(this);
		foodButton.addActionListener(this);
		movieButton.addActionListener(this);
		moviechoesButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {
			new idFrame();
		} else if (e.getSource() == foodButton) {
			new Snack();
		} else if (e.getSource() == movieButton) {
			new Move();
		} else if (e.getSource() == moviechoesButton) {
			new ReservationFrame();
		}
	}

}
