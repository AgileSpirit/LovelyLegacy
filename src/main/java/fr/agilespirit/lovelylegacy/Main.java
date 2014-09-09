package fr.agilespirit.lovelylegacy;

import fr.agilespirit.lovelylegacy.application.EnvironmentResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        EnvironmentResource environmentResource = new EnvironmentResource();
        LOGGER.info("System base URL: " + environmentResource.getSystemBaseUrl());
    }

}
