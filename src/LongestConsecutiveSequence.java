import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String []args){
       int [] nums = {100,101,2,4,3,1};
        int ans = longestConsecutive( nums);
        System.out.println(ans);

        /*
        1 . o(nlogn) first do the sorting then check for the longest

        2. o(n) always try to find the left neighbor, it means an element could be start of
        subsequence if there are no left neighbor then try to search if next of that element exist
        in set or not, if exist then that's the part of sequence increase the length keep search and
        break loop once finish, update the lcs and keep checking.
        */

    }
    public static int longestConsecutive(int[] nums) {
        int lcs=0;

        Set<Integer> set = new HashSet<Integer>();
        for(int ele:nums)
            set.add(ele);

        for(int ele : set){
            if(!set.contains(ele-1)){
                int length =0;

                while(set.contains(ele+length))
                    length++;

                lcs= Math.max(lcs, length);
            }
        }
        return lcs;
    }
}
