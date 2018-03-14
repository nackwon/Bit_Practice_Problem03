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

		for (int i = 0; i < friendArray.length; i++) {
			str = sc.nextLine(); // 친구 입력
			StringTokenizer st = new StringTokenizer(str, " ");
			// StringTokenizer를 이용해 공백을 구분으로 나눔
			friends = new Friend(st.nextToken(), st.nextToken(), st.nextToken()); 
			// nextToken()메소드를 이용해 friends 객체에 넣는다.
			friendArray[i] = friends;
			// 배열에 넣는다.
		}
		
		friends.showInfo(friendArray);
		// showInfo()메소드를 새로 만들어 출력
		
		/*for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 출력 메소드 호출
		}*/
		sc.close();
	}

}
