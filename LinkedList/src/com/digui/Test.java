package com.digui;

import java.util.Scanner;

//张学青8.31 作业
public class Test {

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("请输入王的身高");
        double wang = input.nextDouble();
        System.out.println("请输入李的身高");
        double li = input.nextDouble();
        if (wang > li)
            System.out.println("王比李高");
        else
            System.out.println("李比王高");*/

//        programming1();
//        programming2();
//        programming3();
//        programming4();
        exercise3();

    }

    // 定义变量的两种方式    1.变量类型 变量名称;   2.变量类型 变量名称 = 初值;


    public static void programming1(){
        String brand = "爱国者F928";
        double weight = 12.4;
        String type = "内置锂电池";
        int price = 499;
        System.out.println("MP3的品牌：" + brand + "，重量：" + weight + "，电池类型：" + type + "，价格：" + price);
    }

    public static void programming2(){
        int days = 46;
        int weeks = days / 7;
        int otherdays = days % 7;
        System.out.println("周数：" + weeks + ",剩余天数:" + otherdays);
    }
    public static void programming3(){
        double radius = 1.5;
        double area = radius * radius * 3.1415926;
        System.out.println("面积:" + area);
    }

    public static void programming4(){
        double average1 = 81.29;
        int num = 2;
        double average2 = average1 + num; // 类型自动转换
        System.out.println("第二次平均分：" + average2);
    }

    public static void exercise1(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入基本工资");
        int base_salary = input.nextInt();
        System.out.println("该员工的工资细目为：");
        System.out.println("基本工资为：" + base_salary);
        double dearness_allowance = base_salary * 0.4;
        System.out.println("物价津贴为：" + dearness_allowance);
        double rental_allowance = base_salary * 0.25;
        System.out.println("房租津贴为：" + rental_allowance);
        double salary = base_salary + dearness_allowance + rental_allowance;
        System.out.println("员工薪水为：" + salary);

    }

    public static void exercise2(){
        int a = 10;
        int b = 8;
        System.out.println("输出互换前手中的纸牌：");
        System.out.println("左手中的纸牌：" + a);
        System.out.println("右手中的纸牌：" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("输出互换后手中的纸牌：");
        System.out.println("左手中的纸牌：" + a);
        System.out.println("右手中的纸牌：" + b);
    }

    public static void exercise3(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本金");
        int principle = input.nextInt();
        System.out.println("本金为：" + principle);
        double one = principle * 0.0225 + principle;
        System.out.println("存款一年后的本息是：" + one);
        double two = principle * 0.027 * 2 + principle;
        System.out.println("存款两年后的本息是：" + two);
        double three = principle * 0.0324 * 3 + principle;
        System.out.println("存款三年后的本息是：" + three);
        double five = principle * 0.036 * 5 + principle;
        System.out.println("存款五年后的本息是：" + five);
    }


}
