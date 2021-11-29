public class Main {
    public static void main(String[] args) {
        int array [] = {1,5,8,12,19};
        for (int i : array){
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length / 2; i++){
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        System.out.println();
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
