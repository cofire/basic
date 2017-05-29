/**
 * @Author:      liying
 * @DateTime:    2017-05-29 14:05:14
 * @Description: Description
 */

import java.util.BitSet;

public class BitSetDemo{
    public static void main(String[] args) {
        BitSet bits1 = new BitSet();
        BitSet bits2 = new BitSet();

        /*set some bits*/
        for(int i=0;i<16;i++){
            if ((i%2) == 0) {
                bits1.set(i);
            }

            if ((i%5) != 0) {
                bits2.set(i);
            }
        }

        System.out.println("Initial pattern in bits1:");
        System.out.println(bits1);
        System.out.println("Initial pattern in bits2:");
        System.out.println(bits2);
        System.out.println(bits1.equals(bits2));
        System.out.println(bits1.size());
        System.out.println(bits2.size());

        /*And bits*/
        bits2.and(bits1);
        System.out.println("bits2 and bits1:");
        System.out.println(bits2);
        System.out.println(bits1.equals(bits2));

        /*Or bits*/
        bits2.or(bits1);
        System.out.println("bits2 or bits1:");
        System.out.println(bits2);
        System.out.println(bits1.equals(bits2));

        /*Xor bits*/
        bits2.xor(bits1);
        System.out.println("bits2 xor bits1:");
        System.out.println(bits2);
        System.out.println(bits1.equals(bits2));

    }
}