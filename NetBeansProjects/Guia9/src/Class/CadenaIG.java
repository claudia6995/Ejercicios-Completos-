
package Class;

public class CadenaIG {
    private String frase;
    private int longitud;

    public CadenaIG() {
    }

    public CadenaIG(String frase,int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
}
