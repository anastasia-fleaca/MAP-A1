package model;

import exceptions.ValidationException;

public class PearTree implements FruitTree{
    private final int age;
    public PearTree(int age)
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
        return "Pear";
    }

    @Override
    public String toString()
    {
        return "Pear tree of age " + this.age;
    }
}
