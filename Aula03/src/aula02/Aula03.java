
package aula02;

public class Aula03 {
    //os atributos que são protegidos só está sendo possivel, pois o main está usando a classe caneta, o main é como se fosse o um filho e classe a mãe, por isso tem autorização.
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
