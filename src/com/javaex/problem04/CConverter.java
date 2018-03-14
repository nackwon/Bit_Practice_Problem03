package com.javaex.problem04;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double r){
        CConverter.rate = r;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}
// static 문제
// 기존의 객체는 우리가 직접 new 키워드를 사용해 객체를 생성했다.
// 하지만 static을 사용하면 객체를 생성하지 않아도 된다.
// 공통으로 사용하는 메소드나 변수를 사용하고 싶을 때 사용한다.