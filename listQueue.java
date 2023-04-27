/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class listQueue {
   private Node head;
   private Node tail;
   private int size;
   public static class emptyLinkedList extends Exception{
       public emptyLinkedList(String message){
           super(message);
       }
   }
   public listQueue(){
       head=null;
       tail=null;
       size=0;
   }
   public boolean isEmpty(){
       if(size==0){
           return true;
       }
       return false;
   }
   public int size(){
       return size;
   }
   public void insertToFirst(Object o){
       if(isEmpty()){
            Node newNode=new Node(o,null);
            head=newNode;
            tail=newNode;
       }
       else{
           Node newNode=new Node(o,head);
           head=newNode;
       }
       size++;
   }
   public void enqueue(Object o){//in deQues insert at last
       if(isEmpty()){
            Node newNode=new Node(o,null);
            head=newNode;
            tail=newNode;
       }
       else{
           Node newNode=new Node(o,null);
           tail.setNext(newNode);
           tail=newNode;
       }
       size++;
   }
   //circular queue
   public void circularEnqueue(Object o){
       Node newNode=new Node(o,null);
       if(isEmpty()){
           head=newNode;
           tail=newNode;
           newNode.setNext(head);
       }
       else{
           tail.setNext(newNode);
           tail=newNode;
           newNode.setNext(head);
       }
       size++;
   }
   public Object circularDequeue()throws emptyLinkedList{
       Node h=head;
       if(h==null){
           throw new emptyLinkedList("Error");
       }
       else{
           head=head.getNext();
           h.setNext(null);
           tail.setNext(head);
       }
       return h.getElement();
   }
   public void printCircular(){
       Node t1=head;
       System.out.print("[");
       if(head!=null){
           System.out.print(head.getElement().value+",");
       }
       else{
           System.out.print("]");
           return;
       }
        Node t2=head.getNext();
        while(t2!=t1){
            System.out.print(t2.getElement().value);
            t2=t2.getNext();
            if(t2!=t1){
                System.out.print(",");
            }
        }
        System.out.print("]");
   }
   public Node front(){
       return head;
   }
   public Object dequeue() throws emptyLinkedList{//in deQues remove first
       Node res;
       if(isEmpty()){
           throw new emptyLinkedList("Error");
       }
       else{
           res=head;
           Node temp=head.getNext();
           head.setNext(null);
           head=temp;
       }
       size--;
       return res.getElement();
   }
   public Object removeLast()throws emptyLinkedList{
       Node res;
       if(isEmpty()){
           throw new emptyLinkedList("Error");
       }
       else{
           res=tail;
           Node bef=head,after=head;
           while(after!=tail){
               bef=after;
               after=after.getNext();
           }
           bef.setNext(null);
           tail=bef;
       }
       size--;
       return res.getElement();
   }
   public void insert(Object o,int index){
       if(isEmpty()){
           insertToFirst(o);
       }
       else if(index>=size){
           enqueue(o);
       }
       else{
           Node newNode=new Node(o,null);
           Node bef=head;
           int idx=0;
           while(idx!=index-1){
               bef=bef.getNext();
               idx++;
           }
           Node aft=bef.getNext();
           bef.setNext(newNode);
           newNode.setNext(aft);
       }
   }
   public void removeIdx(int index){
       if(isEmpty()){
           System.out.println("Error");
           return;
       }
       else{
           if(head==null){
               return;
           }
           Node temp = head;
           if(index==0){
               try{
                   head=head.getNext();
               }
               catch(Exception e){
                   System.out.println("error");
               }
           }
           for (int i = 0; temp != null && i < index-1;
             i++)
            temp = temp.getNext();
         if (temp == null || temp.getNext() == null)
            return;
         Node next=temp.getNext().getNext();
         temp.setNext(next);
       }
   }
   public void removeAll(int val){
       Node temp=head;
       Node prev=head;
       while(temp!=null && temp.getElement().value==val){
           head=head.getNext();
           temp=head;
       }
       while(temp!=null){
           while(temp!=null && temp.getElement().value!=val){
               prev=temp;
               temp=temp.getNext();
           }
           if(temp==null){
               return;
           }
           prev.setNext(temp.getNext());
           temp=prev.getNext();

       }
   }
   public void sortList(){
       Node temp1=head;
       Node temp2=head.getNext();
       int aux;
       while(temp1!=null){
           temp2=temp1.getNext();
           while(temp2!=null){
               if(temp1.getElement().value>temp2.getElement().value){
                   aux=temp1.getElement().value;
                   temp1.getElement().value=temp2.getElement().value;
                   temp2.getElement().value=aux;
               }
               temp2=temp2.getNext();
           }
           temp1=temp1.getNext();
       }
   }
   public void insertSorted(Object o){
       sortList();
       Node sortedNode=new Node(o,null);
       Node temp=head;
       Node prev=head;
       while(temp!=null){
           if(temp.getElement().value<o.value){
               prev=temp;
               temp=temp.getNext();
           }
           else{
               prev.setNext(sortedNode);
               sortedNode.setNext(temp);
               break;
           }
       }
   }
   public void reverse(){
       Node current=head;
       Node before=null;
       Node after=current.getNext();
       while(after!=null){
           current.setNext(before);
           before=current;
           current=after;
            after=after.getNext();
       }
       current.setNext(before);
       head=current;
   }
   public void print(){
       Node temp=head;
       System.out.print("[");
       while(temp!=null){
           System.out.print(temp.getElement().value);
           temp=temp.getNext();
           if(temp!=null){
               System.out.print(",");
           }
       }
       System.out.print("]");
   }
}
