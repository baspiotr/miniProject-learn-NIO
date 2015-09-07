import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Piotr on 2015-03-11.
 */
public class ArrayFinder {


    FileInputStream fis;
    DataInputStream dis;


    public ArrayFinder(String fileName) throws IOException {

        fis = new FileInputStream(fileName);
        dis = new DataInputStream(fis);

    }


    public int[] getSelectedArrayParameters(int k) throws IOException {


        int arrayNumber = 0, sumOfValuesBeforeN = 0, val, firstParametr = 0, needSize = 0;


        while ((val = dis.readInt()) != 0) {


            arrayNumber++;


            if (k == arrayNumber) {

                firstParametr = 1 + sumOfValuesBeforeN;
                needSize = val;


            }
            sumOfValuesBeforeN += val;

        }

        firstParametr += arrayNumber;

        int[] parametrsArray = {firstParametr, needSize, arrayNumber};

        // System.out.println("firstParametr: " + firstParametr + " size: " + needSize);


        fis.close();
        dis.close();

        return parametrsArray;

    }

}
