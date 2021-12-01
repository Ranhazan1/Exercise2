public class UpAndDownArray {
    public static int topOffArray(int[] arrayOffNumbers) {
        boolean top=true;
        int count=0;
        int a=0;
        int b=1;
        while (arrayOffNumbers[a]<arrayOffNumbers[b]){
            a++;
            b++;
            count++;
        }
        for (int i=a;i<arrayOffNumbers.length-1;i++,b++) {
            if (arrayOffNumbers[i] < arrayOffNumbers[b]) {
                top = false;
                break;
            }
        }
        if (!top){
            count=-1;
        }
        return count;
    }



    public static void main(String[] args) {
        int[] array={3,4,7,8,9,10,7,3};
        System.out.println(topOffArray(array));
    }
}
