import java.util.Queue;
import java.util.ArrayList;

public class Calculos {
    private float resultado;
    private ArrayList<String> listaDeOperacao;

    public Calculos() {
        listaDeOperacao = new ArrayList<String>();
        resultado = 0;
    }

    public void addNaLista(String operador) {
        listaDeOperacao.add(operador);
    }

    public Boolean eOperador(String caractere) {
        if (caractere == "/" || caractere == "+" || caractere == "-" || caractere == "*") {
            return true;
        }
        return false;
    }

    public int retornaNumero(String numero) {
        switch (numero) {
            case "0":
                return 0;
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            default:
                return 0;
        }
    }

    public float fazOperacao(float v1, float v2, String operador) {

        float saida = 0;

        switch (operador) {
            case "+":
                saida = v1 + v2;
                break;
            case "-":
                saida = v1 - v2;
                break;
            case "/":
                saida = v1 / v2;
                break;
            case "*":
                saida = v1 * v2;
                break;
        }
        return saida;
    }

    public float resultado() {
        String caractereAtual = "", operador = "";
        int contDecimal = 0;
        float v1 = 0, v2 = 0, saida = 0;
        boolean segundoValor = false, decimal = false;

        for (int i = 0; i < this.listaDeOperacao.size(); i++) {
            caractereAtual = this.listaDeOperacao.get(i);
            if (eOperador(caractereAtual)) { // troca valor
                if (segundoValor) {
                    v1 = fazOperacao(v1, v2, operador);
                    v2 = 0;
                }
                segundoValor = true;
                decimal = false;
                operador = caractereAtual;
                contDecimal = 0;
            } else if (caractereAtual == (".")) {
                decimal = true;
                contDecimal = -1;
            } else {
                if (!decimal) {
                    if (!segundoValor) {
                        v1 *= Math.pow(10, contDecimal);
                        v1 += retornaNumero(caractereAtual);
                    } else {
                        v2 *= Math.pow(10, contDecimal);
                        v2 += retornaNumero(caractereAtual);
                    }
                    contDecimal++;
                } else {
                    if (!segundoValor) {
                        v1 += retornaNumero(caractereAtual) * Math.pow(10, contDecimal);
                    } else {
                        v2 += retornaNumero(caractereAtual) * Math.pow(10, contDecimal);
                    }
                    contDecimal--;
                }
            }
        }
        saida = fazOperacao(v1, v2, operador);
        this.resultado = saida;
        return saida;
    }

    public void resetar() {
        listaDeOperacao.clear();
        resultado = 0;
    }
}