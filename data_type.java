class data_type{
    public static void main(String s[]){
        //float per=2.5; It will give error. As by default value of decimal is double
        // So in order to use float, we need to mention type explicitly f
        float per = 92.5f;
        System.out.println(per);
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
    }
}