public class InvoiceItem_Demo {

    // Declare variables
    private int invoiceId;
    private String invoiceDesc;
    private int invoiceQty;
    private double invoiceItemPrice;

    // Constructor to initialize the values
    public InvoiceItem_Demo(int invoiceId, String invoiceDesc, int invoiceQty, double invoiceItemPrice) {
        this.invoiceId = invoiceId;
        this.invoiceDesc = invoiceDesc;
        this.invoiceQty = invoiceQty;
        this.invoiceItemPrice = invoiceItemPrice;
    }

    // Getter and Setter methods for InvoiceId
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    // Getter and Setter methods for InvoiceDesc
    public String getInvoiceDesc() {
        return invoiceDesc;
    }

    public void setInvoiceDesc(String invoiceDesc) {
        this.invoiceDesc = invoiceDesc;
    }

    // Getter and Setter methods for InvoiceQty
    public int getInvoiceQty() {
        return invoiceQty;
    }

    public void setInvoiceQty(int invoiceQty) {
        this.invoiceQty = invoiceQty;
    }

    // Getter and Setter methods for InvoiceItemPrice
    public double getInvoiceItemPrice() {
        return invoiceItemPrice;
    }

    public void setInvoiceItemPrice(double invoiceItemPrice) {
        this.invoiceItemPrice = invoiceItemPrice;
    }

    // Method to calculate the invoice total based on quantity
    public void printInvoicePrice() {
        if (invoiceQty == 1) {
            System.out.println("Invoice Item Price: " + invoiceItemPrice);
        } else if (invoiceQty > 1) {
            System.out.println("Total Invoice Price: " + (invoiceItemPrice * invoiceQty));
        } else {
            System.out.println("Invalid quantity.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of InvoiceItem_Demo
        InvoiceItem_Demo invoice1 = new InvoiceItem_Demo(101, "Laptop", 1, 1000.00);
        InvoiceItem_Demo invoice2 = new InvoiceItem_Demo(102, "Mouse", 3, 25.50);

        // Print the invoice prices based on the quantity
        System.out.println("Invoice 1:");
        invoice1.printInvoicePrice();  // Should print InvoiceItemPrice
        System.out.println("\nInvoice 2:");
        invoice2.printInvoicePrice();  // Should print the total price (InvoiceItemPrice * InvoiceQty)
    }
}
