package fr.agilespirit.lovelylegacy.domain;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class Environment {

    private EnvironmentType type;

    public Environment(EnvironmentType type) {
        this.type = type;
    }

    public EnvironmentType getType() {
        return type;
    }

}
