package ru.stqa.pft.sandbox;

public class myFirstProgramm1 {
  public static void main(String [] args){
    hello("World");
	hello(" ");
	  Square s= new Square(5);



	  System.out.println("ploshad kvadrata so storonoj "+s.l+"="+s.area());
	  Rectangle r= new Rectangle(4,6);

	  System.out.println("ploshad pryamougolnika so storonami "+r.a+" i "+r.b+"="+r.area());
	}
	public static void hello(String somebody){

		System.out.println("Hello,"+somebody+"!");
	}


}