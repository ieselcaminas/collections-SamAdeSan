package Flujos_Streams.Actividades.ninosbuenos;

public class Buenos implements Comparable<Buenos>{
    private String buenos;
    private int regalos;
    public Buenos(String buenos, int regalos) {
        this.buenos = buenos;
        this.regalos = regalos;
    }
    public String getBuenos() {
        return buenos;
    }
    public void setBuenos(String buenos) {
        this.buenos = buenos;
    }
    public int getRegalos() {
        return regalos;
    }
    public void setRegalos(int regalos) {
        this.regalos = regalos;
    }
    @Override
    public String toString() {
        return this.buenos + " --> " + this.regalos + ".";
    }
    @Override
    public int compareTo(Buenos other) {
        if (this.regalos - other.regalos == 0) {
            return this.buenos.compareTo(other.buenos);
        }else return this.regalos - other.regalos;
    }
}
