package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();	
		
		Champion c1 = new Champion(name, life, attack, armor);
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();	
		
		Champion c2 = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos você deseja executar?");
		int N = sc.nextInt();
		
		System.out.println();
		
			for (int i = 0; (i < N) ; i++ ) {
			Champion.takeDamage(c1, c2);
			System.out.printf("Resultado do turno %d: ",i+1);
			System.out.println();
			System.out.printf(Champion.status(c1.getName(),c1.getLife()));
			System.out.println();
			System.out.printf(Champion.status(c2.getName(),c2.getLife()));
	
			if (c1.getLife() == 0 ||c2.getLife() == 0  ) {
				i = N;
			}
			
			System.out.println();
		
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		
		sc.close();	
	}
}
