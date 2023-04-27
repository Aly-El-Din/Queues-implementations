/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class ArrayQueue implements IQueue{
    private Object arr[];
    private int front;
    private int rear;
    private int Capacity=1000;
    private int capacity;
    private int count;
    //parameterized constructor
    ArrayQueue(){
        arr=new Object[Capacity];
        capacity=Capacity;
        front=0;
        rear=0;
        count=0;
    }
    ArrayQueue(int size){
        arr=new Object[size];
        capacity=size;
        front=-1;
        rear=0;
        count=0;
    }
    public boolean isFull(){
        if(count==capacity){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        return false;
    }
    public int size(){
        return count;
    }
    public void insertLast(Object o) throws queueFullException {//enqueue in normal queue
        if(isFull()){
            throw new queueFullException("queue overflow");
        }
        else{
            if(isEmpty()){
                front++;
                arr[front]=o;
            }
            else{
                rear=(rear+1)%capacity;
                arr[rear]=o;
            }
            count++;
            System.out.println(front+" "+rear+" "+count);
        }       
    }
    public void insertFirst(Object o)throws queueFullException{
        if(isFull()){
            throw new queueFullException("Error");
        }
        else{
            if(front==0){
                front=capacity-1;
                arr[front]=o;
            }
            else{
                front--;
                arr[front]=o;
            }
        }
        count++;
    }
    public Object removeFirst() throws queueEmptyException{//dequeue in normal queue
        Object element;
        if(isEmpty()){
            throw new queueEmptyException("queue underflow");
        }
        else{ 
            element=arr[front];
            arr[front]=null;
            front=(front+1)%capacity;
            count--;
        }       
        return element;     
    }
    public Object removeLast()throws queueEmptyException{
        Object element=null;
        if(isEmpty()){
            throw new queueEmptyException("Error");
        }
        else{
            if(rear==0){
                rear=capacity-1;
            }
            else{
                element=arr[rear];
                arr[rear]=null;
                rear--;
            }
        }
        return element;
    }
    public void print(){
        System.out.print("[");
        if(rear>=front){
            for(int i=front ;i<=rear;i++){
                System.out.print(arr[i].value);
                if(i!=rear){
                    System.out.print(", ");
                }
            }
        }
        else{
            if(isEmpty()){
                System.out.println("]");
                return;
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i].value+", ");
            }
            for (int i = front; i < capacity; i++){
               System.out.print(arr[i].value);
                if(i!=capacity-1){
                    System.out.print(", ");
                }
            }

        }
                System.out.print("]");
    }
    public Object front()throws queueEmptyException{
        if(isEmpty()){
            throw new queueEmptyException("queue underflow");
        }
        else{
            return arr[front];
        }
    }
    public void reverse()throws queueEmptyException{
        if(isEmpty()){
            throw new queueEmptyException("queue is empty");
        }
        else{
            int idx;
            if(size()%2==0){
                idx=(size()/2)-1;
            }
            else{
                idx=size()/2;
            }
            for(int i=0;i<=idx;i++){
                int temp=arr[i].value;
                arr[i].value=arr[size()-1-i].value;
                arr[size()-1-i].value=temp;
            }
        }
    }
    public void sortDes(){
        for(int i=0;i<size();i++){
            for(int j=0;j<size()-1;j++){
                if(arr[j+1].value>arr[j].value){
                    int temp=arr[j+1].value;
                    arr[j+1].value=arr[j].value;
                    arr[j].value=temp;
                }
            }
        }
    }
}
