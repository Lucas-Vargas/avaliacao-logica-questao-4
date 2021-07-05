/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoquestao4;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Vargas
 */
public class AvaliacaoQuestao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int somaM = 0, somaF = 0, x=0, contF = 0, bigalt=0, lessalt=2000; 
        double contM = 0, mediaF=0, mediapop=0, perc=0;
        for(x=0;x<50;x++){
            System.out.println("Digite 0 para masculino e 1 para feminino.");
            int sexo = ler.nextInt();
            System.out.println("Digite a altura em cm Ex: 180");
            int altura = ler.nextInt();
            if(altura>bigalt){
                bigalt = altura;
            }
            if(altura<lessalt){
                lessalt = altura;
            }
            if (sexo == 0) {
                contM++;
                somaM += altura;
               
            }if (sexo == 1) {
                somaF += altura;
                contF++;
            }
        }
        System.out.println(contM);
        System.out.println(bigalt);
        System.out.println(lessalt);
        System.out.println(somaF);
        System.out.println(contF);
        System.out.println(contM);
        mediaF = (somaF / contF);
        mediapop = (somaM+somaF)/50;
        perc = 100 / 50 * contM;
        System.out.println("Maior altura encontrada: "+bigalt);
        System.out.println("Menor altura encontrada: "+lessalt);
        System.out.println("Média da altura (feminino) " + mediaF);
        System.out.println("Média de altura da população: " + mediapop);
         System.out.println("Percentual de homens na população " + perc+"%");
        
    }
    
}
