public class FindSecondLargest {


    public static void main(String[] args) {
        
    int [] arr={30,50,90,12,73};
    int largest=arr[0];
    int SecondLargest=arr[0];

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>largest)
        {
            
            SecondLargest=largest;
            largest=arr[i];
            
        }

        else if(arr[i]>SecondLargest&& arr[i]!=largest)
        {
            SecondLargest=arr[i];
            
        }
        
    }
    System.out.println("THe largest is "+largest);
        System.out.println("The Second Largest is "+SecondLargest);
    }
    
}
