/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class Entry {
    private Object key;
    private Object element;
    Entry next;
    Entry(Object element,Object key){
        this.element=element;
        this.key=key;
    }
    Entry(Object key,Object element,Entry next){
        this.key=key;
        this.element=element;
        this.next=next;
    }
    public void setNext(Entry newEntry){
        next=newEntry;
    }
    public void setElement(Object newEntryObject){
        element=newEntryObject;
    }
    
    public Object get_element(){
        return element;
    }
    public Object get_priority(){
        return key;
    }
    public Entry getNext(){
        return next;
    }

    
   
    
    
    
}
