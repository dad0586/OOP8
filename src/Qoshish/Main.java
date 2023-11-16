package Qoshish;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String birinchiRaqam = JOptionPane.showInputDialog("Birinchi raqamni kiriting");
        String ikkinchiRaqam = JOptionPane.showInputDialog(" Ikkinchi raqamni kiriting");
        int raqam1 = Integer.parseInt(birinchiRaqam);
        int raqam2 = Integer.parseInt(ikkinchiRaqam);
        int yigindi = raqam1 + raqam2;
        JOptionPane.showMessageDialog(null, "Ularning yig'indisi: " +yigindi,
                "Sarlavha", JOptionPane.INFORMATION_MESSAGE);
    }
}
