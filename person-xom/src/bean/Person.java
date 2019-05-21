package bean;

import java.util.Random;

public class Person {

	private int age = -1;
	private String sex = "";
	private String bbb = "aa";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static void main(String[] args){
		Random random=new Random();
		int a=random.nextInt(100);
		System.out.println(a);
	}
		
	
}
