import java.io.IOException;

public class Cycles {
    public static void main(String[] args) {
       // public static void main(String[] args) throws IOException {
    //for (int i = 0; i < 5; i++) {//присваиваем i ноль после проверка на то что i<5 и после добавляем условие выполнения итерации это при каждой проверке будет добавляться i по еденице
        //int i;// это делаться для того чтоб переменная i мы могли испольовать вне цикла for
        //for (i = 0; (char) System.in.read() != 'S'; i++) //здаесь изменям нмного и теперь итерация будет идти до того пока мы не получим S
        //System.out.println("Итерация " + i);// указываем блок кода который мы хотим выполнять на каждой итерации  цикла

        //или

        //int i;
       // i = 0;

        //for (; i > 5;) {// если удалить из скобок i > 5 то цикл будет бесонечный

      //      System.out.println("Итерация " + i);

     //       i++;

     //   for (int i = 0; i > 5; i++) {

      //      System.out.println("Итерация " + i);

       // int count = 0;
       // while (count < 10){
       //     System.out.println(count);
       //     count ++;

      //  int count = 0;
        // while (count < 10){
           //  System.out.println(count);
           //  count++;

            // if(count == 5) break;

          int count = 0;

         while (count < 10){
             count++;
             if((count%2) != 0) continue;
          System.out.println(count);
         }
        }
    }
