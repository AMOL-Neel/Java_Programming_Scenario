package javaTrickyScenario;

import java.util.stream.IntStream;

import org.omg.Messaging.SyncScopeHelper;

public class PrintNumberWithoutLoop {
	//1. recursive function
	public static void printNum(int num){
		if(num<=100){
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	//2. recursive function
	public static void printNumber(int stNum,int endNum){
		if(stNum <= endNum){
			System.out.println(stNum);
			stNum++;
			printNumber(stNum,endNum);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * print 1 to 100 without using any loop
		 * 1. recursive function 
		 * 2. java streams
		 */
		printNum(1);
		System.out.println();
		printNumber(101,200);
		
		// javaStream
		IntStream.range(201, 301).forEach(e->System.out.println(e));
		
		
	}

}
