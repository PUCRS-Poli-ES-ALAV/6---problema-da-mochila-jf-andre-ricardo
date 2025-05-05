public class Bloco {
    double peso;
    double valor;
    double coef;

    public Bloco(double peso,double valor){
        this.peso = peso;
        this.valor = valor;
        this.coef = valor/peso;
    }

    @Override
    public String toString() {
        return super.toString() +"--"+ coef;
    }
}
