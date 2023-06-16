// Add your header here

import java.util.Scanner;

public class myTest
{
   public static void main (String[] args)
   {
      LinkedList myList = new LinkedList(); //create a list object
   
      for (int i=1; i <= 5; i++) //add 5 nodes to the list
      {
         myList.addFirstNode(i*10);
      } 
      
      //print out the list content
      System.out.print("My test list values are:  ");
      myList.printList();
      System.out.println();    
   }
   /*
   public static void Menu(){
      int choice;
      do {
         Scanner sc = new Scanner(System.in);
         System.out.println("--------MAIN MENU--------\n1 - Add First Node\n2 - Add Last Node\n3 - Add At Index\n4 - Remove First Node\n5 - Remove Last Node\n6 - Remove At Index\n7 - Print List Size\n8 - Print List(Forward)\n9 - Print List In Reverse\n10 - Exit Program");
         choice=sc.nextInt();
      }while(choice!=10);


   }
   */
}
    
