class A extends Object{
    public A(){
        super();
        System.out.println("Inside A");
    }
    public A(int x){
        super(); // Super class for base class
               // So, it will call object class
               // every class in java extends Object class
        System.out.println("Inside A parameter");
    }
}

class B extends A{
    public B(int x){
         super(); // every constructor conatins super class constructor
         //super(5) : it will called parameterized constructor of super class(base class)
         System.out.println("Inside X");
    }
}

class Mohit{
    public static void main(String args[]){
        B b= new B(5);
        System.out.println("Inside main");
    }
}
/*
Output :
Inside A
Inside X
Inside main
*/
