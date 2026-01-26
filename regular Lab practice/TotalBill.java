void main() {
    double totalBill = 0;
    double []prices= new double[10];

    String name = IO.readln();
    int totalItem = Integer.parseInt(IO.readln());
    for ( int i = 0 ; i<totalItem; i++ ) {
        prices[i] = Double.parseDouble(IO.readln());
    }
    processPayment(name,totalBill, prices);
}
public void processPayment(String name,double totalBill,double ...prices) {
    for (double price : prices){
        totalBill = totalBill + price;
    }
    IO.println("Customer Name : "+ name);
    IO.println("Total Bill    : "+ totalBill);
}