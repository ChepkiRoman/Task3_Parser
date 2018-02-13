package by.tc.task3_Impl.Main;

import task3.analyser.Analyser;
import task3.analyser.impl.AnalyserImpl;

public class Main {
    public static void main(String[] args) {
        Analyser analyser = AnalyserImpl.getInstance();
        analyser.analyse();
    }
}
