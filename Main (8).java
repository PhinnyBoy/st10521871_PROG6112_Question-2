import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //Prompting user to enter Details
        System.out.print("Enter console device type: ");
        String consoleType = sc.nextLine();

        System.out.print("Enter store name: ");
        String store = sc.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = sc.nextInt();

        // Instantiate ConsoleSales object
        //Costructor and object used
        ConsoleSales obj = new ConsoleSales(consoleType, store, totalSales);

        
        System.out.println();
        obj.printReport(); 

  
    }
}