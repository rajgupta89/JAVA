// import java.util.ArrayList;
import java.util.*;
    public class array1{    
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<String>();
        ArrayList<String>deletedarray=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter Names");
            String name=sc.nextLine();
               if (name.length()>0) {
                   names.add(name);
                   deletedarray.add(name); // this is created to store copy of name and after used for storing names after ddeleting 'ss' containing names
               } else {
                   break;
               }         
        }
        System.out.println("Total names in array: "+names.size());
        // System.out.println("Names that contain ss: "+names.contains("ss"));
        System.out.println("\t\t\tNames that contains 'ss': ");
        
        for (String check : names) {
            if(check.contains("ss")){ 
            System.out.println("\t\t\t"+ check+" \t Index: "+names.indexOf(check)); // print names containing ss and their index
            deletedarray.remove(check); // it will remove all the names which contains 'ss'
            
        }
    }
        // System.out.println("Index of ss: "+names.indexOf("ss"));
        // System.out.println("Index of 0: "+names.get(0));
        // System.out.println("Names that removes ss: "+names.remove("ss"));
        System.out.println("\n");
        System.out.println("Names after deleting 'ss' containing names");
        System.out.println(deletedarray); // print names after deleting 'ss' containg names
    }
}