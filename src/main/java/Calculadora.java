/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 21:53
 * @category Model
 */
public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora() {
    }

    /**
     *
     * @param numero1 Recebe o primeiro numero para uma operação
     * @param numero2 Recebe o segundo numero para uma operação
     */
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     *
     * @return Retorna a soma de dois numeros
     */
    public double somar() {
        return this.numero1 + this.numero2;
    }


    /**
     *
     * @return Retorna a subtração de dois numeros
     */
    public double subtrair() {
        return this.numero1 - this.numero2;
    }


    /**
     *
     * @return Retorna a multiplicação de dois numeros
     */
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }


    /**
     *
     * @return Retorna a divisão de dois numeros
     */
    public double dividir() {
        return this.numero1 / this.numero2;
    }

    public String verificarOperacao(int opcao) {
        switch(opcao) {
            case 1: return "Soma: " + this.somar();
            case 2: return "Subtração: " + this.subtrair();
            case 3: return "Multiplicação: " + this.multiplicar();
            case 4: return "Divisão: " + this.dividir();
            case 5: return toString();
            case 0: System.exit(0);;
                return null;
            default: return "operação invalida";
        }
    }

    @Override
    public String toString() {
    return       "\nPrimeiro numero: " + this.numero1
                +"\nSegundo numero: " + this.numero2
                + "\nSoma: " + this.somar()
                + "\nSubtração: " + this.subtrair()
                + "\nMultiplicação: " + this.multiplicar()
                + "\nDivisão: " + this.dividir();
    }
}
