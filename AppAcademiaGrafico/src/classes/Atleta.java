
package classes;

public class Atleta extends Pessoa{
    
    private double altura, peso;

    public Atleta(double altura, double peso, String nome, String sobrenome) {
        super(nome, sobrenome);
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double imc(){
        return peso/(altura*altura);
    }
    
    public String situação(){
        double imc = imc();
        if(imc<18.6){
            return "Abaixo do peso";
        }else if (imc<=24.9){
            return "Peso ideal";
        }else if (imc<=30){
            return "Excesso de peso";
        }else{
            return "Obesidade";
        }
    }
    
    @Override
    public String toString(){
       return super.toString()
               +"\nPeso: " + peso
               +"\nAltura: " + altura
               +"\nSituação: " + situação();
        
        
    }

}
