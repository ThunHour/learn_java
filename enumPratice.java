import java.util.*;
enum name {
    HOUR, CHINA, RITH, HENG, HOR, SEIHA
};

public class enumPratice {
    public static void main(String[] args) {
        Set<name> set1 ;
        set1 = EnumSet.of(name.CHINA, name.RITH, name.SEIHA);
        System.out.println("Some element:"+set1);
        set1 = EnumSet.allOf(name.class);
        System.out.println("All element:"+set1);
        set1 = EnumSet.range(name.HOUR, name.SEIHA);
        System.out.println("range:"+set1);
        // set2 = EnumSet.complementOf(set1);
    }
}
