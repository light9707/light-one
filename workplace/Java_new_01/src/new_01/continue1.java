package new_01;
public class continue1 {
 public static void main(String []args) {
	out: for(int i=0;i<10;i++) {
		 for(int j=0;j<20;j++) {
			 if(j>i) {
				 System.out.println();
				 continue out;
			 }
			 System.out.print("*");
		 }
		 
	 }
 }
}
