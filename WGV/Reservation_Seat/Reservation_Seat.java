package Reservaion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Reservation_Seat extends JFrame implements ActionListener {
	ReservationDAO dao = new ReservationDAO();

	// 화면 열고 닫는거 설정
	Boolean onoff = true;

	Color color_black = new Color(30, 30, 30);
	Color color_white = new Color(204, 204, 204);
	Color color_beige = new Color(242, 240, 229);
	Color color_boldbeige = new Color(232, 230, 219);

	// 폰트 저장
	Font font10 = new Font("맑은 고딕", Font.BOLD, 10);
	Font font18 = new Font("맑은 고딕", Font.BOLD, 18);
	Font font25 = new Font("맑은 고딕", Font.BOLD, 25);

	Container con = getContentPane();

	
	// 1. 큰 틀 
	JPanel p_north = new JPanel();
	JPanel p_west = new JPanel();
	JPanel p_center = new JPanel();
	JPanel p_east = new JPanel();
	JPanel p_south = new JPanel();

	
	

	public Reservation_Seat() {

		setSize(1500, 1000);
		setTitle("WGV 좌석 선택");

		init();
		start();
		setVisible(onoff);
	}

	private void init() {
		con.setLayout(new BorderLayout());

		con.add("North",p_north);
		con.add("West",p_west);
		con.add("Center",p_center);
		con.add("East",p_east);
		con.add("South",p_south);

		p_north.setLayout();
		
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 리스트 클릭시 글자 출력
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}