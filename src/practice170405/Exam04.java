package practice170405;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Exam04 {
	public static void main(String[] ar){
		Exam04_sub ex = new Exam04_sub();
	}
}

class Exam04_sub extends JFrame{
	private Container con;
	private JLabel lb1 = new JLabel("이것은 탭 팬 입니당~~!");
	private JButton btn1 = new JButton("확인");
	private JButton btn2 = new JButton("취소");
	private JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	private JPanel jp2 = new JPanel(new BorderLayout());
	private JTabbedPane jtp = new JTabbedPane(JTabbedPane.BOTTOM,
												JTabbedPane.SCROLL_TAB_LAYOUT);
	private JButton bt1 = new JButton("1번째 Tab");
	private JButton bt2 = new JButton("2번째 Tab");
	private JButton bt3 = new JButton("3번째 Tab");
	private JButton bt4 = new JButton("4번째 Tab");
	private JButton bt5 = new JButton("5번째 Tab");	

	public Exam04_sub(){
		super();
		this.init();
		this.setSize(500,400);
		this.setVisible(true);
	}
	
	public void init(){
		con = this.getContentPane();
		con.setLayout(new BorderLayout(5,5));
		con.add("North", lb1);
		jp1.add(btn1);
		jp1.add(btn2);
		con.add("South", jp1);
		
		jtp.add("첫번째",bt1);
		jtp.add("두번째",bt2);
		jtp.add("세번째",bt3);
		jtp.add("네번째",bt4);
		
		jtp.addTab("마지막", new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\deung.jpg"),bt5,"asd");

	
		jp2.add(jtp);
		con.add("Center", jp2);
	}
}

