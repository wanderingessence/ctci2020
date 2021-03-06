
public class p40NextNumber2 {

	
	public static int getNext(int n) {
		int c = n;
		int c0 = 0;
		int c1 = 0; 
		while((c & 1) == 0 && (c != 0)) {
			c0++;
			c >>= 1;
		}
		while((c & 1) == 1) {
			c1++;
			c >>= 1;
		}
		if(c0 + c1 == 31 || c0 + c1 == 0) return -1;
		int pos = c0 + c1;
		n |= (1 << pos);
		n &= ~((1 << pos) - 1);
		n |= (1 << (c - 1)) - 1;
		return n;
	}
	
	public static int getPrev(int n) {
		int temp = n;
		int c0 = 0;
		int c1 = 0;
		while((temp & 1) == 1) {
			c1++;
			temp >>= 1;
		}
		int p = c0 + 1;
		n &= ((~0) << (p + 1));
		int mask = (1 << (c1 + 1)) - 1;
		n |= mask << (c0 - 1);
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(getNext(13948));
		System.out.println(getPrev(13948));
	}
	
	
}
