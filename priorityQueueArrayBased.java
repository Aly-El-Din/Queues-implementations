/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues;

/**
 *
 * @author Cyber
 */
public class priorityQueueArrayBased{     
  private final int MAX;
   private int[] intArray;
   private int itemCount;

   public priorityQueueArrayBased(int size){
      MAX = size;
      intArray = new int[MAX];     
      itemCount = 0;
   }

   public void insert(int data){
      int i =0;
      if(!isFull()){
         // if queue is empty, insert the data 
         if(itemCount == 0){
            intArray[itemCount++] = data;        
         }
         else{
            // start from the right end of the queue 
            for(i = itemCount - 1; i >= 0; i-- ){
               // if data is larger, shift existing item to right end 
               if(data > intArray[i]){
                  intArray[i+1] = intArray[i];
               }else{
                  break;
               }            
            }   
            // insert the data 
            intArray[i+1] = data;
            itemCount++;
         }
      }
   }
   public int remove(){
      return intArray[--itemCount];
   }
   public int peek(){
      return intArray[itemCount - 1];
   }

   public boolean isEmpty(){
      return itemCount == 0;
   }

   public boolean isFull(){
      return itemCount == MAX;
   }

   public int size(){
      return itemCount;
   }
    
}
