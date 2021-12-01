public class IntersectionArray {
    public static int[] intersectionArray(int[] arrayNum1, int[] arrayNum2) {
        int arrayLength=0;
        for (int i=0;i<arrayNum1.length;i++){
            for (int j=0;j<arrayNum2.length;j++){
                if (arrayNum1[i]==arrayNum2[j]){
                    ++arrayLength;
                }
            }
        }int[] intersectionArray=new int[arrayLength];
        int index=0;
        for (int i=0;i<arrayNum1.length;i++){
            for (int j=0;j<arrayNum2.length;j++){
                if (arrayNum1[i]==arrayNum2[j]){
                    intersectionArray[index]=arrayNum1[i];
                    index++;
                    break;
                }
            }
        }return intersectionArray;
    }
    public static boolean strangersArrays(int[] arrayNumber1,int[] arrayNumber2){
        boolean strangers=true;
        int[] newArray=intersectionArray(arrayNumber1,arrayNumber2);
        for (int i=0;i< newArray.length;i++){
            if (newArray[i]!=0){
                strangers=false;
                break;
            }
        }return strangers;
    }

    public static void main(String[] args) {
        int[] arrayNum1={10,20,30,40,50,60};
        int[] arrayNum2={20,40,60,80,50};
        int[] arrayNum3={5,35,55,75,90};
        int[] newArray=intersectionArray(arrayNum1,arrayNum2);
        for (int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }boolean strangers=strangersArrays(arrayNum3,arrayNum2);
        System.out.println(strangers);
    }
}
