package com.example.test.ch3;

public class KCustomerAccess {
    public static void main(String[]args) {
        //코틀린 클래스의 컴패니언 객체를 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();//애노테이션을 사용할 떄 접근 방법
        KCustomer.Companion.miso();//위와 동일한 결과를 애노테이션을 사용하지 않을 때 접근 방법
    }
}
