void main() {

String day = "monday";
//IO.readln().toLowerCase();

String typeDay = switch (day) {
    case "monday", "tuesday", "wednesday", "thursday", "friday" -> "Weekday";

    case "satursday", "sunday" -> "Weekend";

    default -> "Invalid Day";
};

IO.println(day.toUpperCase() + "is a "+ typeDay);



}