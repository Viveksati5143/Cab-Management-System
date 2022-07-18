import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Driver{
    public Driver(){

        JFrame j5 = new JFrame("Driver Info");

        Aarthi ar1 = null;

        try {
            FileInputStream fileIn = new FileInputStream("/home/natasha/Desktop/user2.set");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ar1 = (Aarthi) in.readObject();

            in.close();
            fileIn.close();
        }

        catch (IOException | ClassNotFoundException i){
            i.printStackTrace();
            return;
        }

        Driver2 d9 = null;
         try {
                FileInputStream fileIn = new FileInputStream("/home/natasha/Desktop/user5.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                d9 = (Driver2) in.readObject();
                in.close();
                fileIn.close();
            }
            catch (IOException i) {
                i.printStackTrace();
                return;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


            JLabel cdn = new JLabel("Cab Driver Name");
            cdn.setBounds(10,100,200,30);
            JLabel cd2 = new JLabel(d9.drivername);
            cd2.setBounds(150,100,200,30);


            JLabel cnp = new JLabel(d9.numplate);
            JLabel cnp1 = new JLabel("Cab no ");
            cnp.setBounds(150,150,200,30);
            cnp1.setBounds(10,150,200,30);



            JLabel cn1 = new JLabel("CAB MODEL");
            cn1.setBounds(10,100,200,30);
            JLabel cn3 = new JLabel();
            cn3.setBounds(150,200,100,30);


            JLabel tel = new JLabel("Driver telephone:");
            tel.setBounds(10,250,200,30);
            JLabel tel1 = new JLabel(d9.telno);
            tel1.setBounds(150,100,150,30);

            String y = ar1.vt;

            cn3.setBounds(100,400,110,50);

            JButton bc3 = new JButton("Back");
            bc3.setBounds(250,400,110,50);


            j5.add(cdn);
            j5.add(cd2);
            j5.add(cnp);
            j5.add(cnp1);
            j5.add(cn1);
            j5.add(cn3);
            j5.add(tel);
            j5.add(tel1);

            cn3.setText(y);
            j5.add(bc3);
            j5.setSize(600,500);
            j5.setLayout(null);
            j5.setVisible(true);


            bc3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e5) {
                    Manage m = new Manage();
                }});
    }

}