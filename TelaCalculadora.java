import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCalculadora {
    private Calculos meuCalculo = new Calculos();
    private String ecraTerminal = "";
    private JLabel ecra;
    private JFrame janela;
    private JButton botaoAC;
    private JButton botaoSair;
    private JButton botao0;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botaoDivide;
    private JButton botaoMultiplica;
    private JButton botaoSubtrai;
    private JButton botaoResultado;
    private JButton botaoSoma;
    private JButton botaoDecimal;

    public TelaCalculadora() {
        janela = new JFrame("Tela da Calculadora");
        ecra = new JLabel(" ");
        botaoAC = new JButton("AC");
        botaoAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.resetar();
                ecraTerminal = "";
                printEcra(" ");
            }
        });
        botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        botao0 = new JButton("0");
        botao0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("0");
                printEcra("0");
            }
        });
        botao1 = new JButton("1");
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("1");
                printEcra("1");
            }
        });
        botao2 = new JButton("2");
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("2");
                printEcra("2");
            }
        });
        botao3 = new JButton("3");
        botao3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("3");
                printEcra("3");
            }
        });
        botao4 = new JButton("4");
        botao4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("4");
                printEcra("4");
            }
        });
        botao5 = new JButton("5");
        botao5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("5");
                printEcra("5");
            }
        });
        botao6 = new JButton("6");
        botao6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("6");
                printEcra("6");
            }
        });
        botao7 = new JButton("7");
        botao7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("7");
                printEcra("7");
            }
        });
        botao8 = new JButton("8");
        botao8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("8");
                printEcra("8");
            }
        });
        botao9 = new JButton("9");
        botao9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("9");
                printEcra("9");
            }
        });
        botaoDivide = new JButton("/");
        botaoDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("/");
                printEcra("/");
            }
        });
        botaoMultiplica = new JButton("*");
        botaoMultiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("*");
                printEcra("*");
            }
        });
        botaoSubtrai = new JButton("-");
        botaoSubtrai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("-");
                printEcra("-");
            }
        });
        botaoSoma = new JButton("+");
        botaoSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista("+");
                printEcra("+");
            }
        });
        botaoDecimal = new JButton(".");
        botaoDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meuCalculo.addNaLista(".");
                printEcra(".");
            }
        });
        botaoResultado = new JButton("=");
        botaoResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ecraTerminal = " ";
                ecraTerminal += Float.toString(meuCalculo.resultado());
                printEcra("");
            }
        });
        montarJanela();

    }

    private void montarJanela() {
        janela.setSize(500, 700);
        JPanel painelBaixo = new JPanel();
        painelBaixo.setLayout(new BoxLayout(painelBaixo, BoxLayout.X_AXIS));
        painelBaixo.add(botaoAC);
        painelBaixo.add(botaoSair);
        janela.add(painelBaixo, BorderLayout.SOUTH);

        JPanel painelCima = new JPanel();
        painelCima.setLayout(new BoxLayout(painelCima, BoxLayout.Y_AXIS));
        painelCima.add(ecra);
        janela.add(painelCima, BorderLayout.NORTH);

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new GridLayout(4, 4));
        painelCentral.add(botao7);
        painelCentral.add(botao8);
        painelCentral.add(botao9);
        painelCentral.add(botaoDivide);
        painelCentral.add(botao4);
        painelCentral.add(botao5);
        painelCentral.add(botao6);
        painelCentral.add(botaoMultiplica);
        painelCentral.add(botao1);
        painelCentral.add(botao2);
        painelCentral.add(botao3);
        painelCentral.add(botaoSubtrai);
        painelCentral.add(botao0);
        painelCentral.add(botaoDecimal);
        painelCentral.add(botaoSoma);
        painelCentral.add(botaoResultado);
        janela.add(painelCentral, BorderLayout.CENTER);

        janela.pack();
    }

    public void exibir() {
        janela.setVisible(true);
    }

    public void printEcra(String novo) {
        ecraTerminal += novo;
        this.ecra.setText(ecraTerminal);
    }

}