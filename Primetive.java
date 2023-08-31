public class Primetive {

    public static void main(String[] args) {

        // byte a;
        // short b;
        // int c;
        // long d;
        // float e;

        // int c = 6;
        // double f = 55.5;

        // // You can not change from double to int but int can be double 
        // // int g = f; //It will throw an error 
        // double g = c;

        // // There is the ways you can do it but it will lose number after .
        // int h = (int)f;

        // System.out.println(h);

        //First way to declear the strings
        String str = "John, Jenny, jim, Jack Joe";
        String str1 = "John, Jenny, jim, Jack Joe";

        if(str == str1) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println(str);
        System.out.println(str.length());


        // create new one each time, so they will not go the same part of memory 
        String str3 = new String("John, Jenny, jim, Jack Joe");
        String str4 = new String("John, Jenny, jim, Jack Joe");
        System.out.println(str3);
        if(str3 == str4) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        String str5 = "abc";
        String str6 = "bcde";

        System.out.println(str5+str6);




    }
    
}
