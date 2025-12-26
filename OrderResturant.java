void main() {
IO.println(itemName("Burger"));
IO.print(placeOrder("Pizza", 2));

}


String itemName(String item){
    return "Ordered: " + item;
}

String placeOrder(String item, int quantity){
    return "Ordered: "+item + ","+ quantity;
}