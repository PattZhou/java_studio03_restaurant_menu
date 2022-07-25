package restaurant;

public class MenuItem {
    //class variables HAVE to be private
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors. "this.name" name refers to the public Class MenuItem name. " = name" refers to the constructor "(String name,)"
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not categorized";
        this.isNew = false;
    }
    //why make two constructors?

    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //Methods (functions)
//Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setName(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }
}
