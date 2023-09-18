import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();
        // Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");
        // Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null,retorno);
        // Atribuiçao dinamica
        String nome = JOptionPane
                .showInputDialog("entre com o nome da pessoa " +
                        "Turista:");
        // Criaçao de objeto do tipo Turista
        Turista pessoaTurista = new Turista(nome);
          // Saida de dados - nome armazenado acima
        System.out.println(pessoaTurista.getNome());
          // pedir cpf e mostrar




        String cpf = JOptionPane
                .showInputDialog("entre com o cpf da pessoa " +
                        "Turista:");

        Turista pessoa2Turista = new Turista(cpf);
        pessoaTurista.setCpf(cpf);
        System.out.println(pessoaTurista.getCpf(cpf));

    }
}