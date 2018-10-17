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
		
		
		
		
	}
}
