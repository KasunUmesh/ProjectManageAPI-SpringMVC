package lk.ijse.gdse;

import lk.ijse.gdse.config.WebAppConfig;
import lk.ijse.gdse.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("one");
        return new Class[]{WebAppRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("two");
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("three");
        return new String[]{"/"};
    }
}
