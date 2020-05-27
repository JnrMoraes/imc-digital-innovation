import imc.CalculateImc;
import person.Person;

public class Programa {

    public static void main(String[] args) {

        final Person person = new Person("Junior", 1.78,74.0);
        final  CalculateImc calculate = new CalculateImc();

        final Double imc = calculate.calculate(person);

        System.out.printf("IMC = %.2f ", imc);

    }
}

/**
 * MENOR QUE 18,5       MAGREZA         0
 * ENTRE 18,5 E 24,9    NORMAL          0
 * ENTRE 25,0 E 29,9    SOBREPESO       I
 * ENTRE 30,0 E 39,9    OBESIDADE       II
 * MAIOR QUE 40,0       OBESIDADE GRAVE III
 */