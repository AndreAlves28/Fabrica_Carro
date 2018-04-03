import static java.lang.System.out;
public class TestaCarro {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;
        
        meuCarro.liga();
        
        //acelera o carro
        meuCarro.acelera(20);
        out.println(meuCarro.velocidadeAtual);
    }
    
}
