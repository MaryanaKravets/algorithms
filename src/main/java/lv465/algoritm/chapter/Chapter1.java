package lv465.algoritm.chapter;

import lv465.algoritm.util.Reader;
import lv465.algoritm.util.ReaderImpl;

import java.util.*;

public class Chapter1 {
    
    private Scanner scanner=new Scanner(System.in);
    private Reader reader=new ReaderImpl(scanner);
    private List<Integer> list=new ArrayList<>();
    private List<List<Integer>> listList=new ArrayList<>();
    private boolean flag=false;
    

    public int getSmallestNumberGreaterThanGivenNumber(){
        System.out.println("Enter a natural number:");
        int number=0;
        try{
            number = reader.read();
        }catch (InputMismatchException ex){
            ex.printStackTrace();
        }
        int i = 0;

        while (number != 0 & number != 1) {
            number /= 2;
            i++;
        }
        double d=Math.pow(2,i+1);
        System.out.println("The smallest number of 2^r and greater than " + number + " is ");
        return (int) d;
    }
    

    public List<Integer> getThreeNumber() {
        System.out.println("Enter a natural number");

        int number=0;
        boolean flag = false;

        try {
            number=reader.read();
        }catch (InputMismatchException ex){
            ex.printStackTrace();
        }
        
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= number - i * i; j++) {
                for (int k = 1; k <= number - i * i - j * j; k++) {
                    if (number == i * i + j * j + k * k) {
                        list.addAll(Arrays.asList(i,j,k));
                        flag = true;
                        break;
                    }
                }if(flag){break;}
            }if(flag){break;}
        }
        if (!flag) {
            System.out.println("This natural number can't be represented " +
                "as a sum of squares of three number!");
        }
        return list;
    }

    
    public List<List<Integer>> getAllPairOfThreeNumber(){
        int number=0;
        try {
            number = reader.read();
        }catch (InputMismatchException ex){
            ex.printStackTrace();
        }

        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= number - i * i; j++) {
                for (int k = 1; k <= number - i * i - j * j; k++) {
                    if (number == i * i + j * j + k * k) {
                        listList.add(Arrays.asList(i,j,k));
                         System.out.println("i= " + i + " j= " + j + " k= " + k);
                        flag=true;
                    }
                }
            }
        }
        if (!flag){
             System.out.println("This natural number can't be represented " +
                   "as a sum of squares of three number!");
        }
        return listList;
    }
}

