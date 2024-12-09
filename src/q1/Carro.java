package q1;

import java.util.Scanner;

public class Carro {
    String modelo;
    double velocidade;
    double aceler;
    int marcha;
    boolean ligado;

    public Carro(String modelo, double aceler) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.aceler = aceler;
        this.marcha = 0;
        this.ligado = false;
    }

    void funcCarro(){
        Scanner scan = new Scanner(System.in);
        int funcao;
        do {
            System.out.println("[1] - Ligar");
            System.out.println("[2] - Desligar");
            System.out.println("[3] - Acelerar");
            System.out.println("[4] - Desacelerar");
            System.out.println("[5] - Virar esquerda");
            System.out.println("[6] - Virar Direita");
            System.out.println("[7] - Marcha para cima");
            System.out.println("[8] - Marcha para baixo");
            System.out.println("[9] - Sair");
            System.out.println("Escolha uma opção:");
            funcao = scan.nextInt();

            switch (funcao){
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    acelerar();
                    break;
                case 4:
                    desacelerar();
                    break;
                case 5:
                    virarEsquerda();
                    break;
                case 6:
                    virarDireita();
                    break;
                case 7:
                    marchaCima();
                    break;
                case 8:
                    marchaBaixo();
                    break;
                case 9:
                    System.out.println("Você saiu do carro.");
                    break;
                case 10:
                    System.out.println("Digite uma opção válida.");
                    break;

            }
        }while (funcao!=9);
    }

    void ligar(){
        ligado = true;
        System.out.println("O carro está ligado.");
    }

    void desligar(){
        ligado = false;
        System.out.println("O carro está desligado.");
    }

    void acelerar(){
        if (ligado){
            velocidade += aceler;
            System.out.println("Você acelerou o carro. A velocidade é:" + velocidade);
        }else{
            System.out.println("O carro está desligado, ligue-o.");
        }
    }

    public void desacelerar(){
        if (ligado){
            velocidade -= aceler;
            if(velocidade < 0){
                velocidade = 0;
                System.out.println("O carro está parado.");
            }
            System.out.println("O carro desacelerou. A velocidade é:"+ velocidade);
        }else{
            System.out.println("O carro está desligado, ligue-o.");
        }
    }

    void virarEsquerda(){
        if(ligado && velocidade > 0){
            System.out.println("O carro está virando à esquerda.");
        }else{
            System.out.println("O carro está desligado, ligue-o.");
        }
    }
    void virarDireita(){
        if(ligado && velocidade > 0){
            System.out.println("O carro está virando à direita.");
        }else{
            System.out.println("O carro está desligado, ligue-o.");
        }
    }

    void marchaCima(){
        if(ligado && marcha >= 0){
            marcha++;
            System.out.println("O carro aumentou uma marcha. Marcha atual:"+marcha);
        }else{
            System.out.println("O carro está desligado e sem marcha, ligue-o e mude de marcha.");
        }
    }

    void marchaBaixo(){
        if(ligado && marcha > 0){
            marcha--;
            System.out.println("O carro diminuiu uma marcha. Marcha atual:"+marcha);
        }else{
            System.out.println("O carro está desligado e sem marcha, ligue-o e mude de marcha.");
        }
    }
}
