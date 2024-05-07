package MainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    public MainScreen() {
        // JFrame 설정
        setTitle("메인 화면");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800); // 크기 조절 가능
        setLocationRelativeTo(null); // 중앙 정렬

        // 이미지 아이콘 생성
        ImageIcon wgvIcon = new ImageIcon("img/wgv.gif");

        // WGV 이미지 레이블 생성
        JLabel wgvLabel = new JLabel();
        wgvLabel.setIcon(wgvIcon);

        // 버튼 패널 생성
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // 2x2 그리드 레이아웃
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 여백 추가

        // 버튼 생성 및 패널에 추가
        String[] buttonLabels = {"Button 1", "Button 2", "Button 3", "Button 4"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener()); // 버튼 리스너 추가
            buttonPanel.add(button);
        }

        // 컨테이너에 추가
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(wgvLabel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    // 버튼 클릭 리스너
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            JOptionPane.showMessageDialog(null, "버튼 '" + source.getText() + "'가 클릭되었습니다.");
        }
    }

    // 실행
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainScreen mainScreen = new MainScreen();
            mainScreen.setVisible(true);
        });
    }
}

