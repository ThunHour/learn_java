import java.util.Scanner;
public class assignment_EB{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Customer Number:");
        
        int cNum=scanner.nextInt();

        System.out.print("Enter Customer Name:");

        String cName=scanner.next();
        
        System.out.print("Enter Customer Previous Month Reading:");

        int preMonth=scanner.nextInt();

        System.out.print("Enter Customer Current Month Reading:");

        int curMonth=scanner.nextInt();

        System.out.print("Your Connection is domestic or commercial:");

        String conType=scanner.next();

        int calu_ele=curMonth-preMonth;

        double cash=0;

        String type="";
        
        if (conType.equalsIgnoreCase("domestic")){
            if (calu_ele<=100 && calu_ele>=0){
                cash += calu_ele*1;
            }
            else if (calu_ele>100 && calu_ele<=200){
                cash +=(100*1)+(calu_ele-100)*2.50;
            }
            else if(calu_ele>200 && calu_ele<=500){
                cash+=(100*1)+(100)*2.50+(calu_ele-200)*4;
            }
            else{
                cash+=(100*1)+(100)*2.50+(300)*4 +(calu_ele-500)*6;
            }
            type+="domestic";
        }
        else if(conType.equalsIgnoreCase("commercial")){
            if (calu_ele<=100 && calu_ele>=0){
                cash += calu_ele*2;
            }
            else if (calu_ele>100 && calu_ele<=200){
                cash +=(100*2)+(calu_ele-100)*4.50;
            }
            else if(calu_ele>200 && calu_ele<=500){
                cash+=(100*2)+(100)*4.50+(calu_ele-200)*6;
            }
            else{
                cash+=(100*2)+(100)*4.50+(300)*6 +(calu_ele-500)*7;
            }
            type+="commercial";
        }
        System.out.println("Customer Number:"+cNum);
        System.out.println("Customer Name:"+cName);
        System.out.println("Previous Month Reading:"+preMonth);
        System.out.println("Current Month Reading"+curMonth);
        System.out.println("Connection Type:"+type);
        System.out.println(String.format("Total cash:"+cash+" rupees"));
    }
}