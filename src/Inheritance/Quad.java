package Inheritance;

public class Quad {
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quad() {
		s1 = 10;
		s2 = 10;
		s3 = 10;
		s4 = 10;
	}

	public Quad(double xs1, double xs2, double xs3, double xs4) {
		s1 = xs1;
		s2 = xs2;
		s3 = xs3;
		s4 = xs4;
	}

	public void setSide1(double xs1) {
		s1 = xs1;
	}

	public void setSide2(double xs2) {
		s1 = xs2;
	}

	public void setSide3(double xs3) {
		s1 = xs3;
	}

	public void setSide4(double xs4) {
		s1 = xs4;
	}

	public double getSide1() {
		return s1;
	}

	public double getSide2() {
		return s2;
	}

	public double getSide3() {
		return s3;
	}

	public double getSide4() {
		return s4;
	}

	public double perimeter() {
		return s1 + s2 + s3 + s4;
	}

}
