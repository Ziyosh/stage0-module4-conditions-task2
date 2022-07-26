package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        first = 23;
        second = 14;

        if(first > second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }
    }

    public static void main(String[] args){
        printGreatest(23);
        printGreatest(14);
        
    }

    private static void printGreatest(int i) {
    }
}
