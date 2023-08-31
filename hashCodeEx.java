public class hashCodeEx {
    public static void main(String[] args) {
        Integer i=new Integer("20000000000");
        int hashVaule1 = i.hashCode();
        int hashVaule2 = Integer.hashCode(100);// we can only pass integer into hashcode function
        System.out.println("hash value of object one:" + hashVaule1);
        System.out.println("hash value of object two:" + hashVaule2);
    }
}