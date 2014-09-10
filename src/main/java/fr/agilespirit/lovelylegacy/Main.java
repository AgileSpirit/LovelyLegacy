package fr.agilespirit.lovelylegacy;

import fr.agilespirit.lovelylegacy.application.EnvironmentService;
import fr.agilespirit.lovelylegacy.infra.security.AuthorizationHeader;
import fr.agilespirit.lovelylegacy.infra.security.ResourceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws ResourceException {
        AuthorizationHeader authorizationHeader = new AuthorizationHeader(UUID.randomUUID().toString());
        EnvironmentService environmentResource = new EnvironmentService();
        LOGGER.info("System base URL: " + environmentResource.getSystemBaseUrl(authorizationHeader));
    }

}
