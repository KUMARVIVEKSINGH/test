package collections;

class Solution {
    
	
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.solution(17));
	}
	
	
	int solution(int N) {
        int largest = 0;
        int shift = 0;
        int temp = N;
        System.out.println(Integer.toBinaryString(temp));
        for (int i = 1; i < 30; ++i) {
            int index = (temp & 1);
            System.out.println(Integer.toBinaryString((temp>>1)));
            System.out.println(Integer.toBinaryString((index << 5)));
            temp = ((temp >> 1) | (index << 29));
            System.out.println(Integer.toBinaryString(temp));
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;
    }
}
