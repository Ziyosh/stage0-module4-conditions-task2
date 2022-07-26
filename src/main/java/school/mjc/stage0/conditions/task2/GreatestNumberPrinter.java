package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        first = 12;
        second = 23;

        if(first > second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }
    }

    public static void main(String[] args){
        printGreatest(23);
        printGreatest(12);
        
    }

    private static void printGreatest(int i) {
    }
}
