package mainpage;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Move.Move;
import Reservaion.ReservationFrame;
import food.Snack;
import login.idFrame;

public class mainFrame extends JFrame implements ActionListener {

	Container container = getContentPane();

	JPanel mainpanel = new JPanel();	
	JButton movieButton = new JButton("영화 리스트 / 영화검색 기능 ");
	JButton moviechoesButton = new JButton("예매  / 예매확인");
	JButton foodButton = new JButton("음식");
	JButton loginButton = new JButton("로그인");

	JPanel namepanel = new JPanel();
	JPanel mainname = new JPanel();
	JLabel mainpage = new JLabel("메인화면");
	JPanel pic1 = new JPanel();
	JPanel pic2 = new JPanel();

	public mainFrame() {
		setTitle("로그인");
		setSize(900, 500);
		init();
		start();
		setLocationRelativeTo(null);
		setVisible(true);
//		setIconImage(ImageIcon.getImage());
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("Center", mainpanel);
		container.add("North", namepanel);

		namepanel.setLayout(new FlowLayout());
		namepanel.add(mainpage);


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
