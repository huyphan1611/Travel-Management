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
public class DeletePackage extends JFrame {
    private JPanel contentPane;
    Choice c1;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DeletePackage frame = new DeletePackage("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DeletePackage(String username) throws SQLException {
        setBounds(580, 220, 850, 550);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i3 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(500,100,300,300);
        add(l1);

        JLabel lblName = new JLabel("DELETE COMBO");
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName.setBounds(118, 11, 300, 53);
        contentPane.add(lblName);

        JLabel lb3 = new JLabel("Username :");
        lb3.setBounds(35, 70, 200, 14);
        contentPane.add(lb3);

        JLabel l2 = new JLabel(username);
        l2.setBounds(271, 70, 200, 14);
        contentPane.add(l2);

        c1 = new Choice();
        Conn c = new Conn();
        try{

            ResultSet rs = c.s.executeQuery("select * from bookcombo where username ='"+username+"'");
            while(rs.next()){
                c1.add(rs.getString("combo"));
            }

            rs.close();
        }catch(SQLException e){}

        c1.setBounds(271, 110, 150, 30);
        add(c1);

        JLabel lblId = new JLabel("Combo :");
        lblId.setBounds(35, 110, 200, 14);
        contentPane.add(lblId);



        JLabel lb2 = new JLabel("Persons :");
        lb2.setBounds(35, 150, 200, 14);
        contentPane.add(lb2);

        JLabel l3 = new JLabel();
        l3.setBounds(271, 150, 200, 14);
        contentPane.add(l3);

        JLabel lblName_1 = new JLabel("ID Type :");
        lblName_1.setBounds(35, 190, 200, 14);
        contentPane.add(lblName_1);

        JLabel l4 = new JLabel();
        l4.setBounds(271, 190, 200, 14);
        contentPane.add(l4);


        JLabel lblGender = new JLabel("ID Number :");
        lblGender.setBounds(35, 230, 200, 14);
        contentPane.add(lblGender);

        JLabel l5 = new JLabel();
        l5.setBounds(271, 230, 200, 14);
        contentPane.add(l5);

        JLabel lblCountry = new JLabel("Phone :");
        lblCountry.setBounds(35, 270, 200, 14);
        contentPane.add(lblCountry);

        JLabel l6 = new JLabel();
        l6.setBounds(271, 270, 200, 14);
        contentPane.add(l6);

        JLabel lblReserveRoomNumber = new JLabel("Price :");
        lblReserveRoomNumber.setBounds(35, 310, 200, 14);
        contentPane.add(lblReserveRoomNumber);

        JLabel l7 = new JLabel();
        l7.setBounds(271, 310, 200, 14);
        contentPane.add(l7);

        JButton b1 = new JButton("Check");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();
                String combo= c1.getSelectedItem();

                try{
                    ResultSet rs = c.s.executeQuery("select * from bookcombo where combo ='"+combo+"'");

                    if(rs.next()){
                        //l2.setText(rs.getString(2));
                        l3.setText(rs.getString(3));
                        l4.setText(rs.getString(4));
                        l5.setText(rs.getString(5));
                        l6.setText(rs.getString(6));
                        l7.setText(rs.getString(7));

                    }
                }catch(Exception ee){ }
            }
        });
        b1.setBounds(425, 70, 80, 22);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);


        JButton btnNewButton = new JButton("Delete");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();


                try{
                    String s1 = c1.getSelectedItem();

                    String q1 = "delete from bookcombo where combo = '"+s1+"'";
                    c.s.executeUpdate(q1);

                    JOptionPane.showMessageDialog(null, "Deleted Successfully");
                    setVisible(false);
                }catch(SQLException e1){
                    System.out.println(e1.getMessage());
                }
                catch(NumberFormatException s){
                    JOptionPane.showMessageDialog(null, "Please enter a valid Number");
                }
            }
        });
        btnNewButton.setBounds(100, 430, 120, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        contentPane.add(btnNewButton);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnExit.setBounds(260, 430, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }
}

