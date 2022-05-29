public class Main {
    public static void main(String[] args) {
        // Test constructor and toString()
        InvoiceItem invoiceItem = new InvoiceItem("1", "Dell Laptop", 888, 0.08);
        System.out.println(invoiceItem); // toString();

        // Test setters and getters
        invoiceItem.setQty(999);
        invoiceItem.setUnitPrice(0.99);
        System.out.println(invoiceItem); // toString();
        System.out.println("Id is " + invoiceItem.getId());
        System.out.println("Description is " + invoiceItem.getDesc());
        System.out.println("Quantity is " + invoiceItem.getQty());
        System.out.println("UnitPrice is " + invoiceItem.getUnitPrice());

        System.out.println("Total is " + invoiceItem.getTotal());
    }
}
