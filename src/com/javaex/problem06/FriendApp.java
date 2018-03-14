package com.javaex.problem06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		String str = "";
		Friend friends = null;
		System.out.println("친구를 3명 등록해 주세요");

		// 1번 방법
		for (int i = 0; i < friendArray.length; i++) {
			str = sc.nextLine(); // 친구 입력
			StringTokenizer st = new StringTokenizer(str, " ");
			friends = new Friend(st.nextToken(), st.nextToken(), st.nextToken());
			friendArray[i] = friends;
			// StringTokenizer를 이용해 공백을 구분으로 나눔(자바 API에서 확인해볼것)
			// nextToken()메소드를 이용해 friends 객체에 넣는다.
			// 배열에 넣는다.
		}

		for (int i = 0; i < friendArray.length; i++) { // 친구정보 출력 메소드 호출 }
			friendArray[i].showInfo();
		}

		// 2번 방법
		for (int i = 0; i < friendArray.length; i++) {
			str = sc.nextLine();
			friends = new Friend(str.split(" ")[0], str.split(" ")[1], str.split(" ")[2]);
			friendArray[i] = friends;
		}
		// split()메소드를 이용해 공백을 나눔
		// split()은 String[]으로 리턴 되므로
		// 직접적으로 각각 넣음 (ex.str.split(" ")[0];
		// 나머지는 똑같음
		for (int i = 0; i < friendArray.length; i++) { // 친구정보 출력 메소드 호출 }
			friendArray[i].showInfo();
		}
		sc.close();
	}

}
