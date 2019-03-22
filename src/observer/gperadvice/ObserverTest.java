package observer.gperadvice;

/**
 * Created by Administrator on 2019/3/21.
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        gper.addObserver(tom);
        gper.addObserver(mic);
        //业务逻辑代码
        Question question = new Question();
        question.setUsername("小明");
        question.setContent("观察者模式适用于哪些场景？");
        gper.publicshQuestion(gper,question);
    }
}
