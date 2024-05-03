package Move;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Move extends JFrame implements ActionListener{
	Container container = getContentPane();
	CardLayout cardLayout = new CardLayout();
	
	
	
	// 상단 (패널)
	JPanel panel_North = new JPanel();
		// 로고 영역(패널)
		JPanel panel_rogo = new JPanel();
			// 로고 (라벨)
			JLabel label_rogo = new JLabel("WGV");
			JLabel label_rogosub = new JLabel("i want go home");
		// 카테고리(패널)
		JPanel panel_category = new JPanel();
			// 검색창
			JPanel panel_search = new JPanel();
			ImageIcon icon_search = new ImageIcon("move_img/searchIcon.png");
			JTextField textField_search = new JTextField(15);
			JButton button_search = new JButton(icon_search);
		
		
	// 중앙 (패널)
	JPanel panel_Center = new JPanel();
		
      // 중앙 서브(패널)
		JPanel panel_centerborder = new JPanel();
	 
		// 무비 차트 제목
		JPanel panel_title = new JPanel();
				// 무비 차트 (라벨)
				JLabel label_title = new JLabel("무비차트");
				// 무비 차트 (버튼)
				JPanel panel_Tbts = new JPanel();
				ImageIcon icon_r = new ImageIcon("img/right.gif");
				JButton button_top = new JButton("무비차트",icon_r);
				JButton button_soon = new JButton("상영 예정작",icon_r);
	
		// 무비 차트 & 상영 예정작
		JPanel panel_MS = new JPanel();
		// 무비 차트 (패널)
		JPanel panel_moveset = new JPanel();
			// 영화포스터 (아이콘)
			ImageIcon icon_1 = new ImageIcon("move_img/move1.png");
			ImageIcon icon_2 = new ImageIcon("move_img/move2.png");
			ImageIcon icon_3 = new ImageIcon("move_img/move3.png");
			ImageIcon icon_4 = new ImageIcon("move_img/move4.png");
			ImageIcon icon_5 = new ImageIcon("move_img/move5.png");
			ImageIcon icon_6 = new ImageIcon("move_img/move6.png");
			ImageIcon icon_7 = new ImageIcon("move_img/move7.png");
			ImageIcon icon_8 = new ImageIcon("move_img/move8.png");
			// 영화포스터 (버튼)
			JButton top1 = new JButton(icon_1);
			JButton top2 = new JButton(icon_2);
			JButton top3 = new JButton(icon_3);
			JButton top4 = new JButton(icon_4);
			JButton top5 = new JButton(icon_5);
			JButton top6 = new JButton(icon_6);
			JButton top7 = new JButton(icon_7);
			JButton top8 = new JButton(icon_8);
			
		// 상영 예정작 (패널)
		JPanel panel_soon = new JPanel();
			// 영화포스터 (아이콘)
			ImageIcon icon_S1 = new ImageIcon("move_img/soon1.png");
			ImageIcon icon_S2 = new ImageIcon("move_img/soon2.png");
			ImageIcon icon_S3 = new ImageIcon("move_img/soon3.png");
			ImageIcon icon_S4 = new ImageIcon("move_img/soon4.png");
			ImageIcon icon_S5 = new ImageIcon("move_img/soon5.png");
			ImageIcon icon_S6 = new ImageIcon("move_img/soon6.png");
			ImageIcon icon_S7 = new ImageIcon("move_img/soon7.png");
			ImageIcon icon_S8 = new ImageIcon("move_img/soon8.png");
			
			// 영화포스터 (버튼)
			JButton soon1 = new JButton(icon_S1);
			JButton soon2 = new JButton(icon_S2);
			JButton soon3 = new JButton(icon_S3);
			JButton soon4 = new JButton(icon_S4);
			JButton soon5 = new JButton(icon_S5);
			JButton soon6 = new JButton(icon_S6);
			JButton soon7 = new JButton(icon_S7);
			JButton soon8 = new JButton(icon_S8);
//------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------------------
ImageIcon plotimg1 = new ImageIcon("move_img/move1_plot.png");
// 영화 소개 창
JPanel panel_report1 = new JPanel();
JPanel panel_Rcenter = new JPanel();
JPanel panel_RCleft = new JPanel();

	// top1 report
	JLabel labelplotIMG = new JLabel(plotimg1);
	//파일 경로 지정
	String filePath = "plotfile/plot1.txt";
	//텍스트 파일 읽어오기
	String fileContent = TextFileReader.readTextFile(filePath);
	// 줄거리 창
	JTextArea plotArea1 = new JTextArea(fileContent);
	JScrollPane plotScrollPane1 = new JScrollPane(plotArea1);
	
	// 예매하기 버튼
	JPanel panel_reserve = new JPanel();
	JButton button_reserve = new JButton("예매 하기");


	public Move() {
		setSize(1500,1000);
		setTitle("WGV");
		setLocation(200,10);
		init();
		start();
		setResizable(false);
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.setBackground(new Color(255,60,60));
		container.add("North", panel_North);
		container.add("South", panel_Center);
		
		// North
		panel_North.setLayout(new BorderLayout());
		panel_North.setBackground(Color.white);
		panel_North.add("Center", panel_rogo);
		panel_North.add("South", panel_category);
			// rogo
			panel_rogo.setLayout(new FlowLayout(FlowLayout.LEFT));
			panel_rogo.setBackground(Color.white);
			panel_rogo.add(label_rogo);
			label_rogo.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,45));
			panel_rogo.add(label_rogosub);
			label_rogosub.setFont(new Font("Felix Titling",0,10));
			
			//panel_category
			panel_category.setLayout(new FlowLayout(FlowLayout.RIGHT));
			panel_category.setBackground(Color.white);
			panel_category.add(panel_search);
			
				//panel_search
				panel_search.setBackground(Color.white);
				panel_search.add(textField_search);
				panel_search.add(button_search);
				
				//textField_search
				textField_search.setPreferredSize(new Dimension(100,50));
				textField_search.setFont(new Font("맑은 고딕",Font.BOLD,25));
				
				//button_search
				button_search.setPreferredSize(new Dimension(50,50));
				button_search.setBorder(new EmptyBorder(0,0,0,0));
				button_search.setBackground(new Color(255,255,255));
				
		
		// Center
		panel_Center.setLayout(new BorderLayout());
		panel_Center.setBackground(Color.white);
		panel_Center.add("North",panel_title);
		panel_Center.add("Center",panel_centerborder);
			
			// panel_title
			panel_title.setLayout(new BorderLayout());
			panel_title.setBackground(Color.white);
	
			panel_title.add("West",label_title);
				//title font
				label_title.setFont(new Font("맑은 고딕",Font.BOLD,25));
	
				panel_title.add("East",panel_Tbts);
				panel_Tbts.setBackground(Color.white);
				panel_Tbts.add(button_top);
				panel_Tbts.add(button_soon);
				
				button_top.setFont(new Font("맑은 고딕",Font.BOLD,18));
				button_soon.setFont(new Font("맑은 고딕",Font.BOLD,18));
		
				// title buttons color
				button_top.setBackground(Color.white);
				button_soon.setBackground(Color.white);
				button_top.setBorder(new EmptyBorder(5,5,5,5));
				button_soon.setBorder(new EmptyBorder(5,5,5,5));
		
			//panel_centerborder
			panel_centerborder.setLayout(new FlowLayout(FlowLayout.CENTER));
			panel_centerborder.setBackground(Color.white);
			panel_centerborder.add(panel_MS);
			
			// panel_MS
			panel_MS.setLayout(new BorderLayout());
			panel_MS.setBackground(Color.white);
			panel_MS.add("Center",panel_moveset);
				
			// panel_moveset
			panel_moveset.setLayout(new GridLayout(2,4,10,10));
			panel_moveset.setBackground(Color.white);
			
			
				// moves(버튼)
				panel_moveset.add(top1);
				panel_moveset.add(top2);
				panel_moveset.add(top3);
				panel_moveset.add(top4);
				panel_moveset.add(top5);
				panel_moveset.add(top6);
				panel_moveset.add(top7);
				panel_moveset.add(top8);
				// 버튼 배경색
				top1.setBackground(Color.white);
				top2.setBackground(Color.white);
				top3.setBackground(Color.white);
				top4.setBackground(Color.white);
				top5.setBackground(Color.white);
				top6.setBackground(Color.white);
				top7.setBackground(Color.white);
				top8.setBackground(Color.white);
				// 버튼 테두리 색
				top1.setBorder(new EmptyBorder(5,5,5,5));
				top2.setBorder(new EmptyBorder(5,5,5,5));
				top3.setBorder(new EmptyBorder(5,5,5,5));
				top4.setBorder(new EmptyBorder(5,5,5,5));
				top5.setBorder(new EmptyBorder(5,5,5,5));
				top6.setBorder(new EmptyBorder(5,5,5,5));
				top7.setBorder(new EmptyBorder(5,5,5,5));
				top8.setBorder(new EmptyBorder(5,5,5,5));
				
			// panel_soon
			panel_soon.setLayout(new GridLayout(2,4,10,10));
			panel_soon.setBackground(Color.white);
				
				
				// moves(버튼)
				panel_soon.add(soon1);
				panel_soon.add(soon2);
				panel_soon.add(soon3);
				panel_soon.add(soon4);
				panel_soon.add(soon5);
				panel_soon.add(soon6);
				panel_soon.add(soon7);
				panel_soon.add(soon8);
			
				// 버튼 배경색
				soon1.setBackground(Color.white);
				soon2.setBackground(Color.white);
				soon3.setBackground(Color.white);
				soon4.setBackground(Color.white);
				soon5.setBackground(Color.white);
				soon6.setBackground(Color.white);
				soon7.setBackground(Color.white);
				soon8.setBackground(Color.white);
			
				// 버튼 테두리 색
				soon1.setBorder(new EmptyBorder(5,5,5,5));
				soon2.setBorder(new EmptyBorder(5,5,5,5));
				soon3.setBorder(new EmptyBorder(5,5,5,5));
				soon4.setBorder(new EmptyBorder(5,5,5,5));
				soon5.setBorder(new EmptyBorder(5,5,5,5));
				soon6.setBorder(new EmptyBorder(5,5,5,5));
				soon7.setBorder(new EmptyBorder(5,5,5,5));
				soon8.setBorder(new EmptyBorder(5,5,5,5));
//------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------------------

// 영화 소개 창
// top1
	panel_report1.setLayout(new BorderLayout());
	panel_report1.setBackground(Color.white);
	panel_report1.add("North",labelplotIMG);
	panel_report1.add("Center",panel_Rcenter);
	panel_report1.add("East",panel_reserve);
	// 줄거리 칸 패널
	panel_Rcenter.setBackground(Color.white);
	panel_Rcenter.setLayout(new FlowLayout(FlowLayout.CENTER));
	panel_Rcenter.add(plotScrollPane1);
	
	//plotArea setting
	plotArea1.setFont(new Font("맑은 고딕",Font.BOLD,20));
	plotArea1.setEditable(false);

	plotScrollPane1.setBorder(new EmptyBorder(5,3,5,3));
	plotScrollPane1.setBackground(Color.white);
	
	// 예매하기 버튼
	panel_reserve.setLayout(new BorderLayout() );
	panel_reserve.setBackground(Color.white);
	panel_reserve.add("South",button_reserve);
	button_reserve.setPreferredSize(new Dimension(200,100));

	


		
	}

	private void start() {
		// 창 닫기
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// 무비차트 상영예정작 이벤트
		button_top.addActionListener(this);
		button_soon.addActionListener(this);
		top1.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// 화면 전환(무비차트 & 상영예정작)
		if(e.getSource() == button_top) {
			panel_MS.remove(panel_soon); 			// 없애기
			panel_MS.invalidate(); 			// 화면 무효화
			panel_MS.add("Center",panel_moveset);	// 추가
			panel_MS.revalidate(); 			// 유효화
			panel_MS.repaint();				// 화면 갱신
		} else if(e.getSource() == button_soon) {
			panel_MS.remove(panel_moveset); 			// 없애기
			panel_MS.invalidate(); 			// 화면 무효화
			panel_MS.add("Center",panel_soon);	// 추가
			panel_MS.revalidate(); 			// 유효화
			panel_MS.repaint();
		}
		// 화면 전환2(포스트 클릭 시)
		if(e.getSource() == top1) {
			panel_Center.remove(panel_title); 			// 없애기
			panel_Center.remove(panel_centerborder); 			// 없애기
			panel_Center.remove(top1); 			// 없애기
			panel_Center.invalidate(); 			// 화면 무효화
			panel_Center.add("Center",panel_report1);	// 추가
			panel_Center.revalidate(); 			// 유효화
			panel_Center.repaint();				// 화면 갱신
		}
		
	}

}
