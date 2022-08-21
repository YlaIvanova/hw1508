import java.util.Random;

public class Main {
    public static int []generateRandomArray(){
        java.util.Random random = new java.unil.Random();
        int [] arr = new int [30];
        for ( int i = 0; i< arr.length; i++){
            arr[i]= random.nextInt( 100_000)+100_000;
        }
        return arr;

        public static void main ( String[]args){
            var expenses = generateRandomArray();
            int sum = 0;
            for ( int i=0; i< expenses.length; i++){
                sum + = expenses[i];
            }
            System.out.print("Сумма трат за месяц составила %d рублей",sum);
        }
    }



}