import java.util.Scanner;
import java.text.DecimalFormat;

public class Item {

    //PERGUNTAS
    String questions = "";
    String A = "";
    String B = "";
    String C = "";
    String D = "";
    String E = "";
    String correta = "";

    public void escrevaresposta() {
        System.out.println(this.questions);
        System.out.println();
        System.out.println(this.A);
        System.out.println(this.B);
        System.out.println(this.C);
        System.out.println(this.D);
        System.out.println(this.E);
        System.out.println();
    }

    //RESPOSTA CORRETA E ERRADA
    public boolean verdadeira() {
        String resposta = leiaResposta();
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("");
            System.out.println("-------//-------//-------//-------//-------");
            System.out.println("Boa, é isso aí: " + this.correta);
            return true;

        } else {
            System.out.println("");
            System.out.println("-------//-------//-------//-------//-------");
            System.out.println("Resposta errada, a resposta é: " + this.correta);
            return false;
        }
    }

    //LEITURA RESPOSTA
    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String r;
        do {
            System.out.println("Escreva sua resposta: ");
            r = ler.next();
        } while (!respostaValida(r));
        return r;

    }

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") ||
                resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") ||
                resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Digite apenas uma das alternativas: A, B, C, D ou E.");
        System.out.println("-------//-------//-------//-------//-------//-------");
        return false;
    }
}