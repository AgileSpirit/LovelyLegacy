package fr.agilespirit.lovelylegacy;

import org.junit.Assert;
import org.junit.Test;


public class ServiceTest {
/*
    @Test
    public void testGetApplicationModeInProductionEnvironment() throws Exception {
        // Given
        EnvironmentResource environmentResource = new EnvironmentResource();

        // When
        String actual = environmentResource.getSystemUrl();

        // Then
        Assert.assertEquals(SpringBeanMock.WORKER_STATUS_PRODUCTION, actual);
    }

    @Test
    public void testGetApplicationModeInTestEnvironment() throws Exception {
        // Given
        EnvironmentResource environmentResource = new EnvironmentResourceMock();

        // When
        String actual = environmentResource.getSystemUrl();

        // Then
        Assert.assertEquals(SpringBeanMock.WORKER_STATUS_TEST, actual);
    }

    */
/*
     * MOCK OBJECTS
     *//*


    private class EnvironmentResourceMock extends EnvironmentResource {
        @Override
        ContextFacade getSingleton() {
            ApplicationContext testContext = new ApplicationContext();
            testContext.setSpringBean(new SpringBeanMock());
            return ContextFacade.getInstance4Test(testContext);
        }
    }

    private class SpringBeanMock extends SpringBean {

        private static final String WORKER_STATUS_TEST = "Run into 'Test' mode";

        @Override
        public String getStatus() {
            return WORKER_STATUS_TEST;
        }

    }
*/
}
