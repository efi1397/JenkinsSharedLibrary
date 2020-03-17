import org.junit.Before
import org.junit.Test
import com.lesfurets.jenkins.unit.*

class MultiplicationTest extends BasePipelineTest{
    def multiplication

    @Before
    void setUp() {
        super.setUp()
        multiplication = loadScript("vars/multiplication.groovy")
    }

    @Test
    void testCall() {
        def result = multiplication(5, 6)
        assert result == 40
    }
}
