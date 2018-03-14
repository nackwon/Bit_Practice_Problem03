package com.javaex.problem02;

public class Base {

	public void service(String state) {
		// 코드작성
		if (state.equals("낮")) {
			day();
		} else if (state.equals("밤")) {
			night();
		} else if (state.equals("오후")) {
			afternoon();
		}
	}

	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}

	public void night() {
		//
		System.out.println("night");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
// 메인에서 다른 점은 입력되는 매개변수 값이다.
// 그렇기 때문에 그걸로 구분을 하면된다.
// 입력 값에 맞게 if 문으로 구분해줬다.