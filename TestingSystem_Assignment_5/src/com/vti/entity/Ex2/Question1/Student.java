package com.vti.entity.Ex2.Question1;

public class Student implements IStudent{
	int id;
	String name;
	public int group;
	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	
	public Student() {
		super();
	}

	@Override
	public void diemDanh() {
		// TODO Auto-generated method stub
		System.out.println(name + " diểm danh");
	}
	@Override
	public void hocBai() {
		// TODO Auto-generated method stub
		System.out.println(name + " học bài");

	}
	@Override
	public void donVeSinh() {
		// TODO Auto-generated method stub
		System.out.println(name + " dọn vệ sinh");

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}
	
}
