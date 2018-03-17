package pl.coderstrust.regex;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RegexForIPAddressTest {

    @Test
    @Parameters({"17.267.11.2, false",
            "22.22.123.4, true",
            "0.27.111.2, true",
            "173.2.13d.a2, false",
            "17.11.32 1, false"})
    public void shouldTestInvalidIPs(String ipAddress, boolean valid) {

        //given
        RegexForIPAddress regexForIPAddress = new RegexForIPAddress();
        regexForIPAddress.isTheIPNumberValid(ipAddress);

        //when


        //then
        assertThat(new RegexForIPAddress().isTheIPNumberValid(ipAddress), is(valid));

    }

}