
/**
 * program to create new images that are photographic negatives (or inverted images) of selected images
 * 
 * @Priyanka
 * @11.3.2015
 */
import edu.duke.*;
import java.io.*;
public class ImageInversion {
    public ImageResource InvertImage(ImageResource inImage) {
        //I made a blank image of the same size
        ImageResource outImage = inImage;
        //for each pixel in outImage
        for(Pixel pixel: outImage.pixels()) {
            //look at the corresponding pixel in inImage
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            //compute inPixel's red + inPixel's blue + inPixel's green
            // Invert by subtracting each component value by 255
            
            int red = 255 - inPixel.getRed();
            int green = 255 - inPixel.getGreen();
            int blue = 255 - inPixel.getBlue();
            pixel.setRed(red);
            pixel.setGreen(green);
            pixel.setBlue(blue);
        }
            
        return outImage;

        
    }
    
    
    public void assig2() {
        DirectoryResource dr = new DirectoryResource();
        for (File f: dr.selectedFiles()) {
            ImageResource outImage = new ImageResource(f);
            String fname = outImage.getFileName();
            String newname = "invert_" + fname;
            outImage.setFileName(newname);
            outImage = InvertImage(outImage);
            outImage.draw();
            outImage.save();          
        }
    
    }
}
