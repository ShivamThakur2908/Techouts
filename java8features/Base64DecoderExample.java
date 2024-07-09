package java8features;
import java.util.Base64;

public class Base64DecoderExample {
	public static void main(String[] args) {
        // Decode a Base64 encoded string
        String encodedString = "SGVsbG8sIEJhc2U2NCBFbmNvZGluZyE=";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);

        // Decode Base64 encoded data
        String encodedData = "SGVsbG8="; // "Hello" in Base64
        byte[] decodedData = Base64.getDecoder().decode(encodedData);
        System.out.print("Decoded data: ");
        for (byte b : decodedData) {
            System.out.print((char) b);
        }
        System.out.println();
    }
}

