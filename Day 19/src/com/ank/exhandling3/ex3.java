package com.ank.exhandling3;
import java.io.*;  
class N{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
class ex3{  
   public static void main(String args[])throws IOException{ 
     N m=new N();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  