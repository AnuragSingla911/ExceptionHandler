package exceptionhandler.android.com.exceptionhandler;

import android.app.Application;

/**
 * Created by jade on 9/6/16.
 */
public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ExceptionHandler.inilizeHandler();
    }


}
