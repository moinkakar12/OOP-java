class Triangle
{
    double perpendicular, base, hypotenuse ;
    Triangle()
    {
    }
    Triangle(double perp, double bs, double hyp)
    {
        perpendicular = perp;
        base = bs;
        hypotenuse=hyp;
    }
    double sin()
    {
        return perpendicular/hypotenuse;
    }
    double cos()
    {
        return base/hypotenuse;
    }
    double tan()
    {
        return perpendicular/base;
    }
}
class TestTriangle
{
    public static void main(String[] args)
    {
        Triangle tobj;
        Triangle t= new Triangle(18.8,16.0,12.6);
        System.out.println(" SIN θ of Triangle is = "+t.sin());
        System.out.println(" COS θ of Triangle is = "+t.cos());
        System.out.println(" TAN θ of Triangle is = "+t.tan());

    }
}

