package zoo.annotation;

import com.alibaba.fastjson.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SheepAnnotationTest {
    private static ApplicationContext context;
    @BeforeClass
    public static void getContext(){
        context = new ClassPathXmlApplicationContext(
                "ioc/annotation/spring.xml");
    }

    @Test
    public void autowire(){
        Sheep sheep =
                context.getBean("sheep", Sheep.class);
        System.out.println(sheep.getContext() == context);
    }
}