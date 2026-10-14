package model;

import exceptions.ValidationException;

public class AppleTree implements FruitTree
{
    private final int age;
    public AppleTree(int age)
    {
        if (age < 0) {
            throw new ValidationException("Age cannot be negative");
        }
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