package github;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SimpleTests {

    @Test
    void simpleTestForCheckAllureAndJenkinsIntegration1() {
        assertTrue (true);
    }

    @Test
    void simpleTestForCheckAllureAndJenkinsIntegration2() {
        assertTrue (true);
    }
    @Test
    void simpleTestForCheckAllureAndJenkinsIntegration3() {
        assertTrue (false);
    }
    @Test
    void simpleTestForCheckAllureAndJenkinsIntegration4() {
        assertTrue (true);
    }
}
