public class CalculadoraVeterinaria {
    public static void main(String[] args) {
        int precioDeConsulta = 50000;
        int precioDeMedicamentos = 12000;
        int precioDeProcedimientos = 80000;
        int cantidadDeMedicamentos = 3;
        int subtotalMedicamentos = precioDeMedicamentos * cantidadDeMedicamentos;
        int descuento = 10000;
        int total = subtotalMedicamentos + precioDeConsulta + precioDeProcedimientos;
        int totalFinal = total - descuento;
        System.out.println("-----FACTURA-----");
        System.out.println("Consulta: $" + precioDeConsulta);
        System.out.println("Medicamentos: $" + subtotalMedicamentos);
        System.out.println("Procedimientos: $" + precioDeProcedimientos);
        System.out.println("Descuento: $" + descuento);
        System.out.println("--------------------");
        System.out.println("Total sin descuento: $" + total);
        System.out.println("--------------------");
        System.out.println("TOTAL FINAL: $" +
                totalFinal);
    }
}
