package my_Project;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class FinalForm extends JFrame {
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextPane tp1,tp2,tp3,tp4,tp5,tp6,tp7,tp8,tp9,tp10,tp11,tp12,tp13;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;



    public FinalForm(String nume) {
        l = new JLabel("STUDENT REGISTRATION FORM");
        l.setForeground(Color.CYAN);
        l.setFont(new Font("Times New Roman", Font.BOLD, 42));
        l.setBounds(150, 10, 900, 60);

        l1 = new JLabel("First Name : ");
        l1.setBounds(40, 100, 170, 30);
        l1.setForeground(Color.yellow);
        l1.setFont(new Font("Arial", Font.BOLD, 25));

        l2 = new JLabel("Last Name : ");
        l2.setBounds(40, 160, 170, 30);
        l2.setForeground(Color.yellow);
        l2.setFont(new Font("Arial", Font.BOLD, 25));

        l3 = new JLabel("Date of Birth : ");
        l3.setBounds(40, 220, 170, 30);
        l3.setForeground(Color.yellow);
        l3.setFont(new Font("Arial", Font.BOLD, 25));

        l4 = new JLabel("Email : ");
        l4.setBounds(40, 280, 170, 30);
        l4.setForeground(Color.yellow);
        l4.setFont(new Font("Arial", Font.BOLD, 25));

        l5 = new JLabel("Mobile No. : ");
        l5.setBounds(40, 340, 170, 30);
        l5.setForeground(Color.yellow);
        l5.setFont(new Font("Arial", Font.BOLD, 25));

        l6 = new JLabel("Gender : ");
        l6.setBounds(40, 400, 170, 30);
        l6.setForeground(Color.yellow);
        l6.setFont(new Font("Arial", Font.BOLD, 25));

        l7 = new JLabel("Address : ");
        l7.setBounds(40, 460, 170, 30);
        l7.setForeground(Color.yellow);
        l7.setFont(new Font("Arial", Font.BOLD, 25));

        l8 = new JLabel("City : ");
        l8.setBounds(540, 100, 170, 30);
        l8.setForeground(Color.yellow);
        l8.setFont(new Font("Arial", Font.BOLD, 25));

        l9 = new JLabel("Pincode : ");
        l9.setBounds(540, 160, 170, 30);
        l9.setForeground(Color.yellow);
        l9.setFont(new Font("Arial", Font.BOLD, 25));

        l10 = new JLabel("State : ");
        l10.setBounds(540, 220, 170, 30);
        l10.setForeground(Color.yellow);
        l10.setFont(new Font("Arial", Font.BOLD, 25));

        l11 = new JLabel("Country : ");
        l11.setBounds(540, 280, 170, 30);
        l11.setForeground(Color.yellow);
        l11.setFont(new Font("Arial", Font.BOLD, 25));

        l12 = new JLabel("Hobbies : ");
        l12.setBounds(540, 340, 170, 30);
        l12.setForeground(Color.yellow);
        l12.setFont(new Font("Arial", Font.BOLD, 25));

        l13 = new JLabel("Course : ");
        l13.setBounds(540, 400, 170, 30);
        l13.setForeground(Color.yellow);
        l13.setFont(new Font("Arial", Font.BOLD, 25));


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/aniket";
            Connection con = DriverManager.getConnection(url, "root", "Aniket@#369786");
//            PreparedStatement pstm = con.prepareStatement("SELECT * FROM aniket.anikettable where Mobile_No=6307207120;" );
//            PreparedStatement pstm = con.prepareStatement("SELECT * FROM aniket.anikettable;" );
            Statement pstm = con.createStatement();
//            String num ="7013627502";
            String sql = ("SELECT * FROM aniket.anikettable where Mobile_No="+nume);
//            String sql = ("SELECT * FROM aniket.anikettable ORDER BY Mobile_No DESC LIMIT 1");
            ResultSet rs = pstm.executeQuery(sql);
            while (rs.next()) {
                 s1 = rs.getNString("First_Name");
                 s2 = rs.getNString("Second_Name");
                 s3 = rs.getNString("Date_of_Birth");
                 s4 = rs.getNString("Email");
                 s5 = rs.getNString("Mobile_No");
                 s6 = rs.getNString("Gender");
                 s7 = rs.getNString("Address");
                 s8 = rs.getNString("City");
                 s9 = rs.getNString("Pincode");
                 s10 = rs.getNString("State");
                 s11 = rs.getNString("Country");
                 s12 = rs.getNString("Hobbies");
                 s13 = rs.getNString("Course");

            }
        } catch (SQLException sqe) {
            System.out.println("Sql Error");
            JOptionPane.showMessageDialog(null, "Data already existed");

        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found Error");

        }


        tp1 = new JTextPane();
        tp1.setBounds(220, 100, 220, 35);
        tp1.setFont(new Font("Arial", Font.BOLD, 25));
        tp1.setBackground(Color.black);
        tp1.setForeground(Color.white);
        tp1.setText(s1);

        tp2 = new JTextPane();
        tp2.setBounds(220, 160, 220, 35);
        tp2.setFont(new Font("Arial", Font.BOLD, 25));
        tp2.setBackground(Color.black);
        tp2.setForeground(Color.white);
        tp2.setText(s2);

        tp3 = new JTextPane();
        tp3.setBounds(220, 220, 220, 35);
        tp3.setFont(new Font("Arial", Font.BOLD, 25));
        tp3.setBackground(Color.black);
        tp3.setForeground(Color.white);
        tp3.setText(s3);

        tp4 = new JTextPane();
        tp4.setBounds(220, 280, 220, 35);
        tp4.setFont(new Font("Arial", Font.BOLD, 25));
        tp4.setBackground(Color.black);
        tp4.setForeground(Color.white);
        tp4.setText(s4);

        tp5 = new JTextPane();
        tp5.setBounds(220, 340, 220, 35);
        tp5.setFont(new Font("Arial", Font.BOLD, 25));
        tp5.setBackground(Color.black);
        tp5.setForeground(Color.white);
        tp5.setText(s5);

        tp6 = new JTextPane();
        tp6.setBounds(220, 400, 70, 30);
        tp6.setFont(new Font("Arial", Font.BOLD, 20));
        tp6.setBackground(Color.black);
        tp6.setForeground(Color.white);
        tp6.setText(s6);

        tp7 = new JTextPane();
        tp7.setBounds(220, 460, 310, 35);
        tp7.setFont(new Font("Arial", Font.BOLD, 25));
        tp7.setForeground(Color.white);
        tp7.setBackground(Color.black);
        tp7.setText(s7);

        tp8 = new JTextPane();
        tp8.setBounds(680, 100, 220, 35);
        tp8.setFont(new Font("Arial", Font.BOLD, 25));
        tp8.setBackground(Color.black);
        tp8.setForeground(Color.white);
        tp8.setText(s8);

        tp9 = new JTextPane();
        tp9.setBounds(680, 160, 220, 35);
        tp9.setFont(new Font("Arial", Font.BOLD, 25));
        tp9.setBackground(Color.black);
        tp9.setForeground(Color.white);
        tp9.setText(s9);

        tp10 = new JTextPane();
        tp10.setBounds(680, 220, 220, 35);
        tp10.setFont(new Font("Arial", Font.BOLD, 25));
        tp10.setBackground(Color.black);
        tp10.setForeground(Color.white);
        tp10.setText(s10);

        tp11 = new JTextPane();
        tp11.setBounds(680, 280, 220, 35);
        tp11.setFont(new Font("Arial", Font.BOLD, 23));
        tp11.setBackground(Color.black);
        tp11.setForeground(Color.white);
        tp11.setText(s11);

        tp12 = new JTextPane();
        tp12.setBounds(680, 340, 220, 35);
        tp12.setFont(new Font("Arial", Font.BOLD, 25));
        tp12.setBackground(Color.black);
        tp12.setForeground(Color.white);
        tp12.setText(s12);

        tp13 = new JTextPane();
        tp13.setBounds(700, 400, 100, 35);
        tp13.setFont(new Font("Arial", Font.BOLD, 25));
        tp13.setBackground(Color.black);
        tp13.setForeground(Color.white);
        tp13.setText(s13);


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

        add(tp1);
        add(tp2);
        add(tp3);
        add(tp4);
        add(tp5);
        add(tp6);
        add(tp7);
        add(tp8);
        add(tp9);
        add(tp10);
        add(tp11);
        add(tp12);
        add(tp13);


        setTitle("final Form ");
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.black);
        setBounds(450, 70, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
//        new FinalForm();
    }
}
