package person.liuxx.fgo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 刘湘湘
 * @version 1.0.0<br>
 *          创建时间：2017年7月26日 下午4:38:54
 * @since 1.0.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer
{
    @Override
    public void addViewControllers(ViewControllerRegistry registry)
    {
        // registry.addViewController("/login").setViewName("login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/dev/**").addResourceLocations(
                "file:E:/GitProject/fgo-calculator/dist/");
        registry.addResourceHandler("/page/**").addResourceLocations("file:./page/");
    }
}
