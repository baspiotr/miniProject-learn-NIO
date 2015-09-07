import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Piotr on 2015-03-11.
 */
public class ReadFromFile {

    FileInputStream fis;
    DataInputStream dis;


    public ReadFromFile(String fileName) throws IOException {

        fis = new FileInputStream(fileName);
        dis = new DataInputStream(fis);

        printBinaryFile();

    }

    private void printBinaryFile() throws IOException {


        int val = -1, sum = 0;

        while (true) {

            val = dis.readInt();

            sum += val;
            System.out.print(val + " ");


            if (val == 0) break;

        }


        for (int i = 0; i < sum; i++) {

            System.out.print(dis.readDouble() + " ");

        }

        System.out.println();


        fis.close();
        dis.close();

    }


}
