

package dio.iphone;



import dio.iphone.reprodutores.ReprodutorMusical;
import dio.iphone.telefone.AparelhoTelefonico;
import dio.iphone.navegador.NavegadorInternet;

   public class  IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    @Override
    public void tocar() {
        // Implementação para tocar música
    }

    @Override
    public void pausar() {
        // Implementação para pausar música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        // Implementação para fazer uma ligação
    }

    @Override
    public void atender() {
        // Implementação para atender uma chamada
    }

    @Override
    public void iniciarConversaVoz() {
        // Implementação para iniciar uma conversa de voz
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir uma página na Internet
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação para adicionar uma nova aba de navegação
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página atual
    }

   public static void main(String[] args) {
    IPhone meuIPhone = new IPhone();

    // Usando as funcionalidades do iPhone
    meuIPhone.ligar("123-456-789");
    meuIPhone.atender();
    meuIPhone.tocar();
    meuIPhone.selecionarMusica("Música 1");
    meuIPhone.pausar();
    meuIPhone.exibirPagina("https://www.example.com");
    meuIPhone.adicionarNovaAba("https://www.example2.com");
    meuIPhone.atualizarPagina();
}
}
