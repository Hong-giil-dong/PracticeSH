package practice170405;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


//삭제 프레임과 수정 프레임은 비슷하므로 같은 클래스로 구성해서 인스턴스로 사용해서 쓰는것이 어떨까

public class Work01{
	public static void main(String[] ar){ // 메인메소드 시작
		Work01_Sub es = new Work01_Sub("사용자 관리"); // Work01_Sub 클래스 객체 생성
	}
}

class Work01_Sub1 implements Serializable{//직렬화...
	// 복잡한구조의 객체를 저장이나 네트워크전송을 할수있게 바이트스트림형태로 변경하는 것
	private String name; // 이름 변수 선언
	private String jumin; // 주민번호 변수 선언
	private String tel; // 전화번호 변수 선언
	private String addr; // 어드레스 변수 선언
	
	public Work01_Sub1(String a, String b, String c, String d){ //생성자->객체가 만들어 질때마다 초기화 되는 곳, 이름 주민번호 전화번호 주소는 객체가 만들어 질때마다 새로 사용할 것들이기 때문
		name = a;
		jumin = b;
		tel = c;
		addr = d;
	}
	
	public void setName(String a){ // 이름을 설정하는 메소드 .. 매개변수로 스트링 값이 들어오면 그것을 name변수에 저장
		name = a;
	}
	public String getName(){ // 이름을 얻어오는 메소드.. 스트링값으로 저장된 이름 값을 반환
		return name;
	}
	public void setJumin(String a){ // 주민번호를 설정하는 메소드.. 매개변수로 스트링 값이 들어오면 그것을 jumin변수에 저장
		jumin = a;
	}
	public String getJumin(){// 주민번호를 얻어오는 메소드...  스트링값으로 저장된 주민번호 값을 반환
		return jumin;
	}
	public void setTel(String a){ // 전화번호를 설정하는 메소드.. 매개변수로 스트링 값이 들어오면 그것을 tel 변수에 저장
		tel = a;
	}
	public String getTel(){ // 전화번호를 얻어오는 메소드...  스트링값으로 저장된 전화번호 값을 반환
		return tel;
	}
	public void setAddr(String a){ // 전화번호를 설정하는 메소드.. 매개변수로 스트링 값이 들어오면 그것을 addr 변수에 저장
		addr = a;
	}
	public String getAddr(){ // 주소를 얻어오는 메소드...  스트링값으로 저장된 addr 값을 반환
		return addr;
	}
}


class Work01_Sub extends JFrame
	implements ActionListener, KeyListener, FocusListener{ // 스윙프레임을 상속받아서 프레임을 쓸 준비를 하고
	// 액션 리스너와 키리스너, 포커스리스너 등 각 인터페이스가 갖고 있는 기능을 구현하기 위해서 사용
	private Container con; // 컨테이너 타입 참조변수 선언
	private BorderLayout bl = new BorderLayout(5, 5); // 보더레이아웃객체 bl 생성 (조건 가운데 5,5 공백) 
	private JLabel jlb = new JLabel("<== 이것을 누르면 전체보기가 됩니다."); // 라벨 객체 생성
	private JButton jbt = new JButton("전체보기"); // 버튼 객체 생성
	private JTextArea jta = new JTextArea(15, 40); // 텍스트에리아 객체 생성(사이즈 조건지정)
	private JScrollPane jsp = new JScrollPane(jta); // 텍스트에리아 객체인 jta를 넣은 스크롤팬 객체 jsp 생성
	private JButton jbt1 = new JButton("등록"); // 버튼 객체 생성
	private JButton jbt2 = new JButton("수정"); // 버튼 객체 생성
	private JButton jbt3 = new JButton("삭제"); // 버튼 객체 생성
	private JButton jbt4 = new JButton("Clear"); // 버튼 객체 생성
	private JButton jbt5 = new JButton("저장"); // 버튼 객체 생성
	private JButton jbt6 = new JButton("로드"); // 버튼 객체 생성
	private JButton jbt7 = new JButton("종료"); // 버튼 객체 생성
	
	private JLabel lb = new JLabel("이름 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel lb1 = new JLabel("주민번호 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel lb2 = new JLabel("전화번호 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel lb3 = new JLabel("주소 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JTextField tf = new JTextField(14); // 텍스트필드 객체 생성(사이즈 조건지정)
	private JTextField tf1 = new JTextField(7); // 텍스트필드 객체 생성(사이즈 조건지정)
	private JTextField tf2 = new JTextField(7); // 텍스트필드 객체 생성(사이즈 조건지정)
	private JTextField tf3 = new JTextField(14); // 텍스트필드 객체 생성(사이즈 조건지정)
	private JTextField tf4 = new JTextField(14); // 텍스트필드 객체 생성(사이즈 조건지정)
	
	private JLabel alb = new JLabel("검색 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JTextField atf = new JTextField(7); // 텍스트필드 객체 생성(사이즈 조건지정)
	private JTextField atf1 = new JTextField(7); // 텍스트필드 객체 생성(사이즈 조건지정)
	private JButton abt = new JButton("검색"); // 버튼 객체 생성
	private JTextArea ata = new JTextArea(5, 20); // 텍스트에리아 객체 생성(사이즈 조건지정)
	private JScrollPane ajsp = new JScrollPane(ata); // 텍스트에리아 객체인 ata를 넣은 스크롤팬 객체 ajsp 생성
	private JButton abt1 = new JButton("<<"); // 버튼 객체 생성
	private JButton abt2 = new JButton(">>"); // 버튼 객체 생성
	
	private ImageIcon im = new ImageIcon("web.gif"); // 이미지 아이콘 객체 im 생성
	
	private Vector vc = new Vector(); //벡터 인스턴스를 사용해서 사용자 데이터(Work01_Sub1의 객체)를 무한히 저장...
	private int pos = 0; // 검색된 데이터의 위치번째를 기억하는 변수
	private int pos1 = 0; //수정될 데이터의 위치번째를 기억하는 변수
	
	
	private JFileChooser jfc = new JFileChooser("D://잠팅//온라인강좌//classes//Chapter_10"); // 파일선택창 객체 생성 (조건 : 띄울때 현재 디렉토리를 설정)
	
	private JDialog jdlg = new JDialog(this, "삭제", true); // 다이얼로그 창 객체 생성(조건 : 프레임 제목 삭제, 다른쪽에 클릭 못하게)
	private Container condlg; // 컨테이너 타입 참조변수 생성
	private JLabel lbdlg = new JLabel("이름 : ", JLabel.RIGHT); // 라벨객체 생성
	private JLabel lbdlg1 = new JLabel("주민번호 : ", JLabel.RIGHT); // 라벨객체 생성
	private JTextField tfdlg = new JTextField(15); // 텍스트 필드 객체 생성
	private JTextField tfdlg1 = new JTextField(7); // 텍스트 필드 객체 생성
	private JTextField tfdlg2 = new JTextField(7); // 텍스트 필드 객체 생성
	private JButton btdlg = new JButton("삭제"); // 버튼 객체 생성
	private JButton btdlg1 = new JButton("취소"); // 버튼 객체 생성 hhj724
	
	private JDialog ajdlg = new JDialog(this, "수정", true); // 다이얼로그 창 객체 생성(조건 : 프레임 제목 '수정', 다른쪽에 클릭 못하게)
	private Container acondlg; // 컨테이너 타입 참조변수 생성
	private JLabel albdlg = new JLabel("이름 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel albdlg1 = new JLabel("주민번호 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JTextField atfdlg = new JTextField(15); // 텍스트 필드 객체 생성
	private JTextField atfdlg1 = new JTextField(7); // 텍스트 필드 객체 생성
	private JTextField atfdlg2 = new JTextField(7); // 텍스트 필드 객체 생성
	private JButton abtdlg = new JButton("수정"); // 버튼 객체 생성
	private JButton abtdlg1 = new JButton("취소"); // 버튼 객체 생성
	
	private JDialog bjdlg = new JDialog(this, "수정", true); // 다이얼로그 창 객체 생성(조건 : 프레임 제목 '수정', 다른쪽에 클릭 못하게)
	private Container bcondlg; // 컨테이너 타입 참조변수 생성
	private JLabel blbdlg = new JLabel("이름 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel blbdlg1 = new JLabel("주민번호 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel blbdlg2 = new JLabel("전화번호 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel blbdlg3 = new JLabel("주소 : ", JLabel.RIGHT); // 라벨 객체 생성
	private JLabel btfdlg = new JLabel(); // 라벨 객체 생성
	private JLabel btfdlg1 = new JLabel(); // 라벨 객체 생성
	private JTextField btfdlg2 = new JTextField(15); // 텍스트 필드 객체 생성
	private JTextField btfdlg3 = new JTextField(15); // 텍스트 필드 객체 생성
	private JButton bbtdlg = new JButton("수정"); // 버튼 객체 생성
	private JButton bbtdlg1 = new JButton("취소"); // 버튼 객체 생성
			
	public Work01_Sub(String str){ //생성자->객체가 만들어 질때마다 초기화 되는 곳, 이름 주민번호 전화번호 주소는 객체가 만들어 질때마다 새로 사용할 것들이기 때문
		//객체가 생성될때마다 이곳은 항상 실행됨
		super(str); // 프레임클래스의 생성자(str변수를 넣은것에 맞는) 호출
		this.setIconImage(im.getImage()); // im객체의 getImage메소드 실행(이미지를 얻어온다는 의미), 얻어온 이미지를 프레임의 아이콘으로 설정하는 메소드 실행
		this.init(); // 이 클래스내의 init메소드 실행
		this.start(); // 이 클래스내의 start메소드 실행
		this.pack(); // 이 클래스내의 pack메소드 실행
		this.setResizable(false); // 프레임의 사이즈를 바꿀수 없게 설정
		//this.setSize(720, 320);
		Toolkit tk = Toolkit.getDefaultToolkit(); // 툴킷 클래스의 객체 tk 생성함
		Dimension di = tk.getScreenSize(); // tk객체의 getScreenSize메소드를 실행해서 스크린 사이즈를 얻어와서 Dimension 타입 di변수에 값을 저장
		Dimension di1 = this.getSize(); // 프레임의 사이즈를 불러오는 메소드를 실행하고 그 사이즈값을 Dimension 타입 di2변수에 저장
		this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), 
			(int)(di.getHeight() / 2 - di1.getHeight() / 2)); // 프레임을 스크린의 가운데 뜨도록 설정하는 계산식과 메소드
		this.setVisible(true); // 프레임을 드디어 보이게 설정함
	}
	
	public void init(){
		con = this.getContentPane(); // 컨테이너 타입 참조변수에 컨텐트팬 객체를 매칭시킴
		con.setLayout(bl); // con객체의 레이아웃을 bl(보더레이아웃)으로 설정함
		JPanel jp = new JPanel(new BorderLayout(3, 3));	// 패널 객체jp를 만들고 보더레이아웃(3가로공간,3세로공간)을 집어넣음 
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));	// 패널 객체jp1를 만들고 플로우 레이아웃(왼쪽정렬)을 집어넣음 
		jp1.add(jbt);	// 전체보기 버튼을 패널jp1객체에 삽입
		jp1.add(jlb);	// 라벨(전체보기관한 설명)을 패널jp1객체에 삽입
		jp.add("North", jp1);	// 패널jp객체의 북쪽에 jp1객체 삽입
		jp.add("Center", jsp);	// 패널 jp객체의 중앙에 jsp객체(텍스트에리아 객체인 jta를 넣은 스크롤팬 객체 jsp) 삽입 
		JPanel jp2 = new JPanel(new GridLayout(1, 7, 3, 3));	// 패널 객체jp2를 만들고 그리드 레이아웃(1행 7열 3공간)을 집어넣음 
		jp2.add(jbt1);	// jp2패널에 jbt버튼 객체를 추가
		jp2.add(jbt2);
		jp2.add(jbt3);
		jp2.add(jbt4);
		jp2.add(jbt5);
		jp2.add(jbt6);
		jp2.add(jbt7);
		jp.add("South", jp2);	//완성된 jp2객체를 jp객체의 남쪽에 추가시킴 
		jbt.setBorder(new BevelBorder(BevelBorder.RAISED)); // jbt객체에 BevelBorder(경사지게 보이는 경계선을 그림) 설정
		jbt1.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt2.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt3.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt4.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt5.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt6.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt7.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt.setEnabled(false); // 일단 버튼을 비활성화
		jbt1.setEnabled(false);
		jbt2.setEnabled(false);
		jbt3.setEnabled(false);
		jbt4.setEnabled(false);
		jbt5.setEnabled(false);
		jp.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "개인정보확인")); // 패널jp객체를 타이틀(개인정보확인)이 있는 경계로 설정 
		con.add("Center", jp); // 패널jp객체를 con객체 가운데 붙임
		JPanel jp3 = new JPanel(new GridLayout(2, 1, 3, 3)); // 그리드레이아웃(2행, 1열)의 패널 객체를 생성 
		JPanel jp4 = new JPanel(new BorderLayout()); // 보더레이아웃(2행, 1열)의 패널 객체를 생성 
		JPanel jp5 = new JPanel(new GridLayout(4, 1)); // 그리드레이아웃(4행, 1열)의 패널 객체를 생성 
		jp5.add(lb); 
		jp5.add(lb1);
		jp5.add(lb2);
		jp5.add(lb3);
		jp4.add("West", jp5);
		JPanel jp6 = new JPanel(new GridLayout(4, 1));
		jp6.add(tf);
		JPanel jp7 = new JPanel(new GridLayout(1, 2, 5, 5));
		jp7.add(tf1);
		jp7.add(tf2);
		jp6.add(jp7);
		jp6.add(tf3);
		jp6.add(tf4);
		jp4.add("Center", jp6);
		jp4.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "개인정보"));
		jp3.add(jp4);//상단부
		JPanel jp8 = new JPanel(new BorderLayout());
		JPanel jp9 = new JPanel(new BorderLayout());
		jp9.add("West", alb);
		JPanel jp10 = new JPanel(new GridLayout(1, 2, 4, 4));
		jp10.add(atf);
		jp10.add(atf1);
		jp9.add("Center", jp10);
		jp9.add("East", abt);
		JPanel jp11 = new JPanel(new FlowLayout());
		jp11.add(abt1);
		jp11.add(abt2);
		jp8.add("North", jp9);
		jp8.add("Center", ajsp);
		jp8.add("South", jp11);
		abt.setBorder(new BevelBorder(BevelBorder.RAISED));
		abt1.setBorder(new BevelBorder(BevelBorder.RAISED));
		abt2.setBorder(new BevelBorder(BevelBorder.RAISED));
		abt.setEnabled(false);
		abt1.setEnabled(false);
		abt2.setEnabled(false);
		jp8.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "정보검색"));
		jp3.add(jp8);//하단부
		con.add("West", jp3);
		jta.setEnabled(false);
		ata.setEnabled(false);
		jta.setDisabledTextColor(Color.black); // 비활성화된 텍스트의 색상을 설정... 기본적으로 비활성화되면 색이 매우 옅어지므로 검정색으로 설정한다.
		ata.setDisabledTextColor(Color.black); // 비활성화된 텍스트의 색상을 설정... 기본적으로 비활성화되면 색이 매우 옅어지므로 검정색으로 설정한다.
		
		//삭제 다이얼로그를 구성합니다. 
		condlg = jdlg.getContentPane();
		condlg.setLayout(new BorderLayout());
		JPanel jpdlg = new JPanel(new GridLayout(2, 1));
		jpdlg.add(lbdlg);
		jpdlg.add(lbdlg1);
		condlg.add("West", jpdlg);
		JPanel jpdlg1 = new JPanel(new GridLayout(2, 1));
		jpdlg1.add(tfdlg);
		JPanel jpdlg3 = new JPanel(new GridLayout(1, 2, 4, 4));
		jpdlg3.add(tfdlg1);
		jpdlg3.add(tfdlg2);
		jpdlg1.add(jpdlg3);
		condlg.add("Center", jpdlg1);
		JPanel jpdlg2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jpdlg2.add(btdlg);
		jpdlg2.add(btdlg1);
		condlg.add("South", jpdlg2);
		jdlg.pack();
		jdlg.setResizable(false);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = jdlg.getSize();
		jdlg.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), 
			(int)(di.getHeight() / 2 - di1.getHeight() / 2));
		//삭제 다이얼로그 구성 끝...
		
		//수정 다이얼로그를 구성합니다.
		acondlg = ajdlg.getContentPane();
		acondlg.setLayout(new BorderLayout());
		JPanel ajpdlg = new JPanel(new GridLayout(2, 1));
		ajpdlg.add(albdlg);
		ajpdlg.add(albdlg1);
		acondlg.add("West", ajpdlg);
		JPanel ajpdlg1 = new JPanel(new GridLayout(2, 1));
		ajpdlg1.add(atfdlg);
		JPanel ajpdlg3 = new JPanel(new GridLayout(1, 2, 4, 4));
		ajpdlg3.add(atfdlg1);
		ajpdlg3.add(atfdlg2);
		ajpdlg1.add(ajpdlg3);
		acondlg.add("Center", ajpdlg1);
		JPanel ajpdlg2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		ajpdlg2.add(abtdlg);
		ajpdlg2.add(abtdlg1);
		acondlg.add("South", ajpdlg2);
		ajdlg.pack();
		ajdlg.setResizable(false);
		Toolkit atk = Toolkit.getDefaultToolkit();
		Dimension adi = atk.getScreenSize();
		Dimension adi1 = ajdlg.getSize();
		ajdlg.setLocation((int)(adi.getWidth() / 2 - adi1.getWidth() / 2), 
			(int)(adi.getHeight() / 2 - adi1.getHeight() / 2));
		//수정 다이얼로그 구성 끝...
		
		//수정 두번째 다이얼로그 구성...
		bcondlg = bjdlg.getContentPane();
		bcondlg.setLayout(new BorderLayout());
		JPanel bjp = new JPanel(new GridLayout(4, 1));
		bjp.add(blbdlg);
		bjp.add(blbdlg1);
		bjp.add(blbdlg2);
		bjp.add(blbdlg3);
		bcondlg.add("West", bjp);
		JPanel bjp1 = new JPanel(new GridLayout(4, 1));
		bjp1.add(btfdlg);
		bjp1.add(btfdlg1);
		bjp1.add(btfdlg2);
		bjp1.add(btfdlg3);
		bcondlg.add("Center", bjp1);
		JPanel bjp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		bjp2.add(bbtdlg);
		bjp2.add(bbtdlg1);
		bcondlg.add("South", bjp2);
		bjdlg.pack();
		bjdlg.setResizable(false);
		Toolkit btk = Toolkit.getDefaultToolkit();
		Dimension bdi = btk.getScreenSize();
		Dimension bdi1 = bjdlg.getSize();
		bjdlg.setLocation((int)(bdi.getWidth() / 2 - bdi1.getWidth() / 2), 
			(int)(bdi.getHeight() / 2 - bdi1.getHeight() / 2));
		//수정 두번째 다이얼로그 구성끝...
		
		// 기본적으로 메인 프레임 외의 다이얼로그들은 생성은 되어 있지만 나중에 필요할때만 보이도록 함
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙의 기본 종료 동작 버튼 (변수로 DO_NOTHING_ON_CLOSE 이걸 쓰면 동작 하지 않음ㅋㅋ)
		
		//각종 버튼과 필드값 등등에 일어나는 변화를 감지하는 메소드를 일단 넣는 곳
		jbt7.addActionListener(this);//종료 버튼..
		tf.addKeyListener(this);//이름 필드...
		tf1.addFocusListener(this);//주민번호 첫번째 필드..
		tf1.addKeyListener(this);
		tf2.addFocusListener(this);//주민번호 두번째 필드..
		tf2.addKeyListener(this);
		tf3.addFocusListener(this);//전화번호 필드..
		tf3.addKeyListener(this);
		tf4.addFocusListener(this);//주소 필드..
		tf4.addKeyListener(this);
		atf.addKeyListener(this);
		atf1.addKeyListener(this);
		atf1.addFocusListener(this);
		jbt1.addActionListener(this);
		jbt4.addActionListener(this);
		jbt.addActionListener(this);//전체보기...
		abt.addActionListener(this);//검색버튼...
		abt1.addActionListener(this);//이전버튼...
		abt2.addActionListener(this);//다음버튼...
		jbt5.addActionListener(this);//저장버튼...
		jbt6.addActionListener(this);//로드버튼...
		
		jbt3.addActionListener(this);//삭제버튼...
		tfdlg1.addKeyListener(this);//삭제 다이얼로그의 주민 1필드..
		tfdlg2.addKeyListener(this);//삭제 다이얼로그의 주민 2필드...
		btdlg1.addActionListener(this);//삭제 다이얼로그의 취소버튼...
		btdlg.addActionListener(this);//삭제 다이얼로그의 삭제버튼...
		
		jbt2.addActionListener(this);//수정버튼..
		atfdlg1.addKeyListener(this);//수정 다이얼로그의 주민 1필드..
		atfdlg2.addKeyListener(this);//수정 다이얼로그의 주민 2필드...
		abtdlg1.addActionListener(this);//수정 다이얼로그의 취소버튼...
		abtdlg.addActionListener(this);//수정 다이얼로그의 수정버튼...
		
		bbtdlg.addActionListener(this);//수정다이얼로그2의 수정버튼...
		bbtdlg1.addActionListener(this);//수정다이얼로그2의 취소버튼...
	}
	
	
	
	// 리스너에 대해 응답하는 메소드들 시작
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == jbt7){ // 버튼 7 객체에 종료 기능을 부여하는 식
			System.exit(0); // 종료
		}
		else if(e.getSource() == jbt1){ // 버튼1 객체에 사람 정보를 '등록' 하는 기능을 부여하는 식
			String str = tf1.getText().trim() + tf2.getText().trim(); // 두개로 나눠져 있던 주민등록번호 앞뒤 자리를 붙여서 str 문자열에 저장 
			//trim은 정제된 문자열을 얻기위해 씀(앞뒤에 혹시 있을지 모를 공백 등등..)
			int[] jumin = new int[13]; // 주민번호 배열 생성
			for(int i = 0; i < 13; i++){
				jumin[i] = str.charAt(i) - 48;//'0' //문자열의 특정 위치값(i)을 읽어서 그 특정 문자열을 문자로 반환한다 . 그 뒤에 문자가 int로 형변환 되어 저장
			}
			
			// 주민등록번호의 유효성을 테스트 하기 위한 확인값 생성하는 식
			float hap = 0.0f;
			float temp = 0.0f;
			float temp1 = 0.0f;
			float cre = 2.0f;
			for(int i = 0; i < 12; i++){
				if(cre == 10.0f){
					cre = 2.0f;
				}
				hap += (jumin[i] * cre);
				cre += 1.0f;
			}
			temp = 11.0f * (int)(hap / 11.0f) + 11.0f - hap;
			temp1 = temp - 10.0f * (int)(temp / 10.0f);
			
			// 유효성 확인값 생성 완료
			
			// 유효성 확인값과 주민등록번호 끝자리를 비교해서 일치하지 않으면 주민등록번호가 유효하지 않은 것이므로
			// 주민등록번호를 다시 입력하도록 하는 기능
			if(temp1 != jumin[12]){
				tf1.setText("");
				tf2.setText("");
				jbt1.setEnabled(false);
				tf1.requestFocus();
				return;
			}
			
			
			
			//이전까지 유효성을 확인 했으므로 여기 오면 등록의 준비가 다 된것임... 이제 등록하는 기능만 이루어지도록 하면 됨
		
			String a = tf.getText().trim();
			String b = tf1.getText().trim() + tf2.getText().trim();
			String c = tf3.getText().trim();
			String d = tf4.getText().trim();
			Work01_Sub1 ess = new Work01_Sub1(a, b, c, d); // 순서대로 이름 주민번호 전화 주소
			vc.addElement(ess); // 벡터 객체에 Work01_Sub1클래스를 인스턴스화 한 객체 ess를 추가한다
			jta.setText("저장이 잘 되었습니다.\n");
			jta.append("현재 " + vc.size() + "명의 데이터가 존재합니다.");
			tf.setText("");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			jbt1.setEnabled(false);
			jbt4.setEnabled(false);
			jbt.setEnabled(true);
			jbt2.setEnabled(true);
			jbt3.setEnabled(true);
			jbt5.setEnabled(true);
			tf.requestFocus();
		}
		else if(e.getSource() == jbt4){ // 초기화 버튼 실행
			tf.setText("");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			jbt4.setEnabled(false);
			tf.requestFocus();
		}
		else if(e.getSource() == jbt){ // 전체보기 버튼
			jta.setText("전체 인원의 개인정보 입니다.\n");
			jta.append("이름\t주민번호\t\t전화번호\t주소\n");
			jta.append("=============================================================\n");
			for(int i = 0; i < vc.size(); i++){
				Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(i);
				jta.append(imsi.getName() + "\t");
				jta.append(imsi.getJumin() + "\t");
				jta.append(imsi.getTel() + "\t");
				jta.append(imsi.getAddr() + "\n");
			}
			jta.append("=============================================================\n");
			jta.append("총 " + vc.size() + "명");
		}
		
		
		else if(e.getSource() == abt){ // 
			String str = atf.getText().trim() + atf1.getText().trim(); //검색자가 찾고자 하는 주민등록번호를 입력한 것을 가지고 합쳐서 str에 저장
			int k = -1;
			
			for(int i = 0; i < vc.size(); i++){ // 벡터에 저장된 사이즈 만큼 반복
				Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(i); // 특정 위치의 벡터 값에 저장된 객체를 불러와서 Work01_Sub1타입으로 형변환
				if(imsi.getJumin().equals(str)){ // imsi객체의 getJumin메소드를  사용해서 벡터에 저장되었었던 객체의 주민번호를  검색자가 찾고자 입력한 주민등록번호와
					//equals로 비교해서 참이라면 아래를 실행
					k = i; // 찾은 벡터 위치값을 k변수에 저장
				}
			}
			
			if(k == -1){ // k가 -1과 같다는 의미는 일치하는 주민등록번호를 찾지 못했다는 의미임
				ata.setText("그런 주민번호는 등록된 적이 없습니다.");
				atf.setText("");
				atf1.setText("");
				abt.setEnabled(false);
				atf.requestFocus();
				return; // 이 메소드를 빠져나감
			}
			
			 // 여기 까지 왔다는 것은 검색한 주민등록번호를 찾았다는 의미
			pos = k; // 벡터 위치값을 저장한 k 값을 pos에 대입 
			view(pos); // 클래스 내의 view라는 메소드를 실행하며 매개변수를 pos로 지정해 줬음 (검색결과 찾은 주민등록번호의 벡터값 위치를 찾아가라는 의미)
			
			if(vc.size() <= 1){ // 벡터내에 한사람의 정보만 있다면 이동버튼이 활성화 되지 않는게 좋기 때문ㅇ 
				abt1.setEnabled(false);
				abt2.setEnabled(false);
			}
			else{
				if(pos == 0){ // 현재 보여주는 위치가 맨 왼쪽일때 오른쪽 버튼만 활성화
					abt1.setEnabled(false);
					abt2.setEnabled(true);
				}
				else if(pos == vc.size() - 1){ // 현재 보여주는 위치가 맨 오른쪽일때 왼쪽 버튼만 활성화
					abt1.setEnabled(true);
					abt2.setEnabled(false);
				}
				else{ // 보여주는 위치가 중간일 경우 양쪽 버튼 전부 활성화
					abt1.setEnabled(true);
					abt2.setEnabled(true);
				}
			}
			
			//검색이 다 끝났으므로 각 필드를 초기화 하고 검색프레임을 안보이게 함
			atf.setText("");
			atf1.setText("");
			abt.setEnabled(false);
		}
		
		else if(e.getSource() == abt1){ // 왼쪽 버튼을 눌렀을때 동작 내용
			pos--;
			if(pos == 0){
				abt1.setEnabled(false);
			}
			abt2.setEnabled(true);
			view(pos);
		}
		
		else if(e.getSource() == abt2){ // 오른쪽 버튼을 눌렀을때 동작 내용
			pos++;
			if(pos == vc.size() - 1){
				abt2.setEnabled(false);
			}
			abt1.setEnabled(true);
			view(pos);
		}
		
		
		
		
		
		//////////////
		
		
		
		
		
		else if(e.getSource() == jbt5){ // 파일 저장 버튼 눌렀을때 동작
			jfc.showSaveDialog(this); // 비활성화되어있던 jfc 객체의 저장다이얼로그를 보이게 함
			File file = jfc.getSelectedFile(); // 사용자가 선택한 파일을 불러오는 메소드를 실행해서 File 타입의 file변수에
			// 대입시킴
		
			//System.out.println(file);
			//파일 입력...
			try{
				FileOutputStream fo = new FileOutputStream(file); // 파일을 출력스트림하는 객체 생성 및 사용
				BufferedOutputStream bo = new BufferedOutputStream(fo); // 성능향상을 위해 버퍼로 출력스트림 하는 객체 생성 및 사용
				ObjectOutputStream oos = new ObjectOutputStream(bo); // 직렬화를 위한 객체출력스트림 객체 생성
				oos.writeObject(vc);//vc속에는..Work01_Sub1.. <-- 직렬화 되어야 함.. vc안에 있는 객체를 writeObject메소드를
				// 사용해서 실제 직렬화 함
				oos.close(); // 스트림 을 다 썼으므로 종료시킴
				bo.close(); // 스트림 을 다 썼으므로 종료시킴
				fo.close(); // 스트림 을 다 썼으므로 종료시킴
			}catch(FileNotFoundException ee){
			}catch(IOException ee){}
			//파일 입력 끝....
			jta.setText("저장 완료 ! \n");
			jta.append(file + "의 이름으로 저장되었습니다.");
		}
		
		else if(e.getSource() == jbt6){
			jfc.showOpenDialog(this);
			File file = jfc.getSelectedFile();
			//System.out.println(file);
			//파일 가져오기...
			try{
				FileInputStream fi = new FileInputStream(file); // 파일을 입력스트림하는 객체 생성 및 사용
				BufferedInputStream bi = new BufferedInputStream(fi); // 성능향상을 위해 버퍼로 입력스트림 하는 객체 생성 및 사용
				ObjectInputStream ois = new ObjectInputStream(bi); // 직렬화를 위한 객체입력스트림 객체 생성
				vc.clear(); // vc객체에 있는 내용을 일단 초기화
				vc = (Vector)ois.readObject(); // 객체입력스트림 객체의 readObject메소드를 사용해서 파일을 역직렬화 하고 그것을 벡터타입으로 형변환
				// 한뒤에 다시 vc객체에 삽입
				ois.close(); // 스트림 을 다 썼으므로 종료시킴 
				bi.close(); // 스트림 을 다 썼으므로 종료시킴
				fi.close(); // 스트림 을 다 썼으므로 종료시킴	
			}catch(ClassNotFoundException ee){
			}catch(FileNotFoundException ee){
			}catch(IOException ee){}
			//파일 가져오기...끝
			jta.setText("파일 읽기 완료 ! \n"); // 처음 텍스트 에리아에 글을 넣을 경우 전체 초기화되는 이것을 사용
			jta.append(file + "의 파일로부터 읽기를 완료하였습니다.\n"); // 이미 있는 글에 추가적으로 텍스트를 넣어야 할 경우에
			//append 메소드를 사용한다.
			jta.append("총 데이터 개수 : " + vc.size() + "개");
			if(vc.size() >= 1){
				jbt.setEnabled(true);
				jbt2.setEnabled(true);
				jbt3.setEnabled(true);
				jbt5.setEnabled(true);
			}
		}
		else if(e.getSource() == jbt3){
			//다이얼 로그를 띄웁니다...
			jdlg.setVisible(true);
		}
		else if(e.getSource() == btdlg1){ // 취소버튼 눌렀을때 동작
			tfdlg.setText("");
			tfdlg1.setText("");
			tfdlg2.setText("");
			jdlg.setVisible(false);
		}
		else if(e.getSource() == btdlg){ // 삭제버튼을 눌렀을때 동작하는것
			String str = tfdlg.getText().trim(); // 검색할 이름값 받아서 저장
			String str1 = tfdlg1.getText().trim() + tfdlg2.getText().trim(); // 검색할 주민번호값 받아서 저장
			int kk = -1; // 
			for(int i = 0; i < vc.size(); i++){ //벡터사이즈만큼 반복
				Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(i); // 벡터의 위치값(i)에 저장된 객체를 불러와서 Work01_Sub1 타입으로 형변환
				if(imsi.getName().equals(str) && imsi.getJumin().equals(str1)){
					kk = i;	// 이름과 주민번호 모두 일치하는 벡터 위치값을 찾았을때 kk에 i값을 대입			
				}
			}
			if(kk == -1){ // 검색된 사용자가 없을때 아래 실행
				jta.setText("사용자 존재 하지 않습니다..\n"); //텍스트 초기 설정
				jta.append("정보 !!!\n"); // 텍스트에리아에 설정된 텍스트를 지우지 않고 추가적으로 텍스트를 기입
				jta.append("이름 : " + str + "\n"); // 텍스트에리아에 설정된 텍스트를 지우지 않고 추가적으로 텍스트를 기입
				jta.append("주민번호 : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n"); // 텍스트에리아에 설정된 텍스트를 지우지 않고 추가적으로 텍스트를 기입
				jta.append("다시 시도 하세요... ^^"); // 텍스트에리아에 설정된 텍스트를 지우지 않고 추가적으로 텍스트를 기입
				tfdlg.setText(""); // 다이얼로그내 텍스트 필드 초기화
				tfdlg1.setText(""); // 다이얼로그내 텍스트 필드 초기화
				tfdlg2.setText(""); // 다이얼로그내 텍스트 필드 초기화
				jdlg.setVisible(false);
				return;
			}
			tfdlg.setText("");
			tfdlg1.setText("");
			tfdlg2.setText("");
			jdlg.setVisible(false);
			vc.removeElementAt(kk);//이부분이 실제 삭제 하는 부분입니다. // 벡터에서 실제로 검색된 위치(kk)의 객체를 삭제
			jta.setText("다음의 사용자를 데이터 저장소에서 삭제 하였습니다.\n");
			jta.append("정보 !!!\n");
			jta.append("이름 : " + str + "\n");
			jta.append("주민번호 : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n");
			jta.append("현재 남은 데이터 개수 : " + vc.size() + "개");
		}
		else if(e.getSource() == jbt2){ // 수정할 다이얼로그를 보이게 함
			//수정 다이얼로그...
			ajdlg.setVisible(true);
		}
		else if(e.getSource() == abtdlg1){ // 수정에서 취소를 누를경우 실행
			atfdlg.setText("");
			atfdlg1.setText("");
			atfdlg2.setText("");
			ajdlg.setVisible(false);
		}
		else if(e.getSource() == abtdlg){ // 수정의 확인 버튼을 누름
			String str = atfdlg.getText().trim();
			String str1 = atfdlg1.getText().trim() + atfdlg2.getText().trim();
			int kk = -1;
			for(int i = 0; i < vc.size(); i++){
				Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(i);
				if(imsi.getName().equals(str) && imsi.getJumin().equals(str1)){
					kk = i;				
				}
			}
			if(kk == -1){
				jta.setText("사용자 존재 하지 않습니다..\n");
				jta.append("정보 !!!\n");
				jta.append("이름 : " + str + "\n");
				jta.append("주민번호 : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n");
				jta.append("다시 시도 하세요... ^^");
				atfdlg.setText("");
				atfdlg1.setText("");
				atfdlg2.setText("");
				ajdlg.setVisible(false);
				return;
			}
			atfdlg.setText("");
			atfdlg1.setText("");
			atfdlg2.setText("");
			ajdlg.setVisible(false);
			//수정할 수 있는 다이얼로그를 띄운다...
			pos1 = kk;
			jta.setText("해당 사용자를 찾았습니다... 수정하세요..");
			Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(kk); // 벡터에 저장된 객체를 불러옴
			// 불러온 객체의 각 내용을 입력
			btfdlg.setText(imsi.getName());
			btfdlg1.setText(imsi.getJumin().substring(0, 6) + "-" + imsi.getJumin().substring(6));
			//substring 메소드를 사용해서 저장된 주민번호의 일부분을 떼어내서 작업
			btfdlg2.setText(imsi.getTel());
			btfdlg3.setText(imsi.getAddr());
			bjdlg.setVisible(true);
		}
		else if(e.getSource() == bbtdlg){ // 수정 안에서 확인 버튼을 눌렀을때
			Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(pos1);
			if(btfdlg2.getText().trim().length() != 0){
				imsi.setTel(btfdlg2.getText().trim());
			}
			if(btfdlg3.getText().trim().length() != 0){
				imsi.setAddr(btfdlg3.getText().trim());
			}
			jta.setText(imsi.getName() + "님의 자료가 정상적으로 수정되었습니다.");
			bjdlg.setVisible(false);
		}
		else if(e.getSource() == bbtdlg1){ // 수정 안에서 확인 버튼을 눌렀을때
			bjdlg.setVisible(false);
		}
	}
	
	public void keyTyped(KeyEvent e){
		
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getSource() == tf1){
			if(tf1.getText().trim().length() == 6){ //텍스트를 불러와서 trim하고 그 길이를 반환 -> 그 값이 6과 같다면
				tf2.requestFocus(); // 다음 텍스트 필드로 넘어감
				return;
			}
		}
		else if(e.getSource() == tf2){
			if(tf2.getText().trim().length() == 7){//텍스트를 불러와서 trim하고 그 길이를 반환 -> 그 값이 6과 같다면
				tf3.requestFocus(); // 다음 텍스트 필드로 넘어감
				return;
			}
		}	
		else if(e.getSource() == atf){
			if(atf.getText().trim().length() == 6){
				atf1.requestFocus();
				return;
			}
		}
		else if(e.getSource() == atf1){
			if(atf1.getText().trim().length() == 7){
				abt.setEnabled(true);
				abt.requestFocus();
				return;
			}
		}	
		else if(e.getSource() == tfdlg1){
			if(tfdlg1.getText().trim().length() == 6){
				tfdlg2.requestFocus();
				return;
			}
		}
		else if(e.getSource() == tfdlg2){
			if(tfdlg2.getText().trim().length() == 7){
				btdlg.setEnabled(true);
				btdlg.requestFocus();
				return;
			}
		}	
		else if(e.getSource() == atfdlg1){
			if(atfdlg1.getText().trim().length() == 6){
				atfdlg2.requestFocus();
				return;
			}
		}
		else if(e.getSource() == atfdlg2){
			if(atfdlg2.getText().trim().length() == 7){
				abtdlg.setEnabled(true);
				abtdlg.requestFocus();
				return;
			}
		}	
	}
	public void keyReleased(KeyEvent e){
		if(e.getSource() == tf){
			String str = tf.getText().trim();
			if(str.length() != 0){
				jbt4.setEnabled(true);
				if(tf.getText().trim().length() != 0 &&
					tf1.getText().trim().length() != 0 &&
					tf2.getText().trim().length() != 0 &&
					tf3.getText().trim().length() != 0 &&
					tf4.getText().trim().length() != 0){
					jbt1.setEnabled(true);
				}
			}
			else{
				jbt1.setEnabled(false);
				if(tf1.getText().trim().length() != 0 || tf2.getText().trim().length() != 0 || tf3.getText().trim().length() != 0 || tf4.getText().trim().length() != 0){
					return;
				}
				jbt4.setEnabled(false);
			}			
		}
		else if(e.getSource() == tf4){
			String str = tf4.getText().trim();
			if(str.length() == 0){
				jbt1.setEnabled(false);
			}
			else{
				if(tf.getText().trim().length() != 0 &&
					tf1.getText().trim().length() != 0 &&
					tf2.getText().trim().length() != 0 &&
					tf3.getText().trim().length() != 0 &&
					tf4.getText().trim().length() != 0){
					jbt1.setEnabled(true);
				}
			}
		}
		else if(e.getSource() == tf1){
			if(tf1.getText().trim().length() == 6){
				tf2.requestFocus();
				return;
			}
			if(tf1.getText().trim().length() == 0){
				jbt1.setEnabled(false);
			}
			else{
				if(tf.getText().trim().length() != 0 &&
					tf1.getText().trim().length() != 0 &&
					tf2.getText().trim().length() != 0 &&
					tf3.getText().trim().length() != 0 &&
					tf4.getText().trim().length() != 0){
					jbt1.setEnabled(true);
				}
			}
		}
		else if(e.getSource() == tf2){
			if(tf2.getText().trim().length() == 7){
				tf3.requestFocus();
				return;
			}
			if(tf2.getText().trim().length() == 0){
				jbt1.setEnabled(false);
			}
			else{
				if(tf.getText().trim().length() != 0 &&
					tf1.getText().trim().length() != 0 &&
					tf2.getText().trim().length() != 0 &&
					tf3.getText().trim().length() != 0 &&
					tf4.getText().trim().length() != 0){
					jbt1.setEnabled(true);
				}
			}
		}
		else if(e.getSource() == tf3){
			if(tf3.getText().trim().length() == 0){
				jbt1.setEnabled(false);
			}
			else{
				if(tf.getText().trim().length() != 0 &&
					tf1.getText().trim().length() != 0 &&
					tf2.getText().trim().length() != 0 &&
					tf3.getText().trim().length() != 0 &&
					tf4.getText().trim().length() != 0){
					jbt1.setEnabled(true);
				}
			}
		}
		else if(e.getSource() == atf){
			if(atf.getText().trim().length() == 6){
				atf1.requestFocus();
				return;
			}
		}
		else if(e.getSource() == atf1){
			if(atf1.getText().trim().length() == 7){
				abt.setEnabled(true);
				abt.requestFocus();
				return;
			}
		}	
		else if(e.getSource() == tfdlg1){
			if(tfdlg1.getText().trim().length() == 6){
				tfdlg2.requestFocus();
				return;
			}
		}
		else if(e.getSource() == tfdlg2){
			if(tfdlg2.getText().trim().length() == 7){
				btdlg.setEnabled(true);
				btdlg.requestFocus();
				return;
			}
		}	
		else if(e.getSource() == atfdlg1){
			if(atfdlg1.getText().trim().length() == 6){
				atfdlg2.requestFocus();
				return;
			}
		}
		else if(e.getSource() == atfdlg2){
			if(atfdlg2.getText().trim().length() == 7){
				abtdlg.setEnabled(true);
				abtdlg.requestFocus();
				return;
			}
		}	
	}
	public void focusGained(FocusEvent e){
		if(e.getSource() == tf1){
			String str = tf.getText().trim();
			if(str.length() == 0){
				tf.setText("");
				tf.requestFocus();
				return;
			}
		}
		else if(e.getSource() == tf2){
			String str = tf1.getText().trim();
			if(str.length() != 6){
				tf1.setText("");
				tf1.requestFocus();
				return;
			}
			try{
				int i = Integer.parseInt(str);
			}catch(NumberFormatException ee){
				tf1.setText("");
				tf1.requestFocus();
				return;
			}
		}
		else if(e.getSource() == tf3){
			String str = tf2.getText().trim();
			if(str.length() != 7){
				tf2.setText("");
				tf2.requestFocus();
				return;
			}
			try{
				int i = Integer.parseInt(str);
			}catch(NumberFormatException ee){
				tf2.setText("");
				tf2.requestFocus();
				return;
			}
		}
		else if(e.getSource() == tf4){
			String str = tf3.getText().trim();
			if(str.length() == 0){
				tf3.setText("");
				tf3.requestFocus();
				return;
			}
		}
		else if(e.getSource() == atf1){
			String str = atf.getText().trim();
			if(str.length() != 6){
				atf.setText("");
				atf.requestFocus();
				return;
			}
		}
	}
	public void focusLost(FocusEvent e){
		
	}
	
	// 리스너에 응답하는 메소드들 끝
	

	
	public void view(int ii){
		Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(ii);
		ata.setText("이름 : " + imsi.getName() + "\n");
		ata.append("주민번호 : " + imsi.getJumin().substring(0, 6) + "-" + imsi.getJumin().substring(6) + "\n");
		ata.append("전화번호 : " + imsi.getTel() + "\n");
		ata.append("주소 : " + imsi.getAddr() + "\n");
		
		//주민등록번호 문자열을 분해해서 각 배열에 입력
		int[] jumin = new int[13];
		for(int i = 0; i < 13; i++){
			jumin[i] = imsi.getJumin().charAt(i) - 48;
		}
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		//주민등록번호 7번째 자리를 이용해서 태어난 '세기'를 파악
		//9,0은 1800년도 출생, 1,2는 1900년도 출생, 2000년도 출생 의미
		if(jumin[6] == 9 || jumin[6] == 0){
			year = 1800;
		}
		else if(jumin[6] == 1 || jumin[6] == 2){
			year = 1900;
		}
		else if(jumin[6] == 3 || jumin[6] == 4){
			year = 2000;
		}
		
		year += jumin[0] * 10 + jumin[1]; // 연도 확정
		month = jumin[2] * 10 + jumin[3]; // 월 확정
		day = jumin[4] * 10 + jumin[5]; // 일 확정
		
		
		ata.append("생년월일 : " + year + "년 " + month + "월 " + day + "일\n"); // 생년월일 출력
		ata.append("성별 : " + ((jumin[6] % 2 == 0) ? "여성" : "남성") + "\n"); // 주민등록번호 7번째 자리를 이용해서 성별을 바로 확인해서 출력
		Calendar ca = Calendar.getInstance(); // 캘린더를 이용하기 위해서 캘린더 클래스의 인스턴스를 생성
		ata.append("나이 : " + ((int)ca.get(Calendar.YEAR) - year) + "세\n"); 
		// 캘린더 객체로 확인한 현재 연도와 주민등록번호상 연도를 가지고 나이를 계산해서 출력
	}
}

