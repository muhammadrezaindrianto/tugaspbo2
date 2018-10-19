package pbo5d2;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends JFrame{
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);    
    JLabel lblnik=new JLabel("NIK");    
    JTextField txnik=new JTextField(7);    
    JLabel lblkelamin=new JLabel("Jenis Kelamin");    
    JRadioButton pria=new JRadioButton("Pria");    
    JRadioButton wanita=new JRadioButton("Wanita");    
    ButtonGroup kelompok=new ButtonGroup();    
    JLabel lblstatus=new JLabel("Status");    
    JCheckBox single=new JCheckBox("Single");    
    JCheckBox menikah=new JCheckBox("Menikah");    
    JCheckBox cerai=new JCheckBox("Cerai");    
    JButton cetak=new JButton("Cetak");    
    JTextArea hasil=new JTextArea(); 
 
   form()    {       
       setTitle("Status Perkawaninan");
       setLocation(300,100);       
       setSize(300,320);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
   } 
 
   void KomponenVisual()    
   {       
       getContentPane().setLayout(null);
       getContentPane().add(lblnama);       
       lblnama.setBounds(10,10,80,20);       
       getContentPane().add(txnama);       
       txnama.setBounds(105,10,175,20);       
       getContentPane().add(lblnik);       
       lblnik.setBounds(10,33,175,20);       
       getContentPane().add(txnik);       
       txnik.setBounds(105,33,175,20);       
       getContentPane().add(lblkelamin);       
       lblkelamin.setBounds(10,56,80,20);       
       kelompok.add(pria);       
       kelompok.add(wanita);      
       getContentPane().add(pria);      
       pria.setBounds(105,56,50,20);       
       getContentPane().add(wanita); 
       wanita.setBounds(160,56,70,20);       
       getContentPane().add(lblstatus);       
       lblstatus.setBounds(10,80,70,20);       
       getContentPane().add(single);       
       single.setBounds(105,80,100,20);       
       getContentPane().add(menikah);       
       menikah.setBounds(105,103,100,20);       
       getContentPane().add(cerai);       
       cerai.setBounds(105,126,100,20);       
       getContentPane().add(cetak);       
       cetak.setBounds(10,150,270,20);       
       getContentPane().add(hasil);       
       hasil.setBounds(10,180,270,100);       
       setVisible(true);    
   } 
 
   void AksiReaksi(){
       cetak.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hasil.append(txnama.getText()+"\n");  
                hasil.append(txnik.getText()+"\n");            
                if(pria.isSelected()==true){                
                    hasil.append(pria.getText()+"\n");            
                }             
                else{                
                    hasil.append(wanita.getText()+"\n");             
                }
                if(single.isSelected()==true){               
                    hasil.append(single.getText()+"\n");             
                }             
                if(menikah.isSelected()==true){  
                    hasil.append(menikah.getText()+"\n");             
                }         
                if(cerai.isSelected()==true){           
                    hasil.append(cerai.getText()+"\n");             
                } 
            }       
       });    
    }
   public static void main(String args[])    {       
       form e5=new form();       
       e5.KomponenVisual();       
       e5.AksiReaksi();    
    } 
}
