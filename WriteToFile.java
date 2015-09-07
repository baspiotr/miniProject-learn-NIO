import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Piotr on 2015-03-11.
 */
public class WriteToFile {


    private FileOutputStream fileOutputStream;
    private DataOutputStream dataOutputStream;

    public WriteToFile(String fileName) throws IOException {

        fileOutputStream = new FileOutputStream(fileName);
        dataOutputStream = new DataOutputStream(fileOutputStream);

        writeData();

    }


    private void writeData() throws IOException {


        int n1 = 5, n2 = 2, n3 = 3;

        double[] arrayOne = {1, 2, 3, 4, 5};
        double[] arrayTwo = {6, 7};
        double[] arrayThree = {8, 9, 10};


        dataOutputStream.writeInt(n1);
        dataOutputStream.writeInt(n2);
        dataOutputStream.writeInt(n3);
        dataOutputStream.writeInt(2);


        dataOutputStream.writeInt(0);

        for (Double x : arrayOne) {
            dataOutputStream.writeDouble(x);
        }

        for (Double x : arrayTwo) {
            dataOutputStream.writeDouble(x);
        }

        for (Double x : arrayThree) {
            dataOutputStream.writeDouble(x);
        }

        dataOutputStream.writeDouble(12);
        dataOutputStream.writeDouble(15);


        fileOutputStream.close();
        dataOutputStream.close();


    }


}
