package q2;

import java.util.Scanner;

public class Televisao {
    float polegadas;
    String marca;
    int volume;
    int canal;
    int voltagem;
    boolean ligada;

    public Televisao(float polegadas, String marca, int voltagem) {
        this.polegadas = polegadas;
        this.marca = marca;
        this.volume = 5;
        this.canal = 0;
        this.voltagem = voltagem;
    }
    void funcTelevisao(){
        Scanner scan = new Scanner(System.in);
        int funcao;

        do{
            System.out.println("[1] - Ligar");
            System.out.println("[2] - Aumentar volume");
            System.out.println("[3] - Diminuir volume");
            System.out.println("[4] - Subir canal");
            System.out.println("[5] - Descer canal");
            System.out.println("[6] - Desligar");
            System.out.println("Escolha uma opção:");
            funcao = scan.nextInt();

            switch (funcao){
                case 1:
                    ligar();
                    break;
                case 2:
                    aumentVol();
                    break;
                case 3:
                    diminVol();
                    break;
                case 4:
                    subirCan();
                    break;
                case 5:
                    descerCan();
                    break;
                case 6:
                    desligar();
                    break;
                case 7:
                    System.out.println("Escolha uma opção válida.");
            }
        }while(funcao!=6);
    }

    void ligar(){
        ligada = true;
        float consumo = this.voltagem*this.polegadas;
        System.out.println("A televisão está ligada. Seu consumo é de: "+consumo);
    }
    void desligar(){
        ligada = false;
        System.out.println("A televisão está desligada.");
    }
    void aumentVol(){
        if(ligada && (this.volume<10)){
            this.volume++;
            System.out.println("O volume é de:"+this.volume);
        }else if(ligada && (this.volume==10)){
            System.out.println("O volume está no máximo.");
        }
        else{
            System.out.println("A televisão está desligada, ligue-a para continuar.");
        }
    }
    void diminVol(){
        if(ligada && (this.volume>=1)){
            this.volume--;
            System.out.println("O volume é de:"+this.volume);
        }else if(ligada && (this.volume==0)){
            System.out.println("O volume está no mínimo.");
        }
        else{
            System.out.println("A televisão está desligada, ligue-a para continuar.");
        }
    }
    void subirCan(){
        this.canal++;
        System.out.println("Você subiu de canal.\nCanal atual:"+this.canal);
    }
    void descerCan(){
        if(canal!=0){
            this.canal--;
            System.out.println("Você desceu de canal.\nCanal atual:"+this.canal);
        }else{
            System.out.println("Não é possível encontrar canais menores.\nCanal atual:"+this.canal);
        }
    }
}
