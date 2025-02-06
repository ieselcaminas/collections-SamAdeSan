package Interfaces_Comparables.Actividades.tutankamon;

public class Tesoros implements Comparable<Tesoros>{
    private String objetos;
    private int valor;
    private int peso;

    public Tesoros(String objetos, int valor, int peso) {
        this.objetos = objetos;
        this.valor = valor;
        this.peso = peso;
    }
    public String getObjetos() {
        return objetos;
    }

    public void setObjetos(String objetos) {
        this.objetos = objetos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tesoro: " + objetos + ", " + valor + ", " + peso + ".";
    }
    @Override
    public int compareTo(Tesoros other) {
        if (this.valor != other.valor) {
            return this.valor - other.valor;
        } else {
            if (this.peso != other.peso) {
                return this.peso - other.peso;
            }else{
                return this.objetos.compareTo(other.objetos);
            }
        }
    }
}
