import java.util.Random;

public class test1
{
    public static void main(String[] args)
    {
            int [][] correct_values ={
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    {0,3,0,0,0,0,0,7,7,7,7,0,0,11,11,11,11,0,0,15,0,0,0,0},
    {0,3,0,0,0,0,0,7,0,0,0,0,0,11,0,0,0,0,0,15,0,0,0,0},
    {0,3,3,3,0,0,0,7,7,7,0,0,0,11,11,11,0,0,0,15,15,15,15,0},
    {0,3,0,0,0,0,0,7,0,0,0,0,0,11,0,0,0,0,0,15,0,0,15,0},
    {0,3,3,3,3,0,0,7,7,7,7,0,0,11,11,11,11,0,0,15,15,15,15,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
};

PGM pgm = new PGM("feep.pgm");
pgm.flip_vertically();
int [][] pixels = pgm.getPixels();

for (int i = 0; i < pgm.getHeight(); i++)
{
    for(int j = 0; j < pgm.getWidth(); j++)
    {
        assert(correct_values[i][j] == pixels[i][j]):  "pixels[" + i + "]["+ j +"] == "+ correct_values[i][j];
    }
}

    }
}
