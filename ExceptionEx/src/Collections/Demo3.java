package Collections;
import java.util.*;
class Demo3{  
     int rollno;  
     String name;  
     String city;  

	public Demo3(int i, String string, String string2) { 
     this.rollno=rollno;  
     this.name=name;  
     this.city=city;  
     }  
      
public static void main(String args[]){  
       Demo3 s1=new Demo3(1,"Ravi","vizag");  
       Demo3 s2=new Demo3(2,"Vinay","Munjeru");
       List l=new ArrayList();
       l.add(s1);
       l.add(s2);
       Iterator n=l.iterator();
       while(n.hasNext())
       {
    	   System.out.println(n.next());
       }
     }  
}

