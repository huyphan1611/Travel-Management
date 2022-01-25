package quanlidulich;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;


    public Login() {


        //setBackground(new Color(255, 255, 204));
        setBounds(550, 250, 800, 470);

        panel = new JPanel();
        //NewLabel.setBackground(new Color(255, 255, 204));
        //setContentPane(NewLabel);
        //NewLabel.setLayout(new FlowLayout());
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 800, 450);
        add(NewLabel);

        JLabel l1 = new JLabel("Username ");
        l1.setBounds(240, 89, 95, 24);
        NewLabel.add(l1);

        JLabel l2 = new JLabel("Password ");
        l2.setBounds(240, 124, 95, 24);
        NewLabel.add(l2);

        textField = new JTextField();
        textField.setBounds(326, 93, 157, 20);
        NewLabel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(326, 128, 157, 20);
        NewLabel.add(passwordField);

        /*JLabel l3 = new JLabel("");
        l3.setBounds(377, 79, 46, 34);
        NewLabel.add(l3);

        JLabel l4 = new JLabel("");
        l4.setBounds(377, 124, 46, 34);
        NewLabel.add(l3);*/

        /*ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i1 = c1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);


        JLabel l6 = new JLabel(i2);
        l6.setBounds(480, 70, 150, 150);
        add(l6);*/


        b1 = new JButton("Login");
        b1.addActionListener(this);

        //b1.setForeground(new Color(46, 139, 87));
        //b1.setBackground(Color.CYAN);
        b1.setBounds(280, 181, 113, 25);
        NewLabel.add(b1);

        b2 = new JButton("Sign up");
        b2.addActionListener(this);

        //b2.setForeground(new Color(139, 69, 19));
        //b2.setBackground(Color.CYAN);
        b2.setBounds(400, 181, 113, 25);
        NewLabel.add(b2);

        b3 = new JButton("Forgot password?");
        b3.addActionListener(this);

        //b3.setForeground(new Color(205, 92, 92));
       // b3.setBackground(new Color(253, 245, 230));
        b3.setBounds(315, 231, 179, 25);
        NewLabel.add(b3);

        /*JLabel l5 = new JLabel("Trouble in Login?");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l5.setForeground(new Color(255, 0, 0));
        l5.setBounds(70, 235, 110, 20);
        NewLabel.add(l5);*/

        /*JNewLabel NewLabel2 = new JNewLabel();
        NewLabel2.setBackground(new Color(255, 255, 204));
        NewLabel2.setBounds(24, 40, 434, 263);
        NewLabel.add(NewLabel2);*/
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            Boolean status = false;
            try {
                Conn con = new Conn();
                String sql = "select * from account where username=? and password=?";
                PreparedStatement st = con.conn.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    //JOptionPane.showMessageDialog(null, "login Success!");
                    //System.out.print("dang nhap thanh cong!");
                    new Loading(textField.getText()).setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Login or Password!");

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if(ae.getSource() == b2){
            setVisible(false);
            Signup su = new Signup();
            su.setVisible(true);
        }
        if(ae.getSource() == b3){
            setVisible(false);
            ForgotPassword forgot = new ForgotPassword();
            forgot.setVisible(true);
        }
    }
    public static void main(String[] args) {

        new Login().setVisible(true);
    }

}
