package Zadacha3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Bag>bag1 = new ArrayList<>();
        for (int i=0;i<22;i++){
            if (i<20){
                bag1.add(new Balls("pingball"));
            } else {
                bag1.add(new Liquid("dushes"));
                bag1.add(new Book("harry potter"));
            }
        }
        ArrayList <Bag>bag2 = new ArrayList<>();
        for (int i=0;i<52;i++){
            if (i<50){
                bag2.add(new Balls("basketball"));
            } else {
                bag2.add(new Liquid("lemonade"));
                bag2.add(new Book("voina i mir"));
            }
        }
        ArrayList <Bag>bag3 = new ArrayList<>();
        for (int i=0;i<5;i++){
            if (i<3){
                bag3.add(new Balls("football"));
            } else {
                bag3.add(new Liquid("pepsi"));
                bag3.add(new Book("alipe"));
            }
        }
    }
}
