public class RingBuffer{

  private double [] items;
  private int start;
  private int end;
  private int count;


  public RingBuffer(int capacity){
    items = new double[capacity];
    count = 0;
    start = 0;
    end = 0;
  }

  public int size(){
    return count;
  }

  public boolean isEmpty(){
    if(count == 0)
      return true;
    else
      return false;
    }

  public boolean isFull(){
    return count == items.length;
  }

  public void enqueue(double x) throws Exception {
     if(!isFull()){
      items[end] = x;
    end = (end + 1) % this.items.length;
    count++;
  }
}

  public double dequeue() throws Exception {
    if(isEmpty()){
      throw new Exception("buffer is empty.");
    }
    double item = items[start];
    start = (start + 1) % items.length;
    count--;
    return item;

}

  public double peek() throws Exception {
    if(isEmpty()){
      throw new Exception("Buffer is empty.");
    }

    return items[start];

  }

}
