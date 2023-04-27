/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class DLLdeQues {
    private doubleNode head;
    private doubleNode tail;
    private int size;
    public DLLdeQues(){
        head=null;
        tail=null;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void addToLast(Object o){
        doubleNode newNode=new doubleNode(o);
        if(isEmpty()){
            addToFirst(o);
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
            tail.next=null;
        }
        size++;
    }
    
    public void addToFirst(Object o){
        doubleNode newNode=new doubleNode(o);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            head.next=null;
            tail.next=null;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public Object removeFirst(){
        doubleNode element;
        if(isEmpty()){
            System.out.println("Error");
            return null;
        }
        else{
            doubleNode temp=head.next;
            element=head;
            head.next=null;
            head=temp;
        }
        size--;
        return element.obj;
    }
    public Object removeLast(){
        doubleNode element;
        if(isEmpty()){
            System.out.println("Error");
            return null;
        }
        else{
            doubleNode temp=tail.prev;
            element=tail;
            temp.next=null;
            tail.prev=null;
            tail=temp;
        }
        return element.obj;
    }
    public Object getLast(){
        return tail.obj;
    }
    public Object getFirst(){
        return head.obj;
    }
    
    public void print(){
        System.out.print("[");
        doubleNode temp=head;
        while(temp!=null){
            System.out.print(temp.obj.value);
            temp=temp.next;
            if(temp!=null){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
