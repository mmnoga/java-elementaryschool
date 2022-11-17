package school.rooms;

public abstract class Room {
    int number;
    String name;

    public Room(int number, String name) {
        this.number = number;
        this.name = name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return this.number;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
