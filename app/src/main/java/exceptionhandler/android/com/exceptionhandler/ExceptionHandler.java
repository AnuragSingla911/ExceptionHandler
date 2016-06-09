package exceptionhandler.android.com.exceptionhandler;

import android.util.Log;

/**
 * Created by jade on 9/6/16.
 */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    private static ExceptionHandler mINSTANCE = new ExceptionHandler();

    private ExceptionHandler(){}


    public static void inilizeHandler(){
        Thread.currentThread().setUncaughtExceptionHandler(mINSTANCE);
    }
    @Override
    public void uncaughtException(Thread thread, Throwable ex) {

        Log.d("exception handled", " ex handled :" + ex);

        ex.printStackTrace();


    }
}
