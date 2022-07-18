import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.*;
public class Bookings{
    public Bookings(){
        JFrame j3 = new JFrame("Bookings");
        JLabel pl  = new JLabel("pickup Location");
        JTextField pl1 = new JTextField();
        pl.setBounds(10,50,200,30);
        pl1.setBounds(150,50,200,30);

        JTextField dl1 = new JTextField();
        JLabel dl = new JLabel("drop Location");
        dl1.setBounds(150,100,200,30);
        dl.setBounds(10,100,200,30);

        Integer passengers[] ={1,2,3,4,5,6};
        JComboBox<?> np1 = new JComboBox<Object>(passengers);
        JLabel np = new JLabel("no of passengers");
        np1.setBounds(150,150,200,30);
        np1.setBounds(10,150,200,30);

        JLabel vt = new JLabel("vehicle type");
        vt.setBounds(10,250,200,30);
        String models[] = {"Mini","Sedan","Maxi","Micro","Prime"};
        JComboBox<?> m = new JComboBox<Object>(models);
        m.setBounds(150,250,150,30);

        JButton cn = new JButton("confirm");
        cn.setBounds(100,400,110,50);

        JButton ca = new JButton("cancel");
        ca.setBounds(300,400,110,50);

        j3.add(pl);
        j3.add(pl1);
        j3.add(dl);
        j3.add(dl1);
        j3.add(np);
        j3.add(np1);
        j3.add(vt);
        j3.add(m);

        j3.add(cn);
        j3.add(ca);
        j3.setSize(600,500);
        j3.setLayout(null);
        j3.setVisible(true);

        cn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
                Aarthi ar = new Aarthi(pl1.getText(),dl.getText(),np1.getSelectedItem().toString(),m.getSelectedItem().toString());
                try{
                    FileOutputStream fileOut = new FileOutputStream("");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(ar);
                    out.close();
                }catch(IOException i)
                {
                    i.printStackTrace();
                }
                String x= pl1.getText();
                System.out.println(x);

                JOptionPane.showMessageDialog(j3,"checking for near by cabs"+" please wait");
                Cabinfo ci = new Cabinfo();
            }
        });
    ca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e5) {
            JOptionPane.showMessageDialog(j3,"do u want to exit");
            System.exit(0);

        }
    });
    }
}