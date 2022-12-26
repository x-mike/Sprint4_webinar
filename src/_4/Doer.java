package _4;

public class Doer {
    public void doNow() {
        System.out.println("Doer.doNow()");
    }
}

class Manipulator<T extends Doer> {
    private T obj;
    public Manipulator(T x) { obj = x; }
    public void manipulate() { obj.doNow(); }
}

class Manipulator2 {
    private Doer obj;
    public Manipulator2(Doer x) { obj = x; }
    public void manipulate() { obj.doNow(); }
}

class Manipulator3<T extends Doer> {
    private T obj;
    public Manipulator3(T x) { obj = x; }
    public T get() { return obj; }
}

class Worker extends Doer {}
class Assembler extends Doer {}

class CheckDoer {
    public static void main(String[] args) {
        Manipulator3<Worker> m3 = new Manipulator3(new Worker());
        Doer w = m3.get();
    }
}
