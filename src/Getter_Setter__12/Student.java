package Getter_Setter__12;

public class Student {
    private int id;

    public void setId (int i) {
        if (i > 0 ) {
            id = i;
        }
    }

    public int getId () {
        return id;
    }
}
