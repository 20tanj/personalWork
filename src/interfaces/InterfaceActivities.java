package interfaces;

import java.util.Scanner;
import java.util.ArrayList;

public class InterfaceActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	
		/*
		 * System.out.println("length"); int length = input.nextInt();
		 * System.out.println("width"); int width = input.nextInt(); Shape bob =
		 * new Rectangle(length, width); System.out.println(bob.perimeter());
		 * System.out.println(bob.area()); System.out.println("radius"); int
		 * radius = input.nextInt(); Shape circlebob = new Circle(radius);
		 * System.out.println(circlebob.perimeter());
		 * System.out.println(circlebob.area());
		 */
		/*
		 * System.out.println("length"); int length = input.nextInt();
		 * System.out.println("width"); int width = input.nextInt(); Rectangle
		 * notbob= new Rectangle(length,width); Shape bob = notbob;
		 */
		/*
		ArrayList<Shape> shap=new <Shape>ArrayList();
	double sum=0;
	double perimeter=10000000;
	double smallest=1000000;
			Rectangle a1 = new Rectangle(5, 10);
			Circle a2 = new Circle(10);
			Rectangle a3 = new Rectangle(2, 3);
			Circle a4 = new Circle(5);
for(int i=0; i<2; i++)
{
			shap.add(a1);
			shap.add(a2);
			shap.add(a3);
			shap.add(a4);
}
for(int i=0; i<shap.size();i++)
{
double j=shap.get(i).area();
	sum=sum+j;
}
for(int i=0; i<shap.size();i++)
{
double k=shap.get(i).perimeter();
if(k<perimeter)
{
	smallest=k;
}
}
		System.out.println(sum);
		System.out.println(smallest);
		*/
		ArrayList<Person> person=new<Person>ArrayList();
Teacher a =new Teacher();
Teacher b=new Teacher();
Student c=new Student();
Student d=new Student();
for(int i=0; i<4; i++)
{
	person.add(a);
	person.add(b);
	person.add(c);
	person.add(d);
if(person.get(i) instanceof Student)
{
	Student thing= (Student)person.get(i);
	thing.outSick();
}
System.out.println(person.get(i).getName());
}

	}

}
