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


//���� �����Ӱ� ���� �������� ����ϹǷ� ���� Ŭ������ �����ؼ� �ν��Ͻ��� ����ؼ� ���°��� ���

public class Work01{ //���� Ŭ����
	public static void main(String[] ar){ // ���θ޼ҵ� ����
		Work01_Sub es = new Work01_Sub("����� ����"); // Work01_Sub Ŭ���� ��ü ����
	}
}


//���ο� Ŭ����
class Work01_Sub1 implements Serializable{//����ȭ... 
	// �����ѱ����� ��ü�� �����̳� ��Ʈ��ũ������ �Ҽ��ְ� ����Ʈ��Ʈ�����·� �����ϴ� ��
	
	//���� ����
	private String name; // �̸� ���� ����
	private String jumin; // �ֹι�ȣ ���� ����
	private String tel; // ��ȭ��ȣ ���� ����
	private String addr; // ��巹�� ���� ����
	
	
	//��ȯ���� ���� ������!!
	public Work01_Sub1(String a, String b, String c, String d){ //������->��ü�� ����� �������� �ʱ�ȭ �Ǵ� ��, �̸� �ֹι�ȣ ��ȭ��ȣ �ּҴ� ��ü�� ����� �������� ���� ����� �͵��̱� ����
		name = a;
		jumin = b;
		tel = c;
		addr = d;
	}
	
	//��ȯ���� void�� �����Ƿ� �޼ҵ� ���� �κ�
	public void setName(String a){ // �̸��� �����ϴ� �޼ҵ� .. �Ű������� ��Ʈ�� ���� ������ �װ��� name������ ����
		name = a;
	}
	public String getName(){ // �̸��� ������ �޼ҵ�.. ��Ʈ�������� ����� �̸� ���� ��ȯ
		return name;
	}
	public void setJumin(String a){ // �ֹι�ȣ�� �����ϴ� �޼ҵ�.. �Ű������� ��Ʈ�� ���� ������ �װ��� jumin������ ����
		jumin = a;
	}
	public String getJumin(){// �ֹι�ȣ�� ������ �޼ҵ�...  ��Ʈ�������� ����� �ֹι�ȣ ���� ��ȯ
		return jumin;
	}
	public void setTel(String a){ // ��ȭ��ȣ�� �����ϴ� �޼ҵ�.. �Ű������� ��Ʈ�� ���� ������ �װ��� tel ������ ����
		tel = a;
	}
	public String getTel(){ // ��ȭ��ȣ�� ������ �޼ҵ�...  ��Ʈ�������� ����� ��ȭ��ȣ ���� ��ȯ
		return tel;
	}
	public void setAddr(String a){ // ��ȭ��ȣ�� �����ϴ� �޼ҵ�.. �Ű������� ��Ʈ�� ���� ������ �װ��� addr ������ ����
		addr = a;
	}
	public String getAddr(){ // �ּҸ� ������ �޼ҵ�...  ��Ʈ�������� ����� addr ���� ��ȯ
		return addr;
	}
}

//Ŭ���� ����
class Work01_Sub extends JFrame
	implements ActionListener, KeyListener, FocusListener{ // ������������ ��ӹ޾Ƽ� �������� �� �غ� �ϰ�
	// �׼� �����ʿ� Ű������, ��Ŀ�������� �� �� �������̽��� ���� �ִ� ����� �����ϱ� ���ؼ� ���
	
	
	//���� ����(�⺻��, ������)
	private Container con; // �����̳� Ÿ�� �������� ����
	private BorderLayout bl = new BorderLayout(5, 5); // �������̾ƿ���ü bl ���� (���� ��� 5,5 ����) 
	private JLabel jlb = new JLabel("<== �̰��� ������ ��ü���Ⱑ �˴ϴ�."); // �� ��ü ����
	private JButton jbt = new JButton("��ü����"); // ��ư ��ü ����
	private JTextArea jta = new JTextArea(15, 40); // �ؽ�Ʈ������ ��ü ����(������ ��������)
	private JScrollPane jsp = new JScrollPane(jta); // �ؽ�Ʈ������ ��ü�� jta�� ���� ��ũ���� ��ü jsp ����
	private JButton jbt1 = new JButton("���"); // ��ư ��ü ����
	private JButton jbt2 = new JButton("����"); // ��ư ��ü ����
	private JButton jbt3 = new JButton("����"); // ��ư ��ü ����
	private JButton jbt4 = new JButton("Clear"); // ��ư ��ü ����
	private JButton jbt5 = new JButton("����"); // ��ư ��ü ����
	private JButton jbt6 = new JButton("�ε�"); // ��ư ��ü ����
	private JButton jbt7 = new JButton("����"); // ��ư ��ü ����
	
	private JLabel lb = new JLabel("�̸� : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel lb1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel lb2 = new JLabel("��ȭ��ȣ : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel lb3 = new JLabel("�ּ� : ", JLabel.RIGHT); // �� ��ü ����
	private JTextField tf = new JTextField(14); // �ؽ�Ʈ�ʵ� ��ü ����(������ ��������)
	private JTextField tf1 = new JTextField(7); // �ؽ�Ʈ�ʵ� ��ü ����(������ ��������)
	private JTextField tf2 = new JTextField(7); // �ؽ�Ʈ�ʵ� ��ü ����(������ ��������)
	private JTextField tf3 = new JTextField(14); // �ؽ�Ʈ�ʵ� ��ü ����(������ ��������)
	private JTextField tf4 = new JTextField(14); // �ؽ�Ʈ�ʵ� ��ü ����(������ ��������)
	
	private JLabel alb = new JLabel("�˻� : ", JLabel.RIGHT); // �� ��ü ����
	private JTextField atf = new JTextField(7); // �ؽ�Ʈ�ʵ� ��ü ����(������ ��������)
	private JTextField atf1 = new JTextField(7); // �ؽ�Ʈ�ʵ� ��ü ����(������ ��������)
	private JButton abt = new JButton("�˻�"); // ��ư ��ü ����
	private JTextArea ata = new JTextArea(5, 20); // �ؽ�Ʈ������ ��ü ����(������ ��������)
	private JScrollPane ajsp = new JScrollPane(ata); // �ؽ�Ʈ������ ��ü�� ata�� ���� ��ũ���� ��ü ajsp ����
	private JButton abt1 = new JButton("<<"); // ��ư ��ü ����
	private JButton abt2 = new JButton(">>"); // ��ư ��ü ����
	
	private ImageIcon im = new ImageIcon("web.gif"); // �̹��� ������ ��ü im ����
	
	private Vector vc = new Vector(); //���� �ν��Ͻ��� ����ؼ� ����� ������(Work01_Sub1�� ��ü)�� ������ ����...
	private int pos = 0; // �˻��� �������� ��ġ��°�� ����ϴ� ����
	private int pos1 = 0; //������ �������� ��ġ��°�� ����ϴ� ����
	
	
	private JFileChooser jfc = new JFileChooser("D://����//�¶��ΰ���//classes//Chapter_10"); // ���ϼ���â ��ü ���� (���� : ��ﶧ ���� ���丮�� ����)
	
	private JDialog jdlg = new JDialog(this, "����", true); // ���̾�α� â ��ü ����(���� : ������ ���� ����, �ٸ��ʿ� Ŭ�� ���ϰ�)
	private Container condlg; // �����̳� Ÿ�� �������� ����
	private JLabel lbdlg = new JLabel("�̸� : ", JLabel.RIGHT); // �󺧰�ü ����
	private JLabel lbdlg1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT); // �󺧰�ü ����
	private JTextField tfdlg = new JTextField(15); // �ؽ�Ʈ �ʵ� ��ü ����
	private JTextField tfdlg1 = new JTextField(7); // �ؽ�Ʈ �ʵ� ��ü ����
	private JTextField tfdlg2 = new JTextField(7); // �ؽ�Ʈ �ʵ� ��ü ����
	private JButton btdlg = new JButton("����"); // ��ư ��ü ����
	private JButton btdlg1 = new JButton("���"); // ��ư ��ü ���� hhj724
	
	private JDialog ajdlg = new JDialog(this, "����", true); // ���̾�α� â ��ü ����(���� : ������ ���� '����', �ٸ��ʿ� Ŭ�� ���ϰ�)
	private Container acondlg; // �����̳� Ÿ�� �������� ����
	private JLabel albdlg = new JLabel("�̸� : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel albdlg1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT); // �� ��ü ����
	private JTextField atfdlg = new JTextField(15); // �ؽ�Ʈ �ʵ� ��ü ����
	private JTextField atfdlg1 = new JTextField(7); // �ؽ�Ʈ �ʵ� ��ü ����
	private JTextField atfdlg2 = new JTextField(7); // �ؽ�Ʈ �ʵ� ��ü ����
	private JButton abtdlg = new JButton("����"); // ��ư ��ü ����
	private JButton abtdlg1 = new JButton("���"); // ��ư ��ü ����
	
	private JDialog bjdlg = new JDialog(this, "����", true); // ���̾�α� â ��ü ����(���� : ������ ���� '����', �ٸ��ʿ� Ŭ�� ���ϰ�)
	private Container bcondlg; // �����̳� Ÿ�� �������� ����
	private JLabel blbdlg = new JLabel("�̸� : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel blbdlg1 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel blbdlg2 = new JLabel("��ȭ��ȣ : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel blbdlg3 = new JLabel("�ּ� : ", JLabel.RIGHT); // �� ��ü ����
	private JLabel btfdlg = new JLabel(); // �� ��ü ����
	private JLabel btfdlg1 = new JLabel(); // �� ��ü ����
	private JTextField btfdlg2 = new JTextField(15); // �ؽ�Ʈ �ʵ� ��ü ����
	private JTextField btfdlg3 = new JTextField(15); // �ؽ�Ʈ �ʵ� ��ü ����
	private JButton bbtdlg = new JButton("����"); // ��ư ��ü ����
	private JButton bbtdlg1 = new JButton("���"); // ��ư ��ü ����
	//���� ���� ��!!
	
	
	//������ (��ü�� ���鶧���� �ʱ�ȭ �Ǵ� ��)
	public Work01_Sub(String str){ //������->��ü�� ����� �������� �ʱ�ȭ �Ǵ� ��, �̸� �ֹι�ȣ ��ȭ��ȣ �ּҴ� ��ü�� ����� �������� ���� ����� �͵��̱� ����
		//��ü�� �����ɶ����� �̰��� �׻� �����
		
		
		//������ �ȿ� �ִ� �κ����μ� ��ü�� �ʱ� ���� �κ�
		super(str); // ������Ŭ������ ������(str������ �����Ϳ� �´�) ȣ��
		this.setIconImage(im.getImage()); // im��ü�� getImage�޼ҵ� ����(�̹����� ���´ٴ� �ǹ�), ���� �̹����� �������� ���������� �����ϴ� �޼ҵ� ����
		this.init(); // �� Ŭ�������� init�޼ҵ� ����
		this.start(); // �� Ŭ�������� start�޼ҵ� ����
		this.pack(); // �� Ŭ�������� pack�޼ҵ� ����
		this.setResizable(false); // �������� ����� �ٲܼ� ���� ����
		//this.setSize(720, 320);
		Toolkit tk = Toolkit.getDefaultToolkit(); // ��Ŷ Ŭ������ ��ü tk ������
		Dimension di = tk.getScreenSize(); // tk��ü�� getScreenSize�޼ҵ带 �����ؼ� ��ũ�� ����� ���ͼ� Dimension Ÿ�� di������ ���� ����
		Dimension di1 = this.getSize(); // �������� ����� �ҷ����� �޼ҵ带 �����ϰ� �� ������� Dimension Ÿ�� di2������ ����
		this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), 
			(int)(di.getHeight() / 2 - di1.getHeight() / 2)); // �������� ��ũ���� ��� �ߵ��� �����ϴ� ���İ� �޼ҵ�
		this.setVisible(true); // �������� ���� ���̰� ������
	}
	
	
	//�޼ҵ� �κ�
	public void init(){
		
		//���������� �޼ҵ� ���� ��� ���� �κ�
		con = this.getContentPane(); // �����̳� Ÿ�� ���������� ����Ʈ�� ��ü�� ��Ī��Ŵ
		con.setLayout(bl); // con��ü�� ���̾ƿ��� bl(�������̾ƿ�)���� ������
		JPanel jp = new JPanel(new BorderLayout(3, 3));	// �г� ��üjp�� ����� �������̾ƿ�(3���ΰ���,3���ΰ���)�� ������� 
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));	// �г� ��üjp1�� ����� �÷ο� ���̾ƿ�(��������)�� ������� 
		jp1.add(jbt);	// ��ü���� ��ư�� �г�jp1��ü�� ����
		jp1.add(jlb);	// ��(��ü������� ����)�� �г�jp1��ü�� ����
		jp.add("North", jp1);	// �г�jp��ü�� ���ʿ� jp1��ü ����
		jp.add("Center", jsp);	// �г� jp��ü�� �߾ӿ� jsp��ü(�ؽ�Ʈ������ ��ü�� jta�� ���� ��ũ���� ��ü jsp) ���� 
		JPanel jp2 = new JPanel(new GridLayout(1, 7, 3, 3));	// �г� ��üjp2�� ����� �׸��� ���̾ƿ�(1�� 7�� 3����)�� ������� 
		jp2.add(jbt1);	// jp2�гο� jbt��ư ��ü�� �߰�
		jp2.add(jbt2);
		jp2.add(jbt3);
		jp2.add(jbt4);
		jp2.add(jbt5);
		jp2.add(jbt6);
		jp2.add(jbt7);
		jp.add("South", jp2);	//�ϼ��� jp2��ü�� jp��ü�� ���ʿ� �߰���Ŵ 
		jbt.setBorder(new BevelBorder(BevelBorder.RAISED)); // jbt��ü�� BevelBorder(������� ���̴� ��輱�� �׸�) ����
		jbt1.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt2.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt3.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt4.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt5.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt6.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt7.setBorder(new BevelBorder(BevelBorder.RAISED));
		jbt.setEnabled(false); // �ϴ� ��ư�� ��Ȱ��ȭ
		jbt1.setEnabled(false);
		jbt2.setEnabled(false);
		jbt3.setEnabled(false);
		jbt4.setEnabled(false);
		jbt5.setEnabled(false);
		jp.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "��������Ȯ��")); // �г�jp��ü�� Ÿ��Ʋ(��������Ȯ��)�� �ִ� ���� ���� 
		con.add("Center", jp); // �г�jp��ü�� con��ü ��� ����
		JPanel jp3 = new JPanel(new GridLayout(2, 1, 3, 3)); // �׸��巹�̾ƿ�(2��, 1��)�� �г� ��ü�� ���� 
		JPanel jp4 = new JPanel(new BorderLayout()); // �������̾ƿ�(2��, 1��)�� �г� ��ü�� ���� 
		JPanel jp5 = new JPanel(new GridLayout(4, 1)); // �׸��巹�̾ƿ�(4��, 1��)�� �г� ��ü�� ���� 
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
		jta.setDisabledTextColor(Color.black); // ��Ȱ��ȭ�� �ؽ�Ʈ�� ������ ����... �⺻������ ��Ȱ��ȭ�Ǹ� ���� �ſ� �������Ƿ� ���������� �����Ѵ�.
		ata.setDisabledTextColor(Color.black); // ��Ȱ��ȭ�� �ؽ�Ʈ�� ������ ����... �⺻������ ��Ȱ��ȭ�Ǹ� ���� �ſ� �������Ƿ� ���������� �����Ѵ�.
		
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
		
		// �⺻������ ���� ������ ���� ���̾�α׵��� ������ �Ǿ� ������ ���߿� �ʿ��Ҷ��� ���̵��� ��
	}//ù��° �޼ҵ��� ��
	
	public void start(){//�ι�° �޼ҵ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �⺻ ���� ���� ��ư (������ DO_NOTHING_ON_CLOSE �̰� ���� ���� ���� ��������)
		
		//���� ��ư�� �ʵ尪 �� �Ͼ�� ��ȭ�� �����ϴ� �޼ҵ带 �ϴ� �ִ� ��
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
	//�ι�° �޼ҵ� ��
	
	
	// �����ʿ� ���� �����ϴ� �޼ҵ�� ����
	
	//����° �޼ҵ�
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == jbt7){ // ��ư 7 ��ü�� ���� ����� �ο��ϴ� ��
			System.exit(0); // ����
		}
		else if(e.getSource() == jbt1){ // ��ư1 ��ü�� ��� ������ '���' �ϴ� ����� �ο��ϴ� ��
			String str = tf1.getText().trim() + tf2.getText().trim(); // �ΰ��� ������ �ִ� �ֹε�Ϲ�ȣ �յ� �ڸ��� �ٿ��� str ���ڿ��� ���� 
			//trim�� ������ ���ڿ��� ������� ��(�յڿ� Ȥ�� ������ �� ���� ���..)
			int[] jumin = new int[13]; // �ֹι�ȣ �迭 ����
			for(int i = 0; i < 13; i++){
				jumin[i] = str.charAt(i) - 48;//'0' //���ڿ��� Ư�� ��ġ��(i)�� �о �� Ư�� ���ڿ��� ���ڷ� ��ȯ�Ѵ� . �� �ڿ� ���ڰ� int�� ����ȯ �Ǿ� ����
			}
			
			// �ֹε�Ϲ�ȣ�� ��ȿ���� �׽�Ʈ �ϱ� ���� Ȯ�ΰ� �����ϴ� ��
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
			
			// ��ȿ�� Ȯ�ΰ� ���� �Ϸ�
			
			// ��ȿ�� Ȯ�ΰ��� �ֹε�Ϲ�ȣ ���ڸ��� ���ؼ� ��ġ���� ������ �ֹε�Ϲ�ȣ�� ��ȿ���� ���� ���̹Ƿ�
			// �ֹε�Ϲ�ȣ�� �ٽ� �Է��ϵ��� �ϴ� ���
			if(temp1 != jumin[12]){
				tf1.setText("");
				tf2.setText("");
				jbt1.setEnabled(false);
				tf1.requestFocus();
				return;
			}
			
			
			
			//�������� ��ȿ���� Ȯ�� �����Ƿ� ���� ���� ����� �غ� �� �Ȱ���... ���� ����ϴ� ��ɸ� �̷�������� �ϸ� ��
		
			String a = tf.getText().trim();
			String b = tf1.getText().trim() + tf2.getText().trim();
			String c = tf3.getText().trim();
			String d = tf4.getText().trim();
			Work01_Sub1 ess = new Work01_Sub1(a, b, c, d); // ������� �̸� �ֹι�ȣ ��ȭ �ּ�
			vc.addElement(ess); // ���� ��ü�� Work01_Sub1Ŭ������ �ν��Ͻ�ȭ �� ��ü ess�� �߰��Ѵ�
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
		else if(e.getSource() == jbt4){ // �ʱ�ȭ ��ư ����
			tf.setText("");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			jbt4.setEnabled(false);
			tf.requestFocus();
		}
		else if(e.getSource() == jbt){ // ��ü���� ��ư
			jta.setText("��ü �ο��� �������� �Դϴ�.\n");
			jta.append("�̸�\t�ֹι�ȣ\t\t��ȭ��ȣ\t�ּ�\n");
			jta.append("=============================================================\n");
			for(int i = 0; i < vc.size(); i++){
				Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(i);
				jta.append(imsi.getName() + "\t");
				jta.append(imsi.getJumin() + "\t");
				jta.append(imsi.getTel() + "\t");
				jta.append(imsi.getAddr() + "\n");
			}
			jta.append("=============================================================\n");
			jta.append("�� " + vc.size() + "��");
		}
		
		
		else if(e.getSource() == abt){ // 
			String str = atf.getText().trim() + atf1.getText().trim(); //�˻��ڰ� ã���� �ϴ� �ֹε�Ϲ�ȣ�� �Է��� ���� ������ ���ļ� str�� ����
			int k = -1;
			
			for(int i = 0; i < vc.size(); i++){ // ���Ϳ� ����� ������ ��ŭ �ݺ�
				Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(i); // Ư�� ��ġ�� ���� ���� ����� ��ü�� �ҷ��ͼ� Work01_Sub1Ÿ������ ����ȯ
				if(imsi.getJumin().equals(str)){ // imsi��ü�� getJumin�޼ҵ带  ����ؼ� ���Ϳ� ����Ǿ����� ��ü�� �ֹι�ȣ��  �˻��ڰ� ã���� �Է��� �ֹε�Ϲ�ȣ��
					//equals�� ���ؼ� ���̶�� �Ʒ��� ����
					k = i; // ã�� ���� ��ġ���� k������ ����
				}
			}
			
			if(k == -1){ // k�� -1�� ���ٴ� �ǹ̴� ��ġ�ϴ� �ֹε�Ϲ�ȣ�� ã�� ���ߴٴ� �ǹ���
				ata.setText("�׷� �ֹι�ȣ�� ��ϵ� ���� �����ϴ�.");
				atf.setText("");
				atf1.setText("");
				abt.setEnabled(false);
				atf.requestFocus();
				return; // �� �޼ҵ带 ��������
			}
			
			 // ���� ���� �Դٴ� ���� �˻��� �ֹε�Ϲ�ȣ�� ã�Ҵٴ� �ǹ�
			pos = k; // ���� ��ġ���� ������ k ���� pos�� ���� 
			view(pos); // Ŭ���� ���� view��� �޼ҵ带 �����ϸ� �Ű������� pos�� ������ ���� (�˻���� ã�� �ֹε�Ϲ�ȣ�� ���Ͱ� ��ġ�� ã�ư���� �ǹ�)
			
			if(vc.size() <= 1){ // ���ͳ��� �ѻ���� ������ �ִٸ� �̵���ư�� Ȱ��ȭ ���� �ʴ°� ���� ������ 
				abt1.setEnabled(false);
				abt2.setEnabled(false);
			}
			else{
				if(pos == 0){ // ���� �����ִ� ��ġ�� �� �����϶� ������ ��ư�� Ȱ��ȭ
					abt1.setEnabled(false);
					abt2.setEnabled(true);
				}
				else if(pos == vc.size() - 1){ // ���� �����ִ� ��ġ�� �� �������϶� ���� ��ư�� Ȱ��ȭ
					abt1.setEnabled(true);
					abt2.setEnabled(false);
				}
				else{ // �����ִ� ��ġ�� �߰��� ��� ���� ��ư ���� Ȱ��ȭ
					abt1.setEnabled(true);
					abt2.setEnabled(true);
				}
			}
			
			//�˻��� �� �������Ƿ� �� �ʵ带 �ʱ�ȭ �ϰ� �˻��������� �Ⱥ��̰� ��
			atf.setText("");
			atf1.setText("");
			abt.setEnabled(false);
		}
		
		else if(e.getSource() == abt1){ // ���� ��ư�� �������� ���� ����
			pos--;
			if(pos == 0){
				abt1.setEnabled(false);
			}
			abt2.setEnabled(true);
			view(pos);
		}
		
		else if(e.getSource() == abt2){ // ������ ��ư�� �������� ���� ����
			pos++;
			if(pos == vc.size() - 1){
				abt2.setEnabled(false);
			}
			abt1.setEnabled(true);
			view(pos);
		}
		
		
		
		
		
		//////////////
		
		
		
		
		
		else if(e.getSource() == jbt5){ // ���� ���� ��ư �������� ����
			jfc.showSaveDialog(this); // ��Ȱ��ȭ�Ǿ��ִ� jfc ��ü�� ������̾�α׸� ���̰� ��
			File file = jfc.getSelectedFile(); // ����ڰ� ������ ������ �ҷ����� �޼ҵ带 �����ؼ� File Ÿ���� file������
			// ���Խ�Ŵ
		
			//System.out.println(file);
			//���� �Է�...
			try{
				FileOutputStream fo = new FileOutputStream(file); // ������ ��½�Ʈ���ϴ� ��ü ���� �� ���
				BufferedOutputStream bo = new BufferedOutputStream(fo); // ��������� ���� ���۷� ��½�Ʈ�� �ϴ� ��ü ���� �� ���
				ObjectOutputStream oos = new ObjectOutputStream(bo); // ����ȭ�� ���� ��ü��½�Ʈ�� ��ü ����
				oos.writeObject(vc);//vc�ӿ���..Work01_Sub1.. <-- ����ȭ �Ǿ�� ��.. vc�ȿ� �ִ� ��ü�� writeObject�޼ҵ带
				// ����ؼ� ���� ����ȭ ��
				oos.close(); // ��Ʈ�� �� �� �����Ƿ� �����Ŵ
				bo.close(); // ��Ʈ�� �� �� �����Ƿ� �����Ŵ
				fo.close(); // ��Ʈ�� �� �� �����Ƿ� �����Ŵ
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
				FileInputStream fi = new FileInputStream(file); // ������ �Է½�Ʈ���ϴ� ��ü ���� �� ���
				BufferedInputStream bi = new BufferedInputStream(fi); // ��������� ���� ���۷� �Է½�Ʈ�� �ϴ� ��ü ���� �� ���
				ObjectInputStream ois = new ObjectInputStream(bi); // ����ȭ�� ���� ��ü�Է½�Ʈ�� ��ü ����
				vc.clear(); // vc��ü�� �ִ� ������ �ϴ� �ʱ�ȭ
				vc = (Vector)ois.readObject(); // ��ü�Է½�Ʈ�� ��ü�� readObject�޼ҵ带 ����ؼ� ������ ������ȭ �ϰ� �װ��� ����Ÿ������ ����ȯ
				// �ѵڿ� �ٽ� vc��ü�� ����
				ois.close(); // ��Ʈ�� �� �� �����Ƿ� �����Ŵ 
				bi.close(); // ��Ʈ�� �� �� �����Ƿ� �����Ŵ
				fi.close(); // ��Ʈ�� �� �� �����Ƿ� �����Ŵ	
			}catch(ClassNotFoundException ee){
			}catch(FileNotFoundException ee){
			}catch(IOException ee){}
			//���� ��������...��
			jta.setText("���� �б� �Ϸ� ! \n"); // ó�� �ؽ�Ʈ �����ƿ� ���� ���� ��� ��ü �ʱ�ȭ�Ǵ� �̰��� ���
			jta.append(file + "�� ���Ϸκ��� �б⸦ �Ϸ��Ͽ����ϴ�.\n"); // �̹� �ִ� �ۿ� �߰������� �ؽ�Ʈ�� �־�� �� ��쿡
			//append �޼ҵ带 ����Ѵ�.
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
		else if(e.getSource() == btdlg1){ // ��ҹ�ư �������� ����
			tfdlg.setText("");
			tfdlg1.setText("");
			tfdlg2.setText("");
			jdlg.setVisible(false);
		}
		else if(e.getSource() == btdlg){ // ������ư�� �������� �����ϴ°�
			String str = tfdlg.getText().trim(); // �˻��� �̸��� �޾Ƽ� ����
			String str1 = tfdlg1.getText().trim() + tfdlg2.getText().trim(); // �˻��� �ֹι�ȣ�� �޾Ƽ� ����
			int kk = -1; // 
			for(int i = 0; i < vc.size(); i++){ //���ͻ����ŭ �ݺ�
				Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(i); // ������ ��ġ��(i)�� ����� ��ü�� �ҷ��ͼ� Work01_Sub1 Ÿ������ ����ȯ
				if(imsi.getName().equals(str) && imsi.getJumin().equals(str1)){
					kk = i;	// �̸��� �ֹι�ȣ ��� ��ġ�ϴ� ���� ��ġ���� ã������ kk�� i���� ����			
				}
			}
			if(kk == -1){ // �˻��� ����ڰ� ������ �Ʒ� ����
				jta.setText("����� ���� ���� �ʽ��ϴ�..\n"); //�ؽ�Ʈ �ʱ� ����
				jta.append("���� !!!\n"); // �ؽ�Ʈ�����ƿ� ������ �ؽ�Ʈ�� ������ �ʰ� �߰������� �ؽ�Ʈ�� ����
				jta.append("�̸� : " + str + "\n"); // �ؽ�Ʈ�����ƿ� ������ �ؽ�Ʈ�� ������ �ʰ� �߰������� �ؽ�Ʈ�� ����
				jta.append("�ֹι�ȣ : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n"); // �ؽ�Ʈ�����ƿ� ������ �ؽ�Ʈ�� ������ �ʰ� �߰������� �ؽ�Ʈ�� ����
				jta.append("�ٽ� �õ� �ϼ���... ^^"); // �ؽ�Ʈ�����ƿ� ������ �ؽ�Ʈ�� ������ �ʰ� �߰������� �ؽ�Ʈ�� ����
				tfdlg.setText(""); // ���̾�α׳� �ؽ�Ʈ �ʵ� �ʱ�ȭ
				tfdlg1.setText(""); // ���̾�α׳� �ؽ�Ʈ �ʵ� �ʱ�ȭ
				tfdlg2.setText(""); // ���̾�α׳� �ؽ�Ʈ �ʵ� �ʱ�ȭ
				jdlg.setVisible(false);
				return;
			}
			tfdlg.setText("");
			tfdlg1.setText("");
			tfdlg2.setText("");
			jdlg.setVisible(false);
			vc.removeElementAt(kk);//�̺κ��� ���� ���� �ϴ� �κ��Դϴ�. // ���Ϳ��� ������ �˻��� ��ġ(kk)�� ��ü�� ����
			jta.setText("������ ����ڸ� ������ ����ҿ��� ���� �Ͽ����ϴ�.\n");
			jta.append("���� !!!\n");
			jta.append("�̸� : " + str + "\n");
			jta.append("�ֹι�ȣ : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n");
			jta.append("���� ���� ������ ���� : " + vc.size() + "��");
		}
		else if(e.getSource() == jbt2){ // ������ ���̾�α׸� ���̰� ��
			//���� ���̾�α�...
			ajdlg.setVisible(true);
		}
		else if(e.getSource() == abtdlg1){ // �������� ��Ҹ� ������� ����
			atfdlg.setText("");
			atfdlg1.setText("");
			atfdlg2.setText("");
			ajdlg.setVisible(false);
		}
		else if(e.getSource() == abtdlg){ // ������ Ȯ�� ��ư�� ����
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
			Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(kk); // ���Ϳ� ����� ��ü�� �ҷ���
			// �ҷ��� ��ü�� �� ������ �Է�
			btfdlg.setText(imsi.getName());
			btfdlg1.setText(imsi.getJumin().substring(0, 6) + "-" + imsi.getJumin().substring(6));
			//substring �޼ҵ带 ����ؼ� ����� �ֹι�ȣ�� �Ϻκ��� ����� �۾�
			btfdlg2.setText(imsi.getTel());
			btfdlg3.setText(imsi.getAddr());
			bjdlg.setVisible(true);
		}
		else if(e.getSource() == bbtdlg){ // ���� �ȿ��� Ȯ�� ��ư�� ��������
			Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(pos1);
			if(btfdlg2.getText().trim().length() != 0){
				imsi.setTel(btfdlg2.getText().trim());
			}
			if(btfdlg3.getText().trim().length() != 0){
				imsi.setAddr(btfdlg3.getText().trim());
			}
			jta.setText(imsi.getName() + "���� �ڷᰡ ���������� �����Ǿ����ϴ�.");
			bjdlg.setVisible(false);
		}
		else if(e.getSource() == bbtdlg1){ // ���� �ȿ��� Ȯ�� ��ư�� ��������
			bjdlg.setVisible(false);
		}
	}
	//����° �޼ҵ� ����
	
	
	//�׹�° �޼ҵ�
	public void keyTyped(KeyEvent e){
		
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getSource() == tf1){
			if(tf1.getText().trim().length() == 6){ //�ؽ�Ʈ�� �ҷ��ͼ� trim�ϰ� �� ���̸� ��ȯ -> �� ���� 6�� ���ٸ�
				tf2.requestFocus(); // ���� �ؽ�Ʈ �ʵ�� �Ѿ
				return;
			}
		}
		else if(e.getSource() == tf2){
			if(tf2.getText().trim().length() == 7){//�ؽ�Ʈ�� �ҷ��ͼ� trim�ϰ� �� ���̸� ��ȯ -> �� ���� 6�� ���ٸ�
				tf3.requestFocus(); // ���� �ؽ�Ʈ �ʵ�� �Ѿ
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
	
	// �����ʿ� �����ϴ� �޼ҵ�� ��
	

	
	public void view(int ii){
		Work01_Sub1 imsi = (Work01_Sub1)vc.elementAt(ii);
		ata.setText("�̸� : " + imsi.getName() + "\n");
		ata.append("�ֹι�ȣ : " + imsi.getJumin().substring(0, 6) + "-" + imsi.getJumin().substring(6) + "\n");
		ata.append("��ȭ��ȣ : " + imsi.getTel() + "\n");
		ata.append("�ּ� : " + imsi.getAddr() + "\n");
		
		//�ֹε�Ϲ�ȣ ���ڿ��� �����ؼ� �� �迭�� �Է�
		int[] jumin = new int[13];
		for(int i = 0; i < 13; i++){
			jumin[i] = imsi.getJumin().charAt(i) - 48;
		}
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		//�ֹε�Ϲ�ȣ 7��° �ڸ��� �̿��ؼ� �¾ '����'�� �ľ�
		//9,0�� 1800�⵵ ���, 1,2�� 1900�⵵ ���, 2000�⵵ ��� �ǹ�
		if(jumin[6] == 9 || jumin[6] == 0){
			year = 1800;
		}
		else if(jumin[6] == 1 || jumin[6] == 2){
			year = 1900;
		}
		else if(jumin[6] == 3 || jumin[6] == 4){
			year = 2000;
		}
		
		year += jumin[0] * 10 + jumin[1]; // ���� Ȯ��
		month = jumin[2] * 10 + jumin[3]; // �� Ȯ��
		day = jumin[4] * 10 + jumin[5]; // �� Ȯ��
		
		
		ata.append("������� : " + year + "�� " + month + "�� " + day + "��\n"); // ������� ���
		ata.append("���� : " + ((jumin[6] % 2 == 0) ? "����" : "����") + "\n"); // �ֹε�Ϲ�ȣ 7��° �ڸ��� �̿��ؼ� ������ �ٷ� Ȯ���ؼ� ���
		Calendar ca = Calendar.getInstance(); // Ķ������ �̿��ϱ� ���ؼ� Ķ���� Ŭ������ �ν��Ͻ��� ����
		ata.append("���� : " + ((int)ca.get(Calendar.YEAR) - year) + "��\n"); 
		// Ķ���� ��ü�� Ȯ���� ���� ������ �ֹε�Ϲ�ȣ�� ������ ������ ���̸� ����ؼ� ���
	}
}

