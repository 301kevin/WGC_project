package food;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Snack extends JFrame implements ActionListener {
   Container container = getContentPane();

   // 아이콘 이미지 변경
   ImageIcon foodIcon = new ImageIcon("img/food.png");   
   // 시작 패널
   JPanel panel_main = new JPanel(); 

   // 스토어 상품 패널
   JPanel panel_main_north = new JPanel();
   // store 라벨
   JLabel label_store = new JLabel("메뉴");
   // 상품고르세요 라벨
   JLabel label_price = new JLabel("원하시는 상품을 골라주세요.");

   // 탭 항목 들
   JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
   JPanel panel_combo = new JPanel();
   JPanel panel_popcorn = new JPanel();
   JPanel panel_drink = new JPanel();
   JPanel panel_snack = new JPanel();

   // 콤보 버튼 부분
   // 더블콤보
   JPanel panel_cm1 = new JPanel();
   JPanel panel_cm11 = new JPanel();
   JPanel panel_cm111 = new JPanel();
   JButton button_cm1 = new JButton(new ImageIcon("img/combo1.png"));
   JLabel label_cm1 = new JLabel("더블 콤보");
   JLabel label_cm11 = new JLabel("팝콘(M)2+탄산음료(M)2");
   JLabel label_cm111 = new JLabel("13,000원");
   // 라지콤보
   JPanel panel_cm2 = new JPanel();
   JPanel panel_cm22 = new JPanel();
   JPanel panel_cm222 = new JPanel();
   JButton button_cm2 = new JButton(new ImageIcon("img/combo2.png"));
   JLabel label_cm2 = new JLabel("라지 콤보");
   JLabel label_cm22 = new JLabel("팝콘(L)2+탄산음료(L)2");
   JLabel label_cm222 = new JLabel("15,000원");
   // 스몰세트
   JPanel panel_cm3 = new JPanel();
   JPanel panel_cm33 = new JPanel();
   JPanel panel_cm333 = new JPanel();
   JButton button_cm3 = new JButton(new ImageIcon("img/combo3.png"));
   JLabel label_cm3 = new JLabel("스몰 세트");
   JLabel label_cm33 = new JLabel("팝콘(M)1+탄산음료(M)1");
   JLabel label_cm333 = new JLabel("7,000원");
   // CGV 콤보
   JPanel panel_cm4 = new JPanel();
   JPanel panel_cm44 = new JPanel();
   JPanel panel_cm444 = new JPanel();
   JButton button_cm4 = new JButton(new ImageIcon("img/combo4.png"));
   JLabel label_cm4 = new JLabel("CGV 콤보");
   JLabel label_cm44 = new JLabel("팝콘(L)1+탄산음료(M)2");
   JLabel label_cm444 = new JLabel("10,000원");
   // 우리패키지
   JPanel panel_cm5 = new JPanel();
   JPanel panel_cm55 = new JPanel();
   JPanel panel_cm555 = new JPanel();
   JButton button_cm5 = new JButton(new ImageIcon("img/combo5.png"));
   JLabel label_cm5 = new JLabel("우리 패키지");
   JLabel label_cm55 = new JLabel("일반 영화 관람권 4매+더블콤보 1개");
   JLabel label_cm555 = new JLabel("61,000원");
   // 나랑 너 패키지
   JPanel panel_cm6 = new JPanel();
   JPanel panel_cm66 = new JPanel();
   JPanel panel_cm666 = new JPanel();
   JButton button_cm6 = new JButton(new ImageIcon("img/combo6.png"));
   JLabel label_cm6 = new JLabel("나랑 너 패키지");
   JLabel label_cm66 = new JLabel("일반 영화 관람권 2매+CGV콤보 1개");
   JLabel label_cm666 = new JLabel("34,000원");
   // 팝콘 버튼 부분
   // 더블 치즈팝콘M
   JPanel panel_pc1 = new JPanel();
   JPanel panel_pc11 = new JPanel();
   JPanel panel_pc111 = new JPanel();
   JButton button_pc1 = new JButton(new ImageIcon("img/popcorn1.png"));
   JLabel label_pc1 = new JLabel("더블치즈팝콘(M)");
   JLabel label_pc11 = new JLabel("6,000원");
   // 바질어니언팝콘M
   JPanel panel_pc2 = new JPanel();
   JPanel panel_pc22 = new JPanel();
   JPanel panel_pc222 = new JPanel();
   JButton button_pc2 = new JButton(new ImageIcon("img/popcorn2.png"));
   JLabel label_pc2 = new JLabel("바질어니언팝콘(M)");
   JLabel label_pc22 = new JLabel("6,000원");
   // 달콤팝콘M
   JPanel panel_pc3 = new JPanel();
   JPanel panel_pc33 = new JPanel();
   JPanel panel_pc333 = new JPanel();
   JButton button_pc3 = new JButton(new ImageIcon("img/popcorn3.png"));
   JLabel label_pc3 = new JLabel("달콤팝콘(M)");
   JLabel label_pc33 = new JLabel("6,000원");
   // 더블치즈팝콘L
   JPanel panel_pc4 = new JPanel();
   JPanel panel_pc44 = new JPanel();
   JPanel panel_pc444 = new JPanel();
   JButton button_pc4 = new JButton(new ImageIcon("img/popcorn4.png"));
   JLabel label_pc4 = new JLabel("더블치즈팝콘(L)");
   JLabel label_pc44 = new JLabel("6,500원");
   // 바질어니언팝콘L
   JPanel panel_pc5 = new JPanel();
   JPanel panel_pc55 = new JPanel();
   JPanel panel_pc555 = new JPanel();
   JButton button_pc5 = new JButton(new ImageIcon("img/popcorn5.png"));
   JLabel label_pc5 = new JLabel("바질어니언팝콘(L)");
   JLabel label_pc55 = new JLabel("6,500원");
   // 달콤팝콘L
   JPanel panel_pc6 = new JPanel();
   JPanel panel_pc66 = new JPanel();
   JPanel panel_pc666 = new JPanel();
   JButton button_pc6 = new JButton(new ImageIcon("img/popcorn6.png"));
   JLabel label_pc6 = new JLabel("달콤팝콘(L)");
   JLabel label_pc66 = new JLabel("6,500원");
   // 음료 버튼 부분
   // 핑크레몬에이드
   JPanel panel_dk1 = new JPanel();
   JPanel panel_dk11 = new JPanel();
   JPanel panel_dk111 = new JPanel();
   JButton button_dk1 = new JButton(new ImageIcon("img/drink1.png"));
   JLabel label_dk1 = new JLabel("핑크레몬에이드");
   JLabel label_dk11 = new JLabel("5,500원");
   // 에이드
   JPanel panel_dk2 = new JPanel();
   JPanel panel_dk22 = new JPanel();
   JPanel panel_dk222 = new JPanel();
   JButton button_dk2 = new JButton(new ImageIcon("img/drink2.png"));
   JLabel label_dk2 = new JLabel("에이드");
   JLabel label_dk22 = new JLabel("5,500원");
   // 아메리카노 아이스
   JPanel panel_dk3 = new JPanel();
   JPanel panel_dk33 = new JPanel();
   JPanel panel_dk333 = new JPanel();
   JButton button_dk3 = new JButton(new ImageIcon("img/drink3.png"));
   JLabel label_dk3 = new JLabel("아메리카노(ICE)");
   JLabel label_dk33 = new JLabel("4,500원");
   // 아메리카노 핫
   JPanel panel_dk4 = new JPanel();
   JPanel panel_dk44 = new JPanel();
   JPanel panel_dk444 = new JPanel();
   JButton button_dk4 = new JButton(new ImageIcon("img/drink4.png"));
   JLabel label_dk4 = new JLabel("아메리카노(HOT)");
   JLabel label_dk44 = new JLabel("4,000원");
   // 탄산음료L
   JPanel panel_dk5 = new JPanel();
   JPanel panel_dk55 = new JPanel();
   JPanel panel_dk555 = new JPanel();
   JButton button_dk5 = new JButton(new ImageIcon("img/drink5.png"));
   JLabel label_dk5 = new JLabel("탄산음료(L)");
   JLabel label_dk55 = new JLabel("3,500원");
   // 탄산음료M
   JPanel panel_dk6 = new JPanel();
   JPanel panel_dk66 = new JPanel();
   JPanel panel_dk666 = new JPanel();
   JButton button_dk6 = new JButton(new ImageIcon("img/drink6.png"));
   JLabel label_dk6 = new JLabel("탄산음료(M)");
   JLabel label_dk66 = new JLabel("3,000원");
   // 스낵 버튼 부분
   // 칠리치즈나쵸
   JPanel panel_sn1 = new JPanel();
   JPanel panel_sn11 = new JPanel();
   JPanel panel_sn111 = new JPanel();
   JButton button_sn1 = new JButton(new ImageIcon("img/snack1.png"));
   JLabel label_sn1 = new JLabel("칠리치즈나쵸");
   JLabel label_sn11 = new JLabel("4,900원");
   // 플레인핫도그
   JPanel panel_sn2 = new JPanel();
   JPanel panel_sn22 = new JPanel();
   JPanel panel_sn222 = new JPanel();
   JButton button_sn2 = new JButton(new ImageIcon("img/snack2.png"));
   JLabel label_sn2 = new JLabel("플레인핫도그");
   JLabel label_sn22 = new JLabel("4,500원");
   // 칠리치즈핫도그
   JPanel panel_sn3 = new JPanel();
   JPanel panel_sn33 = new JPanel();
   JPanel panel_sn333 = new JPanel();
   JButton button_sn3 = new JButton(new ImageIcon("img/snack3.png"));
   JLabel label_sn3 = new JLabel("칠리치즈핫도그");
   JLabel label_sn33 = new JLabel("5,000원");
   // 맛밤
   JPanel panel_sn4 = new JPanel();
   JPanel panel_sn44 = new JPanel();
   JPanel panel_sn444 = new JPanel();
   JButton button_sn4 = new JButton(new ImageIcon("img/snack4.png"));
   JLabel label_sn4 = new JLabel("맛밤");
   JLabel label_sn44 = new JLabel("3,500원");

   // 단순 하단 색상 넣기용
   JPanel panel_south = new JPanel();
   JLabel Label_south = new JLabel("WGV 영화관을 이용해주셔서 감사합니다.");
   // 라벨 변경
   //	스낵 부분 비활성화 버튼
   JButton button23 = new JButton("준비중입니다.");
   JButton button24 = new JButton("준비중입니다.");

   public Snack() {
      setSize(1500, 950);
      setTitle("WGV/음식");
      setLocation(300, 50);
      setIconImage(foodIcon.getImage());
      setResizable(false);
      init();
      start();
      setVisible(true);
   }

   private void init() {
      container.setLayout(new BorderLayout());
      container.add("North", panel_main_north);
      container.add("Center", tabbedPane);
      container.add("South", panel_south);

      // 상단 스토어,상품선택
      panel_main_north.setBackground(new Color(220, 70, 30));
      panel_main_north.setLayout(new GridLayout(1, 1));
      panel_main_north.add("West", label_store);
      panel_main_north.add("Center", label_price);

      // 스토어, 상품 글자 크기 조절
      label_store.setFont(new Font("맑은고딕", Font.BOLD, 50));
      label_price.setFont(new Font("맑은고딕", Font.BOLD, 50));
      // 탭 항목
      tabbedPane.setFont(new Font("맑은고딕", Font.BOLD, 50));

      // 라벨 글자크기 + 가운데 정렬
      // 콤보
      label_cm1.setHorizontalAlignment(JLabel.CENTER);
      label_cm11.setHorizontalAlignment(JLabel.CENTER);
      label_cm111.setHorizontalAlignment(JLabel.CENTER);
      label_cm1.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm11.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm111.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm2.setHorizontalAlignment(JLabel.CENTER);
      label_cm22.setHorizontalAlignment(JLabel.CENTER);
      label_cm222.setHorizontalAlignment(JLabel.CENTER);
      label_cm2.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm22.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm222.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm3.setHorizontalAlignment(JLabel.CENTER);
      label_cm33.setHorizontalAlignment(JLabel.CENTER);
      label_cm333.setHorizontalAlignment(JLabel.CENTER);
      label_cm3.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm33.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm333.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm4.setHorizontalAlignment(JLabel.CENTER);
      label_cm44.setHorizontalAlignment(JLabel.CENTER);
      label_cm444.setHorizontalAlignment(JLabel.CENTER);
      label_cm4.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm44.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm444.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm5.setHorizontalAlignment(JLabel.CENTER);
      label_cm55.setHorizontalAlignment(JLabel.CENTER);
      label_cm555.setHorizontalAlignment(JLabel.CENTER);
      label_cm5.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm55.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm555.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm6.setHorizontalAlignment(JLabel.CENTER);
      label_cm66.setHorizontalAlignment(JLabel.CENTER);
      label_cm666.setHorizontalAlignment(JLabel.CENTER);
      label_cm6.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm66.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_cm666.setFont(new Font("맑은고딕", Font.BOLD, 25));
      // 라벨 글자크기 + 가운데 정렬
      // 팝콘
      label_pc1.setHorizontalAlignment(JLabel.CENTER);
      label_pc11.setHorizontalAlignment(JLabel.CENTER);
      label_pc1.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc11.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc2.setHorizontalAlignment(JLabel.CENTER);
      label_pc22.setHorizontalAlignment(JLabel.CENTER);
      label_pc2.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc22.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc3.setHorizontalAlignment(JLabel.CENTER);
      label_pc33.setHorizontalAlignment(JLabel.CENTER);
      label_pc3.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc33.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc4.setHorizontalAlignment(JLabel.CENTER);
      label_pc44.setHorizontalAlignment(JLabel.CENTER);
      label_pc4.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc44.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc5.setHorizontalAlignment(JLabel.CENTER);
      label_pc55.setHorizontalAlignment(JLabel.CENTER);
      label_pc5.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc55.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc6.setHorizontalAlignment(JLabel.CENTER);
      label_pc66.setHorizontalAlignment(JLabel.CENTER);
      label_pc6.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_pc66.setFont(new Font("맑은고딕", Font.BOLD, 25));
      // 라벨 글자크기 + 가운데 정렬
      // 음료
      label_dk1.setHorizontalAlignment(JLabel.CENTER);
      label_dk11.setHorizontalAlignment(JLabel.CENTER);
      label_dk1.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk11.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk2.setHorizontalAlignment(JLabel.CENTER);
      label_dk22.setHorizontalAlignment(JLabel.CENTER);
      label_dk2.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk22.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk3.setHorizontalAlignment(JLabel.CENTER);
      label_dk33.setHorizontalAlignment(JLabel.CENTER);
      label_dk3.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk33.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk4.setHorizontalAlignment(JLabel.CENTER);
      label_dk44.setHorizontalAlignment(JLabel.CENTER);
      label_dk4.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk44.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk5.setHorizontalAlignment(JLabel.CENTER);
      label_dk55.setHorizontalAlignment(JLabel.CENTER);
      label_dk5.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk55.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk6.setHorizontalAlignment(JLabel.CENTER);
      label_dk66.setHorizontalAlignment(JLabel.CENTER);
      label_dk6.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_dk66.setFont(new Font("맑은고딕", Font.BOLD, 25));
      // 라벨 글자크기 + 가운데 정렬
      // 스낵
      label_sn1.setHorizontalAlignment(JLabel.CENTER);
      label_sn11.setHorizontalAlignment(JLabel.CENTER);
      label_sn1.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_sn11.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_sn2.setHorizontalAlignment(JLabel.CENTER);
      label_sn22.setHorizontalAlignment(JLabel.CENTER);
      label_sn2.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_sn22.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_sn3.setHorizontalAlignment(JLabel.CENTER);
      label_sn33.setHorizontalAlignment(JLabel.CENTER);
      label_sn3.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_sn33.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_sn4.setHorizontalAlignment(JLabel.CENTER);
      label_sn44.setHorizontalAlignment(JLabel.CENTER);
      label_sn4.setFont(new Font("맑은고딕", Font.BOLD, 25));
      label_sn44.setFont(new Font("맑은고딕", Font.BOLD, 25));
      // panel 화면구성
      // 콤보
      tabbedPane.add("콤보", panel_combo);
      panel_combo.setLayout(new GridLayout(2, 3));
      panel_combo.add(panel_cm1);
      panel_cm1.setLayout(new BorderLayout());
      panel_cm1.add("Center", panel_cm11);
      panel_cm11.setLayout(new BorderLayout());
      panel_cm11.add("Center", button_cm1);
      panel_cm11.add("South", panel_cm111);
      panel_cm111.setLayout(new BorderLayout());
      panel_cm111.add("North", label_cm1);
      panel_cm111.add("Center", label_cm11);
      panel_cm111.add("South", label_cm111);
      panel_combo.add(panel_cm2);
      panel_cm2.setLayout(new BorderLayout());
      panel_cm2.add("Center", panel_cm22);
      panel_cm22.setLayout(new BorderLayout());
      panel_cm22.add("Center", button_cm2);
      panel_cm22.add("South", panel_cm222);
      panel_cm222.setLayout(new BorderLayout());
      panel_cm222.add("North", label_cm2);
      panel_cm222.add("Center", label_cm22);
      panel_cm222.add("South", label_cm222);
      panel_combo.add(panel_cm3);
      panel_cm3.setLayout(new BorderLayout());
      panel_cm3.add("Center", panel_cm33);
      panel_cm33.setLayout(new BorderLayout());
      panel_cm33.add("Center", button_cm3);
      panel_cm33.add("South", panel_cm333);
      panel_cm333.setLayout(new BorderLayout());
      panel_cm333.add("North", label_cm3);
      panel_cm333.add("Center", label_cm33);
      panel_cm333.add("South", label_cm333);
      panel_combo.add(panel_cm4);
      panel_cm4.setLayout(new BorderLayout());
      panel_cm4.add("Center", panel_cm44);
      panel_cm44.setLayout(new BorderLayout());
      panel_cm44.add("Center", button_cm4);
      panel_cm44.add("South", panel_cm444);
      panel_cm444.setLayout(new BorderLayout());
      panel_cm444.add("North", label_cm4);
      panel_cm444.add("Center", label_cm44);
      panel_cm444.add("South", label_cm444);
      panel_combo.add(panel_cm5);
      panel_cm5.setLayout(new BorderLayout());
      panel_cm5.add("Center", panel_cm55);
      panel_cm55.setLayout(new BorderLayout());
      panel_cm55.add("Center", button_cm5);
      panel_cm55.add("South", panel_cm555);
      panel_cm555.setLayout(new BorderLayout());
      panel_cm555.add("North", label_cm5);
      panel_cm555.add("Center", label_cm55);
      panel_cm555.add("South", label_cm555);
      panel_combo.add(panel_cm6);
      panel_cm6.setLayout(new BorderLayout());
      panel_cm6.add("Center", panel_cm66);
      panel_cm66.setLayout(new BorderLayout());
      panel_cm66.add("Center", button_cm6);
      panel_cm66.add("South", panel_cm666);
      panel_cm666.setLayout(new BorderLayout());
      panel_cm666.add("North", label_cm6);
      panel_cm666.add("Center", label_cm66);
      panel_cm666.add("South", label_cm666);
      // panel 화면구성
      // 팝콘
      tabbedPane.add("팝콘", panel_popcorn);
      panel_popcorn.setLayout(new GridLayout(2, 3));
      panel_popcorn.add(panel_pc1);
      panel_pc1.setLayout(new BorderLayout());
      panel_pc1.add("Center", panel_pc11);
      panel_pc11.setLayout(new BorderLayout());
      panel_pc11.add("Center", button_pc1);
      panel_pc11.add("South", panel_pc111);
      panel_pc111.setLayout(new BorderLayout());
      panel_pc111.add("North", label_pc1);
      panel_pc111.add("Center", label_pc11);
      panel_popcorn.add(panel_pc2);
      panel_pc2.setLayout(new BorderLayout());
      panel_pc2.add("Center", panel_pc22);
      panel_pc22.setLayout(new BorderLayout());
      panel_pc22.add("Center", button_pc2);
      panel_pc22.add("South", panel_pc222);
      panel_pc222.setLayout(new BorderLayout());
      panel_pc222.add("North", label_pc2);
      panel_pc222.add("Center", label_pc22);
      panel_popcorn.add(panel_pc3);
      panel_pc3.setLayout(new BorderLayout());
      panel_pc3.add("Center", panel_pc33);
      panel_pc33.setLayout(new BorderLayout());
      panel_pc33.add("Center", button_pc3);
      panel_pc33.add("South", panel_pc333);
      panel_pc333.setLayout(new BorderLayout());
      panel_pc333.add("North", label_pc3);
      panel_pc333.add("Center", label_pc33);
      panel_popcorn.add(panel_pc4);
      panel_pc4.setLayout(new BorderLayout());
      panel_pc4.add("Center", panel_pc44);
      panel_pc44.setLayout(new BorderLayout());
      panel_pc44.add("Center", button_pc4);
      panel_pc44.add("South", panel_pc444);
      panel_pc444.setLayout(new BorderLayout());
      panel_pc444.add("North", label_pc4);
      panel_pc444.add("Center", label_pc44);
      panel_popcorn.add(panel_pc5);
      panel_pc5.setLayout(new BorderLayout());
      panel_pc5.add("Center", panel_pc55);
      panel_pc55.setLayout(new BorderLayout());
      panel_pc55.add("Center", button_pc5);
      panel_pc55.add("South", panel_pc555);
      panel_pc555.setLayout(new BorderLayout());
      panel_pc555.add("North", label_pc5);
      panel_pc555.add("Center", label_pc55);
      panel_popcorn.add(panel_pc6);
      panel_pc6.setLayout(new BorderLayout());
      panel_pc6.add("Center", panel_pc66);
      panel_pc66.setLayout(new BorderLayout());
      panel_pc66.add("Center", button_pc6);
      panel_pc66.add("South", panel_pc666);
      panel_pc666.setLayout(new BorderLayout());
      panel_pc666.add("North", label_pc6);
      panel_pc666.add("Center", label_pc66);
      // panel 화면구성
      // 음료
      tabbedPane.add("음료", panel_drink);
      panel_drink.setLayout(new GridLayout(2, 3));
      panel_drink.add(panel_dk1);
      panel_dk1.setLayout(new BorderLayout());
      panel_dk1.add("Center", panel_dk11);
      panel_dk11.setLayout(new BorderLayout());
      panel_dk11.add("Center", button_dk1);
      panel_dk11.add("South", panel_dk111);
      panel_dk111.setLayout(new BorderLayout());
      panel_dk111.add("North", label_dk1);
      panel_dk111.add("Center", label_dk11);
      panel_drink.add(panel_dk2);
      panel_dk2.setLayout(new BorderLayout());
      panel_dk2.add("Center", panel_dk22);
      panel_dk22.setLayout(new BorderLayout());
      panel_dk22.add("Center", button_dk2);
      panel_dk22.add("South", panel_dk222);
      panel_dk222.setLayout(new BorderLayout());
      panel_dk222.add("North", label_dk2);
      panel_dk222.add("Center", label_dk22);
      panel_drink.add(panel_dk3);
      panel_dk3.setLayout(new BorderLayout());
      panel_dk3.add("Center", panel_dk33);
      panel_dk33.setLayout(new BorderLayout());
      panel_dk33.add("Center", button_dk3);
      panel_dk33.add("South", panel_dk333);
      panel_dk333.setLayout(new BorderLayout());
      panel_dk333.add("North", label_dk3);
      panel_dk333.add("Center", label_dk33);
      panel_drink.add(panel_dk4);
      panel_dk4.setLayout(new BorderLayout());
      panel_dk4.add("Center", panel_dk44);
      panel_dk44.setLayout(new BorderLayout());
      panel_dk44.add("Center", button_dk4);
      panel_dk44.add("South", panel_dk444);
      panel_dk444.setLayout(new BorderLayout());
      panel_dk444.add("North", label_dk4);
      panel_dk444.add("Center", label_dk44);
      panel_drink.add(panel_dk5);
      panel_dk5.setLayout(new BorderLayout());
      panel_dk5.add("Center", panel_dk55);
      panel_dk55.setLayout(new BorderLayout());
      panel_dk55.add("Center", button_dk5);
      panel_dk55.add("South", panel_dk555);
      panel_dk555.setLayout(new BorderLayout());
      panel_dk555.add("North", label_dk5);
      panel_dk555.add("Center", label_dk55);
      panel_drink.add(panel_dk6);
      panel_dk6.setLayout(new BorderLayout());
      panel_dk6.add("Center", panel_dk66);
      panel_dk66.setLayout(new BorderLayout());
      panel_dk66.add("Center", button_dk6);
      panel_dk66.add("South", panel_dk666);
      panel_dk666.setLayout(new BorderLayout());
      panel_dk666.add("North", label_dk6);
      panel_dk666.add("Center", label_dk66);
      // panel 화면구성
      // 스낵
      tabbedPane.add("스낵", panel_snack);
      panel_snack.setLayout(new GridLayout(2, 3));
      panel_snack.add(panel_sn1);
      panel_sn1.setLayout(new BorderLayout());
      panel_sn1.add("Center", panel_sn11);
      panel_sn11.setLayout(new BorderLayout());
      panel_sn11.add("Center", button_sn1);
      panel_sn11.add("South", panel_sn111);
      panel_sn111.setLayout(new BorderLayout());
      panel_sn111.add("North", label_sn1);
      panel_sn111.add("Center", label_sn11);
      panel_snack.add(panel_sn2);
      panel_sn2.setLayout(new BorderLayout());
      panel_sn2.add("Center", panel_sn22);
      panel_sn22.setLayout(new BorderLayout());
      panel_sn22.add("Center", button_sn2);
      panel_sn22.add("South", panel_sn222);
      panel_sn222.setLayout(new BorderLayout());
      panel_sn222.add("North", label_sn2);
      panel_sn222.add("Center", label_sn22);
      panel_snack.add(panel_sn3);
      panel_sn3.setLayout(new BorderLayout());
      panel_sn3.add("Center", panel_sn33);
      panel_sn33.setLayout(new BorderLayout());
      panel_sn33.add("Center", button_sn3);
      panel_sn33.add("South", panel_sn333);
      panel_sn333.setLayout(new BorderLayout());
      panel_sn333.add("North", label_sn3);
      panel_sn333.add("Center", label_sn33);
      panel_snack.add(panel_sn4);
      panel_sn4.setLayout(new BorderLayout());
      panel_sn4.add("Center", panel_sn44);
      panel_sn44.setLayout(new BorderLayout());
      panel_sn44.add("Center", button_sn4);
      panel_sn44.add("South", panel_sn444);
      panel_sn444.setLayout(new BorderLayout());
      panel_sn444.add("North", label_sn4);
      panel_sn444.add("Center", label_sn44);
      panel_snack.add(button23);
      panel_snack.add(button24);

      // 이미지 버튼 컬러 색상 변경
      button_cm1.setBackground(Color.WHITE);
      button_cm2.setBackground(Color.WHITE);
      button_cm3.setBackground(Color.WHITE);
      button_cm4.setBackground(Color.WHITE);
      button_cm5.setBackground(Color.WHITE);
      button_cm6.setBackground(Color.WHITE);
      button_pc1.setBackground(Color.WHITE);
      button_pc2.setBackground(Color.WHITE);
      button_pc3.setBackground(Color.WHITE);
      button_pc4.setBackground(Color.WHITE);
      button_pc5.setBackground(Color.WHITE);
      button_pc6.setBackground(Color.WHITE);
      button_dk1.setBackground(Color.WHITE);
      button_dk2.setBackground(Color.WHITE);
      button_dk3.setBackground(Color.WHITE);
      button_dk4.setBackground(Color.WHITE);
      button_dk5.setBackground(Color.WHITE);
      button_dk6.setBackground(Color.WHITE);
      button_sn1.setBackground(Color.WHITE);
      button_sn2.setBackground(Color.WHITE);
      button_sn3.setBackground(Color.WHITE);
      button_sn4.setBackground(Color.WHITE);

      // 스낵 부분 준비중입니다 버튼 클릭X 처리
      button23.setBackground(Color.LIGHT_GRAY);
      button23.setFont(new Font("맑은고딕", Font.BOLD, 35));
      button23.setEnabled(false);
      button24.setBackground(Color.LIGHT_GRAY);
      button24.setFont(new Font("맑은고딕", Font.BOLD, 35));
      button24.setEnabled(false);

      // 단순 하단 색깔 넣기용
      panel_south.setBackground(new Color(220, 70, 30));
      panel_south.setLayout(new BorderLayout());
      panel_south.add(Label_south);
      Label_south.setHorizontalAlignment(JLabel.CENTER);
      Label_south.setFont(new Font("맑은고딕", Font.BOLD, 40));
   }

   private void start() {
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      button_cm1.addActionListener(this);
      button_cm2.addActionListener(this);
      button_cm3.addActionListener(this);
      button_cm4.addActionListener(this);
      button_cm5.addActionListener(this);
      button_cm6.addActionListener(this);
      button_pc1.addActionListener(this);
      button_pc2.addActionListener(this);
      button_pc3.addActionListener(this);
      button_pc4.addActionListener(this);
      button_pc5.addActionListener(this);
      button_pc6.addActionListener(this);
      button_dk1.addActionListener(this);
      button_dk2.addActionListener(this);
      button_dk3.addActionListener(this);
      button_dk4.addActionListener(this);
      button_dk5.addActionListener(this);
      button_dk6.addActionListener(this);
      button_sn1.addActionListener(this);
      button_sn2.addActionListener(this);
      button_sn3.addActionListener(this);
      button_sn4.addActionListener(this);

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button_cm1) {
         choose1();
      } else if (e.getSource() == button_cm2) {
         choose2();
      } else if (e.getSource() == button_cm3) {
         choose3();
      } else if (e.getSource() == button_cm4) {
         choose4();
      } else if (e.getSource() == button_cm5) {
         choose5();
      } else if (e.getSource() == button_cm6) {
         choose6();
      } else if (e.getSource() == button_pc1) {
         choose7();
      } else if (e.getSource() == button_pc2) {
         choose8();
      } else if (e.getSource() == button_pc3) {
         choose9();
      } else if (e.getSource() == button_pc4) {
         choose10();
      } else if (e.getSource() == button_pc5) {
         choose11();
      } else if (e.getSource() == button_pc6) {
         choose12();
      } else if (e.getSource() == button_dk1) {
         choose13();
      } else if (e.getSource() == button_dk2) {
         choose14();
      } else if (e.getSource() == button_dk3) {
         choose15();
      } else if (e.getSource() == button_dk4) {
         choose16();
      } else if (e.getSource() == button_dk5) {
         choose17();
      } else if (e.getSource() == button_dk6) {
         choose18();
      } else if (e.getSource() == button_sn1) {
         choose19();
      } else if (e.getSource() == button_sn2) {
         choose20();
      } else if (e.getSource() == button_sn3) {
         choose21();
      } else if (e.getSource() == button_sn4) {
         choose22();
      }
   }
   // DAO 호출
   SnackDAO dao = new SnackDAO();  
   // 이미지 클릭 후 sql 연동 
   private void choose1() { // 더블콤보
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "더블콤보", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/combo1.png"));     
      if(result == 0)  dao.updatesnack("더블콤보");
   }
   private void choose2() {	 // 라지콤보  
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "라지콤보", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/combo2.png"));
      if(result == 0)     	  
    	  dao.updatesnack("라지콤보");
   }
   private void choose3() {	// 스몰세트
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "스몰세트", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/combo3.png"));
      if(result == 0)  dao.updatesnack("스몰세트");
   }
   private void choose4() {	// CGV콤보
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "CGV콤보", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/combo4.png"));
     if(result == 0)  dao.updatesnack("CGV콤보");
   }
   private void choose5() {	//우리 패키지
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "우리 패키지", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/combo5.png"));
      if(result == 0)  dao.updatesnack("우리 패키지");
   }
   private void choose6() {	// 나랑 너 패키지
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "나랑 너 패키지", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/combo6.png"));
      if(result == 0)  dao.updatesnack("나랑 너 패키지");
   }
   private void choose7() {	// 더블치즈팝콘
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "더블치즈팝콘", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/popcorn1.png"));
      if(result == 0)  dao.updatesnack("더블치즈팝콘M");
   }
   private void choose8() { //바질어니언팝콘M
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "바질어니언팝콘(M)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/popcorn2.png"));
      if(result == 0)  dao.updatesnack("바질어니언팝콘M");
   }
   private void choose9() {	// 달콤팝콘M
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "달콤팝콘(M)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/popcorn3.png"));
      if(result == 0)  dao.updatesnack("달콤팝콘M");
   }
   private void choose10() { // 더블치즈팝콘L
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "더블치즈팝콘(L)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/popcorn4.png"));
      if(result == 0)  dao.updatesnack("더블치즈팝콘L");
   }
   private void choose11() { // 바질어니언L
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "바질어니언팝콘(L)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/popcorn5.png"));
      if(result == 0)  dao.updatesnack("바질어니언팝콘L");
   }
   private void choose12() { // 달콤팝콘L
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "달콤팝콘(L)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/popcorn6.png"));
      if(result == 0)  dao.updatesnack("달콤팝콘L");
   }
   private void choose13() { // 핑크레몬에이드
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "핑크레몬에이드", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/drink1.png"));
      if(result == 0)  dao.updatesnack("핑크레몬에이드");
   }
   private void choose14() { // 에이드
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "에이드", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/drink2.png"));
      if(result == 0)  dao.updatesnack("에이드");
   }
   private void choose15() { // 아이스 아메리카노
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "아메리카노(ICE)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/drink3.png"));
      if(result == 0)  dao.updatesnack("아메리카노ICE");
   }
   private void choose16() { // 아메리카노 핫
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "아메리카노(HOT)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/drink4.png"));
      if(result == 0)  dao.updatesnack("아메리카노HOT");
   }
   private void choose17() { // 탄산음료 L
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "탄산음료(L)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/drink5.png"));
      if(result == 0)  dao.updatesnack("탄산음료L");
   }
   private void choose18() { // 탄산음료 M
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "탄산음료(M)", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/drink6.png"));
      if(result == 0)  dao.updatesnack("탄산음료M");
   }
   private void choose19() { // 칠리치즈나쵸
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "칠리치즈나쵸", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/snack1.png"));
      if(result == 0)  dao.updatesnack("칠리치즈나쵸");
   }
   private void choose20() { // 플레인핫도그
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "플레인핫도그", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/snack2.png"));
      if(result == 0)  dao.updatesnack("플레인핫도그");
   }
   private void choose21() { // 칠리치즈 핫도그
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "칠리치즈핫도그", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/snack3.png"));
      if(result == 0)  dao.updatesnack("칠리치즈핫도그");
   }
   private void choose22() { // 맛밤
      int result = JOptionPane.showConfirmDialog(this, "구매하시겠습니까?", "맛밤", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/snack4.png"));
      if(result == 0)  dao.updatesnack("맛밤");
   }

}