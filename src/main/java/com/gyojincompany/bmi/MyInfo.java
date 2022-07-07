package com.gyojincompany.bmi;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;	
	private BmiCalculator bmiCal;
	
	public void bmiCalculation() {
		bmiCal.bmiCalcu(weight, height);
	}
	
	public void geyMyInfo() {
		System.out.println("이름 : " + name);
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
		bmiCalculation();		
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setBmiCal(BmiCalculator bmiCal) {
		this.bmiCal = bmiCal;
	}
	
	
}
