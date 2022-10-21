public class Massivs {

    public static void main(String[] args) {
        ///int[] nums = {1, 1 ,1, 1};
        /////////////[0][1][2][3]
        int[] nums = new int[4];

        for(int i = 0; i < 4; i++){
            nums[1] = 1;
            //выше мы присвоимли кадой ячейке значение
        }
        //обращаемся к какойто определённой ячейке
        nums[3] = 100;

        for (int e : nums) {
        System.out.println(e);
    }
        int table[][] = new int[3][];
        table[0] = new int[4];
        table[1] = new int[4];
        table[2] = new int[40];


       // for(int i = 0; i < 4; i++){ // на этом цикле справшиваем какая это итерация
      //      System.out.println("Элемент [" + i + "]" + nums[i]); //здесь
        }
        //выше мы постотрели значение каждой ячейки
    }
