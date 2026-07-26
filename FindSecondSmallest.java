public class FindSecondSmallest {


    public static void main(String[] args) {
        
    int [] arr={30,50,90,12,73};
    int smallest=arr[0];
    int SecondSmallest=arr[0];

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<smallest)
        {
            
            SecondSmallest=smallest;
            smallest=arr[i];
            
        }

 
        
    }
    System.out.println("THe smallest is "+smallest);
        System.out.println("The Second smallests is "+SecondSmallest);
    }
    
}
