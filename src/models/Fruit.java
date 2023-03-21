package models;

public class Fruit {
    String name;
    int category;
    public Fruit(String name, int category) {
        this.name = name;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public int getCategory() {
        return category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    
}
