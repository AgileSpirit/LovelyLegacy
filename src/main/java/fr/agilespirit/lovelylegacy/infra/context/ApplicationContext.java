package fr.agilespirit.lovelylegacy.infra.context;

import fr.agilespirit.lovelylegacy.infra.repository.EnvironmentRepository;

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
        setBean("environmentManager", new EnvironmentRepository());
    }

    public <T extends SpringBean> T getBean(String beanName, Class<T> clazz) {
        return (T) managedBeans.get(beanName);
    }

    public <T extends SpringBean> void setBean(String beanName, T springBean) {
        managedBeans.put(beanName, springBean);
    }
}
