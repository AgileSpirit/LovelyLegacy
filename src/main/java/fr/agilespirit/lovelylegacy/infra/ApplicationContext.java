package fr.agilespirit.lovelylegacy.infra;

import java.util.HashMap;
import java.util.Map;

/**
 * User:    Jérémy Buget
 * Email:   jbuget@agile-spirit.fr
 * Twitter: @jbuget
 * GitHub:  https://github.com/AgileSpirit/
 * Date:    09/09/2014
 */
public class ApplicationContext {

    private final Map<String, SpringBean> managedBeans;

    public ApplicationContext() {
        managedBeans = new HashMap<>();
        managedBeans.put("environmentManager", new EnvironmentManager());
    }

    public <T extends SpringBean> T getBean(String beanName, Class<T> clazz) {
        return (T) managedBeans.get(beanName);
    }

}
