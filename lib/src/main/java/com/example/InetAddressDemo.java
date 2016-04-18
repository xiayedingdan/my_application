package com.example;

/**
 * Created by kyp on 2016/3/22.
 */
import java.net.*;

import javax.print.DocFlavor;

public class InetAddressDemo {
    public static void main(String args[]){
        try{
            //ʹ��������������
            InetAddress inet1=InetAddress.getByName("www.baidu.com");
            System.out.println(inet1);
            //ʹ��IP��������
            InetAddress inet2=InetAddress.getByName("127.0.0.1");
            System.out.println(inet2);
            //��ñ�����ַ����
            InetAddress inet3=InetAddress.getLocalHost();
            System.out.println(inet3);
            String host=inet3.getHostName();
            System.out.println("������"+host);
            String ip=inet3.getHostAddress();
            System.out.println("IP:"+ip);
        }
        catch(Exception e){}
    }
}
