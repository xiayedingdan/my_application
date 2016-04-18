package com.example;

/**
 * Created by kyp on 2016/3/24.
 */
/*public class Keyevt {
}*/
//KeyEvt.java??
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEvt {
    class MyKeyListener implements KeyListener {
        public void keyPressed(KeyEvent evt) {
            System.out.println("\n按键被按下");
            showKeyEventMsg(evt);
        }

        public void keyReleased(KeyEvent evt) {
        }

        public void keyTyped(KeyEvent evt) {
        }

        private void showKeyEventMsg(KeyEvent evt) {
            //显示按键事件信息??
            //得到按键对应的整型数?
            int code = evt.getKeyCode();
            //返回按键事件所代表的字符??
            char c = evt.getKeyChar();
            //得到代表按键的字符串??
            String szText = evt.getKeyText(code);
            if (code != KeyEvent.VK_UNDEFINED)
                System.out.println("\n按键对应的整型数：" + code);
            if (c != KeyEvent.CHAR_UNDEFINED)
                System.out.println("\n与按键相联系的字符：" + c);
            if (evt.isShiftDown())
                System.out.println("\n按键Shift被按下");
            System.out.println("\n按键本身的字符串：" + szText);
        }
    }

    class ButtonPanel extends JPanel {
        public ButtonPanel() {//新建一个文本域组件?
            tf = new JTextField(20);
            add(tf);
            //指定用来处理该按钮事件的监听器对象为JPanel本身???
            myListener = new MyKeyListener();
            tf.addKeyListener(myListener);
        }

        private JTextField tf;
        private MyKeyListener myListener;
    }

    class ButtonFrame extends JFrame {
        public ButtonFrame() {
            setTitle("键盘事件示例程序");
            setSize(300, 200);
            setLocation(100, 100);
            addWindowListener(new WindowAdapter() {
                                  public void windowClosing(WindowEvent e) {
                                      System.exit(0);
                                  }
                              }
            );
            Container ctPane = getContentPane();
            ctPane.add(new ButtonPanel());
        }
    }

public   void  main(String[] args){//有错
        JFrame frame=new ButtonFrame();
        frame.setVisible(true);
        }
}


