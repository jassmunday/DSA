public class java29practicearray {
    public static void main(String[] args) {

//        float [] average = {38.9f,40.1f,24.5f,32.3f,54.8f};
//        float sum= 0;
//        for(float elements: average){
//         sum=sum+elements;
//
//        }
//        System.out.println("Sum of Averages is "+sum);

        // reverse an array
        int [] marks = {0,1,2,3,4,};
        int l= marks.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){

            temp = marks[i];
            marks[i]=marks[(l-i-1)];
            marks[(l-i-1)]= temp;
        }
        for (int element: marks) {
            System.out.println(element);
        }


        //maximum array
        System.out.println("to find the maximum element of array");
        int [] arr={45,39,75};
        int max=0;
        for (int element: arr) {
            if (max < element) {
                max = element;
            }
        }
        System.out.println("maximum "+max);

    }
}
