public abstract class Image
{
    // ---------------------
    // Image attributes
    // ---------------------
    protected String magic;
    protected int width;
    protected int height;
    protected int depth;

    // Accessors: getMagic(), getWidth(), etc...
      public String getMagic(){
        return magic;
      }
      public int getWidth(){
        return width;
      }
      public int getHeight(){
        return height;
      }
      public int getDepth(){
        return depth;
      }
      
    // Modifiers: setMagic(string m), setWidth(int w), etc...
      public void setMagic(String m){
        magic = m;
      }
      public void setWidth(int w){
        width = w;
      }
      public void setHeight(int h){
        height = h;
      }
      public void setDepth(int d){
        depth = d;
      }
    // -------------------
    // abstract functions
    // -------------------
    public abstract void flip_horizontally();
    public abstract void flip_vertically();
    public abstract void rotate_right_90();
}
