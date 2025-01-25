public class Principal {
    public static void main(String[] args) {
        // Criando 3 instâncias de Paciente com diferentes valores
        Paciente paciente1 = new Paciente(70, 1.75); // Peso: 70kg, Altura: 1.75m
        Paciente paciente2 = new Paciente(50, 1.60); // Peso: 50kg, Altura: 1.60m
        Paciente paciente3 = new Paciente(95, 1.80); // Peso: 95kg, Altura: 1.80m

        // Imprimindo os resultados dos métodos
        System.out.println("Paciente 1: IMC = " + paciente1.calcularIMC() + ", Diagnóstico: " + paciente1.diagnostico());
        System.out.println("Paciente 2: IMC = " + paciente2.calcularIMC() + ", Diagnóstico: " + paciente2.diagnostico());
        System.out.println("Paciente 3: IMC = " + paciente3.calcularIMC() + ", Diagnóstico: " + paciente3.diagnostico());
    }
}
