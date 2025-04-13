package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textname,textFname,textEname,textaddress,textcity,textpin,textstate;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,r4,r5,r6;
    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first = " "+Math.abs(first4);
    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO:"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("PAGE 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(370,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("PERSONAL DETAILS:");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,120,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textname = new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(200,190,300,30);
        add(textname);

        JLabel labelName1 = new JLabel("Father's Name : ");
        labelName1.setFont(new Font("Raleway",Font.BOLD,20));
        labelName1.setBounds(100,240,300,30);
        add(labelName1);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(280,240,300,30);
        add(textFname);

        JLabel labelName2 = new JLabel("Date of Birth : ");
        labelName2.setFont(new Font("Raleway",Font.BOLD,20));
        labelName2.setBounds(100,290,300,30);
        add(labelName2);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(270,290,400,30);
        add(dateChooser);

        JLabel labelg = new JLabel("Gender : ");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,340,200,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(230,340,60,30);
        r1.setBackground(new Color(222,255,228));
        r1.setForeground(Color.green);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(300,340,90,30);
        r2.setBackground(new Color(222,255,228));
        r2.setForeground(Color.green);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(400,340,90,30);
        r3.setBackground(new Color(222,255,228));
        r3.setForeground(Color.green);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,380,100,40);
        add(email);

        textEname = new JTextField();
        textEname.setFont(new Font("Raleway",Font.BOLD,14));
        textEname.setBounds(200,385,500,30);
        add(textEname);

        JLabel mstatus = new JLabel("Maritial Status : ");
        mstatus.setFont(new Font("Raleway",Font.BOLD,20));
        mstatus.setBounds(100,430,200,40);
        add(mstatus);

        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(280,435,90,30);
        r4.setBackground(new Color(222,255,228));
        r4.setForeground(Color.red);
        add(r4);

        r5 = new JRadioButton("Unmarried");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBounds(380,435,100,30);
        r5.setBackground(new Color(222,255,228));
        r5.setForeground(Color.red);
        add(r5);

        r6 = new JRadioButton("Other");
        r6.setFont(new Font("Raleway",Font.BOLD,14));
        r6.setBounds(490,435,100,30);
        r6.setBackground(new Color(222,255,228));
        r6.setForeground(Color.red);
        add(r6);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);
        buttonGroup1.add(r6);


        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,485,100,30);
        add(address);

        textaddress = new JTextField();
        textaddress.setFont(new Font("Raleway",Font.BOLD,14));
        textaddress.setBounds(220,485,300,30);
        add(textaddress);

        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,530,100,30);
        add(city);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(220,530,300,30);
        add(textcity);

        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,580,100,30);
        add(pin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(200,580,200,30);
        add(textpin);

        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,630,100,30);
        add(state);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(220,630,200,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(500,700,90,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textname.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if(r2.isSelected())
        {
            gender = "Female";
        }
        else if(r3.isSelected())
        {
            gender = "Other";
        }
        String email = textEname.getText();
        String marriage = null;
        if(r4.isSelected())
        {
            marriage = "Married";
        } else if (r5.isSelected()) {
            marriage = "Unmarried";

        }
        else if(r6.isSelected())
        {
            marriage = "Other";
        }

        String address = textaddress.getText();
        String city = textcity.getText();
        String pin = textpin.getText();
        String state = textstate.getText();

        try{
            if(textname.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill All the Fields");
            }
            else
            {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marriage+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}