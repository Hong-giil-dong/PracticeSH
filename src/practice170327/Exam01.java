package practice170327;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Exam01 {
	public static void main(String[] ar){
		Frame f = new Frame("? λͺ©ν?μ€?"); //μ΄κΈ°? κ³Όμ ?? ?€? 
		//f.show();
		f.setTitle("? λͺ©μ°?΅μ€?"); //? λͺ? λ³?κ²?
		
		f.setSize(300, 500);//?Ό? ?¬κΈ?
		
		
		Dimension dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen2 = f.getSize();
		int x = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		int y = (int)(dimen1.getHeight()/ 2 - dimen2.getHeight()/2);
		f.setLocation(x, y); //?μΉ? μ§?? 
		f.setVisible(true); //?λ©΄μ ??
	}
}












