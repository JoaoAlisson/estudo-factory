package br.com.estudo.factory;

public class AnimalFactory {

	public Animal getAnimal(String type) {
		if ("canino".equals(type)) {
			return new Cachorro();
		} else {
			return new Gato();
		}
	}

}