package practice170404;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}

class Exam01_sub extends JFrame{
	private Container con; //작업 영역을 위한 기본 Panel을 담을 객체
	private ImageIcon im, im1; //타이틀바 이미지 객체
	
	public Exam01_sub(){
		this.init();
		this.start();
		this.setSize(300,200);
		this.setTitle("TEST");
		im = new ImageIcon("C:\\Users\\user2\\Pictures\\icon.png");
		this.setIconImage(im.getImage()); //타이틀 바에 이미지 넣기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = this.getSize();
		this.setLocation((int)(di.getWidth()/2-di1.getWidth()/2), 
				(int)(di.getHeight()/2 - di1.getHeight()/2));
		this.setVisible(true);
	}

	private void init() {
		con = this.getContentPane();
		//다중 패널에서 기본 작업 영역 획득
		//폼 구성 영역
		im1 = new ImageIcon("C:\\Users\\user2\\Pictures\\icon2.jpg");
		con.setLayout(new BorderLayout());
		con.add("North", new JButton("Test"));
		con.add("Center",new JButton(im1));
	}

	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}












