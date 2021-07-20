class Bike
{
    //int speed = 100, gear = 1;
    int speed, gear;

    Bike() //Default constructor
    {
        speed = 100;
        gear = 1;
    }

    Bike(int s, int g) //Parameterised constructor
    {
        this.speed = s;
        this.gear = g;
    }

    void gearUp()
    {
        this.gear++;
    }

    public static void main(String[] args)
    {
        Bike b1 = new Bike(200, 5);
        System.out.println("B1  Values");
        b1.gearUp();
        System.out.println(b1.speed);
        System.out.println(b1.gear);

        Bike b2 = new Bike(150, 4);
        System.out.println("B2 Values");
        b2.speed = 200;
        System.out.println(b2.speed);
        System.out.println(b2.gear);
    }
}