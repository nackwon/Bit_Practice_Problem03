package com.javaex.problem03;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }

    public void printer(boolean val) {
    	System.out.println(val);
    }
    
    public void printer(double val) {
    	System.out.println(val);
    }
    
    public void printer(String val) {
    	System.out.println(val);
    }
    //메소드  작성
}
// 메소드 오버로딩을 위한 문제
// 메소드는 같은 이름을 가질수 있다 대신 메소드가 가지는 
// 매개변수가 달라야한다.
// 매개변수의 갯수나 자료형 등이 달라야하며
// 메인에서는 알아서 매개변수에 맞게 메소드를 불러오기 때문에 편하다