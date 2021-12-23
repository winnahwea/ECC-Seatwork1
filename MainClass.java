package com.activity.one;
import com.activity.one.util.ClassC;


public class MainClass{
	
	
	public static void main(String[] args) {
		ClassA classAObj = new ClassA();
		ClassB classBObj = new ClassB();
		ClassC classCObj = new ClassC();

		//Display value of Boolean/boolean from Class A
		System.out.println(classAObj.classABoolean);
		System.out.println(classAObj.classABool);

		//Loop and display array value in Class B

			for (int i = 0;i <classBObj.days.length ;i++ ) {
			System.out.print(classBObj.days[i]+" ");
		}
		//Display value passed to method in Class C
		System.out.println();
		System.out.println(classCObj.classCMethod(3));
	}
}