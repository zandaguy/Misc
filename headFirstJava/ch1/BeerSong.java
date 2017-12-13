public class BeerSong {
    public static void main(String[] args) {
        int numOfBeers = 99;
        String word = "bottles";

        while(numOfBeers > 0) {

            if(numOfBeers == 1) {
                word = "bottle";
            }

            System.out.println(numOfBeers + " " + word + " of beer on the wall");
            System.out.println(numOfBeers + " " + word + " of beer");
            System.out.println("Take one down");
            // System.out.println("Pass it around");
            numOfBeers--;

            if(numOfBeers > 0) {
                System.out.println(numOfBeers + " " + word + " of beer on the wall!" + "\n");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
