package flowcontrol;

public enum Week 
{
	MON,TUE,WED;
}

class E
{
	public static void main(String[] args) 
	{
		Week w1 =Week.MON;
		
		switch(w1)
		{
		case MON: System.out.println("temple......");
		case TUE: System.out.println("Classes........");
		case WED: System.out.println("Village...........");
		}
		
	}
}
