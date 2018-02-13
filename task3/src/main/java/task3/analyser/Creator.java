package task3.analyser;

import task3.entity.Tag;
import task3.entity.Type;

public class Creator {
    private static final String START_TAG = "<[^>]+>";;
    private static final String END_TAG = "[a-zA-Z 0-9 _,.+=^&*%$#@!]+>";
    private static final String CONTENT = "([\\S \\n]+</)";
    private static final String EMPTY_ELEMENT = "<.+/>";

    private static Creator instance = new Creator();
    private Creator (){};
    public static Creator getInstance(){
        return instance;
    }

    public  Tag createTag(String content) {
        Tag tag = new Tag();

        if (content.matches(START_TAG)) {
            tag.setContent(content);
            tag.setType(Type.START_TAG);
            return tag;
        }

        if (content.matches(END_TAG)) {
            tag.setContent(content);
            tag.setType(Type.END_TEG);
            return tag;
        }

        if (content.matches(CONTENT)) {
            tag.setContent(content);
            tag.setType(Type.CONTENT);
            return tag;
        }

        if (content.matches(EMPTY_ELEMENT)) {
            tag.setContent("Empty element");
            tag.setType(Type.EMPTY_ELEMENT);
            return tag;
        }
        return null;
    }


}
