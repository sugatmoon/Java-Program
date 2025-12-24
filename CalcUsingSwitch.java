void main() {

int a = Integer.parseInt(IO.readln());
int b = Integer.parseInt(IO.readln());
char oprator = IO.readln().toLowerCase().charAt(0);

String result = switch (oprator) {
    case 'a' -> ""+(a + b);
    case 's' -> ""+(a - b);
    case 'm' -> ""+(a * b);
    case 'd' -> ""+(a / b);
    default -> "Invalid Input";
};

IO.print("Result:" + result);
}