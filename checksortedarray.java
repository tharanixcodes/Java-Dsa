public class checksortedarray {


    public static void main(String[] args) {
        

        int arr[]={2,275,12,56,78,68};
        boolean sorted=true;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                sorted=true;
            }

            else 
            {
                sorted=false;
            }
        }
    
    if (sorted)
    {
        System.out.println("array is sorted");
    }
    else{
        System.err.println("array is not sorted");
    }
    }
    
}
