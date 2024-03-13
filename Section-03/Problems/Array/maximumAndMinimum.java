public class maximumAndMinimum {
    public static void main(String[] args) {
     int[] marks = {1,8,4,3,4,9,7,12,14,4,8,9,12,6,4};  
    //  int[] sortedArray = sortArray(marks);
    sortArray(marks);
    //  System.out.println("The Sorted Array is " + sortedArray);

    }

    public static int[] sortArray(int[] marks){
        System.out.println("Arguments : " + marks);
        int i = 0;
        while (i < (marks.length - 1)) {
            int j = 0;
            while (j < (marks.length - 1)) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
        System.out.println("Sorted Array : " + marks);
        return marks;
    }
}
