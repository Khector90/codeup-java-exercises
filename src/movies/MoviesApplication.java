package movies;
import Util.Input;


import java.util.Arrays;


public class MoviesApplication {

    public static void main(String[] args) {
        int attempt = 0;
        Input movie = new Input();
        Movie[] movieList = Arrays.copyOf(MoviesArray.findAll(), 100);
        boolean running = true;
        System.out.println(movieList.toString());
//        for(Movie oneMovie : movieList){
//            System.out.println(oneMovie.getGetName());
//        }
        System.out.println("movies");
        System.out.println();
        MOVIES:
        while (running){
            System.out.println("What you want to do");
            System.out.println("0 - exit");
            System.out.println("1 - view all");
            System.out.println("2 - view animated movies");
            System.out.println("3 - view drama");
            System.out.println("4 - view horror");
            System.out.println("5 - view scifi");

            int choice = movie.getInt();

            for(int i = 0; i < movieList.length; i++){

                if(choice == 1){
                    System.out.println(movieList[i].getGetName());
//                    System.out.println("i = " + i);
//                    System.out.println("choice = " + choice);
                }

                else if(choice == 2 && movieList[i].getCategory().equals("animated")){
                    System.out.println("animations");
                    System.out.println(movieList[i].getGetName());
//                    do the same thing as above for the next options
                }

                else if (choice == 3 && movieList[i].getCategory().equals("drama")) {
                    System.out.println("drama");
                    System.out.println(movieList[i].getGetName());
                }

                else if (choice == 4 && movieList[i].getCategory().equals("horror")) {
                    System.out.println("horror");
                    System.out.println(movieList[i].getGetName());
                }

                else if (choice == 5 && movieList[i].getCategory().equals("scifi")) {
                    System.out.println("scifi");
                    System.out.println(movieList[i].getGetName());
//                    continue MOVIES;
                }

            }
            attempt++;
            if (choice == 0){
                  break;
              }

              //if
            // else if
            // else if
            // else if
            // else if
            // else (final thing)
        }
        System.out.println("thank you, please come again" + attempt);
    }


}




