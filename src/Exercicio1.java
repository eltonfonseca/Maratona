public class Exercicio1 {

	public static void main(String[] args) {

		int i, j, vogal = 0, consoante = 0;
		String caractere = "elton";

		i = 0;
		j = caractere.length();

		while (i <= j - 1) {

			if (caractere.toLowerCase().charAt(i) == 'a'
					|| caractere.toLowerCase().charAt(i) == 'e'
					|| caractere.toLowerCase().charAt(i) == 'i'
					|| caractere.toLowerCase().charAt(i) == 'o'
					|| caractere.toLowerCase().charAt(i) == 'u') {
				vogal++;
			} else {
				consoante++;
			}
			i++;
		}
		System.out.println(vogal + " Vogais - " + consoante + " Consoantes");
	}

}
