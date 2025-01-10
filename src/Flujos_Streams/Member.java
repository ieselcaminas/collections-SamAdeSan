package Flujos_Streams;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    public String toString(Object obj) {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member other) {
        if (this.height == other.getHeight()) {
            return 0;
        } else if (this.height > other.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}
