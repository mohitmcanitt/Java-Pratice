class A{
    public A(){
        System.out.println("Inside A");
    }
}

class B extends A{
    public B(){
        System.out.println("Inside B");
    }
}

class Mohit{
    public static void main(String args[]){
        B b= new B();
        System.out.println("Inside main");
    }
}
/*
Output :
Inside A
Inside B
Inside main
*/
