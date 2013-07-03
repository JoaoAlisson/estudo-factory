package br.com.estudo.factory;

public class Demo {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();

		Animal a1 = animalFactory.getAnimal("felino");
		System.out.println("a1 som: " + a1.fazSom());

		Animal a2 = animalFactory.getAnimal("canino");
		System.out.println("a2 som: " + a2.fazSom());
	}

}