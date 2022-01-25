package quanlidulich;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.net.URI;

public class Home extends JFrame{
    String username;
    public static void main(String[] args) {
        new Home("").setVisible(true);
    }

    public Home(String username) {
        super("Travel and Tourism Management System");
        this.username = username;
        setForeground(Color.CYAN);
        setLayout(null);
        String Temp= "admin" ;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

        JLabel l1 = new JLabel("< Welcome >");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
        l1.setBounds(800, 60, 1000, 100);
        NewLabel.add(l1);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        if (username.equals("admin") == true){
            JMenu m1 = new JMenu("INFORMATION");
            m1.setForeground(Color.BLUE);
            menuBar.add(m1);

            JMenuItem mi1 = new JMenuItem("REGISTER PERSONAL INFORMATION");
            m1.add(mi1);

            JMenuItem mi2 = new JMenuItem("UPDATE PERSONAL INFORMATION");
            m1.add(mi2);

            JMenuItem mi3 = new JMenuItem("VIEW ALL CUSTOMERS");
            m1.add(mi3);

            JMenuItem mi4 = new JMenuItem("DELETE CUSTOMER");
            m1.add(mi4);

            mi1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        new AddCustomer(username).setVisible(true);
                    }catch(Exception e ){}
                }
            });

            mi2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        new UpdateCustomer(username).setVisible(true);
                    }catch(Exception e ){}
                }
            });

            mi3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                        try {
                            new ViewCustomers().setVisible(true);
                        } catch (Exception e) {
                        }
                }
            });

            mi4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        new DeleteCustomer().setVisible(true);
                    }catch(Exception e ){}
                }
            });
        } else {
            JMenu m1 = new JMenu("INFORMATION");
            m1.setForeground(Color.BLUE);
            menuBar.add(m1);

            JMenuItem mi1 = new JMenuItem("REGISTER PERSONAL INFORMATION");
            m1.add(mi1);

            JMenuItem mi2 = new JMenuItem("UPDATE PERSONAL INFORMATION");
            m1.add(mi2);

            mi1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        new AddCustomer(username).setVisible(true);
                    }catch(Exception e ){}
                }
            });

            mi2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        new UpdateCustomer(username).setVisible(true);
                    }catch(Exception e ){}
                }
            });
        }



        JMenu m2 = new JMenu("COMBO");
        m2.setForeground(Color.BLUE);
        menuBar.add(m2);

        JMenuItem mi6 = new JMenuItem("VIEW COMBO");
        m2.add(mi6);

        JMenuItem mi7 = new JMenuItem("BOOK COMBO");
        m2.add(mi7);

        JMenuItem mi5 = new JMenuItem("VIEW BOOKED COMBO");
        m2.add(mi5);

        JMenuItem mi17 = new JMenuItem("DELETE COMBO");
        m2.add(mi17);


        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckPackage(username).setVisible(true);
                }catch(Exception e ){}
            }
        });


        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookPackage(username).setVisible(true);
                }catch(Exception e ){}
            }
        });


        mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewAdCombo(username).setVisible(true);
                }catch(Exception e ){}

            }
        });

        mi17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeletePackage(username).setVisible(true);
                }catch(Exception e ){}

            }
        });

        //if(username.equals("admin") == true) {
            JMenu m3 = new JMenu("HOTELS");
            m3.setForeground(Color.BLUE);
            menuBar.add(m3);

            JMenuItem mi8 = new JMenuItem("BOOK HOTELS");
            m3.add(mi8);

            JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
            m3.add(mi9);

            JMenuItem mi10 = new JMenuItem("VIEW BOOKED HOTEL");
            m3.add(mi10);

            JMenuItem mi18 = new JMenuItem("DELETE BOOKED HOTEL");
            m3.add(mi18);

            mi8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    new BookHotel(username).setVisible(true);
                }
            });

            mi9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        new CheckHotels().setVisible(true);
                    } catch (Exception e) {
                    }
                }
            });

            mi10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        new ViewAdHotel(username).setVisible(true);
                    } catch (Exception e) {
                    }
                }
            });

            mi18.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        new DeleteHotel(username).setVisible(true);
                    } catch (Exception e) {
                    }
                }
            });
        /*}else{
            JMenu m3 = new JMenu("HOTELS");
            m3.setForeground(Color.BLUE);
            menuBar.add(m3);

            JMenuItem mi8 = new JMenuItem("BOOK HOTELS");
            m3.add(mi8);

            JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
            m3.add(mi9);

            JMenuItem mi10 = new JMenuItem("VIEW BOOKED HOTEL");
            m3.add(mi10);

            mi8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    new BookHotel(username).setVisible(true);
                }
            });

            mi9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        new CheckHotels().setVisible(true);
                    } catch (Exception e) {
                    }
                }
            });

            mi10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        new ViewBookedHotel(username).setVisible(true);
                    } catch (Exception e) {
                    }
                }
            });
        }*/

        JMenu m4 = new JMenu("DESTINATION");
        m4.setForeground(Color.BLUE);
        menuBar.add(m4);

        JMenuItem mi11 = new JMenuItem("VIEW DESTINATION");
        m4.add(mi11);

        JMenuItem mi20 = new JMenuItem("VIEW BOOKED DESTINATION");
        m4.add(mi20);

        JMenuItem mi21 = new JMenuItem("DELETE BOOKED DESTINATION");
        m4.add(mi21);

        mi11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new bookPlace(username).setVisible(true);

            }
        });

        mi20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new ViewAdDes(username).setVisible(true);
                }catch (Exception e){}

            }
        });

        mi21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new DeleteDestination(username).setVisible(true);
                }catch (Exception e){}

            }
        });


        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.BLUE);
        menuBar.add(m5);

        JMenuItem mi12 = new JMenuItem("PAY USING VNPAY");
        m5.add(mi12);

        mi12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    String url = "https://sandbox.vnpayment.vn/paymentv2/vpcpay.html?vnp_Amount=1806000&vnp_Command=pay&vnp_CreateDate=20210801153333&vnp_CurrCode=VND&vnp_IpAddr=127.0.0.1&vnp_Locale=vn&vnp_OrderInfo=Thanh+toan+don+hang+%3A5&vnp_OrderType=other&vnp_ReturnUrl=https%3A%2F%2Fdomainmerchant.vn%2FReturnUrl&vnp_TmnCode=DEMOV210&vnp_TxnRef=5&vnp_Version=2.1.0&vnp_SecureHash=3e0d61a0c0534b2e36680b3f7277743e8784cc4e1d68fa7d276e79c23be7d6318d338b477910a27992f5057bb1582bd44bd82ae8009ffaf6d141219218625c42";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        Desktop.getDesktop().browse(new URI(url));
                    }
                }catch (Exception e){};
                //new Payment().setVisible(true);
            }
        });

        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.BLUE);
        menuBar.add(m6);

        JMenuItem mi13 = new JMenuItem("NOTEPAD");
        m6.add(mi13);

        JMenuItem mi14 = new JMenuItem("CALCULATOR");
        m6.add(mi14);

        mi13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
        });

        mi14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
        });

        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.BLUE);
        menuBar.add(m7);

        JMenuItem mi15 = new JMenuItem("ABOUT");
        m7.add(mi15);

        mi15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new About().setVisible(true);
            }
        });

        JMenu m8 = new JMenu("LOGOUT");
        m8.setForeground(Color.BLUE);
        menuBar.add(m8);

        JMenuItem mi16 = new JMenuItem("LOGOUT");
        m8.add(mi16);

        mi16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Login().setVisible(true);
            }

        });





        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
