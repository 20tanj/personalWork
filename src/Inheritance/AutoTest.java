package Inheritance;
import java.util.ArrayList;
import java.util.Random;
public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Auto> auto= new ArrayList<Auto>();
		auto.add(new Car(10,30,2));
		auto.add(new Truck(true,10,30));
		Random generator=new Random();
		int min=0;
		int max=100;
		for(Auto x: auto)
		{
			int distance=min+generator.nextInt(max-min+1);
			x.drive(distance);
		}
		int total=0;
		for(Auto x: auto)
		{
			total=total+x.getOdometer();
		}
		System.out.println(total);
		int mile=0;
		for(Auto x: auto)
		{
			mile=mile+x.getMPG();
		}
		System.out.println(mile/auto.size());
		int cup=0;
		for(Auto x: auto)
		{
			if(x instanceof Car)
			{
				Car bob= (Car)x;
			cup=cup+bob.getCupHolders();
			}
			System.out.println(cup);
		}
		int four=0;
		for(Auto x: auto)
		{
			if(x instanceof Truck)
			{
				Truck bob= (Truck)x;
				if(bob.getFourWd()==true)
				{
					four= four+1;
				}
			}
		}
		System.out.println(four);
	}

}
