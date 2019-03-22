package observer.gperadvice;

import java.util.Observable;

/**JDK提供的一种观察者的实现方式，被观察者
 * Created by Administrator on 2019/3/21.
 */
public class GPer extends Observable{
    private String name ="GPer生态圈";

    private static  GPer gper = null;

    private GPer(){}

    public static GPer getInstance(){
        if(gper==null){
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publicshQuestion(GPer gper, Question question){
        System.out.println(question.getUsername()+ "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
