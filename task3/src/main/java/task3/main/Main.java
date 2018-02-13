package task3.main;

import task3.analyser.Analyser;
import task3.analyser.impl.AnalyserImpl;

import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        Analyser analyser = AnalyserImpl.getInstance();
        analyser.analyse();

        }
}
