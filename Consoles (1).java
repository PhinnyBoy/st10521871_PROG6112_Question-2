//Abstract class
public abstract class Consoles implements IConsoles {
    private String consoleType;
    private String Store; // Small mistake: Variable name starts with capital letter
    private int totalSales;

    public Consoles(String consoleType, String Store, int totalSales) {
        this.consoleType = consoleType;
        this.Store = Store;
        this.totalSales = totalSales;
    }

    //Calling out methods
    public String getConsoleType() {
        return consoleType;
    }
//Method used 
    public String getStore() {
        return Store;
    }
//Method used to get the total Sales of Store
    public int getTotalSales() {
        return totalSales;
    }
}