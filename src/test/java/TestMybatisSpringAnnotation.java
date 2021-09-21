import com.shy.config.SpringMybatisConfig;
import com.shy.entity.Actor;
import com.shy.service.ActorService;
import com.shy.service.impl.ActorServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMybatisSpringAnnotation {

    /**
     * 测试Spring-Mybatis的注解整合形式
     */
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringMybatisConfig.class);
        ActorService actorService = (ActorService) applicationContext.getBean("actorServiceImpl");
        Actor actor = actorService.getActorById(1);
        System.out.println(actor.toString());
    }
}
