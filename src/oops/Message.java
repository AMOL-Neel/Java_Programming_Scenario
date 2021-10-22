package oops;

public interface Message 
{
	void morning();
	void evening();
	void night();
}
abstract class Implmessage implements Message
{
	public void morning()
	{
		System.out.println("abstract class good morning");
	}
	public void evening() {
		System.out.println("abstrct class good evening");
	}
	abstract public void night();
}
class Helper extends Implmessage
{
	public void night() 
	{System.out.println("abstract class good night");}

	public static void main(String[] args)
	{
		Helper h = new Helper();
		h.night();h.evening();h.morning();
	}
}

class AllImpmessage implements Message
{
	public void morning()
	{
		System.out.println("good morning");
	}
	public void evening()
	{
		System.out.println("good evening");
	}
	public void night()
	{
		System.out.println("good night");
	}
	public static void main(String[] args) 
	{
		AllImpmessage a = new AllImpmessage();
		a.morning();a.night();a.evening();

	}

}
