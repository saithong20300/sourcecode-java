
public class WorkingWithLoop {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        
        int start = 9;
        System.out.print(" **   ** ");
        System.out.println();
        
        for (int i = 0; i < 9; i++) {
            if (i == start / 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();

        for (int round = 0; round < 5; round++) {
            for (int space = 0; space < round; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < start; star++) {
                System.out.print("*");
            }
            System.out.println();
            start = start - 2;
        }

    }

}
