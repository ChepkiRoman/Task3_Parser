
package task3.analyser.impl;


import task3.analyser.Analyser;
import task3.analyser.Creator;
import task3.entity.Tag;
import task3.print.PrintInfo;
import task3.reader.impl.CustomXMLReader;

import java.io.IOException;

public class AnalyserImpl implements Analyser {
    private final static String END_OF_TAG = "</";
    private static AnalyserImpl instance = new AnalyserImpl();
    private AnalyserImpl(){}
    public static AnalyserImpl getInstance(){
        return  instance;
    }

    public void analyse() {
        Tag tag = null;
        Creator creator = Creator.getInstance();
        PrintInfo print = new PrintInfo();

        try (CustomXMLReader customXMLReader = new CustomXMLReader()) {
            String content;
            while ((content = customXMLReader.read()) != null) {

                if (content.equals(END_OF_TAG)) {
                    continue;
                }
                tag = creator.createTag(content);
                print.print(tag);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }


}

