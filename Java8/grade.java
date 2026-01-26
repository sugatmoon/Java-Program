void main() {
    String name = IO.readln() ;
    int attedance = Integer.parseInt(IO.readln());
    int exam = Integer.parseInt(IO.readln());
    int lab = Integer.parseInt(IO.readln());
    int task = Integer.parseInt(IO.readln());

    double overrall = (attedance + exam + lab + task) /100;
    String gread;

    if ( overrall >= 90){

        gread = "A+";
    }
    else if ( overrall >=80){

        gread = "A";
    }
     else if (overrall >=70){

        gread = "B";
    }
    else if ( overrall >= 60){

        gread = "C";
    }
    else{

        gread = "Fail";
    }

}