package edu.farmingdale.csc325_f22_lab01demo;
public class NewClass {
    
    private static void sayHello(String str){
        System.out.println(str);
    }
    
    private static void sayHello(String str, int n){
        int i=0;
       
        do{
            i++;
            System.out.println(str);
        }while(i<n);
    }
     
    public static void main(String[] args) {
        sayHello("Hello World",5);
    }  
}

class Class2{
    public Class2(){
        
    }
    public Class2(int x){
        
    }
    public Class2(String x){
        
    }
    
}
