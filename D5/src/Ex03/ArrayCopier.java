package Ex03;

public class ArrayCopier {

	// Copies elements of src[] to dst[], truncating/padding when dst has fewer/more elements 
	public int[] copy(int[] src, int[] dst) { 
		if (src.length < dst.length){
			for (int i = 0; i < src.length; i++) {
				dst[i] = src[i];
			} 
			for (int i = src.length; i < dst.length; i++) {
				dst[i] = 0;
			}
			return dst;
		} else {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
			return dst;
		}
	}


}