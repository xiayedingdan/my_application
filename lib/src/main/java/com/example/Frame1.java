package com.example;

/**
 * Created by kyp on 2016/3/23.
 */
import org.omg.PortableInterceptor.INACTIVE;

import java.awt.*;
import java.awt.event.*;
public class Frame1 extends WindowAdapter{
    Frame f;

    Label la1,la2;
    TextField t;
    public Frame1(){
        f=new Frame("LoginWindows");
        la1=new Label("INPUT Commend");
        la2=new Label("");
        t=new TextField();
        f.setFont(new Font("¿¬Ìå", Font.BOLD, 12));
        f.setLayout(new GridLayout(3, 2, 15, 15));
        t.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });

        f.addWindowListener(this);

        f.setSize(400, 300);
        f.setVisible(true);
        f.add(la1);f.add(t);
        f.add(la2);
    }
    public void keyTyped(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            if(e.equals("12345")) la2.setText("Success");
            else la2.setText("failure");
        }
    }
    public static void main(String[] args){
        new Frame1();

    }
}
