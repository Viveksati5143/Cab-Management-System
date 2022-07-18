//import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Register{
    public Register() {
        JFrame j2 = new JFrame("Registration");
        JLabel un = new JLabel("Username");
        JTextField un1 = new JTextField();
        un.setBounds(10, 50, 200, 30);
        un1.setBounds(150, 50, 200, 30);

        JPasswordField pwd = new JPasswordField();
        JLabel p = new JLabel("Password");
        pwd.setBounds(150, 100, 200, 30);
        p.setBounds(10, 100, 200, 30);

        JPasswordField pw = new JPasswordField();
        JLabel pp = new JLabel("confirm");
        pw.setBounds(150, 150, 200, 30);
        pp.setBounds(10, 150, 200, 30);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(10, 250, 200, 30);

        JRadioButton r1 = new JRadioButton("A, Male");
        JRadioButton r2 = new JRadioButton("B , Female");
        r1.setBounds(150, 250, 100, 30);
        r2.setBounds(270, 250, 200, 30);

        JLabel tele = new JLabel("Telephone no");
        tele.setBounds(10, 300, 100, 40);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 300, 175, 40);

        JButton s1 = new JButton("Register");
        s1.setBounds(100, 400, 110, 50);
        j2.add(un);
        j2.add(un1);
        j2.add(p);
        j2.add(pw);
        j2.add(pwd);
        j2.add(pp);
        j2.add(gender);
        j2.add(r1);
        j2.add(r2);
        j2.add(tele);
        j2.add(t1);
        j2.add(s1);
        j2.setSize(500, 500);
        j2.setLayout(null);
        j2.setVisible(true);

        s1.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e1) {
                                     char[] password = pwd.getPassword();
                                     char[] cpassword = pw.getPassword();

                                     if (!(Arrays.equals(password, cpassword))) {
                                         JOptionPane.showMessageDialog(j2, "password not Same!");
                                     } else {
                                         JOptionPane.showMessageDialog(j2, "password Okay!");
                                         Bookings b1 = new Bookings();
                                     }
                                     joe v = new joe(un1.getText(), pwd.getText(), gender.getText());
                                     String x = un1.getText();
                                     System.out.println(x);
                                 }
                             }
        );
        s1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e8) {
                joe v = new joe(un1.getText(), pwd.getText(), gender.getText());
                try {
                    FileOutputStream fileOut = new FileOutputStream("");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(v);
                    out.close();
                } catch ( IOException i) {
                    i.printStackTrace();
                }
                String x = un1.getText();
                System.out.println(x);


            }

        });


    }   }