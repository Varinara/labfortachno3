public class Sedan implements Car {

    @Override
    public void gas() {
        System.out.println("Газ!");
    }

    @Override
    public void brake() {
        System.out.println("Тормоз!");
    }
}