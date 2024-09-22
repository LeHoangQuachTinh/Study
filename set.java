import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class set {
    //add size contains remove addAll removeAll retainAll:dùng chung cho HashSet,LinkedHashSet,TreeSet
    //first(),last(),higher(),lower(),ceiling(),floor(),headSet(),tailSet(),poltFirst(),poltLast():Chỉ dùng cho TreeSet
    public static void main(String[] args)
    {
       HashSet<Integer> s =new HashSet<>();//Không có theo thứ tự kể cả thứ tự add vào set
       s.add(1);
       s.add(3);
       s.add(2);
       s.add(1);
       if(s.contains(2))
          System.out.println("Found\n");
       else
           System.out.println("Not Found\n");
        s.remove(2);
       for(int x:s)
           System.out.print(x+" ");
       System.out.println("\n");
       ArrayList<Integer> arr=new ArrayList<>();
       for(int i=1;i<10;i++)
         arr.add(i);
       s.addAll(arr);//Đẩy tất cả các phần tử của ArrayList vào Set
       for(int x:s)
          System.out.print(x+" ");
       HashSet<Integer> s1=new HashSet<>();
       HashSet<Integer> s2=new HashSet<>();
       for(int i=1;i<7;i++)
          s1.add(i);
       for(int i=3;i<=10;i++)
           s2.add(i);
       s2.removeAll(s1);//Xoá tất cả các phần tử trong s2 mà tồn tại trong s1
       System.out.println("\n");
       for(int x:s2)
         System.out.print(x+" ");
       for(int i=1;i<7;i++)
         s1.add(i);
       for(int i=3;i<=10;i++)
          s2.add(i);
        s2.retainAll(s1);//Xoá tất cả các phần tử trong s2 chỉ giữ lại phân giao giữa s2 và s1
        System.out.println("\n");
        for(int x:s2)
           System.out.print(x+" ");


        LinkedHashSet<Integer> SL=new LinkedHashSet<>();//Theo thứ tự đã add vào set

        TreeSet<Integer> ST=new TreeSet<>();//Theo thứ tự và sắp xếp
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
           ST.add(sc.nextInt());
        System.out.println(ST.first());//Phần tử nhỏ nhất
        System.out.println(ST.last());//Phần tử lớn nhất
        System.out.println(ST.higher(5));//Phân tử nhỏ nhất lớn hơn 5
        System.out.println(ST.lower(5));//Phần tử lớn nhất nhỏ hơn 5
        System.out.println(ST.ceiling(5));//Phần tử nhỏ nhất >=5
        System.out.println(ST.floor(5));//Phần tử lớn nhất <=5
        System.out.println(ST.headSet(5));//In ra các phần tử trong set <6
        System.out.println(ST.tailSet(5));//In ra các phần tử trong set>=6
        ST.pollFirst();//Xoá phần tử ở đầu
        ST.pollLast();//Xoá phần tử ở cuối
    }
}
