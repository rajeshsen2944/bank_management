package bank_management;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignUp_1 extends JFrame {
    SignUp_1(){
             
        setLayout(null);
        Random ran=new Random();
        JLabel formno =new JLabel("Application From No."+Math.abs(ran.nextInt(9999)));
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(120,20,600,40);
        add(formno);


//        JButton next = new JButton("Next");
//        add(next);
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
////        next.setFont(new Font("Rale way",Font.BOLD,14));
//        setBounds(400,550,100,20);


        JLabel personalDetail =new JLabel("Page No. 1: Personal Detail");
        personalDetail.setFont(new Font("Raleway",Font.BOLD,20));
        personalDetail.setBounds(240,70,300,30);
        add(personalDetail);

        JLabel name =new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,15));
        name.setBounds(80,120,300,30);
        add(name);

        JTextField nameTextField =new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,15));
        nameTextField.setBounds(250,120,200,23);
        add(nameTextField);



        JLabel fanme =new JLabel("Father name: ");
        fanme.setFont(new Font("Raleway",Font.BOLD,15));
        fanme.setBounds(80,150,300,30);
        add(fanme);

        JTextField fnameTextField =new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,15));
        fnameTextField.setBounds(250,150,200,23);
        add(fnameTextField);

        JLabel dob =new JLabel("Date Of Barth");
        dob.setFont(new Font("Raleway",Font.BOLD,15));
        dob.setBounds(80,180,300,30);
        add(dob);

        JDateChooser dateChooser=new JDateChooser();
        dateChooser.setBounds(250,180,150,23);
        add(dateChooser);

        JLabel gender =new JLabel("Gender");
        gender.setFont(new Font("Raleway",Font.BOLD,15));
        gender.setBounds(80,210,300,30);
        add(gender);

        JRadioButton male =new JRadioButton("male");
        male.setBounds(250,210,100,30);
        male.setBackground(Color.white);
        add(male);

        JRadioButton female =new JRadioButton("female");
        female.setBounds(350,210,100,30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email =new JLabel("Email: ");
        email.setFont(new Font("Raleway",Font.BOLD,15));
        email.setBounds(80,240,300,30);
        add(email);

        JTextField emailTextField =new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,15));
        emailTextField.setBounds(250,240,200,23);
        add(emailTextField);

        JLabel marital =new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,15));
        marital.setBounds(80,270,300,30);
        add(marital);

        JRadioButton marride =new JRadioButton("marride");
        marride.setBounds(250,270,100,30);
        marride.setBackground(Color.white);
        add(marride);

        JRadioButton unmarride =new JRadioButton("unmarride");
        unmarride.setBounds(350,270,100,30);
        unmarride.setBackground(Color.white);
        add(unmarride);

        ButtonGroup marrideGroup=new ButtonGroup();
        marrideGroup.add(marride);
        marrideGroup.add(unmarride);

        JLabel address =new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,15));
        address.setBounds(80,300,300,30);
        add(address);

        JTextField addressTextField =new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,15));
        addressTextField.setBounds(250,300,200,23);
        add(addressTextField);

        JLabel city =new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,15));
        city.setBounds(80,330,300,30);
        add(city);

        JTextField cityTextField =new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,15));
        cityTextField.setBounds(250,330,200,23);
        add(cityTextField);

        JLabel state =new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,15));
        state.setBounds(80,360,300,30);
        add(state);

        JTextField stateTextField =new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,15));
        stateTextField.setBounds(250,360,200,23);
        add(stateTextField);

        JLabel pinCode =new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Rale way",Font.BOLD,15));
        pinCode.setBounds(80,390,300,30);
        add(pinCode);

        JTextField pinTextField =new JTextField();
        pinTextField.setFont(new Font("Rale way",Font.BOLD,15));
        pinTextField.setBounds(250,390,200,23);
        add(pinTextField);

        JButton next=new JButton("Next");
        add(next);
        next.setBounds(500,600,100,25);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.ORANGE);
        next.setFont(new Font("Raleway",Font.BOLD,15));
        
        
        setSize(700,800);
        setLocation(350,10);
//        setBackground(Color.ORANGE);
        setVisible(true);
        getContentPane().setBackground(Color.white);
    }

    public static void main(String[] args) {

        new SignUp_1();
    }
    
}
