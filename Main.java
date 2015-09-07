import java.io.IOException;

/**
 * Created by Piotr on 2015-03-11.
 */
public class Main {


    public static void main(String args[]) throws IOException, InterruptedException {


        new WriteToFile("plik.dat");

        new Task(1, 1);
        new Task(2, 1);
        new Task(3, 1);
        new Task(4, 1);

        new Task(1, 2);
        new Task(2, 2);
        new Task(3, 2);
        new Task(4, 2);


        new ReadFromFile("plik.dat");

    }


}
