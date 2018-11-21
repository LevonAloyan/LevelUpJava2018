package homework16.IV_2.stella_tahmazyan;

import auditorium.figure.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HanoCanvas extends JPanel {
    ArrayList<Tower> towerList = new ArrayList<>();

    public HanoCanvas() {
        setBackground(Color.CYAN);
        int k = 40;
        for (int i = 0; i < 3; i++) {
            towerList.add(new Tower(k, 200, this));
            k += Tower.horWidth + 40;
        }
    }

    public void load(int n) {
//        for (int i = 1; i <= n; i++) {
//            int a = Tower.horWidth / n;
//            towerList[0].getDiscList().add(new Disc(Tower.horWidth - a * i, Tower.horHeight * i
//                    + Tower.horHeight + 2, Tower.horWidth - i * a / 2, 9, Color.red, this));
//
//        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (Tower tower : towerList) {
            tower.draw(g);
        }
    }

}
