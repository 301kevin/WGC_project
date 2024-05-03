package Reservaion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

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

public class ReservationFrame extends JFrame implements ActionListener {
	ReservationDAO dao = new ReservationDAO();

	// 화면 열고 닫는거 설정
	Boolean onoff = true;

	// 패널 바꾸기
	CardLayout cardLayout = new CardLayout();

	// 컬러 저장하기
	Color color_black = new Color(30, 30, 30);
	Color color_white = new Color(204, 204, 204);
	Color color_beige = new Color(242, 240, 229);

	// 폰트 저장
	Font font10 = new Font("맑은 고딕", Font.BOLD, 10);
	Font font18 = new Font("맑은 고딕", Font.BOLD, 18);
	Font font25 = new Font("맑은 고딕", Font.BOLD, 25);

	Container con = getContentPane();

	// 1. 센터
	JPanel p_center = new JPanel();

	// 1-1. 영화 선택 창
	JPanel p_movietot = new JPanel();
	JLabel l_moive = new JLabel("영화", JLabel.CENTER);

	/** 추후 영화 리스트 공유 받아서 DataBase에서 리스트 뽑아오기 */
	JList<String> list_movie = new JList<>(dao.popdesc());
	JScrollPane scr_movie = new JScrollPane(list_movie);

	// 1-2. 날짜 글 + 년월 / 일 요일 묶음
	JPanel p_calander = new JPanel();

	JLabel l_calander = new JLabel("날짜", JLabel.CENTER); // 1-2-1. 날짜

	JPanel p_day = new JPanel(); // 1-2-2. 년월 / 일 요일 묶음

	JPanel p_ym = new JPanel(); // 1-2-3. 년월 묶음
	JLabel l_year = new JLabel("2024", JLabel.CENTER);
	JLabel l_mon = new JLabel("4", JLabel.CENTER);

	HCalendar hc = new HCalendar();
	JList<String> list_day = new JList<String>(hc.displayDatesAndDays());
	JScrollPane scr_day = new JScrollPane(list_day);

	// 1-3. 시간
	JLabel l_time = new JLabel("시간", JLabel.CENTER);

	JPanel p_time_total = new JPanel();
	JPanel p_timetot = new JPanel();
	JPanel p_time1 = new JPanel();
	JPanel p_time2 = new JPanel();
	JPanel p_time3 = new JPanel();

	// 1-3-1. 1관
	JLabel l_1관 = new JLabel("1관 데이터베이스 안넘어오옹",JLabel.LEFT);
	JButton[] b_1관 = new JButton[6];
	
	// 1-3-2. 2관
	JLabel l_2관 = new JLabel("2관 데이터베이스 안넘어오옹",JLabel.LEFT);
	JButton[] b_2관 = new JButton[6];

	// 1-3-3. 3관
	JLabel l_3관 = new JLabel("3관 데이터베이스 안넘어오옹",JLabel.LEFT);
	JButton[] b_3관 = new JButton[6];

	
	// 3화면 아래 - 선택한 결과 값
	JPanel p_infortot = new JPanel();

	// 3-1 왼쪽
	JPanel p_infor_label = new JPanel();

	// 3-1-1. 영화 이미지
	ImageIcon ima_movie = new ImageIcon("image/0.png");
	JLabel l_pic = new JLabel(ima_movie);

	// 3-1-2. 영화 제목
	JPanel p_infor_label_1 = new JPanel();
	JTextArea area = new JTextArea(); // 영화 제목

	// 3-1-2. 영화 일시 ,상영관 , 인원
	JPanel p_infor_label_2 = new JPanel();

	JLabel l_infor_2_일시 = new JLabel("일시 ");
	JLabel l_infor_2_상영관 = new JLabel("상영관 ");
	JLabel l_infor_2_인원 = new JLabel("좌석선택 ");

	// 3-2 가운데
	ImageIcon ima_center = new ImageIcon("image/1.png");
	JLabel l_infor_center = new JLabel(ima_center);

	// 3-3 오른쪽
	// 이미지 아이콘 생성
	ImageIcon ima_next = new ImageIcon("image/좌석선택.png");
	ImageIcon ima_nextend = new ImageIcon("image/좌석선택완.png");

	// 버튼 생성 및 이미지 아이콘 설정
	JPanel p_select = new JPanel(); // -> 버튼 이미지 2개 저장해두기
	JLabel l_infor_select = new JLabel(ima_next);
	JButton b_infor_selectend = new JButton(ima_nextend);

	public ReservationFrame() {
		setSize(1500, 1000);
		setTitle("WGV 예매");

		init();
		start();
		setVisible(onoff);
	}

	private void init() {

		con.setLayout(new BorderLayout());
		con.add("Center", p_center);
		con.add("South", p_infortot);

		// 1.가운데
		p_center.setLayout(new GridLayout(1, 3, 3, 3));
		p_center.add(p_movietot);
		p_center.add(p_calander);
		p_center.add(p_time_total);

		// 1-1. 영화 목록
		p_movietot.setBackground(color_black);

		p_movietot.setLayout(new BorderLayout());
		p_movietot.add("North", l_moive).setForeground(color_white);
		p_movietot.add("Center", scr_movie);
		scr_movie.setPreferredSize(new Dimension(300, 500));

		// 1-1-1. 영화 목록 위
		l_moive.setFont(font25);

		// 1-1-2. 목록의 셀 렌더러 설정
		list_movie.setCellRenderer(new CustomCellRenderer());

		// 1-2. 날짜
		p_calander.setBackground(color_black);

		p_calander.setLayout(new BorderLayout());
		p_calander.add("North", l_calander).setForeground(color_white);
		p_calander.add("Center", p_day);

		l_calander.setFont(font25);

		// 1-2-1. 년월 / 일 요일 나누기
		p_day.setLayout(new BorderLayout());
		p_day.add("North", p_ym);
		p_day.add(scr_day);

		// 1-2-2. 날짜 출력 - 일 / 요일

		list_day.setCellRenderer(new CustomCellRenderer());

		// 1-2-1. 년 월 표시
		p_ym.setLayout(new GridLayout(2, 1));
		p_ym.setBackground(color_beige);

		l_year.setText(hc.getYear());
		l_mon.setText(hc.getMonth());
		p_ym.add(l_year).setForeground(color_black);
		p_ym.add(l_mon).setForeground(color_black);

		l_year.setFont(font10);
		l_mon.setFont(font18);

		// 1-3. 상영 관/ 시간
		// 1-3-1. 시간 제목 
		p_time_total.setBackground(color_black);

		p_time_total.setLayout(new BorderLayout());
		p_time_total.add("North", l_time).setForeground(color_white);
		l_time.setFont(font25);
		p_time_total.add("Center", p_timetot);

		// 1-3-2. 스케줄 표 패널 p_timetot
		p_timetot.setBackground(color_beige);
		p_timetot.setLayout(new GridLayout(3,1,5,5));
		p_timetot.add(p_time1);
		p_timetot.add(p_time2);
		p_timetot.add(p_time3);
		
	
		// 1-3-2-1. 1관
		JLabel l_1관 = new JLabel("1관 데이터베이스 안넘어오옹",JLabel.LEFT);
		JButton[] b_1관 = new JButton[6];
		
		// 1-3-2-2. 2관
		JLabel l_2관 = new JLabel("2관 데이터베이스 안넘어오옹",JLabel.LEFT);
		JButton[] b_2관 = new JButton[6];

		// 1-3-2-3. 3관
		JLabel l_3관 = new JLabel("3관 데이터베이스 안넘어오옹",JLabel.LEFT);
		JButton[] b_3관 = new JButton[6];

		
		
		// 2. 아래 임포
		p_infortot.setBackground(color_black);
		p_infortot.setPreferredSize(new Dimension(1500, 160));

		p_infortot.setLayout(new BorderLayout());
		p_infortot.add("West", p_infor_label);
		p_infortot.add("Center", l_infor_center); //
		p_infortot.add("East", p_select); // 완

		// 2-1. 글씨 정보 임포
		p_infor_label.setBackground(color_black);

		p_infor_label.setLayout(new GridLayout(1, 3, 3, 3));
		p_infor_label.add(l_pic);
		p_infor_label.add(p_infor_label_1);
		p_infor_label.add(p_infor_label_2);

		// 2-1-1. 영화 사진
		l_pic.setPreferredSize(new Dimension(92, 138));

		// 2-1-2. 영화 제목 - 고정
		p_infor_label_1.setBackground(color_black);
		p_infor_label_1.setPreferredSize(new Dimension(200, 138));
		p_infor_label_1.setLayout(new GridLayout(1, 1, 3, 3));
		p_infor_label_1.add(area).setForeground(color_white);
		area.setBackground(color_black);
		area.setLineWrap(true); // 자동 줄바꿈 활성화
		area.setWrapStyleWord(true); // 단어 단위 줄바꿈
		area.setFont(font18);

		// 2-1-3. 영화 일시, 상영관, 인원
		p_infor_label_2.setBackground(color_black);
		p_infor_label_2.setLayout(new GridLayout(3, 1));

		p_infor_label_2.setPreferredSize(new Dimension(250, 138));

		p_infor_label_2.add(l_infor_2_일시).setForeground(color_white);
		p_infor_label_2.add(l_infor_2_상영관).setForeground(color_white);
		p_infor_label_2.add(l_infor_2_인원).setForeground(color_white);

		l_infor_2_일시.setFont(font18);
		l_infor_2_상영관.setFont(font18);
		l_infor_2_인원.setFont(font18);

		// 2-2." > 좌석 선택 >" 결제
		// 보안 : 양 옆이 비어 있음
		l_infor_center.setBackground(color_black);
		l_infor_center.setPreferredSize(new Dimension(0, 138));

		// 2-3. 좌석 선택 버튼 -
		// 보안 필요 : 영화 선택 시 -> b_infor_selectend 으로 바꿔서 활성화 시키기
		p_select.setBackground(color_black);
		// p_select.add(b_infor_selectend, "selected");
		p_select.add(l_infor_select, "select");
		p_select.setLayout(cardLayout);

		b_infor_selectend.setPreferredSize(new Dimension(137, 138));
		b_infor_selectend.setBackground(color_black);
		l_infor_select.setPreferredSize(new Dimension(137, 138));

	}

	private void start() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		// next 버튼 선택시 다른 Frame 으로 변경
		b_infor_selectend.addActionListener(this);

		// 리스트 클릭시 글자 출력
		list_movie.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JList<String> list = (JList<String>) e.getSource();
				int index = list.locationToIndex(e.getPoint());
				String selectedItem = list.getModel().getElementAt(index);

				// 텍스트 에리어에 글씨출력
				area.setText(selectedItem);

				// 리스트 클릭시 => 이미지 출력
				String image_moive = dao.mvimagedesc(selectedItem);
				ImageIcon icon = new ImageIcon(image_moive);
				// System.out.println(image_moive);

				l_pic.setIcon(icon);

				// 클랙시 추가
				checkAndSwitchPanel();

			}
		});

		// 리스트 클릭시 글자 출력
		list_day.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JList<String> list = (JList<String>) e.getSource();
				int index = list.locationToIndex(e.getPoint());
				String selectedItem = list.getModel().getElementAt(index);
				l_infor_2_일시.setText("일시     " + hc.getYear() + "년 " + hc.getMonth() + "월 " + selectedItem);

				// 클랙시 추가
				checkAndSwitchPanel();

			}
		});

		b_infor_selectend.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				// 마우스를 누르는 순간 버튼에 경계가 사라지고 바탕색으로 검은색으로 채워주기
				b_infor_selectend.setBackground(color_black);
				b_infor_selectend.setContentAreaFilled(false);

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b_infor_selectend) {
			// 좌석 선택 부분
		}
	}

	// 리스트 내 텍스트 색상 및 글꼴 크기 변경
	private class CustomCellRenderer extends DefaultListCellRenderer {
		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

			setBorder(BorderFactory.createEmptyBorder(7, 10, 7, 10));

			c.setBackground(color_beige);
			if (isSelected) {
				c.setBackground(color_black);
				c.setForeground(color_white);
			} else {
				c.setBackground(color_beige);
				c.setForeground(color_black); // 텍스트 색상 변경
			}
			// 글꼴 크기 변경
			c.setFont(font18);
			return c;
		}
	}

	// 리스트 2개 클릭 했을 시 -> 다음 버튼 활성화
	private void checkAndSwitchPanel() {
		if (list_movie.getSelectedIndex() > -1 && list_day.getSelectedIndex() > -1) {
			// Both lists are selected
			// System.out.println(list_movie.getSelectedIndex());
			// System.out.println(list_day.getSelectedIndex());
			cardLayout.show(p_select, "selected");
			p_select.add(b_infor_selectend, "selected");
			p_select.add(l_infor_select, "select");
		}
	}
}
