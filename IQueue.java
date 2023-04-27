/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public interface IQueue {
     public static class queueFullException extends Exception {
        public queueFullException(String message) {
            super(message);
        }
    }
      public static class queueEmptyException extends Exception {
        public queueEmptyException(String message) {
            super(message);
        }
    }
    public void insertLast(Object item) throws queueFullException;
    public Object removeFirst()throws queueEmptyException;
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public Object front()throws queueEmptyException;
    public void print();
}
