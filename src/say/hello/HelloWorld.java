package say.hello;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
/*
        Scanner a = new Scanner(System.in);
        String b = a.next().toUpperCase();
        System.out.println(b);
*/
//        String a = Integer.toHexString(60);
//        System.out.println(a);

//        int a = 61;
//        int b = a&15;
//        String i = (b>9)?(char)(b-10+'A')+"":b+"";
//        int c = a>>>4;
//        b = c&15;
//        String j = (b>9)?(char)(b-10+'A')+"":b+"";
//        System.out.println(j+""+i);
//        int a;
//        int i = 0;
//        while (true) {
//            a = (int)(Math.random()*100);
//            i++;
//            if (a==0) break;
//        }
//        System.out.println(i);
        Scanner scr = new Scanner(System.in);
        System.out.println("请输入年：");
        int c = scr.nextInt();
        System.out.println("请输入月：");
        int a = scr.nextInt();
        System.out.println("请输入日：");
        int b = scr.nextInt();
        int days = 0;
        int day = 0;
        switch(a){
            case 12:
                days = days + 30;
            case 11:
                days = days + 31;
            case 10:
                days = days + 30;
            case 9:
                days = days + 31;
            case 8:
                days = days + 31;
            case 7:
                days = days + 30;
            case 6:
                days = days + 31;
            case 5:
                days = days + 30;
            case 4:
                days = days + 31;
            case 3:
                days = days + ((c % 400 == 0 || (c % 4 == 0 && c % 100 != 0))?29:28);
            case 2:
                days = days + 31;
            case 1:
                days = days + b;
                break;
        }
        System.out.println("当前日期为"+c+"年第"+days+"天。");
    }
}
