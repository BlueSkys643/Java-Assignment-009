import java.util.Scanner;

public class ArrayProcessing {
    int[] intArray;// = new int[5];
    Scanner scan;// = new Scanner(System.in);

    public ArrayProcessing () {
        intArray = new int[5];
        scan = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }
    public void getNumbers() {
        System.out.println("ENTER " + intArray.length + " NUMBERS");
        for (int i=0;i<intArray.length;i++) {
            intArray[i] = scan.nextInt();
        }
    }
    public void processNumbers() {
        boolean tester = true;
        //while (tester) {
            try {
                int action = printMenu();
                switch (action) {
                    case 1:
                        //add
                        add();
                        break;
                    case 2:
                        //mult
                        mult();
                        break;
                    case 3:
                        //print
                        prnt();
                        break;
                    case 4:
                        //reverse print
                        rev_prnt();
                        break;
                    case 0:
                        tester = false;
                }
                again();
            } catch (Exception e) {
                System.out.println("Encountered an issue. You need to enter an integer between 1 and 4.");
            }
        //}
    }
    public static int printMenu () {
        System.out.printf("Choose an option to perform:\n" +
                "1) Add numbers\n" +
                "2) Multiply numbers\n" +
                "3) Print numbers\n" +
                "4) Print number in reverse\n" //+
                //"0) Exit code\n"
        );
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public void add() {
        int sum = 0;
        for (int i=0;i<intArray.length;i++) {
            sum += intArray[i];
        }
        System.out.println(sum);
    }
    public void mult () {
        int sum = 1;
        for (int i=0;i<intArray.length;i++) {
            sum = sum * intArray[i];
        }
        System.out.println(sum);
    }
    public void prnt () {
        String result = "";
        for (int i=0;i<intArray.length;i++) {
            result = result + " " + intArray[i];
        }
        System.out.println(result);
    }
    public void rev_prnt () {
        String result = "";
        for (int i=intArray.length-1;i>0;i--) {
            result = result + " " + intArray[i];
        }
        System.out.println(result);
    }
    public void again() {
        System.out.print("would you like another go? \n1) YES \n2) NO\n");
        Scanner scan = new Scanner(System.in);
        int response = scan.nextInt();
        if (response == 1) {
            processNumbers();
        }
        if (response == 2) {
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        ArrayProcessing ap = new ArrayProcessing();
    }
}
