public class Findoddeven {

    public static void main(String[] args) {
        int arr[]={11,24,35,67,88};

        int even=0;
        int odd=0;
for(int i= 0;i<arr.length;i++)
{
        if(arr[i]%2==0)
        {
            even++;
        }

        else{
            odd++;
            }
}
System.out.println("the even count is "+even);
System.out.println("the odd count is "+odd);
}
}
