package practice170327;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;

import javax.swing.JFrame;

public class Exam02 extends Frame{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	public Exam02(){
		super("?��목줄");
		this.init(); //?��?��?�� ?��?�� 메소?�� - ?��면구?��
		this.start(); // ?��?��?�� ?��?�� 메소?�� - Event or Thread
		this.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = this.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		
	}
	
	public void init(){
		
		/*
		this.setLayout(null);
		this.setBackground(Color.RED);
		Label lb = new Label("?��?�� ?��?���? ?��?��?��.");
		lb.setBackground(Color.YELLOW);
		this.add(lb);
		lb.setBounds(100, 100, 100, 100);
		*/
		
		/* ?��로우 ?��?��?��?��
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT); //좌우 ?��?��?? ?��?��?�� ?��?�� ?��?��?? 불�?
		this.setLayout(flow);
		Label lb1 = new Label("AAA");
		Label lb2 = new Label("BBB");
		Label lb3 = new Label("CCC");
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.GREEN);
		lb3.setBackground(Color.PINK);
		this.add(lb1);
		this.add(lb2);
		this.add(lb3);
		*/
		
		/*
		Label lb1 = new Label("AAA");
		Label lb2 = new Label("BBB");
		Label lb3 = new Label("CCC");
		Label lb4 = new Label("DDD");
		GridLayout grid = new GridLayout(2,2,5,5);//?���? 조절?? ?��?��?�� ?��?��
		this.setLayout(grid);
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.GREEN);
		lb3.setBackground(Color.PINK);
		this.add(lb1);
		this.add(lb2);
		this.add(lb3);
		this.add(lb4);
		*/
		Label lb1 = new Label("AAA");
		Label lb2 = new Label("BBB");
		Label lb3 = new Label("CCC");
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.GREEN);
		lb3.setBackground(Color.PINK);
		BorderLayout border = new BorderLayout();	
		this.setLayout(border);
		this.add(lb1, BorderLayout.CENTER);
		this.add("West", lb3);
		this.add("North", lb2);


	}
	public void start(){
		
	}

}









