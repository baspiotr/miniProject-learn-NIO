import java.io.IOException;

/**
 * Created by Piotr on 2015-03-11.
 */
public class Task {


    public Task(int selectedArray, int alg) throws IOException, InterruptedException {


        String fileName = "plik.dat";

        new ReadFromFile(fileName);

        new ArrayFinder(fileName);

        int[] parametersArray = new ArrayFinder(fileName).getSelectedArrayParameters(selectedArray);

        new Nio(parametersArray, alg);


    }
}
