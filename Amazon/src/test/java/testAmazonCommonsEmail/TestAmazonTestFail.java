package testAmazonCommonsEmail;

import mainAmazonCommonsEmail.AmazonTestFail;
import org.testng.annotations.Test;

public class TestAmazonTestFail extends AmazonTestFail {

    @Test
    public void amazonFailTestOnPurpose(){
        failTestOnPurpose();
    }
}
