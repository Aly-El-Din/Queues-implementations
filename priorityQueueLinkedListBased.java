/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class priorityQueueLinkedListBased {
    private Entry head;
    private Entry tail;
    private int size=0;
    private Object priority;
    public priorityQueueLinkedListBased(){
        head=null;
        tail=null;
        priority=null;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    
    public void remove_min(){
        if(isEmpty()){
            System.out.println("Error");
            return;
        }
        Entry temp=head;
        head=temp.getNext();
        temp.setNext(null);
    }
    public void push(Entry e){
        if(isEmpty()){
            head=e;
            tail=e;
            size++;
        }
        else{
            Entry temp1=head;
            Entry temp2=head;
            while(temp1!=null && temp1.get_priority().value<e.get_priority().value){
                temp2=temp1;
                temp1=temp1.getNext();
            }
            if(temp1==head){
                e.setNext(temp1);
                head=e;
                size++;
                return;
            }
            if(temp1==null){
                temp2.setNext(e);
                e.setNext(null);
               size++;
                return;
            }
            temp2.setNext(e);
            e.setNext(temp1);
            size++;
        }        
    }
    
    public void print(){
        Entry temp=head;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.get_element().value);
            temp=temp.getNext();
            if(temp!=null){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
