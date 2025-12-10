void main() {
    double fahren = Double.parseDouble(IO.readln("Enter the measurement Fahrenheit:"));


    double celci = ((fahren-32)*5)/9;

    IO.print(celci);
}