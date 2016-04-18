package com.example;

/**
 * Created by kyp on 2016/3/24.
 */
//public class Example6_10 {}
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Example6_10 extends Applet implements KeyListener{
    int count =0;
    Button button = new Button();
    TextArea text = new TextArea(5,20);
    public void init(){
        button.addKeyListener(this);
        add(button);add(text);
    }
    public void keyPressed(KeyEvent e){
        int t = e.getKeyCode();
        if(t>=KeyEvent.VK_A&&t<=KeyEvent.VK_Z){
            text.append((char)t+" ");
            count++;
            if(count%10==0)
                text.append("\n");
        }
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}