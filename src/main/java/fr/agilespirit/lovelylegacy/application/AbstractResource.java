package fr.agilespirit.lovelylegacy.application;

import fr.agilespirit.lovelylegacy.infra.security.AuthorizationHeader;
import fr.agilespirit.lovelylegacy.infra.security.ResourceException;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public abstract class AbstractResource {

    void checkSecurity(AuthorizationHeader authorizationHeader) throws ResourceException {
        if (authorizationHeader == null || authorizationHeader.getAccessToken() == null) {
            throw new ResourceException();
        }
    }

}
