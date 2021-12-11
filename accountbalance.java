import pakage.balance;
import java.util.Date;
import java.util.*;
import java.util.regex.*;
public class accountbalance {
    public static void main(String[] args) {
        balance obj=new balance("Raj", 25.2);
        obj.show();
        System.out.println("Date : "+ new Date());
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter mobile no. :");
            String mobile=sc.nextLine();
            Pattern p=Pattern.compile("[0-9]{10}");
            Matcher m=p.matcher(mobile);
            if(m.matches())
            {
                System.out.println("valid no");
            }
            else
            {
                System.out.println("Invalid no");
            }
        }
    }
}
