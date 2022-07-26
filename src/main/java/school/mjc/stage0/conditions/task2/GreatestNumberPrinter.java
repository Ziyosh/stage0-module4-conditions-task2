package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        first = 12;
        second = -400;

        if(first > second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }
    }

    public static void main(String[] args){
        printGreatest(12, -400);
    }

    private static void printGreatest(int i) {

    }
}
