package practice170403;

import java.awt.BorderLayout;

//연도, 월, 일 입력

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}

class Exam02_sub extends Frame implements ItemListener{
	private FlowLayout flow = new FlowLayout();
	GridLayout grid = new GridLayout();
	private BorderLayout border = new BorderLayout();
	private Choice choice1 = new Choice();
	private Choice choice2 = new Choice();
	private Choice choice3 = new Choice();
	
	private List list = new List(3, false);
	public Exam02_sub(){
		super();

		this.init();
		this.start();
		this.setSize(300, 200);
		this.setLocation(800, 400);
		this.setVisible(true);

		addWindowListener(new WindowAdapter(){ // 종료 액션
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}


	private void init() {
		int end = 30;
		FlowLayout flow = new FlowLayout();
		this.setLayout(flow);

		for(int i = 0;i<118;i++){
		choice1.add(i+1900 + "년");
		}
		this.add(choice1);

		for(int i = 1;i<13;i++){
			choice2.add(i + "월");
		}
		this.add(choice2);
		
		
		switch(aaa) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			end = 31; break;
		case 2 : end = 29; break;
		}
		
		
		
		
		if( == ) { 
			for(int i = 1;i<31;i++){
				choice3.add(i + "일");
			}
			this.add(choice3);
		}else if( == ){
			for(int i = 1;i<28;i++){
				choice3.add(i + "일");
			}
			this.add(choice3);
		}else{
			for(int i = 1;i<30;i++){
				choice3.add(i + "일");
			}
			this.add(choice3);
		}
	}

//월을 클릭하면 맞는 일자가 뜨도록
	private void start() {
		choice1.addItemListener(this);
		choice2.addItemListener(this);
		choice3.addItemListener(this);
		list.addItemListener(this);
	}




	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==list){
			String str = list.getSelectedItem();
			int index = list.getSelectedIndex();
			System.out.println("리스트 : " + index +"\t"+str);
		}else{
		}

	}


}

