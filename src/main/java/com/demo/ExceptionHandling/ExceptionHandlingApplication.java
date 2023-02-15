package com.demo.ExceptionHandling;


public class ExceptionHandlingApplication {
    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }
    public static void method1(){
        method2();
        System.out.println("method1 ended");
    }
    public static void method2(){
        try {
            String str = null;
            str.length();
            System.out.println("method2 ended");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
