package com.ank.exhandling3;
import java.io.IOException;  
class ex1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   ex1 obj=new ex1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  