package com.voya.training;

public class Onedim {

	public static void main(String[] args) {
		int [] marks=new int[4];
		System.out.println(marks[0]);
		System.out.println(marks.length);
		marks[0]=90;
		marks[1]=80;
		marks[2]=70;
		marks[3]=60;
//		marks[4]=90;
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		for(int mark:marks)
			System.out.println(mark);
	}

}
