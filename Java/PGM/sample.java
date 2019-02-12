import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class sample
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a PGM file name to read: ");
        String file = sc.nextLine();

        PGM PGMImage = new PGM (file);
        PGMImage.flip_vertically();

        PGMImage.save();

    }
}
