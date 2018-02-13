package task3.reader.impl;

import task3.reader.Reader;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.util.ResourceBundle;

public class CustomXMLReader implements Reader,Closeable {

    private static final Character END_OF_TAG = '>';
    private static final Character SLASH = '/';
    private static String filePath = ResourceBundle.getBundle("source_name").getString("source.name");
    private BufferedReader reader;

    public CustomXMLReader() throws IOException {
        reader = new BufferedReader(new FileReader(filePath));
    }

    public String read() throws IOException {
        StringBuilder builder = new StringBuilder();
        int nextChar;
        while ((nextChar = reader.read()) != -1) {
            if ((char) nextChar == (END_OF_TAG) || (char) nextChar == SLASH) {
                builder.append((char) nextChar);
                break;
            }
            builder.append((char) nextChar);

        }
        if (nextChar == -1) {
            return null;
        }
        return builder.toString().trim();

    }

    public void close() throws IOException {
        reader.close();
    }


}