package demo;

import com.jfinal.core.Controller;

/**
 * Created by wanyer on 2016/5/6.
 */
public class HelloController extends Controller{
    public void index(){
        renderText("Hello World");
    }
}
