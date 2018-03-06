package task3.analyser;

import task3.entity.Tag;

import java.io.IOException;

public interface Analyser {
    Tag analyse() throws IOException;
}
