package fr.agilespirit.lovelylegacy;

import fr.agilespirit.lovelylegacy.application.EnvironmentResource;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class Main {

    public static void main(String[] args) {
        EnvironmentResource environmentResource = new EnvironmentResource();
        System.out.println("System base URL: " + environmentResource.getSystemBaseUrl());
    }

}
