public class Coche {
    private int puertas;

    public void incrementaPuertas() {
        this.puertas += 1;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.incrementaPuertas();

        System.out.println(coche1.puertas);
    }
}
