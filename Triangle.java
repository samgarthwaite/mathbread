import java.util.Scanner;

public class Triangle 
{
	public static void main(String[] args)
	{
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please input your name: ");
		System.out.print("\t");
		String name = Keyboard.nextLine();
		System.out.println("\n\n\n Welcome " + name + " to the triangle calculator. Press Enter to continue");
		Keyboard.nextLine();
		
		System.out.println("Please input the base:");
		System.out.print("\t");
		String base = Keyboard.nextLine();
		
		System.out.println("Please input the height:");
		System.out.print("\t");
		String height = Keyboard.nextLine();
		System.out.println("Please input the units of measure:");
		System.out.print("\t");
		String unit = Keyboard.nextLine();
		
		double basenum = Double.parseDouble(base);
		double heightnum = Double.parseDouble(height);
		
		
		double size;
		size = basenum * heightnum * 0.5;
		System.out.println("\n" + name + ", the area of the triangle you inputted it: \n \t" + size + unit + " squared");
		
		System.out.println("\n\n\n Now we are going to find the volume of a rectangular prism");
		
		System.out.println("Please input the base:");
		System.out.print("\t");
		String rectangleBaseStr = Keyboard.nextLine();
		double rectangleBase = Double.parseDouble(rectangleBaseStr);
		
		System.out.println("Please input the length:");
		System.out.print("\t");
		String rectangleLengthStr = Keyboard.nextLine();
		double rectangleLength = Double.parseDouble(rectangleLengthStr);
		
		System.out.println("Please input the height:");
		System.out.print("\t");
		String rectangleHeightStr = Keyboard.nextLine();
		double rectangleHeight = Double.parseDouble(rectangleHeightStr);
		
		System.out.println("Please input the units of measure:");
		System.out.print("\t");
		String rectangleUnit = Keyboard.nextLine();
		
		double volume;
			volume = rectangleHeight * rectangleLength * rectangleBase;
		System.out.println("The volume of the rectangle is " + volume + " " + rectangleUnit + " cubed");
		
		
		System.out.println("\n \n \n Now we are going to find the zero's of a function");
		
		System.out.println("Please input the A value:");
		System.out.print("\t");
		String aStr = Keyboard.nextLine();
		double a = Double.parseDouble(aStr);
		
		System.out.println("Please input the B value:");
		System.out.print("\t");
		String bStr = Keyboard.nextLine();
		double b = Double.parseDouble(bStr);
		
		System.out.println("Please input the C value:");
		System.out.print("\t");
		String cStr = Keyboard.nextLine();
		double c = Double.parseDouble(cStr);
		
		double rootVal;
		double squaredB = b * b;
		double secondpartofroot = 4 * a * c;	
		rootVal = squaredB -  secondpartofroot;
		//need a if negitive loop
		rootVal = Math.sqrt(rootVal);
		rootVal = rootVal/(2*a);		
		
		double negitiveB = b * -1;
		negitiveB = negitiveB / (a*2);
		double zero1 = negitiveB - rootVal;
		double zero2 = negitiveB + rootVal;
		
		System.out.println("The zeros are \n Zero 1 : " + zero1 + "\nZero2: " + zero2);
		
		
		
		
	}
}
