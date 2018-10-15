package objectOrientated;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle bob=new Rectangle();
System.out.println(bob.returnArea());
System.out.println(bob.returnPerimeter());
Circle john=new Circle();
System.out.println(john.area());
System.out.println(john.getCircumference());
RighTriangle jacob= new RighTriangle();
System.out.println(jacob.area());
System.out.println(jacob.perimeter());
IsoscelesTrapezoid rhea=new IsoscelesTrapezoid();
System.out.println(rhea.area());
System.out.println(rhea.perimeter());
	}

}
