import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkList list1 = new LinkList();

        for(int i=0;i<5;i++){
            System.out.print("enter number");
            list1.InsertFirst(sc.nextInt());
        }

       if( list1.InsertAfter(10, 40)==true)
       list1.DisplayList();

       if(list1.DeleteMidd(50)==true){
                list1.DisplayList();
       }
    }
}
