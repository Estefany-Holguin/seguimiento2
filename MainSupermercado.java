public class MainSupermercado {
    public static void main(String[] args) {
        Snacks snacks = new Snacks("Mani Dulce", "snack", 3500, "Frutos Secos", 6);
    snacks.mostrar();
        System.out.println(snacks.toString());
        Yogurt yogurt = new Yogurt("Yogursin", "Lacteos", 4000, "Mora");
        yogurt.imprimir();
        System.out.println(yogurt.toString());
    }
}
