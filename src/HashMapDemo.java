import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map =  new HashMap<>();

        int a[]={6,7,3,6,8,8,4,4,6,2,6};

        for(int i=0;i<a.length;i++){

            int n=a[i];

            if(map.containsKey(n)){

                int prev = map.get(n);
                map.put(n,prev+1);
            }
            else{
                map.put(n,1);
            }

        }

        for(int val:map.keySet())
        {
            System.out.println(val+" "+map.get(val));
        }

    }
}
