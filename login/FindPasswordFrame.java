package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.*;

import MainPage.MainPageFrame;

public class FindPasswordFrame extends JFrame implements ActionListener {
	JTextField usernameField;
	JButton findPW;
	JButton cencel;

	ImageIcon imageIcon = new ImageIcon("img/wgv.gif");
	
	
		Container container = getContentPane();
		ImageIcon tabmoive = new ImageIcon("image/WGV1.png");
		JLabel label_north = new JLabel(tabmoive);
		JPanel panel = new JPanel();

	public FindPasswordFrame() {
		setTitle("비밀번호 찾기");
		setSize(300, 230);
		setLocationRelativeTo(null); // 화면 중앙에 창 표시
		init();
		start();
		setIconImage(imageIcon.getImage());
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North",label_north);
		container.add("Center",panel);
		
		panel.setLayout(new GridLayout(2, 1));
		panel.setBackground(new Color(53, 53, 53));
		JLabel usernameLabel = new JLabel("등록한 아이디:");
		usernameLabel.setForeground(Color.white);
		panel.add(usernameLabel);
		usernameField = new JTextField();
		usernameField.setBackground(Color.LIGHT_GRAY);
		panel.add(usernameField);

		findPW = new JButton("비밀번호 찾기");
		findPW.setBackground(new Color(53, 53, 53));
		findPW.setForeground(Color.WHITE);
		panel.add(findPW);
		cencel = new JButton("취소");
		cencel.setBackground(new Color(53, 53, 53));
		cencel.setForeground(Color.WHITE);

		panel.add(cencel);
	

		add(panel);
		setVisible(true);

	}

	private void start() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		findPW.addActionListener(this);
		cencel.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 프레임이 닫힐 때 필요한 작업 수행
				// 예를 들어, 프레임을 숨기는 것이 아니라 종료하고 싶다면
				// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);를 사용할 수 있습니다.
				// 혹은 setVisible(false);를 호출하여 프레임을 숨길 수도 있습니다.
				// 여기서는 종료하는 것으로 예시를 작성합니다.
				int option = JOptionPane.showConfirmDialog(FindPasswordFrame.this, "비밀번호찾기를 종료하시겠습니까?", "종료 확인",
						JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					dispose();				} else {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // "아니오"를 선택하면 아무 동작도 하지 않음
				}
//				new MainPageFrame();
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == findPW) {
			idDAO dao = new idDAO();
			String username = usernameField.getText();

			List<idDTO> list = null;
			String name = usernameField.getText();
			list = dao.findPW(username);
			// 입력 검사
			if (username.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				return;
			}
			String result = "";
			if (list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					idDTO dto = list.get(i);
					result += dto.getPassword();
				}
				JOptionPane.showMessageDialog(this, result);
				dispose();
			} else {
				JOptionPane.showMessageDialog(this, "아이디를 확인하세요 .");
				return;
			}

//			dispose(); // 계정 찾기 창 닫기
		}else if(e.getSource() == cencel) {
			dispose();
		}
	}
}
