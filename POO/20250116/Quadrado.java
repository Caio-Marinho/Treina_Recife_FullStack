public class Quadrado extends FormaGeometrica {
    private double _lado;

    public Quadrado(double lado) {
        this._lado = lado;
    }

    public double getLado() {
        return this._lado;
    }

    public void setLado(double novoLado) {
        this._lado = novoLado;
    }

    @Override
    public double area() {
        return this.getLado() * this.getLado();
    }

    @Override
    public double area(double novoLado) {
        this.setLado(novoLado);
        return this.getLado() * this.getLado();
    }
}
