class calculator{
    int a;
    int b;
    
    public void set(int x,int y){
        a=x;
        b=y;
    }
    public void sum(){
        System.out.println(a+b);
    }
}


class Mohit{
    public static void main(String args[]){
        calculator obj= new calculator();
        obj.set(10,20);
        System.out.println(obj.a);
        obj.sum();
    }
}
