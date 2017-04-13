package com.sd.AddressBook;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Phonebooksave{
   String name;
   String address;
   String number;
    
      Phonebooksave(String name, String address, String number){
         this.name=name;
         this.address=address;
         this.number=number;
      }
      
      public String print(){
         return name + " " + address +" " + number;
      }
}

public class pb1 extends JFrame{
   
      JButton jb1= new JButton("조회");
      JButton jb2= new JButton("검색");
      JButton jb3= new JButton("삽입");
      JButton jb4= new JButton("삭제");
      
         JTextField jt1 = new JTextField();
         JTextField jt2 = new JTextField();
         JTextField jt3 = new JTextField();
      
      JTextArea jta = new JTextArea();
      
      HashMap<String,Phonebooksave> hm = new HashMap<String,Phonebooksave>();
      
      pb1(){
         setTitle("phone book");
         setSize(500,200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(null);
         
         jta.setLocation(10,10);
         jta.setSize(200,150);
         add(jta);
      
      JPanel jp1 = new JPanel();
      jp1.setLayout(new GridLayout(1,4));
      jb1.addActionListener(new myAction());
      jb2.addActionListener(new myAction());
      jb3.addActionListener(new myAction());
      jb4.addActionListener(new myAction());

      jp1.add(jb1);
      jp1.add(jb2);
      jp1.add(jb3);
      jp1.add(jb4);
      
      jp1.setLocation(220,10);
      jp1.setSize(260,30);
      add(jp1);
      
      
      JPanel jp2 = new JPanel();
      jp2.setLayout(new GridLayout(3,1,5,10));
      jp2.add(new JLabel("이름"));
      jp2.add(new JLabel("주소"));
      jp2.add(new JLabel("전화번호"));
      jp2.setLocation(220, 50);
      jp2.setSize(80,100);
      add(jp2);
      
      
        JPanel jp3 = new JPanel();
         jp3.setLayout(new GridLayout(3, 1, 5, 10));
         jp3.add(jt1);
         jp3.add(jt2);
         jp3.add(jt3);
         jp3.setLocation(300, 50);
         jp3.setSize(100, 100);
         add(jp3);
      
      setVisible(true);
      }
      
      class myAction implements ActionListener{
         public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            
            if(b.getText().equals("삽입")){
               jta.setText("");
               if(jt1.getText().equals(""))
                  jta.setText("이름을 입력하세요");
               else if(jt2.getText().equals(""))
                  jta.setText("주소를 입력하세요");
               else if(jt3.getText().equals(""))
                  jta.setText("번호를 입력하세요");
               else{
                  String name=jt1.getText();
                  String address=jt2.getText();
                  String number = jt3.getText();
                  
                  hm.put(name, new Phonebooksave(name,address,number));
                  jt1.setText("");
                  jt2.setText("");
                  jt3.setText("");
                  }
            }
            else if(b.getText().equals("조회")){
               jta.setText("");
               Set<String> names = hm.keySet();
               Vector<String> v = new Vector<String>();
               
               v.addAll(names);
               Collections.sort(v);
         //      Iterator<String> il = v.iterator();
               String print ;
               for(int j =0; j<v.size(); j++){
                  Phonebooksave pbs = hm.get(v.get(j));
                  
                  print=pbs.print();
               jta.append(print);
               jta.append("\n");
               }
            
            }
            else if(b.getText().equals("검색")){
               jta.setText("");
               if(jt1.getText().equals(""))
                  jta.setText("검색하고자 하는 사람 입력");
               else{
                  String who= jt1.getText();
                  if(hm.containsKey(who)){
                     Phonebooksave pbs = hm.get(who);
                     jta.append(pbs.print());
                  }
                  else{
                     jta.append(who+"은 존재하지 않습니다.");
                     jt2.setText("");
                     }
               }
            }
               else if(b.getText().equals("삭제")){
               
               String who = jt1.getText();
               if(hm.containsKey(who))
               hm.remove(who);
               else
                  jta.append(who+"가 존재하지 않습니다.");
            }
         }
      }
      
      
   
   public static void main(String[]args){
      pb1 pb = new pb1();

      
      
   }
}