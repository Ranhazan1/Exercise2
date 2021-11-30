public class ArrayWithoutDuplicates {

    public static void main(String[] args) {
        int array[]={1,3,5,3,7,7,8,7,9,9,1,5,2};
        int newArray[]=removeDuplicates(array);
        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]);
        }
    }
    public static int[] removeDuplicates(int[] arrayOffNumbers){
        int newLength = arrayOffNumbers.length;
        for (int i=1 ; i<arrayOffNumbers.length ; i++){
            for (int j=0 ; j<i ; j++){
                if (arrayOffNumbers[i]==arrayOffNumbers[j]) {
                    newLength--;
                    break;
                }
            }
        }
        int[] newArray = new int[newLength];
        newArray[0] = arrayOffNumbers[0];
        int indexArray=1;
        boolean isDuplicate;
        for (int i=1;i<arrayOffNumbers.length;i++){
            isDuplicate = false;
            for (int j=0 ; j<i ; j++) {
                if (arrayOffNumbers[i] == arrayOffNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }if (!isDuplicate){
                newArray[indexArray]=arrayOffNumbers[i];
                indexArray++;
            }
        }return newArray;
    }
}
