import java.security.SecureRandom;

public class DeviceSerialGenerator {
	
	public static String generateRandomString(int length) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();

    }

    public static String generateRandomNumericString(int length) {
        String AB = "0123456789";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();

    }
    public static String generateAlphaNumericString(int length) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();

    }
	
	public String generateSerialNumber(String deviceType) {
		String []firstDigitCL10= {"001","510"};
		String []firstDigitCL55= {"002","511"};
		int randomIndex=(int) ((Math.random() * ((firstDigitCL10.length-1) - 0)));
		String serialNumber=null;
		
		switch(deviceType) {
		case "CL-10":
			serialNumber=firstDigitCL10[randomIndex]+generateRandomNumericString(4) +generateRandomNumericString(4)+generateRandomString(2).toUpperCase()+generateRandomNumericString(2);
			return serialNumber;
		case "CL-55":
			serialNumber=firstDigitCL55[randomIndex]+generateRandomNumericString(4) +generateRandomNumericString(4)+generateRandomString(2).toUpperCase()+generateRandomNumericString(2);
			return serialNumber;
		case "X25":
			serialNumber=generateAlphaNumericString(11).toUpperCase(); return serialNumber;
		case "X35":
			serialNumber=generateAlphaNumericString(11).toUpperCase();return serialNumber;
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeviceSerialGenerator deviceReg=new DeviceSerialGenerator();
		String generatedSerialNumber=deviceReg.generateSerialNumber("CL-10");
		System.out.println("Generated Serial Number CL-10=" + generatedSerialNumber);
		generatedSerialNumber=deviceReg.generateSerialNumber("CL-55");
		System.out.println("Generated Serial Number CL-55=" + generatedSerialNumber);
		generatedSerialNumber=deviceReg.generateSerialNumber("X25");
		System.out.println("Generated Serial Number X25=" + generatedSerialNumber);
		generatedSerialNumber=deviceReg.generateSerialNumber("X35");
		System.out.println("Generated Serial Number X35=" + generatedSerialNumber);
		

	}

}
