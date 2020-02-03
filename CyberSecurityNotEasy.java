package lol;
import java.util.Arrays;
import java.util.Random;

public class CyberSecurityNotEasy {

	public static void main(String[] args) {
		Random random = new Random();
		int huh = random.nextInt(78978981);
		String rBinary = Integer.toBinaryString(huh);
		System.out.println(rBinary);
		
		String[] BYTES = new String [6];
		char[] BYTESascii = new char [6];
		
		
		for (int i = 0; i < 6; i++){
			int rByte = random.nextInt(74)+48;
			char a = (char) rByte;
			String randomByteBinary = Integer.toBinaryString(rByte);
			BYTES[i] = makeTheSizeByte(randomByteBinary);
			BYTESascii[i] = a;
		}
		
		System.out.println(Arrays.toString(BYTES));
		System.out.println(Arrays.toString(BYTESascii));
		
	}
	public static String makeTheSizeByte(String a) {
		if (a.length()==8) {
			return a;
		}
		
		else {
			return makeTheSizeByte("0"+a);
		}
	}
}
