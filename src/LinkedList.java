/*
This class define a linked list that stores integer values.
*/
//Name:Javier Espinoza
// Class:CS 3305/Section W01
// Term:Summer 2023
// Instructor:Prof. Majeed
// Assignment:1
public class LinkedList
{

   public Node head, tail;

   //constructor method to create a list of object with head, tail, and size. 
   public LinkedList()
   {
      head = null;
      tail = null;
   }
  
   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }
  
   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
      if(tail==null)
         head=tail=new Node(data); // if the list is empty
      else {
         Node newNode= new Node(data);//makes a new node with the data

         newNode.next=head;//the new node will point to the head of the linked list
         head=newNode;// the head of the node will be the newly created node
      }
   }
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
      Node temp;//makes a pointer node
      int size = countNodes();
      if(index<=1){
         //if the user selects index 0, then will call the "addFirstNode" method
         addFirstNode(data);
      }
      else if(index>size){
         //if the index is larger than the size then will call the "addLastNode"
         addLastNode(data);
      }
      else{
         for(int i=1;i<=index-1;i++){
            temp=head;//makes the pointer, point to the head


            temp=temp.next;//after each loop, will traverse the Linked List, stopping at index-1
            Node newNode = new Node(data);//Once stopped at the location, it creates a new node with the data
            newNode.next=temp.next;//once the node is created it, it will point to the next node
         }


      }

   }
      
   //method #3: remove first node
   public void removeFirstNode()
   {
      removeAtIndex(0);//will call the removeAtIndex at position 0;

   }
      
   //method #4: remove last node
   public void removeLastNode()
   {
      int size= countNodes();// will call countNodes to see how big the list is and will store this in an int
      removeAtIndex(size-1);//Once the size of the list is found it will remove the node at the last position -1

   }
    
   //method #5: remove node at index
   public void removeAtIndex(int index) {
      Node temp;//pointer node
      temp = head;//pointer node will point to the head
      int size = countNodes();// will get the size of the linked list
      if(index==0){
         removeFirstNode();//if index is zero then it will remove the first node
      }
      else if (index>=size){
         removeLastNode();//if the index is greater than the size, then it will remove the last node
      }
      else{
         for(int i = 0;i<index;i++){

            temp=temp.next;// for each iteration, it will move down the linked list until it get to the index desired
         }
         temp=null;//will change the data to nothing
         temp.next=temp.next.next;//will move the next node to the next node after

      }


   }
          
   //method #6: countNodes
   public int countNodes() {
      int listSize = 0;//a field to count the value of how big the list is
      if(head==null){
         return 0;//if the list is empty them it will send a value of 0
      }
      else{
            Node temp;//temp node to point
            temp=head;//will count the head
            while(temp!=null)//This loop will run while the pointer node is not empty
            {
               listSize++;//will count the node
               temp = temp.next;// will move the pointer to the next node
            }
      }

      //complete this method
    return listSize;
   }



   //method #7: printInReverse  (Recursive method)
   public void printInReverse(Node L)
   {
      if(L==null){//if the node is null then retunr
         return;
      }
      printInReverse(L.next);//if there is data in the node , then call this method until there is a node with no data
      System.out.print(L.data+" ");//once we find a node with no data, we will print that last node with data and print all the way to the head


   }

   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

