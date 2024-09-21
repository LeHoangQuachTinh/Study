public class Mang {
    public static void main(String [] args)
    {
        int [] numbers={8,4,2005};
        String[] friends={"Khanh","Hien","Tin","Tinh"};
        float[] marks={9.2f ,9.8f ,7.8f ,8.5f};

        System.out.print("Thong tin mang numbers:");
        for(int i=0;i<numbers.length;i++)
             System.out.print(numbers[i]+" ");
        
        System.out.print("\nThong tin mang friends:");
        for(int i=0;i<friends.length;i++)
            System.out.print(friends[i]+" ");

        System.out.print("\nThong tin mang marks:");
        for(int i=0;i<marks.length;i++)
            System.out.print(marks[i]+" ");
        //Cap phat bo nho cho mang
        int [] array=new int[101];//mỗi ô nhớ đều bằng 0
        System.out.println("\n"+array[10]);
    }
}
