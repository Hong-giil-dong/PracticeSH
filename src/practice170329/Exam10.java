package practice170329;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class Exam10 {
	public static void main(String[] ar){
		Exam10_sub ex = new Exam10_sub();
	}
}

class Exam10_sub extends JFrame{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private MenuBar mb = new MenuBar();
	//硫붿?�� 硫붾?�� �꽑�뼵

	private Menu view = new Menu("蹂닿�?");
	private Menu edit = new Menu("�렪吏�");
	private Menu help = new Menu("�룄��留�");
	
	private MenuItem fnew = new MenuItem("�깉�뙆�씪");
	private MenuItem fopen = new MenuItem("�뿴湲�");
	private MenuItem fsave = new MenuItem("���옣");
	private MenuItem fsaveas = new MenuItem("�떎?���? �씠?��꾩쑝濡� ���옣");
	private MenuItem fexit = new MenuItem("?��?���?");
	
	private Menu vmo = new Menu("蹂닿�?");
	private MenuItem vmbasic = new MenuItem("湲곕?�� 紐⑥�?");
	private MenuItem vmweb = new MenuItem("�쎒 紐⑥�?");
	private MenuItem vmprint = new MenuItem("�씤�뇙 紐⑥�?");
	
	private Menu vtool = new Menu("�룄?���?");
	private CheckboxMenuItem vtcustom = new CheckboxMenuItem("�몴以�",true);
	private CheckboxMenuItem vtform = new CheckboxMenuItem("�꽌�떇",true);
	private CheckboxMenuItem vtexam = new CheckboxMenuItem("寃��넗",false);
	
	
	private Button[] bt = new Button[50];
	
	
	
	
	
	public Exam10_sub(){
		super("계산�?");
		this.init(); //�궗�슜�옄 �젙�쓽 硫붿?���뱶 - �솕硫닿?���꽦
		this.start(); // �궗�슜�옄 �젙�쓽 硫붿?���뱶 - Event or Thread
		this.setSize(225, 320);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = this.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}

	private void start() {
		
		
	}

	private void init() {
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		Label lb = new Label("계산�?");
		this.add("North", lb);
		this.setMenuBar(mb);
	
		
		view.add(vmo);
		vmo.add(vmbasic);
		vmo.add(vmweb);
		vmo.add(vmprint);
		
		view.add(vtool);
		vtool.add(vtcustom);
		vtool.add(vtform);
		vtool.add(vtexam);
		
		

		mb.add(edit);
		mb.add(view);
		mb.add(help);
		color.
		Panel p = new Panel(new GridLayout(6,5,2,3));
		
		
		ScrollPane sp = new ScrollPane();
		for(int i=0;i<bt.length;i++){
			bt[i] = new Button("TEXT " + i);
			p.add(bt[i]);
		}
		sp.add(p);
		this.add("Center",sp);
		
		
		
	}
}


/*	import java.awt.Frame;
	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;

	public class Calculator {
		public static void main(String[] args) {
			Frame f = new Frame();

		}


		public Calculator() {
			super();
			addWindowListener( new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
	}


		package com.iei.gui.componet;

		import java.awt.*;

		public class Exam11 {
			public static void main(String[] ar){
				Exam11_sub ex = new Exam11_sub();
			}

		}*/

