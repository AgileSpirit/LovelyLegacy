package fr.agilespirit.lovelylegacy.infra.context;

import fr.agilespirit.lovelylegacy.infra.EnvironmentManager;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class ContextFacade {

    private ApplicationContext context = null;

    private static ContextFacade instance = null;

    private ContextFacade() {
        this.context = new ApplicationContext();
    }

    public static ContextFacade getInstance() {
        synchronized (ContextFacade.class) {
            if (instance == null) {
                instance = new ContextFacade();
            }
            return instance;
        }
    }

    public EnvironmentManager getEnvironmentManager() {
        return context.getBean("environmentManager", EnvironmentManager.class);
    }

}
