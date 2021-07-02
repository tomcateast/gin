import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JavaTest {
    public static void main(String args[]) {

        int a = -10;
        int b = 0;
        if (a>0)
            a++;
        else
            b++;

//        ExecutorService executorService = Executors.newScheduledThreadPool(10);
//        for (int i=0; i<1000; i++) {
//            int initI = i;
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(initI);
//                    String date = new JavaTest().date(initI);
//                    System.out.println(date);
//                }
//            });
//        }
    }

    public String date(int seconds) {
        System.out.println("seconds=" + seconds);
        SimpleDateFormat simpleDateFormat = local.get();
        String format = simpleDateFormat.format(seconds * 1000);
        System.out.println("format=" + format);
        return format;
    }

    public static ThreadLocal<SimpleDateFormat> local = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }
    };
}

class Task implements Runnable{

    @Override
    public void run() {
    }
}
