package arrays;
import java.util.Scanner;
import java.util.Random;
public class arrayActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

//Activity 1
/*
int[] scores= new int[5];
for(int i=0; i<5; i++)
{
	System.out.println("Give test score");
	scores[i]=input.nextInt();
}
*/

//Activity 2
/*
int total=0;
int[] scores= new int[5];
for(int i=0; i<5; i++)
{
	System.out.println("Give test score");
	scores[i]=input.nextInt();
	total+=scores[i];
}
	System.out.println(total);
}
*/

//Activity 3
/*
int total=0;
int[] scores= new int[25000];
for(int i=0; i<25000; i++)
{
	System.out.println("Give test score");
	scores[i]=input.nextInt();
	total+=scores[i];
}
	System.out.println(total);
	*/

//Activity 4
/*
int[] scores= new int[5];
for(int i=0; i<5; i++)
{
	System.out.println("Give test score");
	scores[i]=input.nextInt();
	
}
for(int j=4; j>=0; j--)
{
	System.out.print(scores[j]);
}
*/

//Activity 5
Random test=new Random(23);
int max= 1000;
int min= 0;
int largest=0;
int side=min+ test.nextInt(max-min+1);
int[] scores= new int[250];
for(int i=0; i<250; i++)
{
	
	scores[i]=side;
	if(scores[i]>largest)
	{
		largest=scores[i];
	}
	
}
System.out.println(largest);
}
	}


