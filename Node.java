/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class Node {
    private Object element;
    private Node next;
    //default constructor
    public Node(){
        this(null,null);
    }
    //parameterized constructor
    public Node(Object element,Node next){
        this.element=element;
        this.next=next;
    }
    public Object getElement(){
        return element;
    }
    public Node getNext(){
        return next;
    }
    public void setElement(Object newelem){
        element=newelem;
    }
    public void setNext(Node newNext){
        next=newNext;
    }
}
