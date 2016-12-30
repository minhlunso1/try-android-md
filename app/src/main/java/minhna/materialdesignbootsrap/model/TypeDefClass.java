package minhna.materialdesignbootsrap.model;


/**
 * Created by Administrator on 30-Dec-16.
 */

public class TypeDefClass {
    @Status
    private int status;
    @Category
    private String category;

    public int getStatus() {
        return status;
    }

    public void setStatus (@Status int status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(@Category String category) {
        this.category = category;
    }
}
