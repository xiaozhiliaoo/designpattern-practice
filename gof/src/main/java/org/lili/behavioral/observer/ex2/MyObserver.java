package org.lili.behavioral.observer.ex2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lili on 2017/8/3
 */
public class MyObserver implements Observer {

    public void update(Observable o, Object arg) {
        Article art = (Article)arg;
        System.out.println("博主发表了新的文章，快去看吧!");
        System.out.println("博客标题为：" + art.getTitle());
        System.out.println("博客内容为:" + art.getContent());
    }
}
