package oops;

import java.util.concurrent.SynchronousQueue;

abstract public class Abst 
{
	void name()
	{
		System.out.println("my name is amol");
	}
	abstract void surname();
	abstract void fname();
	abstract void vname();
	abstract void education();
}

class Abst1 extends Abst
{
	void surname() {
		System.out.println("surname is neel");
	}
	void fname() {
		System.out.println("father name is babasaheb");
	}
	void vname() {
		System.out.println("village name is kannad");
	}
	void education() {
		System.out.println("i compleceted graduation.");
	}
	public static void main(String[] args) 
	{
		Abst1 a = new Abst1();
		a.name();a.surname();a.vname();a.fname();a.education();
		System.out.println();
		Abst a1 = new Abst1();
		a1.name();a1.surname();a1.fname();a1.vname();a1.education();
	}
}

abstract class Abst2
{
  abstract void m1();
  abstract void m2();
  abstract void m3();
  abstract void m4();
}

abstract class Abst3 extends Abst2
{
	void m1()
	{System.out.println("m1 method");
	}
}

abstract class Abst4 extends Abst3
{
	void m2(){
		System.out.println("m2 method");
	}
}
abstract class Abst5 extends Abst4
{
	void m3(){
		System.out.println("m3 method");
	}
}
class Abst6 extends Abst5
{
	void m4()
	{
		System.out.println("m4 method");
	}
	public static void main(String[] args) 
	{
		Abst6 a = new Abst6();
		a.m1();a.m2();a.m3();a.m4();
	}
}

abstract class Abstr
{
	public static void main(String[] args) 
	{
		System.out.println("automation fratorniy.");
		
	}
	
}

abstract class Abs
{
	Abs()
	{
		System.out.println("abstract class constructor.");
	}
	abstract void m2();
}

class Abstt extends Abs
{
	void m2()
	{
		System.out.println("child class m2 method");
	}
	Abstt()
	{super();
		System.out.println("child class constructor");
	}
 	public static void main(String[] args) 
	{
		Abstt a = new Abstt();
		a.m2();
		new Abstt().m2();
		
	}
}	

abstract class Absttt
{
	Absttt()
	{
		System.out.println("abstract class constructor");
	}
	{
		System.out.println("abstract class instance block");
	}
	static {
		System.out.println("abstract class static block");
	}
    abstract void m1();
}

class Abstract1 extends Absttt
{
	void m1()
	{
		System.out.println("implementation of m1 method");
	}
	Abstract1()
	{
		super();
		System.out.println("child class constructor");
	}
	public static void main(String[] args) 
	{
		Abstract1 a = new Abstract1();
		a.m1();	
	}	
}

