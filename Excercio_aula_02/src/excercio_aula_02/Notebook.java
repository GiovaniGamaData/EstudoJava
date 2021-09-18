
package excercio_aula_02;
public class Notebook {
    String modelo;
    String cor;
    float peso;
    String teclado;
    boolean ligar;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Peso: " + this.peso);
        System.out.println("Tipo do teclado: " + this.teclado);
        System.out.println("Está ligado? " + this.ligar);
    }
    
    void ligarnotebook(){
        if(this.ligar == true){
            System.out.println("Bem vindo!!");
        }else{
            System.out.println("...");
        }
    }
    
    void ligado(){
        this.ligar = true;
    }
    
    void desligado(){
        this.ligar = false;
    }
}
