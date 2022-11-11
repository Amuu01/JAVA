public class Even {
    public static void main(String[] args) {
        int[] arr = {10,25,5,88,7,100,2};
        int i=0;
        int size = arr.length;
        while(i< size )
        {
            if(arr[i]%2==0)
            System.out.println("Even Number:"+arr[i]);
            else
            System.out.println("Odd Number:"+arr[i]);
         
            i++;

        }
    }
}
