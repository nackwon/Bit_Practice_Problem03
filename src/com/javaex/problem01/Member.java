package com.javaex.problem01;

public class Member {

	private String member;
	private String id;
	private int point;

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}	
}

// 접근제한자 private로 지정된 변수는 외부 클래스에서 불러올수 없다.
// 외부클래스에서 이 변수들을  사용하기 위해 getter와 setter를 사용한다.