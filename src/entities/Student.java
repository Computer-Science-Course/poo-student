package entities;

public class Student {

	private String name;
	private double grade_01, grade_02, grade_03;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade_01() {
		return grade_01;
	}
	public void setGrade_01(double grade_01) {
		if(grade_01 < 0) {
			this.grade_01 = 0;
		} else if(grade_01 > 30){
			this.grade_01 = 30;
		} else {
			this.grade_01 = grade_01;
		}
	}
	public double getGrade_02() {
		return grade_02;
	}
	public void setGrade_02(double grade_02) {
		if(grade_02 < 0) {
			this.grade_02 = 0;
		} else if(grade_02 > 35){
			this.grade_02 = 35;
		} else {
			this.grade_02 = grade_02;
		}
	}
	public double getGrade_03() {
		return grade_03;
	}
	public void setGrade_03(double grade_03) {
		if(grade_03 < 0) {
			this.grade_03 = 0;
		} else if(grade_03 > 35){
			this.grade_03 = 35;
		} else {
			this.grade_03 = grade_03;
		}
	}
	
	public void checkStatus() {
		double total = this.getGrade_01() + this.getGrade_02() + this.getGrade_03();
		
		System.out.printf("FINAL GRADE: %.2f\n", total);
		if(total >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", (60 - total));
		}
	}
	
	
}
