package fr.agilespirit.lovelylegacy.infra;

import fr.agilespirit.lovelylegacy.domain.Environment;
import fr.agilespirit.lovelylegacy.domain.EnvironmentType;
import fr.agilespirit.lovelylegacy.infra.context.SpringBean;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class EnvironmentManager extends SpringBean {

    public EnvironmentType retrieveEnvironmentType() {
        return new Environment(EnvironmentType.PRODUCTION).getType();
    }

}
