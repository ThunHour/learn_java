public class Slicing {

    public static void main(String[] args) {

        // Substring is slicing in Java


        String str = "Monirith";

        System.out.println(str.substring(0,6));


        String str1 = new String("John, Jenny, jim, Jack, Joe");

        String[] arrayString = str1.split(", ");

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

        
        String str3 = "Michel";

        StringBuffer rev = new StringBuffer(str3);

        System.out.println(rev.reverse());



        String str4 = "Huot Monirith";


        for (int i = str4.length()-1 ; i >= 0; i--) {
            System.out.println(str4.charAt(i));
        }
    
    }
}
    

