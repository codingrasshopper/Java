
/**
 * Program to convert image to Grayscale
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class GrayScaleConverter {
    //Main program to convert image to Grayscale
    public ImageResource makeGray(ImageResource inImage) {
        //I made a blank image of the same size
        ImageResource outImage = inImage;
        //for each pixel in outImage
        for(Pixel pixel: outImage.pixels()) {
            //look at the corresponding pixel in inImage
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            //compute inPixel's red + inPixel's blue + inPixel's green
            //divide that sum by 3 (call it average)
            int average = (inPixel.getRed() + inPixel.getGreen()+ inPixel.getBlue())/3;
            pixel.setRed(average);
            pixel.setGreen(average);
            pixel.setBlue(average);
        }
            
        return outImage;

        
    }
    
    //Basic program to test makeGray
    public void testGray() {
        ImageResource ir = new ImageResource();
        ImageResource gray = makeGray(ir);
        gray.draw();
       }
       
    //Test selecting image and converting to Grayscale
    public void selectConvert() {
        DirectoryResource dr = new DirectoryResource();
        for (File f: dr.selectedFiles()) {
            ImageResource inImage = new ImageResource(f);
            ImageResource gray = makeGray(inImage);
            gray.draw();
           }
       }
     
    //Final loop to combine everything
    public void assig1() {
        DirectoryResource dr = new DirectoryResource();
        for (File f: dr.selectedFiles()) {
            ImageResource outImage = new ImageResource(f);
            String fname = outImage.getFileName();
            String newname = "gray_" + fname;
            outImage.setFileName(newname);
            outImage = makeGray(outImage);
            outImage.save();          
        }
    
    }
}


    

