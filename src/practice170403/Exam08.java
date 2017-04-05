package practice170403;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 아무것도 입력하지 않고 확인 버튼을 누르면 반응을 하지 않도록 해야함

public class Exam08{
	public static void main(String[] ar){
		Exam08_sub ex = new Exam08_sub();
	}
}


class Exam08_sub extends Frame implements FocusListener, KeyListener, ActionListener, WindowListener{
	private FlowLayout flow = new FlowLayout();

//	private Label lb2 = new Label("주민번호 : ", Label.RIGHT);
	private Label lb1 = new Label("-");
	private TextField tf2 = new TextField(6);
	private TextField tf3 = new TextField(7);
	private Button bt1 = new Button("확인");
	//미성년자인지 아닌지 판단
	
	Exam08_sub(){
		super("Fous Listener");
		this.init();
		this.start();
		this.setSize(300,120);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter(){ // 종료 액션
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
			});

	}
field
	private void init() {
		this.setLayout(flow);
		Panel p1 = new Panel(new GridLayout(2,1));
		Panel p2 = new Panel(new GridLayout(1,2));
		p2.add(tf2);
		p2.add(lb1);
		p2.add(tf3);
		p1.add(p2);
		this.add("Center", p1);
		


		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(bt1);
		this.add("South", p4);
	}

	
	
	private void start() {
		//tf2.addFocusListener(this);
		//tf3.addFocusListener(this);
		bt1.addActionListener(this);
		addWindowListener(this);
		tf2.addKeyListener(this);
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// Focus를 얻을때 발생
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// Focus를 잃을때 발생
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Frame f = new Frame();
		
		if(e.getSource()==bt1){
			int x = tf2.getText().trim().length();
			if(x==0){
				tf2.requestFocus();
			}else{	
				f.setLayout(new GridLayout(2,1));
				Label lb1_f = new Label();
				Label lb2_f = new Label();
				String str1 = lb1.getText() + tf2.getText();
				String str2 = lb1.getText() + tf2.getText()+" - "+tf3.getText();
				lb1_f.setText(str1);
				lb2_f.setText(str2);
				f.add(lb1_f);
				f.add(lb2_f);
				f.setSize(300, 100);
				f.setVisible(true);
				this.setVisible(false);
			}
		}else if(e.getSource()==bt1){
			tf2.setText("");
			tf2.setText("");
			
			System.out.println(tf3.getText());
			tf3.setText("");
			
		}

			
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void keyPressed(KeyEvent e) {

	}
	
	public void keyReleased(KeyEvent e) {
		String str = tf2.getText().trim();
		if(str.length()==6)
			tf3.requestFocus();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}


