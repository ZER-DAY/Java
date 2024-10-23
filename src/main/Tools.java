package main;

public class Tools {

    public final static  double pi = 3.14;


    public  static  int factorel(int myNumber ){
    int result= 1  ;

    for (int index = 1 ; index <= myNumber ; index++ ){
        result *= index;
    }
        return result;
    }
}
