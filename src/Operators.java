import java.io.IOException;

public class Operators {
public static void main(String[] args) throws IOException {

    int month = 3;

    String nonthString;
    switch (month) {
        case 1:
            nonthString = "Январь";
            break;
        case 2:
            nonthString = "Февраль";
            break;
        case 3:
            nonthString = "Март";
            break;
        case 4:
            nonthString = "Апрель";
            break;
        case 5:
            nonthString = "Май";
            break;
        case 6:
            nonthString = "Июнь";
            break;
        case 7:
            nonthString = "Июль";
            break;
        case 8:
            nonthString = "Август";
            break;
        case 9:
            nonthString = "Снтябрь";
            break;
        case 10:
            nonthString = "Октябрь";
            break;
        case 11:
            nonthString = "Ноябрь";
            break;
        case 12:
            nonthString = "Декабрь";
            break;
        default: nonthString = "Незнаем такого месяца ";
    }
    System.out.println(nonthString);
    }
}


