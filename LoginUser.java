package my_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginUser extends JFrame {
    JTextField email,t2,num;
    JTextPane t1;
    private JPasswordField password1;
    private JButton loginbtn,create,otp;
    private JLabel l1,l2,l3,l4,l5,l6,l7;

    public LoginUser(){
        l1 = new JLabel("Login");
        l1.setForeground(Color.MAGENTA);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 70));
        l1.setBounds(400,30,250,80);

        l2 = new JLabel(" Email : ");
        l2.setForeground(Color.green);
        l2.setFont(new Font("Arial", Font.PLAIN, 31));
        l2.setBounds(180, 145, 280, 52);

        l3 =new JLabel(" Password  : ");
        l3.setForeground(Color.green);
        l3.setFont(new Font("Arial", Font.PLAIN, 31));
        l3.setBounds(180, 215, 220, 52);

        l7 =new JLabel(" Mobile No.  : ");
        l7.setForeground(Color.green);
        l7.setFont(new Font("Arial", Font.PLAIN, 31));
        l7.setBounds(180, 280, 220, 52);

        l4 = new JLabel("Don't have account ?  ");
        l4.setForeground(Color.darkGray);
        l4.setFont(new Font("Arial", Font.PLAIN, 31));
        l4.setBounds(50, 790, 350, 52);


        l5 = new JLabel("Here Your Generated OTP -> ");
        l5.setBounds(160, 400, 450, 52);
        l5.setForeground(Color.yellow);
        l5.setFont(new Font("Arial", Font.PLAIN, 31));

        l6 =new JLabel("Fill Generated OTP here -> ");
        l6.setBounds(160, 510, 450, 52);
        l6.setForeground(Color.yellow);
        l6.setFont(new Font("Arial", Font.PLAIN, 31));

        email = new JTextField();
        email.setBounds(360,152,300,40);
        email.setForeground(Color.white);
        email.setFont(new Font("Arial", Font.BOLD, 31));
        email.setBackground(Color.black);

        password1 = new JPasswordField();
        password1.setBounds(360,220,300,40);
        password1.setForeground(Color.white);
        password1.setFont(new Font("Arial", Font.BOLD, 31));
        password1.setBackground(Color.black);

        num = new JTextField();
        num.setBounds(360,280,300,40);
        num.setForeground(Color.white);
        num.setFont(new Font("Arial", Font.BOLD, 31));
        num.setBackground(Color.black);

        t1 = new JTextPane();
        t1.setBounds(590,410,150,50);
        t1.setFont(new Font("Arial",Font.BOLD,25));
        t1.setBackground(Color.black);
        t1.setForeground(Color.white);

        t2 = new JTextField();
        t2.setBounds(560,520,150,40);
        t2.setFont(new Font("Arial",Font.BOLD,25));
        t2.setBackground(Color.black);
        t2.setForeground(Color.white);


        create = new JButton("Create");
        create.setForeground(Color.blue);
        create.setFont(new Font("Arial", Font.BOLD, 27));
        create.setBounds(360, 790, 120, 50);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ragistration();
            }
        });


        final String b = OneTime.generateOTP(6);
        otp = new JButton(" Generate OTP ");
        otp.setForeground(Color.blue);
        otp.setFont(new Font("Arial", Font.BOLD, 28));
        otp.setBounds(700,300,240,60);
        otp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = email.getText();
                String password = password1.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aniket", "root", "Aniket@#369786");
                    PreparedStatement st = connection.prepareStatement("Select email, password from login where email=? and password=?");
                    st.setString(1, userName);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        t1.setText(b);
                        t1.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Data already Existed");
                }catch (ClassNotFoundException cnf){
                    System.out.println("Class not found");
                }
            }
        });


        loginbtn = new JButton(" Login ");
        loginbtn.setForeground(Color.blue);
        loginbtn.setFont(new Font("Arial", Font.BOLD, 32));
        loginbtn.setBounds(750,600,150,60);
        loginbtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                int f = Integer.valueOf(b);
                t1.setText(s);
                String s1 = t2.getText();
                int g = Integer.valueOf(s1);
                t2.setText(s1);

                if (f == g) {
                    String userName = email.getText();
                    String password = password1.getText();
                    String nume = num.getText();
                    try {
                        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/aniket", "root", "Aniket@#369786");
                        PreparedStatement st =connection.prepareStatement("Select email, password from login where email=? and password=?");
                        st.setString(1, userName);
                        st.setString(2, password);
                        ResultSet rs = st.executeQuery();
                        if (rs.next()) {
//                            Form fr = new Form();
//                            fr.setVisible(true);
                            FinalForm ff = new FinalForm(nume);
                            ff.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong Username & Password");
                        }
                    } catch (SQLException sqlException) {
                        sqlException.printStackTrace();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(loginbtn, " Wrong OTP Entered ");


                }
            }
        });

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);

        add(email);
        add(password1);
        add(t1);
        add(t2);
        add(num);


        add(loginbtn);
        add(create);
        add(otp);

        setBounds(400,20,1000,1000);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.black);

    }

    public static void main(String[] args) {
        new LoginUser();
    }
}
