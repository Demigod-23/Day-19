package com.ank.exhandling3;
import java.io.*;  
class O{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class ex4{  
   public static void main(String args[])throws IOException{//declare exception  
     O m=new O();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}