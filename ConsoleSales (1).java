//Subclass Created
public class ConsoleSales extends Consoles {
    
    //Classes used with a SuperClass and Calling them out
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    public void printReport() {
        //Displaying and calling out
        
        String cType = getConsoleType();
        String sName = getStore();
        int sales = getTotalSales();
        //Display Details in this format
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("----------------------------");
        System.out.println("CONSOLE TYPE: " + cType);
        System.out.println("STORE NAME:   " + sName);
        System.out.println("TOTAL SALES:  " + sales);
    }
}
