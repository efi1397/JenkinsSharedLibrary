import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class CheckoutTest extends BasePipelineTest {
    @Override
    @Before
    void setUp() {
        super.setUp()
        binding.setVariable('scm', [$class: 'GitSCM', branches: [[name: '*/dev']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/efi1397/JenkinsSharedLibrary.git']]])
        helper.registerAllowedMethod('checkout', [String.class], null)

    }

    @Test
    void testCall() {
        // create mock checkout step
        def checkoutTest = loadScript("vars/checkoutScm.groovy")
        checkoutTest.call()
        printCallStack()
    }
}
