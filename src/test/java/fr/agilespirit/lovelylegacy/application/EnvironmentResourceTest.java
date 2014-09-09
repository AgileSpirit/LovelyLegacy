package fr.agilespirit.lovelylegacy.application;

import fr.agilespirit.lovelylegacy.domain.EnvironmentType;
import fr.agilespirit.lovelylegacy.infra.EnvironmentManager;
import fr.agilespirit.lovelylegacy.infra.context.ApplicationContext;
import fr.agilespirit.lovelylegacy.infra.context.ContextFacade;
import org.junit.Test;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class EnvironmentResourceTest {

    @Test
    public void testGetSystemBaseUrl() throws Exception {

    }


    /*
     * MOCK OBJECTS
     */


    private class EnvironmentResourceMock extends EnvironmentResource {
/*
        @Override
        ContextFacade getSingleton() {
            ApplicationContext testContext = new ApplicationContext();
            testContext.
            return ContextFacade.getInstance4Test(testContext);
        }
*/
    }

    private class SpringBeanMock extends EnvironmentManager {
        @Override
        public EnvironmentType retrieveEnvironmentType() {
            return EnvironmentType.DEVELOPMENT;
        }
    }

}
