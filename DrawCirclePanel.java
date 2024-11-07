package awtexample;

import javax.swing.*;
import java.awt.*;

public class DrawCirclePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 確保調用父類的 paintComponent 方法
        g.setColor(Color.RED); // 設定圓點的顏色
        g.fillOval(190, 190, 20, 20); // 繪製一個直徑為20的圓點，位置在(190, 190)
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Draw on JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        
        DrawCirclePanel drawCirclePanel = new DrawCirclePanel();
        frame.add(drawCirclePanel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawCirclePanel::createAndShowGUI);
    }
}
