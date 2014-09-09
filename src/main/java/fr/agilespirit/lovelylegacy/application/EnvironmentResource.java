package fr.agilespirit.lovelylegacy.application;

import fr.agilespirit.lovelylegacy.infra.ContextFacade;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class EnvironmentResource {

    private ContextFacade contextFacade = ContextFacade.getInstance();

    public String getSystemBaseUrl() {
        switch (contextFacade.getEnvironmentManager().retrieveEnvironmentType()) {
            case DEVELOPMENT:
                return "http://localhost:8080/";
            case INTEGRATION:
                return "http://integration.my-app.com/";
            case ACCEPTANCE:
                return "http://acceptance.my-app.com/";
            case STAGING:
                return "http://staging.my-app.com:8080/";
            case PRODUCTION:
            default:
                return "http://my-app.com";
        }
    }

}
