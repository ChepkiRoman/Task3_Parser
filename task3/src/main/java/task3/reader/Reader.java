package task3.reader;

import java.io.Closeable;
import java.io.IOException;

public interface Reader extends Closeable {
   public String read() throws IOException;
}
