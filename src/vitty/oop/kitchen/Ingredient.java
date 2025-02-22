package vitty.oop.kitchen;

public class Ingredient {
    public enum Category {
        Protein,
        Base,
        Vegetables,
        Fatty
    }

    protected String name;
    protected Category category;

    // Builder
    public Ingredient(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}