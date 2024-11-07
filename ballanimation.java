package awtexample;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ballanimation {
	int x;
	int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ballanimation ba=new ballanimation();
		ba.go();
		//驗證問題了!!! jpanel互加這件事情本身是沒有問題的 但是問題是出在我們要顯示東西時都是靠著frame的visible呼叫
		//我今天若是用雙重嵌套，會讓小層的那層叫不到

	}

	public void go() {
		JFrame frm=new JFrame();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpn=new JPanel();
		DrawPanel dp=new DrawPanel();
		jpn.add(dp);
		jpn.setBackground(Color.BLACK);
		frm.getContentPane().add(jpn);
		frm.getContentPane().add(jpn);
		frm.getContentPane().add(jpn);
		frm.getContentPane().add(jpn);
		frm.getContentPane().add(dp);
		frm.setBackground(Color.white);
		frm.setSize(300,400);
		frm.setVisible(true);
		
		
		for(int i=1;i<100;i++) { //這裡才會重複畫以製造軌跡
			//move也在這裡做

			x=x++;
			y++;
			dp.repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	class DrawPanel extends JPanel{
		int x1;
		int y1;
		public void paintComponent(Graphics g) {
//			x1=x-1;
//			y1=y-1;
			g.setColor(Color.white);
			g.fillOval(x1, y1, 40, 40);
			for(int j=50;j<201;j=j+50) { //這個for是為了不同球
			g.setColor(Color.black);
			g.fillOval(x+j, y+j, 40, 40);
			
			
			
			}
			
		}
		
	}
	
	
	
	
	
}
