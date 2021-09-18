
package excercio_aula_02;
public class Excercio_aula_02 {
    public static void main(String[] args) {
        Notebook n1 = new Notebook();
        n1.modelo = "Dell vostro";
        n1.cor = "Preto";
        n1.peso = 1.5f;
        n1.teclado = "Membrana(abnt)";
        
        
        n1.ligado(); 
        n1.status();
        n1.ligarnotebook();
    }
    
}
