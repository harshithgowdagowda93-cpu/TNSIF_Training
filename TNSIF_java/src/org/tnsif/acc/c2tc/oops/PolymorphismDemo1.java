package org.tnsif.acc.c2tc.oops;

class addition
{
int add(int num1,int num2)
{
return num1+num2;
}
double add(double num1,double num2)
{
return num1+num2;
}
int add(int num1,int num2,int num3)
{
return num1+num2+num3;
}
}
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		addition add=new addition();
		System.out.println("Two integers sum "+add.add(1,2));
		System.out.println("Three integres sum "+add.add(2,3,4));
		System.out.println("Two double datatype sum "+add.add(4,5));
		
	}

}
