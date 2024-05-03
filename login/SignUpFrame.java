package login;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUpFrame extends JFrame implements ActionListener {
	idDAO dao = new idDAO();

	JTextField usernameField;
	JPasswordField passwordField;
	JTextField nameField;
	JTextField residentNumberField;
	JTextField emailField;
	JButton signUpButton;
	JButton idcheakButton;
	JTextField confirmPasswordField;
	JButton cencel;
	
	ImageIcon imageIcon = new ImageIcon("img/wgv.gif");

	public SignUpFrame() {
		setTitle("회원가입");
		setSize(500, 400);
		init();
		start();
		setLocationRelativeTo(null);
		setIconImage(imageIcon.getImage());
	}

	private void init() {
		JPanel panel = new JPanel(new GridLayout(7, 1));

		JLabel usernameLabel = new JLabel("아이디:");
		panel.add(usernameLabel);
		usernameField = new JTextField();
		panel.add(usernameField);

		JLabel passwordLabel = new JLabel("비밀번호:");
		panel.add(passwordLabel);
		passwordField = new JPasswordField();
		panel.add(passwordField);

		JLabel passwordCheakLable = new JLabel("비밀번호 확인 : ");
		panel.add(passwordCheakLable);
		confirmPasswordField = new JPasswordField();
		panel.add(confirmPasswordField);

		JLabel nameLabel = new JLabel("이름:");
		panel.add(nameLabel);
		nameField = new JTextField();
		panel.add(nameField);

		JLabel residentNumberLabel = new JLabel("주민번호:");
		panel.add(residentNumberLabel);
		residentNumberField = new JTextField();
		panel.add(residentNumberField);

		JLabel emailLabel = new JLabel("이메일:");
		panel.add(emailLabel);
		emailField = new JTextField();
		panel.add(emailField);

		signUpButton = new JButton("회원가입");
		cencel = new JButton("취소");
		
		panel.add(signUpButton);
		panel.add(cencel);
		add(panel);
		setVisible(true);
	}

	private void start() {
		signUpButton.addActionListener(this);
		cencel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signUpButton) {
			String username = usernameField.getText();
			String password = new String(passwordField.getPassword());
			String confirmPassword = new String(((JPasswordField) confirmPasswordField).getPassword());
			String name = nameField.getText();
			String residentNumber = residentNumberField.getText();
			String email = emailField.getText();

			// 모든 필드가 비어있는지 확인
			if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || name.isEmpty()
					|| residentNumber.isEmpty() || email.isEmpty()) {
				JOptionPane.showMessageDialog(SignUpFrame.this, "모든 정보를 입력하세요.");
				return;
			}

			// 비밀번호와 비밀번호 확인이 일치하는지 확인
			if (!password.equals(confirmPassword)) {
				JOptionPane.showMessageDialog(SignUpFrame.this, "비밀번호와 비밀번호 확인이 일치하지 않습니다.");
				return;
			}

			idDTO dto = new idDTO();
			dto.setId(username);
			dto.setPassword(password);
			dto.setName(name);
			dto.setJumin(residentNumber);
			dto.setEmail(email);

			String result = idcheak(dto);
			JOptionPane.showMessageDialog(this, result);

			usernameField.setText("");
//			dispose(); // 회원가입 창 닫기
		} else if(e.getSource() == cencel) {
			dispose();
		}

	}

	public String idcheak(idDTO dto) {
		List<idDTO> list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			idDTO idDTO = list.get(i);
			if (idDTO.getId().equals(dto.getId())) {
				return dto.getId() + " 아이디가 이미 존재하고 있습니다.";
			}
		}
		int result = dao.newMember(dto);
		dispose();
		if (result > 0)
			return dto.getName() + "님의 가입을 환영합니다.";
		else
			return "저장 실패";
	}

}
