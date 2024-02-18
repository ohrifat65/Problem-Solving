
import java.util.Scanner;

abstract class Book{
    
    String title;
    abstract void setTitle(String s);
    
    String getTitle(){
        return title;
    }
    
}

class Solution extends Book {
    

    @Override
    void setTitle(String s) {
        super.title=s;
    }
        
    public static void main(String[] args) {
          Book ob=new Solution();
//          Scanner sc=new Scanner(System.in);
//          String s=sc.nextLine();
          ob.setTitle("A tale of two cities");
          System.out.println("The title is: "+ob.getTitle());
  
    }
}
