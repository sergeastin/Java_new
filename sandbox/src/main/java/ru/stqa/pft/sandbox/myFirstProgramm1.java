package ru.stqa.pft.sandbox;

public class myFirstProgramm1 {
  public static void main(String [] args){
    hello("World");
	hello(" ");
    double l=5;
	  System.out.println("ploshad kvadrata so storonoj "+l+"="+area(l));

	  double a=4;
	  double b=6;
	  System.out.println("ploshad pryamougolnika so storonami "+a+" i "+b+"="+area(a,b));
	}
	public static void hello(String somebody){

		System.out.println("Hello,"+somebody+"!");
	}
	public static double area(double t){
		 return t*t;
	}
	public static double area(double a,double b){
		return a*b;
	}
}