package banyuan.q1;
class A
{
    {
        new B();
    }

    static class B
    {
        {
            new A().new C();
        }
    }

    class C
    {
        {
            System.out.println("SUCCESS");
        }
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        new A();
    }
}

