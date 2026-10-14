package model;

public class AppleTree implements FruitTree
{
    private final int age;
    public AppleTree(int age)
    {
        this.age = age;
    }

    @Override
    public int getAge()
    {
        return this.age;
    }

    @Override
    public String getType()
    {
        return "Apple";
    }

    @Override
    public String toString()
    {
        return "Apple tree of age " + this.age;
    }
}