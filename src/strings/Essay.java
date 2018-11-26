package strings;

public class Essay {

private String name;
private String text;

public Essay(){
	name="Jacob Tan";
	text="Hi my name is jacob";
}
public void setName(String newName)
{
	name=newName;
}
public void setText(String newText)
{
	text=newText;
}
public String getLast()
{
	String upper= name.toUpperCase();
	int space= upper.indexOf(' ');
	return upper.substring(space);
}
public int getFirst()
{
	int space= name.indexOf(' ');
	String first= name.substring(0, space);
	return	first.length();
}
public boolean getX()
{
		return name.contains("X");	
}
public int getLength()
{
	int count=0;
	if(!(" ".equals(text.substring(0, 1))) || !(" ".equals(text.substring(text.length()-1))))
	{
		for(int i=0; i<text.length(); i++)
		{
			if(text.charAt(i)==' ')
			{
				count++;
			}
		}
		count=count+1;
	}
	return count;
}
}


	
	
	

