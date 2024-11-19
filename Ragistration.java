package my_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Ragistration extends JFrame implements ActionListener {
     JTextField username,pass;
    JLabel l1,l2,l3,l4;
    public Ragistration(){
        l1 = new JLabel("Register");
        l1.setForeground(Color.green);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 60));
        l1.setBounds(350,30,250,80);

        l2 = new JLabel(" Email : ");
        l2.setForeground(Color.yellow);
        l2.setFont(new Font("Arial", Font.PLAIN, 31));
        l2.setBounds(150, 145, 280, 52);

        l3 =new JLabel(" Password  : ");
        l3.setForeground(Color.yellow);
        l3.setFont(new Font("Arial", Font.PLAIN, 31));
        l3.setBounds(150, 215, 220, 52);

        l4 = new JLabel("Goto Login Page ->  ");
        l4.setFont(new Font("Arial", Font.PLAIN, 31));
        l4.setBounds(50, 400, 350, 52);

        username = new JTextField();
        username.setBackground(Color.black);
        username.setForeground(Color.white);
        username.setBounds(360,152,300,40);
        username.setFont(new Font("Arial", Font.PLAIN, 31));

        pass = new JTextField();
        pass.setBackground(Color.black);
        pass.setForeground(Color.white);
        pass.setBounds(360,220,300,40);
        pass.setFont(new Font("Arial", Font.PLAIN, 31));

        JButton New = new JButton("Login Page");
        New.setForeground(Color.blue);
        New.setFont(new Font("Arial", Font.BOLD, 31));
        New.setBounds(350, 400, 210, 52);
        New.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginUser();
            }
        });

        JButton loginBtn = new JButton("Submit");
        loginBtn.setForeground(Color.blue);
        loginBtn.setFont(new Font("Arial", Font.BOLD, 31));
        loginBtn.setBounds(750,300,160,60);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/aniket";
                    Connection con = DriverManager.getConnection(url,"root","Aniket@#369786");
                    PreparedStatement pstm = con.prepareStatement("INSERT INTO login(email,password)VALUES(?,?)");
//
                    pstm.setString(1,username.getText());
                    pstm.setString(2,pass.getText());
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(pass,"Ragister Successfull");
                    con.close();

                }
                catch (SQLException sqe){
                    System.out.println("Sql Error");
                    JOptionPane.showMessageDialog(null,"Data already existed");

                }
                catch (ClassNotFoundException cnf){
                    System.out.println("Class not found Error");

                }
                Form f = new Form();
            }
        });
        add(username);
        add(pass);
        add(loginBtn);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(New);



        setTitle("Ragister Page");

        setBounds(400,200,1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.black);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ev) {

    }

    public static void main(String[] args) {
        Ragistration lg = new Ragistration();
    }
}

