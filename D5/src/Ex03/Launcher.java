package Ex03;

public class Launcher {
    public static void main(String[] args){
        int[] src = new int[6];
        src[0] = 1;
        src[1] = 2;
        src[2] = 3;
		src[3] = 4;
        src[4] = 5;
        src[5] = 6;

		int[] dst = new int[5];
        dst[0] = 1;
        dst[1] = 2;
        dst[2] = 3;
		dst[3] = 4;
		dst[4] = 5;
		
        ArrayCopier myCopier = new ArrayCopier();
		dst = myCopier.copy(src, dst);
		
		System.out.println("New value of dst: ");
		
		for (int i = 0; i < dst.length; i++) {
			System.out.println(dst[i]);
		}
		
    }
}