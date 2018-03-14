package com.javaex.problem06;

public class Friend {

	private String name;
	private String hp;
	private String school;

	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void showInfo() {
		System.out.println("이름:" + name + "  핸드폰:" + hp + "  학교:" + school);
	}

	public void showInfo(Friend[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름:" + arr[i].getName() + " 핸드폰:" + arr[i].getHp() + " 학교:" + arr[i].getSchool());
		}
	}
}
