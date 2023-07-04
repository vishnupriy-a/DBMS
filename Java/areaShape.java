class areaShape
{
    areaShape()
    {

    }

    void area(float radius)
    {
        System.out.println("Area of the circle is :"+(3.14*(radius*radius)));
    }
    void area(float length, float breadth)
    {
        System.out.println("Area of the Rectangle is :"+(length*breadth));
    }
    void area(float length, float breadth,String shape)
    {
        System.out.println("Area of the Triangle is :"+(length*breadth)/2);
    }
    public static void main(String args[])
    {
        areaShape ar=new areaShape();
        ar.area(4);
        ar.area(3, 4, "triangle");
        ar.area(6, 2);
    }
}