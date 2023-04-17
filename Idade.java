public class Idade{

    private int homem;
    private int homem1;
    private int mulher;
    private int mulher1;
    
    public Idade(int homem, int homem1, int mulher, int mulher1){
	setHomem(homem);
	setHomem1(homem1);
	setMulher(mulher);
	setMulher1(mulher1);
    }
    public void setHomem(int homem){
	this.homem = homem;
    }
    public int getHomem(){
	return homem;
    }
    public void setMulher(int mulher){
	this.mulher = mulher;
    }
    public int getMulher(){
	return mulher;
    }
    public void setHomem1(int homem1){
	this.homem1 = homem1;
    }
    public int getHomem1(){
	return homem1;
    }
    public void setMulher1(int mulher1){
	this.mulher1 = mulher1;
    }
    public int getMulher1(){
	return mulher1;
    }
}
