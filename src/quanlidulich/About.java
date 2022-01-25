/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidulich;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                               Thông tin về Đồ Án          \n  "
                + "\nMục tiêu của dự án Hệ thống Quản lý Du lịch là phát triển "
                + "một hệ thống tự động hóa các quy trình và hoạt động của một  "
                + "chuyến du lịch và thiết kế một hệ thống có thể thực hiện tất "
                + "cả các hoạt động liên quan đến du lịch."
                + "\n\n"
                + "Ứng dụng này sẽ giúp truy cập các thông tin liên quan đến chuyến đi đến "
                + "điểm đến cụ thể một cách dễ dàng. Người dùng có thể theo dõi "
                + "các thông tin liên quan đến chuyến tham quan của mình dễ dàng "
                + "thông qua ứng dụng này. Thông tin du lịch cũng có thể được lấy "
                + "thông qua ứng dụng này. \n\n"
                + "Ưu điểm của dự án:"
                + "\nCung cấp thông tin chính xác"
                + "\nĐơn giản hóa công việc thủ công"
                + "\nGiảm thiểu các công việc liên quan đến tài liệu"
                + "\nCung cấp thông tin cập nhật"
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("Thông Tin về Đồ Án");
        add(l1);
        l1.setBounds(150, 10, 200, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
