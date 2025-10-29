package Array;

public class RollNumChecker {
    public static void checkRollNum(int[] list, int rollNo){
        int startIdx=0;
        int endIdx=list.length-1;
        boolean found=false;

        //loop condition
        while(startIdx<=endIdx){
            int mid=(startIdx+endIdx)/2;

            //comparison
            if(list[mid]==rollNo){
                System.out.println("Rollno is present at index:"+mid);
                found=true;
                break;
            }
            else if (list[mid]<rollNo){
                startIdx=mid+1;
            }
            else {
                endIdx=mid-1;
            }

        }
        if(!found){
            System.out.println("RollNo "+rollNo+" is not present");
        }

    }
    public static void main(String[] args) {
        int[] list={1,2,5,6,42,56,66};
        int rollNo=67;
        checkRollNum(list,rollNo);
    }
}
