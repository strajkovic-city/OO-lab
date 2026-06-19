import java.util.ArrayList;
import java.util.List;

public class ColorProgram extends Color {

	// Constructor
	public ColorProgram(String name, int red, int green, int blue) {
		super(name, red, green, blue);
	}

	public static void main(String[] args) {

		// create an arraylist for Color objects
		List<Color> colors = new ArrayList<Color>();

		// add to the list 5 newly created objects
		Color red = new Color("red", 255, 0, 0);
		colors.add(red);
		colors.add(new Color("blue", 0, 255, 0));
		colors.add(new Color("green", 0, 0, 255));
		colors.add(new Color("magenta", 255, 255, 0));
		colors.add(new Color("orange", 255, 165, 0));

		// Print all the colors
		System.out.println("ALL THE COLORS");
		for (Color c : colors) {
			System.out.println(c);
		}
		System.out.println();

		// print the color in position 2
		System.out.println("In position 2: " + colors.get(2));
		System.out.println();
		// find and print the color(s) with the maximum blue value and their position
		// inside the arraylist
		int maxBlue = 0;
		for (Color c : colors) {
			if (c.getBlue() > maxBlue)
				maxBlue = c.getBlue();
		}

		for (Color c : colors) {
			if (c.getBlue() == maxBlue) {
				System.out.println(c + "has a max blue value of: " + maxBlue);
				System.out.println("and is located in position: " + colors.indexOf(c));
				System.out.println();
			}
		}
		System.out.println();

		// Create a new violet color
		Color violet = new Color("violet", 127, 0, 255);

		// Add it to the arraylist
		colors.add(violet);

		// print the position of this last color using its reference (name)
		System.out.println("Object violet is located in position: " + colors.indexOf(violet));
	}
}