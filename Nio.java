import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.DoubleBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Piotr on 2015-03-11.
 */
public class Nio {


    public Nio(int[] parametersArray, int alg) throws IOException, InterruptedException {


        RandomAccessFile file = new RandomAccessFile("plik.dat", "rw");
        FileChannel channel = file.getChannel();


        long length = new File("plik.dat").length();

        MappedByteBuffer buf = channel.map(FileChannel.MapMode.READ_WRITE, 0, length);


        buf.position((parametersArray[2] + 1) * 4);


        DoubleBuffer doubleBuffer = buf.asDoubleBuffer();


        for (int i = parametersArray[0] - 5; i < parametersArray[0] + parametersArray[1] - 5; i++) {
            double num = doubleBuffer.get(i);

            if (alg == 1) doubleBuffer.put(i, num * 10);

            if (alg == 2) doubleBuffer.put(i, num - 100);


            Thread.sleep(300);


        }


        file.close();

        buf.force();

        channel.close();


    }
}
