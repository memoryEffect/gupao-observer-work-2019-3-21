package observer;

import observer.mouseevent.Mouse;
import observer.mouseevent.MouseEventCallback;
import observer.mouseevent.MouseEventType;

/**
 * Created by Administrator on 2019/3/22.
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();
    }
}
