/**11.Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não
 *  votar este ano (não é necessário considerar o mês em que a pessoa nasceu).*/

package Exercicio11;

//Criada a classe Vote e adicionado os dois atributos que receberão o ano de nascimento e o ano atual 
public class Vote {
	private int year;
	private int byrth;

	// Contrutor que vai vincular os valores fornecidos aos atributos respectivos
	public Vote(int year, int byrth) {
		this.byrth = byrth;
		this.year = year;
	}

	// Método que vai calcular a idade da pessoa
	public int age() {
		return year - byrth;
	}

	// utilizarei o método main para exibir as respostas
	public static void main(String[] Args) {
		// criado o objeto e vinculado os valores utilizando o construtor
		Vote majority = new Vote(1998, 1947);
		// Se a idade for maior ou igual a 16, segue o IF
		if (majority.age() >= 16) {
			System.out.println("PODERÁ VOTAR ESTE ANO!!");
			// Se a idade for menor que 16, segue o else
		} else {
			System.out.println("NÃO PODERÁ VOTAR ESTE ANO!!");
		}
	}
}
