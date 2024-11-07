package awtexample;
import java.awt.*;
import javax.swing.*;

public class DrawCircle extends JFrame {

    private boolean drawCircle = true; // 控制是否繪製圓形的標誌

    public DrawCircle() {
        setTitle("Draw a Circle");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //上面只是設定frame 沒啥了不起

        JButton eraseButton = new JButton("Erase Circle");
        //jbutton會有字串的引數
        eraseButton.addActionListener(e -> eraseCircle()); // 添加按鈕的動作監聽器
        //這是一個簡潔寫法，總之就是讓e可以聽得見button發出的聲音，聽到後會進行eraseCircle()
        //什麼actionlistener的宣告都免了
        JPanel buttonPanel = new JPanel();
        //創一個panel
        buttonPanel.add(eraseButton); // 將按鈕加進panel

        getContentPane().add(buttonPanel, BorderLayout.SOUTH); // 將panel添加到 JFrame 的南側（底部）

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (drawCircle) {
            g.setColor(Color.RED);
            g.fillOval(100, 100, 100, 100); // 繪製一個直徑為100的圓點，位置在(100, 100)
        }
    }

    private void eraseCircle() { 
        drawCircle = false; // 設置為不繪製圓形
        repaint(); // 重新繪製視窗
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DrawCircle(); // 創建並顯示 DrawCircle 物件
        });
    }
}
