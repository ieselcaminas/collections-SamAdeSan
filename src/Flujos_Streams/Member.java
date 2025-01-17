package Flujos_Streams;

public class Member implements Comparable<Member> {
    private String name;
    private int height;
    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }
    @Override
    public int compareTo(Member other){
        if (this.height - other.height == 0){
            return this.name.compareTo(other.getName());
        }
        else return this.height - other.height;
    }
}
