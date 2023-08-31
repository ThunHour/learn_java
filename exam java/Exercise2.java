class GException extends Exception {
    GException(String s) {
        super(s);
    }
}

class HException extends Exception {
    HException(String s) {
        super(s);
    }
}

public class Exercise2 {
    static void f() {
        try {
            try {
                g();
            } catch (GException ge) {
                System.out.println("Caught GException in f try");
            
                throw new HException("from f(), inner try");
            }
        } catch (HException he) {
            System.out.println("Caught HException in f() outer try");
        
        }
    }

    static void g() throws GException {
        throw new GException("from g()");
    }

    public static void main(String[] args) {
        f();
    }
}
// class gExpection extends Exception {
//     gExpection(String s) { 
//      super(s); 
//     }
//    }
   
//    class eException extends Exception {
//     eException(String s) {
//      super(s); 
//     }
//    }
   
//    public class Exercise2 {
//     static void f() {
//      try {
//       try {
//        g();
//       } catch(gExpection ge) {
//        System.out.println("Caught gExpection in f inner try");
//        throw new eException("from f(), inner try");
//       }
//      } catch(eException he) {
//       System.out.println("Caught eException in f() outer try");
//      }
//     }
//     static void g() throws gExpection {
//      throw new gExpection("from g()");
//     }
//     public static void main(String[] args) {
//      f();
//     } 
//    }