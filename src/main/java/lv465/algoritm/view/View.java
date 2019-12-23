package lv465.algoritm.view;

import lv465.algoritm.chapter.Chapter1;
import lv465.algoritm.util.Reader;
import lv465.algoritm.util.ReaderImpl;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class View {

    private static Logger logger = Logger.getLogger(Chapter1.class.getName());
    private Chapter1 chapter1 = new Chapter1();
    private Scanner scanner = new Scanner(System.in);
    private Reader reader = new ReaderImpl(scanner);

    public void menu() {
        logger.info("Enter a number:");
        int choice = 0;
        try {
            choice = reader.read();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        switch (choice) {
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
                logger.info("You entered incorrect data");
        }

    }
}
