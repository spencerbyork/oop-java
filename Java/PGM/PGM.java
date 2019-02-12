import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PGM extends Image
{
  protected int[][] pixels;

  public PGM(){
try{
    FileInputStream fileInStream = new FileInputStream("image.pgm");
     Scanner inFile = new Scanner(fileInStream);


     setMagic(inFile.nextLine());

     setWidth(inFile.nextInt());

     setHeight(inFile.nextInt());

     inFile.nextLine();

     setDepth(inFile.nextInt());

     pixels = new int[height][width];

     for(int i = 0; i < getHeight(); i++){
       for(int j = 0; j < getWidth(); j++){
         pixels[i][j] = inFile.nextInt();
       }
     }
}
catch(IOException e){
  System.out.print(e.toString());
  System.exit(-1);
}
  }

  public PGM(String file){
    try{
    FileInputStream fileInStream = new FileInputStream(file);
     Scanner inFile = new Scanner(fileInStream);

     setMagic(inFile.nextLine());

     setWidth(inFile.nextInt());

     setHeight(inFile.nextInt());

     inFile.nextLine();

     setDepth(inFile.nextInt());

     pixels = new int[height][width];

     for(int i = 0; i < getHeight(); i++){
       for(int j = 0; j < getWidth(); j++){
         pixels[i][j] = inFile.nextInt();
       }
     }
}
catch(IOException e){
  System.out.print(e.toString());
  System.exit(-1);
}
  }


@Override
public void flip_vertically(){
  int[][] temp = new int[height][width];

  for(int i = 0; i < getHeight(); i++){
    for(int j = 0; j < getWidth(); j++){
      temp[i][j] = pixels[i][j];
    }
  }

  for(int i = 0; i < getHeight(); i++){
    for(int j = 0; j < getWidth(); j++){
      pixels[i][j] = temp[getHeight()-(i+1)][j];
    }
  }
  setWidth(pixels[0].length);
  setHeight(pixels.length);
}

@Override
public void flip_horizontally(){
  int[][] temp = new int[height][width];

  for(int i = 0; i < getHeight(); i++){
    for(int j = 0; j < getWidth(); j++){
      temp[i][j] = pixels[i][j];
    }
  }

  for(int i = 0; i < getHeight(); i++){
    for(int j = 0; j < getWidth(); j++){
      pixels[i][j] = temp[i][getWidth()-(j+1)];
    }
  }
  setWidth(pixels[0].length);
  setHeight(pixels.length);
}


@Override
public void rotate_right_90(){
  int[][] temp = new int[height][width];

  for(int i = 0; i < getHeight(); i++){
    for(int j = 0; j < getWidth(); j++){
      temp[i][j] = pixels[i][j];
    }
  }
  pixels = new int[getWidth()][getHeight()];
  for(int i = 0; i < getWidth(); i++){
    for(int j = 0; j < getHeight(); j++){
      pixels[i][j] = temp[getHeight() - (j+1)][i];
    }
  }
  setWidth(pixels[0].length);
  setHeight(pixels.length);
}


public void save() throws IOException{
  FileOutputStream fileByteStream = null;
        PrintWriter outFS = null;

  fileByteStream = new FileOutputStream("out.pgm");
      outFS = new PrintWriter(fileByteStream);

      outFS.println(getMagic());
      outFS.println(getWidth() + " " + getHeight());
      outFS.println(getDepth());
      for(int i = 0; i < getHeight(); i++){
        for(int j = 0; j < getWidth(); j++){
          outFS.print(pixels[i][j] + " ");
        }
        outFS.println("");
      }
      outFS.flush();

      // Done with file, so try to close it
      fileByteStream.close(); // close() may throw IOException if fails

}

public int[][] getPixels(){
  return pixels;
}
}
