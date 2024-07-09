package java8features;
import java.util.Base64;

public class Base64EncoderExample {

	public static void main(String[] args) {
		// Encode a string to Base64
        String originalString = "Hello, Base64 Encoding!";
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded string: " + encodedString);

        // Encode a byte array to Base64
        byte[] data = {0x48, 0x65, 0x6C, 0x6C, 0x6F}; // 
        String encodedData = Base64.getEncoder().encodeToString(data);
        System.out.println("Encoded data(Hello in ASCII): " + encodedData);

	}

}


