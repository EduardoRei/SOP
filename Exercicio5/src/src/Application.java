package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    ArrayList<Frame> frames = new ArrayList<>();
	    //Frame(id, tempoDeCarga, qtdRef, tempoUltRef, br, bm)
        frames.add(new Frame(1, 12, 10, 20, 1, 1)); 
        frames.add(new Frame(2, 10, 1, 12, 0, 0)); 
        frames.add(new Frame(3, 11, 2, 21, 1, 0)); 
		
        System.out.println("Qual algoritmo de substituicao deseja usar?");
        System.out.println("(1) FIFO");
        System.out.println("(2) LFU");
        System.out.println("(3) LRU");
        System.out.println("(4) NRU");

        while(true){

            int number = sc.nextInt();

            if(number == 1){
                System.out.println(Frame.fifo(frames));
                sc.close();
                return;
            } else if(number == 2) {
                System.out.println(Frame.lfu(frames));
                sc.close();
                return;
            } else if(number == 3) {
                System.out.println(Frame.lru(frames));
                sc.close();
                return;
            } else if(number == 4) {
                System.out.println(Frame.nru(frames));
                sc.close();
                return;
            } else if(number > 4 || number < 1){
                System.out.println("Digite um número valido");
            }
        }
	}

}
