import java.io.IOException;

public class Menu {

    /*
	  public int show()
	  will show a menu and accept the choice
	   1. Add
	   2. Subtract
	   3. Multiply
	   4. Divide
	   // Please enter your choice
	   */



    public void show() throws IOException {

        int number1,number2;
        Math math = new Math();
      //  Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter corresponding number for the operation that you would like " +
                    "to perform from below options listed:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Cube");
            System.out.println("6: Square");

            int choice = BasicInput.readInteger();
                    //scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter 1st number : ");
                    number1 = BasicInput.readInteger();
                    System.out.println("Enter 2nd number : ");
                    number2 = BasicInput.readInteger();
                    math.add(number1, number2);
                }
                case 2 -> {
                    System.out.println("Enter 1st number : ");
                    number1 = BasicInput.readInteger();
                    System.out.println("Enter 2nd number : ");
                    number2 = BasicInput.readInteger();
                    math.sub(number1, number2);
                }
                case 3 -> {
                    System.out.println("Enter 1st number : ");
                    number1 = BasicInput.readInteger();
                    System.out.println("Enter 2nd number : ");
                    number2 = BasicInput.readInteger();
                    math.multiplication(number1, number2);
                }
                case 4 -> {
                    System.out.println("Enter 1st number : ");
                    number1 = BasicInput.readInteger();
                    System.out.println("Enter 2nd number : ");
                    number2 = BasicInput.readInteger();
                    math.divide(number1, number2);
                }
                case 5 -> {
                    System.out.println("Enter the number : ");
                    number1 = BasicInput.readInteger();
                    math.cube(number1);
                }
                case 6 -> {
                    System.out.println("Enter the number : ");
                    number1 = BasicInput.readInteger();
                    math.square(number1);
                }
            }

            System.out.print("Do you want to perform more operations?");

         }while(BasicInput.readString().equalsIgnoreCase("y"));  // (scanner.next().equalsIgnoreCase("y"));

       // scanner.close();
    }
}
