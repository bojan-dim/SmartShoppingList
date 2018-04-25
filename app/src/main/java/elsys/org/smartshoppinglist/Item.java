package elsys.org.smartshoppinglist;

public class Item {

    private int id;
    private String alias;
    private String category;
    private String quantity;
    private boolean isChecked;

    public Item(int id, String alias, String category, String quantyit, boolean isChecked) {
        this.id = id;
        this.alias = alias;
        this.category = category;
        this.quantity = quantity;
        this.isChecked = isChecked;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isChecked() {

        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
