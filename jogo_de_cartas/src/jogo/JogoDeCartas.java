package jogo;

import java.util.Objects;
import java.util.Scanner;

public class JogoDeCartas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("escolha o nipe");
		String nipeEscolhido = input.nextLine();
		System.out.println("escolha a face");
		String faceEscolhida = input.nextLine();

		// arrays de strings para "nipes" e "cartas"
		String[] nipes = {"ouro", "copas", "esapdas", "paus"};

		String[] faces = {"AZ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Reis"};


		// as linhas abaixo recuperam de forma aleatória o conteudo dos arrays.
		String nipe = nipes[(int) (Math.random() * 4)];
		if (Objects.equals(nipeEscolhido, nipe)) {
			System.out.println("voce ACERTOU o nipe");

		} else {
			System.out.println("voce ERROU o nipe");
			System.out.println("nipe sorteado = " + nipe);

			String face = faces[(int) (Math.random() * faces.length)];
			if (Objects.equals(faceEscolhida, face)) {
				System.out.println("voce ACERTOU a face");
			}else{
				System.out.println("voce ERROU a face");
				System.out.println("face sorteado = " + face);
			}
            System.out.println("voce não obteve sucesso!");
        }
			input.close();

		}
	}
