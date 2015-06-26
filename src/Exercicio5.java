
public class Exercicio5 {

	public static void main(String[] args) {
		
		String vnumid, vnumidOK, chave;
		int i, j, soma, resto;
		
		chave = "3515010247235700010655001000016399100411903";
		i = chave.length();
		j = 2;
		soma = 0;
		
		while(i > 0){
			soma = soma + Integer.parseInt(chave.substring((i-1), (i)))*j;
			j++;
			
			if(j > 9){
				j = 2;
			}
			i--;
		}
			resto = soma % 11;
			if(resto == 0 || resto == 1){
				chave = chave + "0";
			}else{
				chave = chave + (11 - resto);
			}
		
		System.out.println(chave);
	}

}
