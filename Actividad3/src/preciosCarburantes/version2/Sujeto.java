package preciosCarburantes.version2;

public interface Sujeto {
    public void registrarObservador(Observador o);
    public void borrarObservador(Observador o);
    public void notificar();
}