
package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Mark1";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.destampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Mark2";
        c2.cor = "vermelho";
        c2.ponta = 0.5f;
        c2.tampar();
        
        c2.status();
        c2.rabiscar();
    }
    
}