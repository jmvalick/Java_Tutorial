package org.example;

class NewException extends RuntimeException
{
    public NewException(String string){
        super(string);
    }
}

class AA{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

public class ExceptionDemo {
    static{
        System.out.println("Class Loaded");
    }

    public static void main(String a[])
    {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new NewException("I don't want to print 0");
        }
        catch(NewException e){
            j = 18/1;
            //System.out.println(e);
        }
        //System.out.println(j + "\n");


        int nums[] = new int[5];

        try
        {
            System.out.println(nums[5]);
            j = 20/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("1: " + e);
        }
        catch(ArithmeticException e) {
            //System.out.println("2: " + e);
        }
        catch(Exception e){
            //System.out.println("3: " + e);
        }
        //System.out.println(j);


        AA obj = new AA();
        try{
            obj.show();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
            // close something here
        }
    }
}
