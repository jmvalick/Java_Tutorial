package org.example.intro;

enum Status{
    Running, Failed, Pending, Success
}

enum Food{
    Burger(4.50F), Apple(0.50F), Taco(3.00F);

    private float price;

    private Food(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

public class EnumDemo
{
    public static void main(String a[])
    {

        Status status = Status.Running;
        System.out.println(status);

        Status[] ss = Status.values();

        for(Status s : ss){
            System.out.println(s + ": " + s.ordinal());
        }

        switch (status){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try againg");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        Food food = Food.Taco;
        System.out.println(food + ": " + food.getPrice());

    }
}
