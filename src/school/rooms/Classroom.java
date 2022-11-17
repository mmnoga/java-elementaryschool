package school.rooms;

public class Classroom extends Room {
    int capacity;

    public Classroom(int number, String name, int capacity) {
        super(number, name);
        this.capacity = capacity;
    }
}
