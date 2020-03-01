// Put standard "header" information here:
//   - Andrew MacKenzie
//   - COMP 1731
//   - Lab 1
//   - Jan 13 2020


public class MathStuff
{
	public static void main(String[] args)
	{
		double diameter = 10; //changed double to doubble. error: cannot find symbol
		double radius = diameter/2;
		double area = Math.PI*Math.pow(radius, 2);
		double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
		System.out.println("The circle diameter is: " + Math.round(diameter*10)/10.0); //removed ';'. error: ';' expected
		System.out.println("The circle radius is: " + Math.round(radius*10)/10.0);
		System.out.println("The circle area is: " + Math.round(area*10)/10.0);
		System.out.println();

		double circumference = 2*Math.PI*radius;
		System.out.println("The circle circumference is: " + Math.round(circumference*10)/10.0); //changed println to Println. error: cannot find symbol
		System.out.println();

		System.out.println("The sphere volume is: " + Math.round(volume*10)/10.0);
		System.out.println();

		int x = 0/0; //divides 0 by 0 and crashes the program

	} //removed closing brace. error: reached end of file while parsing
}
