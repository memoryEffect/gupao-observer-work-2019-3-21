package observer.guava;


/**JDK提供的一种观察者的实现方式，被观察者
 * Created by Administrator on 2019/3/21.
 */
public class GuavaGPer {
    private String name ="GPer生态圈";
    private static GuavaGPer gper = new GuavaGPer();
    private GuavaQuestion guavaQuestion ;


    private GuavaGPer(){}

    public static GuavaGPer getInstance(){
        return  gper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuavaQuestion getGuavaQuestion() {
        return guavaQuestion;
    }

    public void setGuavaQuestion(GuavaQuestion guavaQuestion) {
        this.guavaQuestion = guavaQuestion;
    }

    @Override
    public String toString() {
        return guavaQuestion.getUsername() + "在" + this.name + "上提交了一个问题。";

    }

}
