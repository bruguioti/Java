package dio.iphone.app; 

import dio.iphone.reprodutores.ReprodutorDeMusica;
import dio.iphone.telefone.AparelhoTelefone;
import dio.iphone.navegador.NavegadorWeb;

public class Main {
    public static void main(String[] args) {
        ReprodutorDeMusica reprodutor = new ReprodutorDeMusica(); // Usando a interface ReprodutorMusical
        AparelhoTelefone telefone = new AparelhoTelefone(); // Usando a interface AparelhoTelefonico
        NavegadorWeb navegador = new NavegadorWeb(); // Usando a interface NavegadorInternet

        // Agora você pode usar os objetos reprodutor, telefone e navegador para acessar as funcionalidades do iPhone.
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Música 1");
        telefone.ligar("123-456-789");
        telefone.atender();
        telefone.iniciarConversaVoz();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba("https://www.example2.com");
        navegador.atualizarPagina();
    }
}
