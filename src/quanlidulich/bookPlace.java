package quanlidulich;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class bookPlace extends JFrame {
    private JPanel contentPane;
    JTextField t1,t2, t3;
    Choice c1;
    Conn c = new Conn();
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bookPlace frame = new bookPlace("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public bookPlace(String username) {
        setBounds(420, 220, 1100, 600);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/10.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(450,100,700,300);
        add(la1);

        JLabel lblName = new JLabel("DESTINATION");
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName.setBounds(118, 11, 300, 53);
        contentPane.add(lblName);

        JLabel la2 = new JLabel("Username :");
        la2.setBounds(35, 70, 200, 14);
        contentPane.add(la2);

        JLabel l1 = new JLabel(username);
        l1.setBounds(271, 70, 200, 14);
        contentPane.add(l1);

        JLabel lblId = new JLabel("Select Destination :");
        lblId.setBounds(35, 110, 200, 14);
        contentPane.add(lblId);

        c1 = new Choice();

        try{

            ResultSet rs = c.s.executeQuery("select distinct name from destination");
            while(rs.next()){
                c1.add(rs.getString("name"));
            }

            rs.close();
        }catch(SQLException e){}
        c1.setBounds(271, 110, 150, 30);
        add(c1);

        JButton b5 = new JButton("Check");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(c1.getSelectedItem().equals("Phu Yen") == true ) {
                    try {
                        new DesPhuYen().setVisible(true);
                    } catch (Exception e) {}
                } else if(c1.getSelectedItem().equals("Ha Long") == true){
                    try{
                        System.out.println(c1.getSelectedItem());
                        new DesHalong().setVisible(true);
                    }catch(Exception e ){}
                } else if(c1.getSelectedItem().equals("Hoi An") == true){
                    try{
                        System.out.println(c1.getSelectedItem());
                        new DesHoiAn().setVisible(true);
                    }catch(Exception e ){}
                }else if(c1.getSelectedItem().equals("Phu Quoc") == true){
                    try{
                        System.out.println(c1.getSelectedItem());
                        new DesPhuQuoc().setVisible(true);
                    }catch(Exception e ){}
                }
            }
        });

        b5.setBounds(430,110,100,25);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        contentPane.add(b5);

        JLabel la3 = new JLabel("Total Persons");
        la3.setBounds(35, 150, 200, 14);
        contentPane.add(la3);

        t1 = new JTextField();
        t1.setText("0");
        t1.setBounds(271, 150, 150, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        JLabel la4 = new JLabel("Days");
        la4.setBounds(35, 190, 200, 14);
        contentPane.add(la4);

        t2 = new JTextField();
        t2.setText("0");
        t2.setBounds(271, 190, 150, 20);
        contentPane.add(t2);
        t2.setColumns(10);

        JLabel lbl1 = new JLabel("ID type :");
        lbl1.setBounds(35, 230, 200, 14);
        contentPane.add(lbl1);

        JLabel l2 = new JLabel();
        l2.setBounds(271, 230, 200, 14);
        contentPane.add(l2);

        JLabel lbl2 = new JLabel("ID Number :");
        lbl2.setBounds(35, 270, 200, 14);
        contentPane.add(lbl2);

        JLabel l3 = new JLabel();
        l3.setBounds(271, 270, 200, 14);
        contentPane.add(l3);

        JLabel lbl3 = new JLabel("Phone :");
        lbl3.setBounds(35, 310, 200, 14);
        contentPane.add(lbl3);

        JLabel l4 = new JLabel();
        l4.setBounds(271, 310, 200, 14);
        contentPane.add(l4);


        JLabel la8 = new JLabel("Time");
        la8.setBounds(35, 350, 200, 14);
        contentPane.add(la8);

        t3 = new JTextField();
        t3.setText("0");
        t3.setBounds(271, 350, 150, 20);
        contentPane.add(t3);
        t3.setColumns(10);


        JLabel lblDeposite = new JLabel("Total Price :");
        lblDeposite.setBounds(35, 390, 200, 14);
        contentPane.add(lblDeposite);

        JLabel l5 = new JLabel();
        l5.setBounds(271, 390, 200, 14);
        l5.setForeground(Color.RED);
        contentPane.add(l5);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                l2.setText(rs.getString("idtype"));
                l3.setText(rs.getString("idnumber"));
                l4.setText(rs.getString("phone"));

            }

            rs.close();
        }catch(SQLException e){}


        JButton b1 = new JButton("Check Price");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();

                try{
                    String s1 = c1.getSelectedItem();

                    String q1 = "select * from destination where name = '"+c1.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(q1);
                    if(rs.next()){

                        int cost = Integer.parseInt(rs.getString("cost"));
                        int persons = Integer.parseInt(t1.getText());
                        int days = Integer.parseInt(t2.getText());




                        if(persons * days > 0) {
                            int total = 0;
                            total += cost;
                            total = total * persons * days;
                            l5.setText(total+"$");
                        }


                    }

                }catch(Exception ee){
                    System.out.println(ee.getMessage());
                }
            }
        });
        b1.setBounds(50, 420, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);
        
        
        JButton book = new JButton("Book");
        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();


                try{
                    String s1 = c1.getSelectedItem();

                    String q1 = "insert into bookplace values('"+l1.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+t2.getText()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"','"+t3.getText()+"')";
                    c.s.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null, "Select Destination Successfully");
                    setVisible(false);
                }catch(Exception ee){
                    System.out.println(ee.getMessage());
                }

            }
        });
        book.setBounds(200, 420, 120, 30);
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
        contentPane.add(book);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnExit.setBounds(350, 420, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        getContentPane().setBackground(Color.WHITE);


    }
}
