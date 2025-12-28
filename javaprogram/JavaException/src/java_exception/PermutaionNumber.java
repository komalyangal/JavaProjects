package java_exception;

import java.util.*;

public class PermutaionNumber {

    public static void genperm(int[] num, int idx, List<List<Integer>> ans) {
        if (idx == num.length) {
            List<Integer> temp = new ArrayList<>();
            for (int n : num) {
                temp.add(n);
            }
            ans.add(temp);
            return;
        }

        for (int i = idx; i < num.length; i++) {
            swap(num, idx, i);
            genperm(num, idx + 1, ans);
            swap(num, idx, i); 
        }
    }

   
    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];  
        System.out.println("Enter elements:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();
        genperm(num, 0, result);

        System.out.println("All permutations:");
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }
}
