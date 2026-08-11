public class mergetwoarrays {

    public static void main(String[] args) {
        

        int arr1 []={1,2};
        int arr2 []={3,4,5};
        int merge[]=new int [arr1.length+arr2.length];
        int index=0;

        for(int i = 0;i<arr1.length;i++)
        {
            merge[index]=arr1[i];
            index++;
        }
    
    
        for(int i = 0;i<arr2.length;i++)
        {
            merge[index]=arr2[i];
            index++;
        }

        
        for(int i=0;i<merge.length;i++)
            {
                System.out.println("The merged array is "+merge[i]);
    }}
    
}
