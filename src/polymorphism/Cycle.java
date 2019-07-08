package polymorphism;

public class Cycle {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{
                new Cycle(), new Unicycle(),
                new Bicycle(), new Tricycle()
        };
        for (Cycle c : cycles) {
            c.ride();

        }
    }

    void ride() {
        System.out.println("polymorphism.Cycle.ride()");
    }
}
