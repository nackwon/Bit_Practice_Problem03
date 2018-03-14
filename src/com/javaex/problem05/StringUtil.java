package com.javaex.problem05;

public class StringUtil {

	public static String concatString(String[] strArray) {

		// 메소드 내용작성
		String result = "";
		for (int i = 0; i < strArray.length; i++) {
			result += strArray[i];
		}
		return result;
	}
}
// 이제까지 매개변수로 자료형만 썼다면
// 이 문제에서는 매개변수를 배열을 사용했다.
// 매개변수로는 배열도 가능하다