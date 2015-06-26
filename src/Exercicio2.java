
public class Exercicio2 {

	public static void main(String[] args) {
		
		int linha,coluna,i,j,rei,flag1,flag2;
		
		linha = 10;
		coluna = 10;
		rei = 0;
		flag1 = 0;
		i = 1;
		
		while(i <= linha){
			if(flag1 == 0){
				flag2 = 0;
				j = 1;
				while(j <= coluna){
					if(flag2 == 0){
						rei++;
						flag2 = 1;
					}else{
						flag2 = 0;
						j = j+2;
					}
					flag1 = 1;
				}
			}else{
				flag1 = 0;
				i = i+2;
			}
		}
		System.out.println(+rei+" Reis");
	}

}
