import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cabinfo {
    public  Cabinfo()
    {
        Aarthi ar = null;
        Driver2 s1= new Driver2("mahesh","TSO36726","6756576889");
        Driver2 s2= new Driver2("rajesh","TSOEA6732","6756768809");
        Driver2 s3= new Driver2("likith","TSO45435","6789787990");
        Driver2 s4= new Driver2("mayank","TSO45598","6008976889");
        Driver2 s5= new Driver2("mateen","TSO362126","6713244235");
        Driver2 s6= new Driver2("mathak","TSO334306","6706576889");
       
        List<Driver2> list = new ArrayList<Driver2>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        int s = list.size();
        Random r = new Random();
        int p = r.nextInt();



     try
     {
     FileInputStream fileIn = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\user2.ser");
     ObjectInputStream in = new ObjectInputStream(fileIn);
     ar = (Aarthi) in.readObject();
     in.close();
     fileIn.close();
     }
     catch(IOException i){
     i.printStackTrace();
     return;
     }catch(ClassNotFoundException c)
     {
     System.out.println("joe class not found");
     c.printStackTrace();
     return;
     }


        JFrame j4 = new JFrame("CabInfo");
        String x=ar.p;
        String y=ar.vt;
        JLabel pl = new JLabel("pickup Location");
        JLabel pl1 = new JLabel();
        pl.setBounds(10,50,200,30);
        pl1.setBounds(150,50,200,30);

        JLabel cd = new JLabel("Cab Driver Name");
        cd.setBounds(10,100,200,30);
        JLabel cd1 = new JLabel();
        cd1.setBounds(150,100,200,30);

        //
        JLabel cn11 = new JLabel();
        JLabel cn1 = new JLabel("cab no :");
         cn11.setBounds(150,150,200,30);
          cn1.setBounds(10,150,200,30);

        JLabel cm = new JLabel("CAB MODEL");
          cm.setBounds(10,200,100,30);
        JLabel cm1 = new JLabel();
           cm1.setBounds(150,200,100,30);

        JButton cn2 = new JButton("confirm");
            cn2.setBounds(100,400,110,50);

        JButton ed = new JButton("edit");
             ed.setBounds(350,400,110,50);

             j4.add(pl);
             j4.add(pl1);
             j4.add(cd);
             j4.add(cd1);
             j4.add(cn11);
             j4.add(cn1);
             j4.add(cm);
             j4.add(cm1);
             j4.add(cn2);
             j4.add(ed);
             j4.setSize(600,500);
             j4.setLayout(null);
             j4.setVisible(true);
             pl1.setText(x);
             cn11.setText(list.get(p).numplate);
             cd1.setText(list.get(p).drivername);
             cm1.setText(y);
             cn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e3) {

            JOptionPane.showMessageDialog(j4,"your cab will arrive shortly"+" "+" please wait..");
            Manage m1 = new Manage();
            Driver2 d8= new Driver2(list.get(p).drivername,list.get(p).numplate,list.get(p).telno);
            try
            {
                FileOutputStream fileOut = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\user5.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(d8);
                out.close();
            }catch(IOException i)
            {
                i.printStackTrace();
            }
        }
    });

               ed.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e4) {
            Bookings b3 = new Bookings();

        }
    });
    }
}