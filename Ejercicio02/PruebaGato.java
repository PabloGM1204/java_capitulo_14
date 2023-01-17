public class PruebaGato {
    public static void main(String[] args) {
        Gato papa = new Gato("macho", "papa");
        Gato mama = new Gato("hembra", "mama");

        try {
            papa.apareaCon(mama);
        } catch (ExcepcionApareamientoImposible eai) {
            eai.printStackTrace();
            System.out.println("Deben ser distinto sexo");
        }
    }
}
