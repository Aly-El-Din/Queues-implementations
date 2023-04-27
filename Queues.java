/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
import java.util.Scanner;
public class Queues {
    public static void main(String[] args) {
      priorityQueueLinkedListBased pq=new priorityQueueLinkedListBased();
      Object o1=new Object(5);
      Object o2=new Object(3);
      Object o3=new Object(2);
      Object o4=new Object(6);
      Object o5=new Object(7);
      Object o6=new Object(9);
      Entry e1=new Entry(o1,o2);
      Entry e2=new Entry(o2,o4);
      Entry e3=new Entry(o3,o1);
      Entry e4=new Entry(o4,o5);
      Entry e5=new Entry(o5,o3);
      Entry e6=new Entry(o5,o6);
      pq.push(e1);
      pq.push(e2);
      pq.push(e3);
      pq.push(e4);
      pq.push(e5);
      pq.remove_min();
      pq.push(e6);
      pq.print();
    }
}
