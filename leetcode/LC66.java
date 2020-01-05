package leetcode;

public class LC66 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,9,9};
		int[] c = {9,9,9};
		int[] ans0 = plusOne(a);
		printElements(ans0);
		System.out.println("");
		int[] ans1 = plusOne(b);
		printElements(ans1);
		System.out.println("");
		int[] ans2 = plusOne(c);
		printElements(ans2);
	}
	
	public static int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1] += 1;
        if(digits[digits.length-1] == 10){
            digits[digits.length-1] = 0;
            carry = 1;
            for(int i = digits.length-2 ; i >= 0 ; i--){
                digits[i] += carry;
                if(digits[i] != 10)
                    break;
                if(digits[i] == 10)
                    digits[i] = 0;
            }
        }
        
        if(digits[0] == 0){
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            ans[1] = 0;
            for(int i = 1; i < digits.length ; i++){
                ans[i+1] = digits[i];
            }
            return ans;
        }
        return digits;
    }
	
	private static void printElements(int[] c) {
		for(int i = 0 ; i <c.length ; i++)
			System.out.print(c[i]);
	}

}
