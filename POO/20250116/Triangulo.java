public class Triangulo extends FormaGeometrica {
    private double _base, _altura;

    public Triangulo(double base, double altura) {
        this._base = base;
        this._altura = altura;
    }

    public double getBase() {
        return this._base;
    }

    public double getAltura() {
        return this._altura;
    }

    public void setBase(double base) {
        this._base = base;
    }

    public void setAltura(double altura) {    
        this._altura = altura;
    }

    @Override
    public double area() {
        return (getBase() * getAltura()) / 2;
    }

    @Override
    public double area(double lado) {
        System.out.println("Use area() sem parâmetro ou area(double base, double altura) para calcular a área de um triângulo.");
        return lado;
    }
    
    public double area (double base, double altura) {
        this.setAltura(altura);
        this.setBase(base);
        return (this.getBase() * this.getAltura()) / 2;
    }
}
