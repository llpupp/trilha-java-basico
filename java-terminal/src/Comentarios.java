public class Comentarios {
    public static void main(String[] args) {

    }

    /*
     * Este método foi elaborado as pressas
     * porisso foi abreviado o nome das variáveis e ficou muito ruim
     * ele tem a finalidade de somar ou multiplicar dois números ????
     */
    public int somarMultiplicar(int n, int x, String m) {
        int r = 0; // r é igual ao resultado (comentário muito ruim e usado indevidamente)
        if (m == "M") { // M = multiplicação
            r = n * x;
        } else {
            r = n + x; // senão soma mesmo
        }
        return r;
    }

    // Olá, eu sou um comentário em uma única linha
    /*
     * Olá,
     * Eu sou um comentário
     * que posso ser mais detalhado
     * quando necessário
     */

    /**
     * Essas duas estrelinhas acima
     * sao para identificar que você
     * pretende elaborar um comentário
     * a nivel de documentação
     * Que incrível!!!
     */

    // observação: um comentário não tem a finalidade de amenizar ou mitigar um
    // código / algoritimo
    // não estruturado cf as convenções da linguagem e boas práticas

    public void metodo() {

    }
    // linha de comando para criar documentação html (no terminal) para disponibilizar via web
    // javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
}
