import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.registry.Registry;
import java.util.Random;

public class User
{
    public static void main(String args[]) {
        Random r = new Random();
        JFrame j1 = new JFrame("UserLogin");

        JLabel un = new JLabel("UserName");
        un.setBounds(50,20,150,20);

        JTextField un1= new JTextField();
        un1.setBounds(200,20,150,20);

        JLabel pw = new JLabel("Password");
        pw.setBounds(50,50,150,20);

        JPasswordField pwi = new JPasswordField();
        pwi.setBounds(200,50,150,20);

        JButton s = new JButton("Login");
        s.setBounds(100,260,100,40);

        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                joe v = null;

                try{
                    FileInputStream fileIn = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\user1.ser");
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    v = (joe) in.readObject();
                    in.close();
                    fileIn.close();
                }
                catch (IOException i){
                    i.printStackTrace();
                    return;
                } catch (ClassNotFoundException c)
                {
                    System.out.println("joe class not found");
                    c.printStackTrace();
                    return;
                }
                String y= pwi.getText();
                String z = v.pass;

                if(y.compareTo(z)==0) {
                    JOptionPane.showMessageDialog(j1, "Welcome");
                    Bookings b = new Bookings();
                }else{
                    JOptionPane.showMessageDialog(j1,"Enter valid Details");
                }
                }
            }
        );
        JButton c = new JButton("Register");
        c.setBounds(250,260,100,40);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register r = new Register();
            }
        });
        j1.add(un);
        j1.add(un1);
        j1.add(pw);
        j1.add(pwi);
        j1.add(s);
        j1.add(c);

        j1.setSize(500,500);
        j1.setLayout(null);
        j1.setVisible(true);
    }
}