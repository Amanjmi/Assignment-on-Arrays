import java.util.Arrays;

public class Dupplicateinarray {
	
		public static void main(String[] args) {
			int[] a = {10,18,30,21,22,21,12};
			Arrays.sort(a);
//			for(int ele:a) {
//				System.out.print(ele +" ");
//			}
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length-1;j++) {
					if (a[i]==a[j]) {
						System.out.println(a[i]+" is the duplicate value in the given array");
						break;
					}
				}
			}

			}
			}