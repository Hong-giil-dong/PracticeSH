package practice170405;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
class Exam_03_Sub1 implements Serializable{//����ȭ...
	private String name;
	private String jumin;
	private String tel;
	private String addr;
	public Exam_03_Sub1(String a, String b, String c, String d){
		name = a;
		jumin = b;
		tel = c;
		addr = d;
	}
	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void setJumin(String a){
		jumin = a;
	}
	public String getJumin(){
		return jumin;
	}
	public void setTel(String a){
		tel = a;
	}
	public String getTel(){
		return tel;
	}
	public void setAddr(String a){
		addr = a;
	}
	public String getAddr(){
		return addr;
	}
}
class Exam_03_Sub extends JFrame
	implements ActionListener, KeyListener, FocusListener{
	private Container con;
	private BorderLayout bl = new BorderLayout(5, 5); //���� ������ 5, 5�� �����ص�
	private JLabel jlb = new JLabel("<== �̰��� ������ ��ü���Ⱑ �˴ϴ�."); 
	private JButton jbt = new JButton("��ü����");
	private JTextArea jta = new JTextArea(15, 40);
	private JScrollPane jsp = new JScrollPane(jta);
	private JButton jbt1 = new JButton("���");
	private JButton jbt2 = new JButton("����");
	private JButton jbt3 = new JButton("����");
	private JButton jbt4 = new JButton("Clear");
	private JButton jbt5 = new JButton("����");
	private JButton jbt6 = new JButton("�ε�");
	private JButton jbt7 = new JButton("����");
	
	private JLabel lb = new JLabel("�̸� : ", JLabel.RIGHT);
	private JLabel lb1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT);
	private JLabel lb2 = new JLabel("��ȭ��ȣ : ", JLabel.RIGHT);
	private JLabel lb3 = new JLabel("�ּ� : ", JLabel.RIGHT);
	private JTextField tf = new JTextField(14);
	private JTextField tf1 = new JTextField(7);
	private JTextField tf2 = new JTextField(7);
	private JTextField tf3 = new JTextField(14);
	private JTextField tf4 = new JTextField(14);
	
	private JLabel alb = new JLabel("�˻� : ", JLabel.RIGHT);
	private JTextField atf = new JTextField(7);
	private JTextField atf1 = new JTextField(7);
	private JButton abt = new JButton("�˻�");
	private JTextArea ata = new JTextArea(5, 20);
	private JScrollPane ajsp = new JScrollPane(ata);
	private JButton abt1 = new JButton("<<");
	private JButton abt2 = new JButton(">>");
	
	private ImageIcon im = new ImageIcon("web.gif");
	private Vector vc = new Vector();//����� ������(Exam_03_Sub1�� ��ü)�� ������ ����...
	private int pos = 0; // �˻��� �������� ��ġ��°�� ���...
	private int pos1 = 0; //������ �������� ��ġ��°�� ���...
	private JFileChooser jfc = new JFileChooser("D://����//�¶��ΰ���//classes//Chapter_10");
	
	private JDialog jdlg = new JDialog(this, "����", true);
	private Container condlg;
	private JLabel lbdlg = new JLabel("�̸� : ", JLabel.RIGHT); //�̸� �� ����
	private JLabel lbdlg1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT);//�ֹι�ȣ �� ����
	private JTextField tfdlg = new JTextField(15); //�̸� �Է� �� �ؽ�Ʈ�ʵ� 1�� ����
	private JTextField tfdlg1 = new JTextField(7); //�ֹι�ȣ �Է� �� �ؽ�Ʈ�ʵ� 2�� ����
	private JTextField tfdlg2 = new JTextField(7);
	private JButton btdlg = new JButton("����");	//���� ��ư ����
	private JButton btdlg1 = new JButton("���");//��� ��ư ����
	
	private JDialog ajdlg = new JDialog(this, "����", true);
	private Container acondlg;
	private JLabel albdlg = new JLabel("�̸� : ", JLabel.RIGHT);
	private JLabel albdlg1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT);
	private JTextField atfdlg = new JTextField(15);
	private JTextField atfdlg1 = new JTextField(7);
	private JTextField atfdlg2 = new JTextField(7);
	private JButton abtdlg = new JButton("����");
	private JButton abtdlg1 = new JButton("���");
	
	private JDialog bjdlg = new JDialog(this, "����", true);
	private Container bcondlg;
	private JLabel blbdlg = new JLabel("�̸� : ", JLabel.RIGHT);
	private JLabel blbdlg1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT);
	private JLabel blbdlg2 = new JLabel("��ȭ��ȣ : ", JLabel.RIGHT);
	private JLabel blbdlg3 = new JLabel("�ּ� : ", JLabel.RIGHT);
	private JLabel btfdlg = new JLabel();
	private JLabel btfdlg1 = new JLabel();
	private JTextField btfdlg2 = new JTextField(15);
	private JTextField btfdlg3 = new JTextField(15);
	private JButton bbtdlg = new JButton("����");
	private JButton bbtdlg1 = new JButton("���");
			
	public Exam_03_Sub(String str){
		super(str);
		this.setIconImage(im.getImage());
		this.init();
		this.start();
		this.pack();
		this.setResizable(false);
		//this.setSize(720, 320);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = this.getSize();
		this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), 
			(int)(di.getHeight() / 2 - di1.getHeight() / 2));
		this.setVisible(true);
	}
	public void init(){
		con = this.getContentPane();
		con.setLayout(bl);
		JPanel jp = new JPanel(new BorderLayout(3, 3));
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp1.add(jbt);
		jp1.add(jlb);		
		jp.add("North", jp1);
		jp.add("Center", jsp);
		JPanel jp2 = new JPanel(new GridLayout(1, 7, 3, 3));
		jp2.add(jbt1);
		jp2.add(jbt2);
		jp2.add(jbt3);
		jp2.add(jbt4);
		jp2.add(jbt5);
		jp2.add(jbt6);
		jp2.add(jbt7);
		jp.add("South", jp2);
		jbt.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt1.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt2.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt3.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt4.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt5.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt6.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt7.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt.setEnabled(false);
		jbt1.setEnabled(false);
		jbt2.setEnabled(false);
		jbt3.setEnabled(false);
		jbt4.setEnabled(false);
		jbt5.setEnabled(false);
		jp.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "��������Ȯ��"));
		con.add("Center", jp);
		JPanel jp3 = new JPanel(new GridLayout(2, 1, 3, 3));
		JPanel jp4 = new JPanel(new BorderLayout());
		JPanel jp5 = new JPanel(new GridLayout(4, 1));
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
		jp4.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "��������"));
		jp3.add(jp4);//��ܺ�
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
		jp8.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "�����˻�"));
		jp3.add(jp8);//�ϴܺ�
		con.add("West", jp3);
		jta.setEnabled(false);
		ata.setEnabled(false);
		jta.setDisabledTextColor(Color.black);
		ata.setDisabledTextColor(Color.black);
		
		//���� ���̾�α׸� �����մϴ�.
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
		//���� ���̾�α� ���� ��...
		
		//���� ���̾�α׸� �����մϴ�.
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
		//���� ���̾�α� ���� ��...
		
		//���� �ι�° ���̾�α� ����...
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
		//���� �ι�° ���̾�α� ������...
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbt7.addActionListener(this);//���� ��ư..
		tf.addKeyListener(this);//�̸� �ʵ�...
		tf1.addFocusListener(this);//�ֹι�ȣ ù��° �ʵ�..
		tf1.addKeyListener(this);
		tf2.addFocusListener(this);//�ֹι�ȣ �ι�° �ʵ�..
		tf2.addKeyListener(this);
		tf3.addFocusListener(this);//��ȭ��ȣ �ʵ�..
		tf3.addKeyListener(this);
		tf4.addFocusListener(this);//�ּ� �ʵ�..
		tf4.addKeyListener(this);
		atf.addKeyListener(this);
		atf1.addKeyListener(this);
		atf1.addFocusListener(this);
		jbt1.addActionListener(this);
		jbt4.addActionListener(this);
		jbt.addActionListener(this);//��ü����...
		abt.addActionListener(this);//�˻���ư...
		abt1.addActionListener(this);//������ư...
		abt2.addActionListener(this);//������ư...
		jbt5.addActionListener(this);//�����ư...
		jbt6.addActionListener(this);//�ε��ư...
		
		jbt3.addActionListener(this);//������ư...
		tfdlg1.addKeyListener(this);//���� ���̾�α��� �ֹ� 1�ʵ�..
		tfdlg2.addKeyListener(this);//���� ���̾�α��� �ֹ� 2�ʵ�...
		btdlg1.addActionListener(this);//���� ���̾�α��� ��ҹ�ư...
		btdlg.addActionListener(this);//���� ���̾�α��� ������ư...
		
		jbt2.addActionListener(this);//������ư..
		atfdlg1.addKeyListener(this);//���� ���̾�α��� �ֹ� 1�ʵ�..
		atfdlg2.addKeyListener(this);//���� ���̾�α��� �ֹ� 2�ʵ�...
		abtdlg1.addActionListener(this);//���� ���̾�α��� ��ҹ�ư...
		abtdlg.addActionListener(this);//���� ���̾�α��� ������ư...
		
		bbtdlg.addActionListener(this);//�������̾�α�2�� ������ư...
		bbtdlg1.addActionListener(this);//�������̾�α�2�� ��ҹ�ư...
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == jbt7){
			System.exit(0);
		}
		else if(e.getSource() == jbt1){
			String str = tf1.getText().trim() + tf2.getText().trim();
			int[] jumin = new int[13];
			for(int i = 0; i < 13; i++){
				jumin[i] = str.charAt(i) - 48;//'0'
			}
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
			if(temp1 != jumin[12]){
				tf1.setText("");
				tf2.setText("");
				jbt1.setEnabled(false);
				tf1.requestFocus();
				return;
			}
			//���� ���� ����� �غ� �� �Ȱ���...
			String a = tf.getText().trim();
			String b = tf1.getText().trim() + tf2.getText().trim();
			String c = tf3.getText().trim();
			String d = tf4.getText().trim();
			Exam_03_Sub1 ess = new Exam_03_Sub1(a, b, c, d);
			vc.addElement(ess);
			jta.setText("������ �� �Ǿ����ϴ�.\n");
			jta.append("���� " + vc.size() + "���� �����Ͱ� �����մϴ�.");
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
		else if(e.getSource() == jbt4){
			tf.setText("");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			jbt4.setEnabled(false);
			tf.requestFocus();
		}
		else if(e.getSource() == jbt){
			jta.setText("��ü �ο��� �������� �Դϴ�.\n");
			jta.append("�̸�\t�ֹι�ȣ\t\t��ȭ��ȣ\t�ּ�\n");
			jta.append("=============================================================\n");
			for(int i = 0; i < vc.size(); i++){
				Exam_03_Sub1 imsi = (Exam_03_Sub1)vc.elementAt(i);
				jta.append(imsi.getName() + "\t");
				jta.append(imsi.getJumin() + "\t");
				jta.append(imsi.getTel() + "\t");
				jta.append(imsi.getAddr() + "\n");
			}
			jta.append("=============================================================\n");
			jta.append("�� " + vc.size() + "��");
		}
		else if(e.getSource() == abt){
			String str = atf.getText().trim() + atf1.getText().trim();
			int k = -1;
			for(int i = 0; i < vc.size(); i++){
				Exam_03_Sub1 imsi = (Exam_03_Sub1)vc.elementAt(i);
				if(imsi.getJumin().equals(str)){
					k = i;
				}
			}
			if(k == -1){
				ata.setText("�׷� �ֹι�ȣ�� ��ϵ� ���� �����ϴ�.");
				atf.setText("");
				atf1.setText("");
				abt.setEnabled(false);
				atf.requestFocus();
				return;
			}
			pos = k;
			view(pos);
			if(vc.size() <= 1){
				abt1.setEnabled(false);
				abt2.setEnabled(false);
			}
			else{
				if(pos == 0){
					abt1.setEnabled(false);
					abt2.setEnabled(true);
				}
				else if(pos == vc.size() - 1){
					abt1.setEnabled(true);
					abt2.setEnabled(false);
				}
				else{
					abt1.setEnabled(true);
					abt2.setEnabled(true);
				}
			}
			atf.setText("");
			atf1.setText("");
			abt.setEnabled(false);
		}
		else if(e.getSource() == abt1){
			pos--;
			if(pos == 0){
				abt1.setEnabled(false);
			}
			abt2.setEnabled(true);
			view(pos);
		}
		else if(e.getSource() == abt2){
			pos++;
			if(pos == vc.size() - 1){
				abt2.setEnabled(false);
			}
			abt1.setEnabled(true);
			view(pos);
		}
		else if(e.getSource() == jbt5){
			jfc.showSaveDialog(this);
			File file = jfc.getSelectedFile();
			//System.out.println(file);
			//���� �Է�...
			try{
				FileOutputStream fo = new FileOutputStream(file);
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				ObjectOutputStream oos = new ObjectOutputStream(bo);
				oos.writeObject(vc);//vc�ӿ���..Exam_03_Sub1.. <-- ����ȭ �Ǿ�� ��..
				oos.close();
				bo.close();
				fo.close();
			}catch(FileNotFoundException ee){
			}catch(IOException ee){}
			//���� �Է� ��....
			jta.setText("���� �Ϸ� ! \n");
			jta.append(file + "�� �̸����� ����Ǿ����ϴ�.");
		}
		else if(e.getSource() == jbt6){
			jfc.showOpenDialog(this);
			File file = jfc.getSelectedFile();
			//System.out.println(file);
			//���� ��������...
			try{
				FileInputStream fi = new FileInputStream(file);
				BufferedInputStream bi = new BufferedInputStream(fi);
				ObjectInputStream ois = new ObjectInputStream(bi);
				vc.clear();
				vc = (Vector)ois.readObject();
				ois.close();
				bi.close();
				fi.close();			
			}catch(ClassNotFoundException ee){
			}catch(FileNotFoundException ee){
			}catch(IOException ee){}
			//���� ��������...��
			jta.setText("���� �б� �Ϸ� ! \n");
			jta.append(file + "�� ���Ϸκ��� �б⸦ �Ϸ��Ͽ����ϴ�.\n");
			jta.append("�� ������ ���� : " + vc.size() + "��");
			if(vc.size() >= 1){
				jbt.setEnabled(true);
				jbt2.setEnabled(true);
				jbt3.setEnabled(true);
				jbt5.setEnabled(true);
			}
		}
		else if(e.getSource() == jbt3){
			//���̾� �α׸� ���ϴ�...
			jdlg.setVisible(true);
		}
		else if(e.getSource() == btdlg1){
			tfdlg.setText("");
			tfdlg1.setText("");
			tfdlg2.setText("");
			jdlg.setVisible(false);
		}
		else if(e.getSource() == btdlg){
			String str = tfdlg.getText().trim();
			String str1 = tfdlg1.getText().trim() + tfdlg2.getText().trim();
			int kk = -1;
			for(int i = 0; i < vc.size(); i++){
				Exam_03_Sub1 imsi = (Exam_03_Sub1)vc.elementAt(i);
				if(imsi.getName().equals(str) && imsi.getJumin().equals(str1)){
					kk = i;				
				}
			}
			if(kk == -1){
				jta.setText("����� ���� ���� �ʽ��ϴ�..\n");
				jta.append("���� !!!\n");
				jta.append("�̸� : " + str + "\n");
				jta.append("�ֹι�ȣ : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n");
				jta.append("�ٽ� �õ� �ϼ���... ^^");
				tfdlg.setText("");
				tfdlg1.setText("");
				tfdlg2.setText("");
				jdlg.setVisible(false);
				return;
			}
			tfdlg.setText("");
			tfdlg1.setText("");
			tfdlg2.setText("");
			jdlg.setVisible(false);
			vc.removeElementAt(kk);//�̺κ��� ���� ���� �ϴ� �κ��Դϴ�.
			jta.setText("������ ����ڸ� ������ ����ҿ��� ���� �Ͽ����ϴ�.\n");
			jta.append("���� !!!\n");
			jta.append("�̸� : " + str + "\n");
			jta.append("�ֹι�ȣ : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n");
			jta.append("���� ���� ������ ���� : " + vc.size() + "��");
		}
		else if(e.getSource() == jbt2){
			//���� ���̾�α�...
			ajdlg.setVisible(true);
		}
		else if(e.getSource() == abtdlg1){
			atfdlg.setText("");
			atfdlg1.setText("");
			atfdlg2.setText("");
			ajdlg.setVisible(false);
		}
		else if(e.getSource() == abtdlg){
			String str = atfdlg.getText().trim();
			String str1 = atfdlg1.getText().trim() + atfdlg2.getText().trim();
			int kk = -1;
			for(int i = 0; i < vc.size(); i++){
				Exam_03_Sub1 imsi = (Exam_03_Sub1)vc.elementAt(i);
				if(imsi.getName().equals(str) && imsi.getJumin().equals(str1)){
					kk = i;				
				}
			}
			if(kk == -1){
				jta.setText("����� ���� ���� �ʽ��ϴ�..\n");
				jta.append("���� !!!\n");
				jta.append("�̸� : " + str + "\n");
				jta.append("�ֹι�ȣ : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n");
				jta.append("�ٽ� �õ� �ϼ���... ^^");
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
			//������ �� �ִ� ���̾�α׸� ����...
			pos1 = kk;
			jta.setText("�ش� ����ڸ� ã�ҽ��ϴ�... �����ϼ���..");
			Exam_03_Sub1 imsi = (Exam_03_Sub1)vc.elementAt(kk);
			btfdlg.setText(imsi.getName());
			btfdlg1.setText(imsi.getJumin().substring(0, 6) + "-" + imsi.getJumin().substring(6));
			btfdlg2.setText(imsi.getTel());
			btfdlg3.setText(imsi.getAddr());
			bjdlg.setVisible(true);
		}
		else if(e.getSource() == bbtdlg){
			Exam_03_Sub1 imsi = (Exam_03_Sub1)vc.elementAt(pos1);
			if(btfdlg2.getText().trim().length() != 0){
				imsi.setTel(btfdlg2.getText().trim());
			}
			if(btfdlg3.getText().trim().length() != 0){
				imsi.setAddr(btfdlg3.getText().trim());
			}
			jta.setText(imsi.getName() + "���� �ڷᰡ ���������� �����Ǿ����ϴ�.");
			bjdlg.setVisible(false);
		}
		else if(e.getSource() == bbtdlg1){
			bjdlg.setVisible(false);
		}
	}
	public void keyTyped(KeyEvent e){
		
	}
	public void keyPressed(KeyEvent e){
		if(e.getSource() == tf1){
			if(tf1.getText().trim().length() == 6){
				tf2.requestFocus();
				return;
			}
		}
		else if(e.getSource() == tf2){
			if(tf2.getText().trim().length() == 7){
				tf3.requestFocus();
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
	public void view(int ii){
		Exam_03_Sub1 imsi = (Exam_03_Sub1)vc.elementAt(ii);
		ata.setText("�̸� : " + imsi.getName() + "\n");
		ata.append("�ֹι�ȣ : " + imsi.getJumin().substring(0, 6) + "-" + imsi.getJumin().substring(6) + "\n");
		ata.append("��ȭ��ȣ : " + imsi.getTel() + "\n");
		ata.append("�ּ� : " + imsi.getAddr() + "\n");
		int[] jumin = new int[13];
		for(int i = 0; i < 13; i++){
			jumin[i] = imsi.getJumin().charAt(i) - 48;
		}
		int year = 0;
		int month = 0;
		int day = 0;
		if(jumin[6] == 9 || jumin[6] == 0){
			year = 1800;
		}
		else if(jumin[6] == 1 || jumin[6] == 2){
			year = 1900;
		}
		else if(jumin[6] == 3 || jumin[6] == 4){
			year = 2000;
		}
		year += jumin[0] * 10 + jumin[1];
		month = jumin[2] * 10 + jumin[3];
		day = jumin[4] * 10 + jumin[5];
		ata.append("������� : " + year + "�� " + month + "�� " + day + "��\n");
		ata.append("���� : " + ((jumin[6] % 2 == 0) ? "����" : "����") + "\n");
		Calendar ca = Calendar.getInstance();
		ata.append("���� : " + ((int)ca.get(Calendar.YEAR) - year) + "��\n");
	}
}
public class Exam05{
	public static void main(String[] ar){
		Exam_03_Sub es = new Exam_03_Sub("����� ����");
	}
}
