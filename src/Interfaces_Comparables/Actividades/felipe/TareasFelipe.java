package Interfaces_Comparables.Actividades.felipe;

public class TareasFelipe implements Comparable<TareasFelipe>{
    private int prioridad;
    private int tiempo;

    public TareasFelipe(int prioridad, int tiempo) {
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return this.prioridad + " - " + this.tiempo + ".";
    }

    @Override
    public int compareTo(TareasFelipe other) {
        if (this.prioridad - other.prioridad == 0) {
            return this.tiempo - other.tiempo;
        }else return this.prioridad - other.prioridad;
    }
}
