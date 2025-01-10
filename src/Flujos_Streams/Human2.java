package Flujos_Streams;

public class Human2 implements Comparable<Human2>{
    private String name;
    private double salary;

    public Human2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return this.name + " - " + this.salary;
    }

    @Override
    public int compareTo(Human2 other){
        if (this.name.equals(other.getName()))
            return Double.compare(other.getSalary(), this.salary);
        else return this.name.compareTo(other.getName());
    }
}
