package Zoo;
import java.util.List;

import Repository.Task;

import java.util.Date;

public class Keeper extends Worker implements Task {
	public List<Animal> animals; //zwierzaki, ktore Keeper ma pod opiek¹

	public List<Animal> getAnimals() {
		return animals;
	}
	
	public void Feed(Animal animal) {
		animal.lastFeeding = new Date();
	}
	public void CleanCage(Cage cage) {
		cage.cleaned = new Date();
	}
}
