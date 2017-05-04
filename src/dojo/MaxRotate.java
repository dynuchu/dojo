package dojo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dynuchu on 2017.05.03..
 */
public class MaxRotate {

    public static long maxRot (long n) {
        String n_str = Long.toString(n);
        char[] n_arr = n_str.toCharArray();
        return n;
    }

    public static char[] move (char[] t) {
        char[] r = new char[t.length];
        ArrayList<String> ossz = new ArrayList<>();
        ossz.add(Arrays.toString(t));
        System.out.println(Arrays.toString(r));
        for(int i=0;i<r.length-1;i++){
            for (int j=i+1; j<r.length; j++) {
                r[j-1] = t[j];
            }
            r[r.length-1]=t[0];

            ossz.add(Arrays.toString(r));

        }
        System.out.println(ossz);


        System.out.println(Arrays.toString(r));
        return r;
    }
}
