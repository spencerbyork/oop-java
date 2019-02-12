public class GuitarHero{
      public static void main(String[] args) {
        double x = 440;
          // create two guitar strings, for concert A and C

          String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
          String keys = "`1";
          GuitarString[] strings = new GuitarString[37];
          for(int i = 0; i < 37; i++){
            double pitch = x * Math.pow(1.05956, (i - 24));
            strings[i] = new GuitarString(pitch);
          }


          while (true) {

              // check if the user has typed a key; if so, process it
              if (StdDraw.hasNextKeyTyped()) {
                  char key = StdDraw.nextKeyTyped();
                  String test = Character.toString(key);
                  int index = (keyboard.indexOf(key));
                  if(keyboard.contains(test)) {
                    strings[index].pluck(); }
                  else if(test.equals("`")){
                    x /=2;

                    for(int i = 0; i < 37; i++){
                      double pitch = x * Math.pow(1.05956, (i - 24));
                      strings[i] = new GuitarString(pitch);
                    }                  }
                  else if(test.equals("1")){
                    x *=2;;
                    for(int i = 0; i < 37; i++){

                      double pitch = x * Math.pow(1.05956, (i - 24));
                      strings[i] = new GuitarString(pitch);
                    }                  }
              }
              // compute the superposition of samples
              double sample = 0.0;
              for(int i = 0; i < 37; i++){
              sample += strings[i].sample();
}
              // play the sample on standard audio
              StdAudio.play(sample);

              // advance the simulation of each guitar string by one step
              for(int i = 0; i < 37; i++){
              strings[i].tic();
            }
          }
       }
  }
