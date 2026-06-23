class Vehicle
{
    
    void show()
    {
        System.out.println("GT650");
    }


    void show(int n)
    {
        for (int i = 1; i < n; i++)
        {
            System.out.println("RollsRoyce");
        }
    }

    
    void show(String car)
    {
        System.out.println(car);
    }

    void show(String car, int n)
    {
        for (int i = 1; i < n; i++)
        {
            System.out.println(car);
        }
    }
}

public class MethodOverloadingDemo
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();

        v.show();                

        v.show(6);               

        v.show("Ferrari");       

        v.show("Thar", 8);       

        for (int j = 1; j < 5; j++)
        {
            v.show();           
        }
    }
}