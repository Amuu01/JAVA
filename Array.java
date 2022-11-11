

public class Array {
    public static void main(String[] args) {
        int [] array = new int[10];
        array[0]=10;
        System.out.println(array[0]);
        //String [] str1 = new String[10];
        //int arr1 []={10,20,30};
        System.out.println(array[0]);

        for(int i=0;i<10;i++)
        {
            array[i]=i;
        }
        for(int j:array)
        {
            System.out.println(j);
        }
    }

    
}