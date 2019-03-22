package observer.guava;

import com.google.common.eventbus.EventBus;
import observer.gperadvice.Question;
import observer.gperadvice.Teacher;

/**
 * Created by Administrator on 2019/3/21.
 */
public class GuavaEventTest {
    public static void main(String[] args) {
//        EventBus eventBus= new EventBus();
//        GuavaEvent guavaEvent = new GuavaEvent();
//        eventBus.register(guavaEvent);
//        eventBus.post("Tom");
//
//        GuavaTeacher tom = new GuavaTeacher("TOM");
//        eventBus.register(tom);

        GuavaQuestion question = new GuavaQuestion();
        question.setUsername("小明");
        question.setContent("观察者模式适用于哪些场景？");

        GuavaGPer a=GuavaGPer.getInstance();
        a.setGuavaQuestion(question);
        System.out.println(a.toString());
        GuavaTeacher tomTeacher = new GuavaTeacher("TOM");
        GuavaTeacher micTeacher = new GuavaTeacher("MIC");

        EventBus eventBus= new EventBus();
        //GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(tomTeacher);
        eventBus.register(micTeacher);
        eventBus.post(a);
        //Teacher tom = new Teacher("Tom");
    }
}
