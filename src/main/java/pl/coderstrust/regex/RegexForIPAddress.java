package pl.coderstrust.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForIPAddress {

    public static final String PATTERN_FOR_IPADDRESS = "(([0-1]?\\d{1,2}\\.)|(2[0-4]\\d\\.)|(25[0-5]\\.)){3}(([0-1]?\\d{1,2})|(2[0-4]\\d)|(25[0-5]))";

    public static boolean isTheIPNumberValid(String ipAddress) {

        Pattern pattern = Pattern.compile(PATTERN_FOR_IPADDRESS);
        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }

/*    public static void main(String[] args) {

        String ip = "293.231.2.3";
        String ip2 = "0.23.145.2";
        String ip3 = "0.260.1.123";

        System.out.println(isTheIPNumberValid(ip));
        System.out.println(isTheIPNumberValid(ip2));
        System.out.println(isTheIPNumberValid(ip3));

    }*/
}
