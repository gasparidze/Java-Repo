package model;

import model.Cat;

public class CatWrapper extends Cat{
    private Cat original;
    public CatWrapper (Cat cat)
    {
        super(cat.getName());
        this.original = cat;
    }

    public String getName()
    {
        return "Кот по имени " + original.getName();
    }

    public void setName(String name)
    {
        original.setName(name);
    }
}
