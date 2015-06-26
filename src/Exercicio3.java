
public class Exercicio3 {

	public static void main(String[] args) {
		
		int setores,atraso,i,j;
		int sequencia[] = new int[50];
	
		setores = 7;
		atraso = 1;
		i = 0;
		
		while(i < 50){
			sequencia[i] = 0;
			i++;
		}
		i = 1;
		j = 1;
		while(j <= setores){
			
			if(sequencia[i] == 0){
				sequencia[i] = j;
				i = i+(1+atraso);
				j++;
			}else{
				i++;
			}
			while(i > setores){
				i = i - setores;
			}
		}
		i = 1;
		while(i <= setores){
			System.out.println(sequencia[i]);
			i++;
		}
	}
}
