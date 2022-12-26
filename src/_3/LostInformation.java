package _3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Cat {}
class Animal<Q> {}
class Zoo<POSITION, ANIMAL> {}
public class LostInformation {
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<Cat>();
        Animal<Cat> animal = new Animal<Cat>();
        Zoo<Long,Double> p = new Zoo<Long,Double>();
        System.out.println(Arrays.toString(
                list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
                animal.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
                p.getClass().getTypeParameters()));
    }
}
