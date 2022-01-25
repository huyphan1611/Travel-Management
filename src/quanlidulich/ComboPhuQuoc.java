/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidulich;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ComboPhuQuoc extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    JLabel caption;
    Thread th;

    public void run() {
        try {


            l9.setVisible(true);
            Thread.sleep(5000);
            l9.setVisible(false);
            l10.setVisible(true);
            Thread.sleep(5000);
            l10.setVisible(false);
            l11.setVisible(true);
            Thread.sleep(5000);
            l11.setVisible(false);
            l12.setVisible(true);
            Thread.sleep(5000);
            l12.setVisible(false);

            l2.setVisible(true);
            Thread.sleep(2000);
            l2.setVisible(false);
            l3.setVisible(true);
            l3.setVisible(true);
            Thread.sleep(2000);
            l3.setVisible(false);
            l4.setVisible(true);
            Thread.sleep(2000);
            l4.setVisible(false);
            l5.setVisible(true);
            Thread.sleep(2000);
            l5.setVisible(false);
            l6.setVisible(true);
            Thread.sleep(2000);
            l6.setVisible(false);
            l7.setVisible(true);
            Thread.sleep(2000);
            l7.setVisible(false);
            l8.setVisible(true);
            Thread.sleep(2000);
            l8.setVisible(false);


            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public ComboPhuQuoc() {

        setBounds(500, 220, 1000, 600);
        getContentPane().setBackground(new Color(220, 250, 250));

        th = new Thread(this);


        ImageIcon cb1 = new ImageIcon(ClassLoader.getSystemResource("combo/PQ7.png"));
        Image cb2 = cb1.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
        ImageIcon cb3 = new ImageIcon(cb2);
        l9 = new JLabel(cb3);
        l9.setBounds(0, 0, 1000, 600);
        add(l9);
        l9.setVisible(false);

        ImageIcon cb4 = new ImageIcon(ClassLoader.getSystemResource("combo/PQ8.png"));
        Image cb5 = cb4.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
        ImageIcon cb6 = new ImageIcon(cb5);
        l10 = new JLabel(cb6);
        l10.setBounds(0, 0, 1000, 600);
        add(l10);
        l10.setVisible(false);

        ImageIcon cb7 = new ImageIcon(ClassLoader.getSystemResource("combo/PQ9.png"));
        Image cb8 = cb7.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
        ImageIcon cb9 = new ImageIcon(cb8);
        l11 = new JLabel(cb9);
        l11.setBounds(0, 0, 1000, 600);
        add(l11);
        l11.setVisible(false);

        ImageIcon cb10 = new ImageIcon(ClassLoader.getSystemResource("combo/PQ10.png"));
        Image cb11 = cb10.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
        ImageIcon cb12 = new ImageIcon(cb11);
        l12 = new JLabel(cb12);
        l12.setBounds(0, 0, 1000, 600);
        add(l12);
        l12.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 1000, 600);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 1000, 600);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 1000, 600);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 1000, 600);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 1000, 600);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 1000, 600);
        add(l7);
        l7.setVisible(false);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/7.jpg"));
        Image i20 = i19.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(0, 0, 1000, 600);
        add(l8);
        l8.setVisible(false);

        /*ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/dest8.jpg"));
        Image i23 = i22.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(0, 0, 1000, 600);
        add(l9);
        l9.setVisible(false);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/dest9.jpg"));
        Image i26 = i25.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l10 = new JLabel(i27);
        l10.setBounds(0, 0, 1000, 600);
        add(l10);
        l10.setVisible(false);

        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("phuquoc/dest10.jpg"));
        Image i29 = i28.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l11 = new JLabel(i30);
        l11.setBounds(0, 0, 1000, 600);
        add(l11);
        l11.setVisible(false);*/

        th.start();

    }

    public static void main(String args[]) {
        new ComboPhuQuoc().setVisible(true);

    }

}
