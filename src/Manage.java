import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Manage {
    public Manage() {

        JFrame j6 = new JFrame("Manage");

        JButton ex = new JButton("Exit");
        ex.setBounds(0, 0, 300, 250);

        JButton di = new JButton("Driver Info");
        di.setBounds(300, 250, 300, 250);


        j6.add(ex);
        j6.add(di);
        j6.setSize(600, 500);
        j6.setLayout (null)  ;
        j6.setVisible(true);


        di.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e7) {


                Driver d2 = new Driver();
            }
        });

    }
}