/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class doubleNode {
    Object obj;
    doubleNode next;
    doubleNode prev;
    doubleNode(Object obj){
        this.obj=obj;
    }
    doubleNode(Object obj,doubleNode next,doubleNode prev){
        this.obj=obj;
        this.next=next;
        this.prev=prev;
    }
}
