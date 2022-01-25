package quanlidulich;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckPackage extends JFrame{
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CheckPackage frame = new CheckPackage("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CheckPackage( String username) {

        setBounds(550, 220, 900, 600);
        setVisible(true);
        String[] package1 = new String[]{"halong.jpg","HA LONG","6 days and 7 Nights", "Ha Long 5 Star", "Daily buffet", "Vinh Ha Long", "Bai Chay", "Tuan Chau Island", "Ha Long Night market", "3200$"};
        String[] package2 = new String[]{"phuquoc.jpg","PHU QUOC","4 days and 3 Nights", "Phu Quoc 5 Star", "Daily buffet", "Grand World Phu Quoc", "Bai Dai", "VinWonder", "VinPearl Safari", "2500$"};
        String[] package3 = new String[]{"hoian2.jpg","HOI AN - DA NANG","6 days and 5 Nights", "Pho Co 5 Star", "Daily buffet", "Pho Co Hoi An", "Cau Rong", "Ngu Hanh Son", "Ba Na Hill", "2000$"};
        String[] package4 = new String[]{"1.jpg","PHU YEN","6 days and 5 Nights", "Thap Nhan 5 Star", "Daily buffet", "Ghanh Da Dia", "Hon Yen", "Hai Dang Dai Lanh", "Bai Xep", "2700$"};

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = createPackage(package1, username);
        tabbedPane.addTab("Combo 1", null, p1);
        
        JButton b1 = new JButton("Describe");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try{
                    new ComboHaLong().setVisible(true);
                }catch(Exception e ){}
            }
        });
        b1.setBounds(530,400,200,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        JPanel p2 = createPackage(package2, username);
        tabbedPane.addTab("Combo 2", null, p2);

        JButton b2 = new JButton("Describe");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try{
                    new DesPhuQuoc().setVisible(true);
                }catch(Exception e ){}
            }
        });
        b2.setBounds(530,400,200,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        p2.add(b2);

        JPanel p3 = createPackage(package3, username);
        tabbedPane.addTab("Combo 3", null, p3);

        JButton b3 = new JButton("Describe");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try{
                    new DesHoiAn().setVisible(true);
                }catch(Exception e ){}
            }
        });
        b3.setBounds(530,400,200,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        p3.add(b3);

        JPanel p4 = createPackage(package4, username);
        tabbedPane.addTab("Combo 4", null, p4);

        JButton b4 = new JButton("Describe");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try{
                    new DesPhuYen().setVisible(true);
                }catch(Exception e ){}
            }
        });
        b4.setBounds(530,400,200,30);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        p4.add(b4);

        add(tabbedPane, BorderLayout.CENTER);
    }

    public JPanel createPackage(String[] pack, String username){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(550, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(400,0,450,420);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblName.setBounds(50, 5, 350, 53);
        p1.add(lblName);

        JLabel c3 = new JLabel("Days: ");
        c3.setBounds(35,70, 200, 14);
        p1.add(c3);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.RED);
        l3.setBounds(130, 70, 200, 14);
        p1.add(l3);

        JLabel c4 = new JLabel("Hotel: ");
        c4.setBounds(35,110, 200, 14);
        p1.add(c4);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(Color.BLUE);
        lblId.setBounds(130, 110, 200, 14);
        p1.add(lblId);

        JLabel c5 = new JLabel("Buffet: ");
        c5.setBounds(35,150, 200, 14);
        p1.add(c5);

        JLabel l2 = new JLabel(pack[4]);
        l2.setForeground(Color.RED);
        l2.setBounds(130, 150, 200, 14);
        p1.add(l2);

        JLabel c6 = new JLabel("Schedule: ");
        c6.setBounds(35,190, 200, 14);
        p1.add(c6);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setForeground(Color.BLUE);
        lblName_1.setBounds(130, 190, 200, 14);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setForeground(Color.RED);
        lblGender.setBounds(130, 230, 200, 14);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setForeground(Color.BLUE);
        lblCountry.setBounds(130, 270, 200, 14);
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setForeground(Color.RED);
        lblReserveRoomNumber.setBounds(130, 310, 200, 14);
        p1.add(lblReserveRoomNumber);

        JButton b1 = new JButton("Book Combo");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try{
                    new BookPackage(username).setVisible(true);
                }catch(Exception e ){}
            }
        });
        b1.setBounds(60, 400, 200, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);
        /*JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setForeground(Color.BLUE);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 400, 200, 30);
        p1.add(lblCheckInStatus);*/

        /*JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(130, 460, 400, 40);
        p1.add(lblDeposite);*/
        

        JLabel la1 = new JLabel(pack[9]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        la1.setBounds(110, 460, 400, 40);
        p1.add(la1);

        return p1;
    }
}
