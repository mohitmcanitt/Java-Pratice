class A{
    public A(){
        System.out.println("Inside A");
    }
    public A(int x){
        System.out.println("Inside A parameter");
    }
}

class B extends A{
    public B(int x){
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
