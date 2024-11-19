package my_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Form extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t8,t9,t10,t11,t12;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton b1,b2,b3;
    JTextArea ta;
    JRadioButton rb1,rb2,rb3,rb4,rb5,rb6;
    ButtonGroup bg1,bg2;
    String[] str = {"SELECT COUNTRY", "United States", "United Kingdom", "France", "Italy", "India", "Germany", "Australia", "Russia", "China", "Japan"};
    JComboBox cb;

    public Form()
    {
        l = new JLabel("STUDENT REGISTRATION FORM");
        l.setForeground(Color.CYAN);
        l.setFont(new Font("Times New Roman",Font.BOLD,42));
        l.setBounds(150,10,900,60);

        l1 =new JLabel("First Name : ");
        l1.setBounds(40,100,170,30);
        l1.setForeground(Color.yellow);
        l1.setFont(new Font("Arial",Font.BOLD,25));

        l2 =new JLabel("Last Name : ");
        l2.setBounds(40,160,170,30);
        l2.setForeground(Color.yellow);
        l2.setFont(new Font("Arial",Font.BOLD,25));

        l3 =new JLabel("Date of Birth : ");
        l3.setBounds(40,220,170,30);
        l3.setForeground(Color.yellow);
        l3.setFont(new Font("Arial",Font.BOLD,25));

        l4 =new JLabel("Email : ");
        l4.setBounds(40,280,170,30);
        l4.setForeground(Color.yellow);
        l4.setFont(new Font("Arial",Font.BOLD,25));

        l5 =new JLabel("Mobile No. : ");
        l5.setBounds(40,340,170,30);
        l5.setForeground(Color.yellow);
        l5.setFont(new Font("Arial",Font.BOLD,25));

        l6 =new JLabel("Gender : ");
        l6.setBounds(40,400,170,30);
        l6.setForeground(Color.yellow);
        l6.setFont(new Font("Arial",Font.BOLD,25));

        l7 =new JLabel("Address : ");
        l7.setBounds(40,460,170,30);
        l7.setForeground(Color.yellow);
        l7.setFont(new Font("Arial",Font.BOLD,25));

        l8 =new JLabel("City : ");
        l8.setBounds(540,100,170,30);
        l8.setForeground(Color.yellow);
        l8.setFont(new Font("Arial",Font.BOLD,25));

        l9 =new JLabel("Pincode : ");
        l9.setBounds(540,160,170,30);
        l9.setForeground(Color.yellow);
        l9.setFont(new Font("Arial",Font.BOLD,25));

        l10 =new JLabel("State : ");
        l10.setBounds(540,220,170,30);
        l10.setForeground(Color.yellow);
        l10.setFont(new Font("Arial",Font.BOLD,25));

        l11 =new JLabel("Country : ");
        l11.setBounds(540,280,170,30);
        l11.setForeground(Color.yellow);
        l11.setFont(new Font("Arial",Font.BOLD,25));

        l12 =new JLabel("Hobbies : ");
        l12.setBounds(540,340,170,30);
        l12.setForeground(Color.yellow);
        l12.setFont(new Font("Arial",Font.BOLD,25));

        l13 =new JLabel("Course : ");
        l13.setBounds(540,400,170,30);
        l13.setForeground(Color.yellow);
        l13.setFont(new Font("Arial",Font.BOLD,25));



        //TextField
        t1 = new JTextField();
        t1.setBounds(220,100,220,35);
        t1.setFont(new Font("Arial",Font.BOLD,25));
        t1.setBackground(Color.black);
        t1.setForeground(Color.white);

        t2 = new JTextField();
        t2.setBounds(220,160,220,35);
        t2.setFont(new Font("Arial",Font.BOLD,25));
        t2.setBackground(Color.black);
        t2.setForeground(Color.white);

        t3 = new JTextField();
        t3.setBounds(220,220,220,35);
        t3.setFont(new Font("Arial",Font.BOLD,25));
        t3.setBackground(Color.black);
        t3.setForeground(Color.white);

        t4 = new JTextField();
        t4.setBounds(220,280,220,35);
        t4.setFont(new Font("Arial",Font.BOLD,25));
        t4.setBackground(Color.black);
        t4.setForeground(Color.white);


        t5 = new JTextField();
        t5.setBounds(220,340,220,35);
        t5.setFont(new Font("Arial",Font.BOLD,25));
        t5.setBackground(Color.black);
        t5.setForeground(Color.white);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(220, 400, 70, 30);
        rb1.setFont(new Font("Arial", Font.BOLD, 20));
        rb1.setBackground(Color.black);
        rb1.setForeground(Color.white);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(300, 400, 100, 30);
        rb2.setFont(new Font("Arial", Font.BOLD, 20));
        rb2.setBackground(Color.black);
        rb2.setForeground(Color.white);
        rb3 = new JRadioButton("Others");
        rb3.setBounds(410, 400, 100, 30);
        rb3.setFont(new Font("Arial", Font.BOLD, 20));
        rb3.setBackground(Color.black);
        rb3.setForeground(Color.white);
        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);

        ta = new JTextArea();
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        ta.setBackground(Color.lightGray);
        ta.setBounds(220, 460, 310, 150);
        ta.setFont(new Font("Arial", Font.BOLD, 25));
        ta.setForeground(Color.black);

        t8 = new JTextField();
        t8.setBounds(680,100,220,35);
        t8.setFont(new Font("Arial",Font.BOLD,25));
        t8.setBackground(Color.black);
        t8.setForeground(Color.white);

        t9 = new JTextField();
        t9.setBounds(680,160,220,35);
        t9.setFont(new Font("Arial",Font.BOLD,25));
        t9.setBackground(Color.black);
        t9.setForeground(Color.white);

        t10 = new JTextField();
        t10.setBounds(680,220,220,35);
        t10.setFont(new Font("Arial",Font.BOLD,25));
        t10.setBackground(Color.black);
        t10.setForeground(Color.white);

        cb = new JComboBox(str);
        cb.setBounds(680, 280, 220, 35);
        cb.setFont(new Font("Arial", Font.BOLD, 23));
        cb.setBackground(Color.black);
        cb.setForeground(Color.white);

        t12 = new JTextField();
        t12.setBounds(680,340,220,35);
        t12.setFont(new Font("Arial",Font.BOLD,25));
        t12.setBackground(Color.black);
        t12.setForeground(Color.white);

        rb4 = new JRadioButton("BCA");
        rb4.setBounds(700, 400, 100, 35);
        rb4.setFont(new Font("Arial", Font.BOLD, 25));
        rb4.setBackground(Color.black);
        rb4.setForeground(Color.white);
        rb5 = new JRadioButton("B.TECH");
        rb5.setBounds(700, 460, 140, 35);
        rb5.setFont(new Font("Arial", Font.BOLD, 25));
        rb5.setBackground(Color.black);
        rb5.setForeground(Color.white);
        rb6 = new JRadioButton("Diploma");
        rb6.setBounds(700, 520, 150, 35);
        rb6.setFont(new Font("Arial", Font.BOLD, 25));
        rb6.setBackground(Color.black);
        rb6.setForeground(Color.white);
        bg2 = new ButtonGroup();
        bg2.add(rb4);
        bg2.add(rb5);
        bg2.add(rb6);

        b1 = new JButton("Submit");
        b1.setForeground(Color.blue);
        b1.setBounds(520,660,150,50);
        b1.setFont(new Font("Arial", Font.BOLD, 30));
        b2 = new JButton("Exit");
        b2.setForeground(Color.blue);
        b2.setBounds(680,660,110,50);
        b2.setFont(new Font("Arial", Font.BOLD, 30));
        b3 = new JButton("Reset");
        b3.setForeground(Color.blue);
        b3.setBounds(800,660,130,50);
        b3.setFont(new Font("Arial", Font.BOLD, 30));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ev) {
//                String str = ev.getActionCommand();
//
//                    String s1 = t1.getText();
//                    String s2 = t2.getText();
//                    String s3 = t3.getText();
//                    String s4 = t4.getText();
//                    String s5 = t5.getText();
//                    String s6 = "";
//                    if (rb1.isSelected()) s6 = "Male";
//                    else if (rb2.isSelected()) s6 = "Female";
//                    else if (rb3.isSelected()) s6 = "Others";
//                    String s7 = ta.getText();
//                    String s8 = t8.getText();
//                    String s9 = t9.getText();
//                    String s10 = t10.getText();
//                    String s11 = String.valueOf(cb.getItemAt(cb.getSelectedIndex()));
//                    String s12 = t12.getText();
//                    String s13 = "";
//                    if (rb4.isSelected()) s13 = "BCA";
//                    else if (rb5.isSelected()) s13 = "B.TECH";
//                    else if (rb6.isSelected()) s13 = "Diploma";
//
//                    try {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
//                        String url = "jdbc:mysql://localhost:3306/aniket";
//                        Connection con = DriverManager.getConnection(url,"root","Aniket@#369786");
//                        PreparedStatement pstm = con.prepareStatement("INSERT INTO anikettable(First_Name,Second_Name,Date_of_Birth,Email,Mobile_No,Gender,Address,City,Pincode,State,Country,Hobbies,Course)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
//                        pstm.setString(1,s1);
//                        pstm.setString(2,s2);
//                        pstm.setString(3,s3);
//                        pstm.setString(4,s4);
//                        pstm.setString(5,s5);
//                        pstm.setString(6,s6);
//                        pstm.setString(7,s7);
//                        pstm.setString(8,s8);
//                        pstm.setString(9,s9);
//                        pstm.setString(10,s10);
//                        pstm.setString(11,s11);
//                        pstm.setString(12,s12);
//                        pstm.setString(13,s13);
//                        pstm.executeUpdate();
//                        JOptionPane.showMessageDialog(null,"Registration Successful");
//                        con.close();
//
//                    }
//                    catch (SQLException sqe){
//                        System.out.println("Sql Error");
//                        JOptionPane.showMessageDialog(null,"Data already Existed");
//                    }
//                    catch (ClassNotFoundException cnf){
//                        System.out.println("Class not found Error");
//                    }
//
//            }
//        });
//
//
//
//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int i = JOptionPane.showConfirmDialog(null,"Are you sure want to Exit ?");
//                if (i == JOptionPane.YES_OPTION)
//                    dispose();
//
//            }
//        });
//        b3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                t1.setText("");
//                t2.setText("");
//                t3.setText("");
//                t4.setText("");
//                t5.setText("");
//                ta.setText("");
//                rb1.setText("");
//                rb2.setText("");
//                rb3.setText("");
//                t8.setText("");
//                t9.setText("");
//                t10.setText("");
//                t11.setText("");
//                t12.setText("");
//                rb4.setText("");
//                rb5.setText("");
//                rb6.setText("");
//                JOptionPane.showMessageDialog(null,"Input Fields Are Reset","Alert",JOptionPane.WARNING_MESSAGE);
//
//            }
//        });


        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(rb1);
        add(rb2);
        add(rb3);
        add(ta);
        add(t8);
        add(t9);
        add(t10);
        add(cb);
        add(t12);
        add(rb4);
        add(rb5);
        add(rb6);

        add(b1);
        add(b2);
        add(b3);

        setTitle("Ragistration Form ");
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.black);
        setBounds(450,70,1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

      public void actionPerformed(ActionEvent ev)
      {
        String str = ev.getActionCommand();
        if (str.equals("Submit")){
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            String s4 = t4.getText();
            String s5 = t5.getText();
            String s6 = "";
            if (rb1.isSelected()) s6 = "Male";
            else if (rb2.isSelected()) s6 = "Female";
            else if (rb3.isSelected()) s6 = "Others";
            String s7 = ta.getText();
            String s8 = t8.getText();
            String s9 = t9.getText();
            String s10 = t10.getText();
            String s11 = String.valueOf(cb.getItemAt(cb.getSelectedIndex()));
            String s12 = t12.getText();
            String s13 = "";
            if (rb4.isSelected()) s13 = "BCA";
            else if (rb5.isSelected()) s13 = "B.TECH";
            else if (rb6.isSelected()) s13 = "Diploma";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/aniket";
                Connection con = DriverManager.getConnection(url,"root","Aniket@#369786");
                PreparedStatement pstm = con.prepareStatement("INSERT INTO anikettable(First_Name,Second_Name,Date_of_Birth,Email,Mobile_No,Gender,Address,City,Pincode,State,Country,Hobbies,Course)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pstm.setString(1,s1);
                pstm.setString(2,s2);
                pstm.setString(3,s3);
                pstm.setString(4,s4);
                pstm.setString(5,s5);
                pstm.setString(6,s6);
                pstm.setString(7,s7);
                pstm.setString(8,s8);
                pstm.setString(9,s9);
                pstm.setString(10,s10);
                pstm.setString(11,s11);
                pstm.setString(12,s12);
                pstm.setString(13,s13);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null,"Registration Successful");
                con.close();

            }
            catch (SQLException sqe){
                System.out.println("Sql Error");
                JOptionPane.showMessageDialog(null,"Data already Existed");
            }
            catch (ClassNotFoundException cnf){
                System.out.println("Class not found Error");
            }

        } else if (str.equals("Exit")) {
            int i = JOptionPane.showConfirmDialog(this,"Are you sure want to Exit ?");
            if (i == JOptionPane.YES_OPTION)
            dispose();
        } else if (str.equals("Reset")) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            ta.setText("");
            rb1.setText("");
            rb2.setText("");
            rb3.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            rb4.setText("");
            rb5.setText("");
            rb6.setText("");
            JOptionPane.showMessageDialog(this,"Input Fields Are Reset","Alert",JOptionPane.WARNING_MESSAGE);
        }

      }

//    @Override
//    public void actionPerformed(ActionEvent ev) {
//
//    }
    public static void main(String[] args) {
        Form f =new Form();
    }
}
