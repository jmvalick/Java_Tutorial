package org.example.intro;

// interface creates methods without impl
public interface InterfaceDemo {

    int age = 44;
    String area = "PA";

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{

}

class B implements InterfaceDemo,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("in run");
    }
}

