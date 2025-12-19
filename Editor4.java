import java.awt.Color;

/**
 * Transforms a given image into its grayscale version using the morphing operation.
 * The program receives two command-line arguments: a string representing the name
 * of the PPM file of a source image, and the number of morphing steps (an int).
 * For example, to morph thor.ppm into its grayscale version in 50 steps, use:
 * java Editor4 thor.ppm 50
 */
public class Editor4 {

	public static void main (String[] args) {
		String fileName = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(fileName);
		Color[][] targetImage = Runigram.grayScaled(sourceImage); // Target is the greyscaled version
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}