package ch10;

public class Clothes {
    String id;
    Size size;

    public Clothes(String id, Size size) {
        this.id = id;
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
