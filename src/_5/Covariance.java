package _5;

import java.util.*;

public class Covariance {
    <T> void find(Iterable<? extends T> where, T what) {

    }
}

class Contrvariance {

    <T> void sort(List<T> what, Comparator<? super T> how) {

    }
}

class Animal {
    int foodChainPosition;
}

class FoodChainPositionComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.foodChainPosition, o2.foodChainPosition);
    }
}

class Dog extends Animal { }

class CheckAnimal {
    public static void main(String[] args) {
        Covariance covariance = new Covariance();
        covariance.find(new CatCreator(), new Animal());
        List<Dog> dogs = new ArrayList<>();
        Comparator<Animal> comparator = new FoodChainPositionComparator();
        Contrvariance contrvariance = new Contrvariance();
        contrvariance.sort(dogs, comparator);
    }
}

class Cat extends Animal {}

class CatCreator extends Animal implements Iterable<Cat>{

    @Override
    public Iterator<Cat> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Cat next() {
                return new Cat();
            }
        };
    }
}
