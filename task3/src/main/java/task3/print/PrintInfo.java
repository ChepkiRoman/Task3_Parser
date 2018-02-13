package task3.print;


import task3.entity.Tag;

public class PrintInfo {
    public static void print(Tag tag){
        System.out.println(tag.getContent());
        System.out.println(tag.getType());
    }


}
