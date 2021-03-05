package week4;

/*
 * This program flips an image horizontaly
 */
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
    // Get the file path
    String imagePath = "C:\\Users\\ahmad\\Desktop\\Merit America\\Week4\\Assignments\\milkmaid.jpg";

    public void run() {
        GImage img = new GImage(imagePath);
        GImage flippedImage = rotateHorizontal(img);
        add(flippedImage, 0, 0);
    }

    private GImage rotateHorizontal(GImage image) {
        // Get pixel array of the image
        int[][] imageArray = image.getPixelArray();
        // Set the width and height
        int width = imageArray[0].length;
        int height = imageArray.length;
        //
        for (int row = 0; row < height; row++) {
            for (int x = 0; x < width / 2; x++) {
                int y = width - x - 1;
                int temp = imageArray[row][x];
                imageArray[row][x] = imageArray[row][y];
                imageArray[row][y] = temp;
            }
        }
        return new GImage(imageArray);
    }

}
