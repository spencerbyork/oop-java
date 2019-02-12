import java.lang.Math;

public class GuitarString {
  private RingBuffer buffer;
  private final double SAMPLING_RATE = 44100;
  private final double DECAY_FACTOR = 0.994;
  private int num_tic;
  private int capacity;

  public GuitarString(double frequency){
    try{
    capacity = (int) Math.ceil(SAMPLING_RATE / frequency);
    buffer = new RingBuffer(capacity);
    num_tic = 0;
    for(int i = 0; i < capacity; i++){
      buffer.enqueue(0.0);
    }
  }
  catch(Exception ex){
    System.out.println(ex.toString());
  }
}
  public GuitarString(double[] samples){
    try{
    capacity = samples.length;
    buffer = new RingBuffer(capacity);
    for(int i = 0; i < capacity; i++){
      buffer.enqueue(samples[i]);
        }
    num_tic = 0;
  }
  catch(Exception ex){
    System.out.println(ex.toString());
  }
  }

  public void pluck(){
    try{
    for(int i = 0; i < capacity; i++){
      buffer.dequeue();
    }
    for(int i = 0; i < capacity; i++){
      double rand = Math.random() - 0.5;
      buffer.enqueue(rand);
    }
  }
  catch(Exception ex){
    System.out.println(ex.toString());
  }
}

  public void tic(){
    try{
    double a = buffer.dequeue();
    double b = buffer.peek();
    double temp = (a+b) * 0.5 * DECAY_FACTOR;
    buffer.enqueue(temp);
    num_tic++;
  }
  catch(Exception ex){
    System.out.println(ex.toString());
  }
}

  public double sample(){
    double value = 0.0;
    try{
    value = buffer.peek();
  }
  catch(Exception ex){
    System.out.println(ex.toString());
  }
  return value;
}

  public int time(){
    return num_tic;
  }
}
