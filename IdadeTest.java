import java.util.Scanner;

public class IdadeTest{

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]){
	calcularIdade();
    }
    public static void calcularIdade(){
	int[] mulher = new int[2];
	int[] homem = new int[2];
	int mu1 = 0, mu2 = 0, ho1 = 0, ho2 = 0;
	try{
	    System.out.print("Idade de homem ");
	    homem[0] = in.nextInt();
	    ho1 = homem[0];
	    ho2 = homem[0];
	    for(int i = 0; i < homem.length; i++){
		System.out.print("Idade de homem ");
		homem[i] = in.nextInt();
		if(homem[i] > ho1){
		    ho1 = homem[i];
		}
	    }
	    for(int i = 0; i < homem.length; i++){
		if(homem[i] < ho2){
		    ho2 = homem[i];
		}
	    }
	    System.out.print("Idade de mulher ");
	    mulher[0] = in.nextInt();
	    mu1 = mulher[0];
	    mu2 = mulher[0];
	    for(int y = 0; y < mulher.length; y++){
		System.out.print("Idade de mulher ");
		mulher[y] = in.nextInt();
		if(mulher[y] > mu1){
		    mu1 = mulher[y];
		}
	    }
	    for(int y = 0; y < mulher.length; y++){
		if(mulher[y] < mu2){
		    mu2 = mulher[y];
		}
	    }
	    Idade calc = new Idade(homem[0],homem[1], mulher[0], mulher[1]);
	    System.out.println("Soma das idades de homem mais velhor com mulher mais nova = "+(ho1 + mu2));
	    System.out.println("Produto das idades de homem mais novo com mulher mais velha = "+(ho2 * mu1));
	}catch(Exception p){
	    System.out.println(p);
	    in.nextLine();
	}
    }
}
