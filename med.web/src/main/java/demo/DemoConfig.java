package demo;

import com.jfinal.config.*;

/**
 * Created by wanyer on 2016/5/6.
 */
public class DemoConfig extends JFinalConfig{

    //
    public void configConstant(Constants me){
        me.setDevMode(true);
    }

    public void configRoute(Routes me){
        me.add("/hello",HelloController.class);
    }

    public void configPlugin(Plugins me){
    
    }

    public void configInterceptor(Interceptors me) {}

    public void configHandler(Handlers me) {}
}
