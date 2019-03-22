package observer.guava;

import com.google.common.eventbus.Subscribe;


/**
 * Created by Administrator on 2019/3/21.
 */
public class GuavaTeacher {

    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void eventListener(GuavaGPer arg) {
        //GPer gper= (GPer)o;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" +arg.getGuavaQuestion().getUsername()+ "”的提问，希望您解答，问题内容如下：\n" +
                arg.getGuavaQuestion().getContent() +
                "提问者：" + arg.getGuavaQuestion().getUsername());
    }
}
