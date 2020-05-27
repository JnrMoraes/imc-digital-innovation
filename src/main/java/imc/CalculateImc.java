package imc;

import person.Person;

public class CalculateImc {

    public Double calculate (final Person person){

        final Double heigth = person.getHeigth();
        final Double imc = person.getWeigth() /(heigth * heigth);

        return imc;
    }
}
/**
 * MENOR QUE 18,5       MAGREZA         0
 * ENTRE 18,5 E 24,9    NORMAL          0
 * ENTRE 25,0 E 29,9    SOBREPESO       I
 * ENTRE 30,0 E 39,9    OBESIDADE       II
 * MAIOR QUE 40,0       OBESIDADE GRAVE III
 */