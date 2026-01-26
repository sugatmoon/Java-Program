void main() {

    
    IO.println(makingCall("Sugat"));
    IO.println(makingCall(1234567890));
}

String makingCall(String name) {
    return "I am Calling" + name;
}
String makingCall(int phone) {
    return "I am Calling using a phone no. " + phone;
}