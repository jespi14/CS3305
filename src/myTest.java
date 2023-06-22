//Name:Javier Espinoza
// Class:CS 3305/Section W01
// Term:Summer 2023
// Instructor:Prof. Majeed
// Assignment:1


import java.util.Scanner;

public class myTest
{
   public static void main (String[] args)
   {
      LinkedList myList = new LinkedList(); //create a list object
      int choice;
      do {
         Scanner sc = new Scanner(System.in);
         System.out.println("\n--------MAIN MENU--------\n1 - Add First Node\n2 - Add Last Node\n3 - Add At Index\n4 - Remove First Node\n5 - Remove Last Node\n6 - Remove At Index\n7 - Print List Size\n8 - Print List(Forward)\n9 - Print List In Reverse\n10 - Exit Program");
         choice=sc.nextInt();
         if(choice==1){
            System.out.println("Please Enter a value");
            int num = sc.nextInt();
            System.out.println("Testing method addFirstNode");
            System.out.println("Contents before adding: ");
            myList.printList();
            System.out.println();
            System.out.println("Contents after adding: ");
            myList.addFirstNode(num);
            myList.printList();



         }
         else if (choice==2){
            System.out.println("Please Enter a value");
            int num = sc.nextInt();
            System.out.println("Testing method addLastNode");
            System.out.println("Contents before adding: ");
            myList.printList();
            System.out.println();
            System.out.println("Contents after adding: ");
            myList.addLastNode(num);
            myList.printList();
         }
         else if (choice==3){
            System.out.println("Please enter a position");
            int pos=sc.nextInt();
            System.out.println("Please Enter a value");
            int num = sc.nextInt();
            System.out.println("Testing method addAtIndex");
            System.out.println("Contents before adding: ");
            myList.printList();
            System.out.println();
            System.out.println("Contents after adding: ");
            myList.addAtIndex(pos,num);
            myList.printList();
         }
         else if (choice==4){
            System.out.println("Removing First Node");
            System.out.println("Testing method RemoveFirstNode");
            System.out.println("Contents before Remove: ");
            myList.printList();
            System.out.println();
            System.out.println("Contents after Remove: ");
            myList.removeFirstNode();
            myList.printList();
         }
         else if (choice==5){
            System.out.println("Removing Last Node");
            System.out.println("Testing method RemoveLastNode");
            System.out.println("Contents before Remove: ");
            myList.printList();
            System.out.println();
            System.out.println("Contents after Remove: ");
            myList.removeLastNode();
            myList.printList();
         }
         else if (choice==6){

            System.out.println("Please enter a position");
            int pos=sc.nextInt();
            System.out.println("Removing at index"+pos);
            System.out.println("Contents before Remove: ");
            myList.printList();
            System.out.println();
            System.out.println("Contents after Remove: ");
            myList.removeAtIndex(pos);
            myList.printList();
         }
         else if (choice==7){
            System.out.println("List size\n"+myList.countNodes());
         }
         else if (choice==8){
            System.out.println("Printing List");
            myList.printList();
         }
         else if(choice==9){
            System.out.println("Print list in reverse");
            myList.printInReverse(myList.head);
         }
         else if(choice==10){
            System.out.println("Thank you for using my program");
         }
         else{
            throw new IndexOutOfBoundsException("Please enter the correct value ");
         }
      }while(choice!=10);

   }





}
    
