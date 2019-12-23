package lv465.algoritm.view;

import lv465.algoritm.chapter.Chapter1;
import lv465.algoritm.util.Reader;
import lv465.algoritm.util.ReaderImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    
    private Chapter1 chapter1=new Chapter1();
    private Scanner scanner=new Scanner(System.in);
    private Reader reader=new ReaderImpl(scanner);

    public void menu(){
        System.out.println("Enter a number");
        int choice=0;
        try {
            choice=reader.read();
        }catch (InputMismatchException ex){
            ex.printStackTrace();
        }

        switch (choice){
            case 1:
                System.out.println(chapter1.getSmallestNumberGreaterThanGivenNumber());
                break;
            case 2:
                System.out.println(chapter1.getThreeNumber());
                break;
            case 3:
                System.out.println(chapter1.getAllPairOfThreeNumber());
                break;
            default:
                System.out.println("You entered incorrect data");
        }

    }
}
