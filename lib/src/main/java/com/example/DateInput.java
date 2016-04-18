package com.example; /**
 * Created by kyp on 2016/3/23.
 */
import java.awt.*;
import java.awt.event.*;
 class DateInput extends WindowAdapter {
    Frame f;
    Label la1,la2,la3,la4;
    TextField t;
    Checkbox r1,r2;
    CheckboxGroup g;
    Checkbox c1,c2,c3;
    Choice h;
    Button b;
    TextArea ta;
    Panel p1,p2,p3,p4,p5;
    int i=0;
    public DateInput(){
        f=new Frame("信息录入:");
        la1=new Label("Name:");
        la2=new Label("Sex:");
        la3=new Label("Hobby:");
        la4=new Label("Country:");
        t=new TextField(15);
        h=new Choice();
        c1=new Checkbox("Singing");//复选框
        c2=new Checkbox("Dance");
        c3=new Checkbox("Chinese chess");
        g=new CheckboxGroup();//选择框是单选的
        r1=new Checkbox("boy",true,g);
        r2=new Checkbox("girl",false,g);
        h.add("Europe");//List 列表框
        h.add("Africa");
        h.add("Asia");
        h.add("North America");
        b=new Button("Sure");
        ta=new TextArea();
        p1=new Panel();
        p2=new Panel();
        p3=new Panel();
        p4=new Panel();
        p5=new Panel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));//设置布局格式及其对齐方式
        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p4.setLayout(new FlowLayout(FlowLayout.LEFT));
        //p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1.add(la1);p1.add(t);
        p2.add(la2);p2.add(r1);p2.add(r2);
        p3.add(la3);p3.add(c1);p3.add(c2);p3.add(c3);
        p4.add(la4);p4.add(h);
        p5.add(b);
        Panel p=new Panel();
        p.setLayout(new GridLayout(5, 1));//设置面板为网格，5行1列；
        p.add(p1);p.add(p2);p.add(p3);p.add(p4);p.add(p5);
        f.setLayout(new GridLayout(2, 1));
        f.add("North", p);
        f.add("South", ta);
        f.setBackground(Color.cyan);
        f.setSize(600, 600);
        f.setLocation(200, 200);
        f.setVisible(true);
        f.setFont(new java.awt.Font("新宋体",Font.BOLD,20));
    }
public static void main(String args[]){
    new DateInput();
}

}
