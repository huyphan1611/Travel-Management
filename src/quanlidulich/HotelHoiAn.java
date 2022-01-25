package quanlidulich;

import javax.swing.*;
import java.awt.*;

public class  HotelHoiAn extends JFrame implements Runnable {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    JLabel caption;
    Thread th;

    public void run() {
        try {

            /*l2.setVisible(true);
            Thread.sleep(1500);
            l2.setVisible(false);

            l3.setVisible(true);
            Thread.sleep(1500);
            l3.setVisible(false);*/

            l4.setVisible(true);
            Thread.sleep(1500);
            l4.setVisible(false);

            l5.setVisible(true);
            Thread.sleep(1500);
            l5.setVisible(false);

            l6.setVisible(true);
            Thread.sleep(1500);
            l6.setVisible(false);

            l7.setVisible(true);
            Thread.sleep(1500);
            l7.setVisible(false);

            /*l8.setVisible(true);
            Thread.sleep(1500);
            l8.setVisible(false);

            l9.setVisible(true);
            Thread.sleep(1500);
            l9.setVisible(false);

            l10.setVisible(true);
            Thread.sleep(1500);
            l10.setVisible(false);

            l11.setVisible(true);
            Thread.sleep(1500);
            l11.setVisible(false);*/

            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public  HotelHoiAn() {
        setBounds(520, 160, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));

        th = new Thread(this);

        caption = new JLabel();
        caption.setBounds(50, 550, 1000, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(caption);


        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);*/

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 900, 700);
        add(l7);
        l7.setVisible(false);
        th.start();
    }

    public static void main(String args[]){
        new HotelHoiAn().setVisible(true);
    }

}

