package awtexample;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class HW7_011220917_ver2 extends JFrame{
	static int fx=300;
	static int fy=400; 
	Ball2 ball=new Ball(3);
	JPanel panel=new JPanel();
	public HW7_011220917_ver2 (){ //建構子
		setSize(fx,fy);//直接使用方法就好，我有從上面繼承來的方法 設定框的大小
		getContentPane().add(ball.inball);

			}
	public static void main(String args[]) {
		HW7_011220917_ver2 frm=new HW7_011220917_ver2();
		
		frm.setVisible(true);
		
	}
	
}

class Ball2 extends Thread {

	int fx=300;
	int fy=400;
	int ballnumber;
	int x;
	int y;
	int red;
	int green;
	int blue;
	int radius;
	int dir;
	boolean walln=false;
	boolean walle=false;
	boolean wallw=false;
	boolean walls=false;
	
	innerBall inball=new innerBall(); //內部類別 只有他能夠被當成JPanel
	//而且一個ball物件也會綁定一個內部類別 我終於感受到他的強大了
	ArrayList<Integer> xlist=new ArrayList<Integer>();
	ArrayList<Integer> ylist=new ArrayList<Integer>();
	ArrayList<Integer> dirlist=new ArrayList<Integer>();
	ArrayList<Integer> radlist=new ArrayList<Integer>();
	ArrayList<Integer> redlist=new ArrayList<Integer>();
	ArrayList<Integer> greenlist=new ArrayList<Integer>();
	ArrayList<Integer> bluelist=new ArrayList<Integer>();
//	ArrayList<Color> colorlist=new ArrayList<Color>();

	public Ball2(int n) {
		ballnumber=n;
		Random rdm = new Random();//之後再用 不要急
		for(int h=0;h<n;h++) {
			xlist.add(rdm.nextInt(fx-radius-1));
			ylist.add(rdm.nextInt(fy-radius-1));
			dirlist.add(rdm.nextInt(1,9));
			radlist.add(rdm.nextInt(10,100));
			redlist.add(rdm.nextInt(256));
			greenlist.add(rdm.nextInt(256));
			bluelist.add(rdm.nextInt(256));
			//colorlist.add(new Color(redlist.get(h),greenlist.get(h),bluelist.get(h)));
		}  //等於說輸入好n的時候，已經把那顆球的所有資訊設定好了
		
	} 
	class innerBall extends JPanel{
		
		public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillOval(10,10,10,10);
		//for(int j=0;j<ballnumber;j++) { //這裡會生出不同球
//		g.setColor(colorlist.get(j));
//		g.fillOval(xlist.get(j), ylist.get(j), radlist.get(j), radlist.get(j)); 
//	
		//}
		
	}
	
	}
}





