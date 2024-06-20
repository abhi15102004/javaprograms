class Shape{
	public int x,y;
	void printArea(){
		System.out.println("prints the area of shape");
	}
}
class Rectangle extends Shape{
	void printArea(){
		System.out.println("Area of rectangle is "+x*y);
	}
}
public class Overrid{
	public static void main(String[] args){
		Rectangle r=new Rectangle();
		r.x=10;
		r.y=20;
		r.printArea();
	}
}