import java.util.Arrays;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/8/1 20:27
 * @Created by mmz
 */
public class test {
    static volatile Integer i = 1;
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (i){
                        try{
                            if(i == 1){
                                System.out.println("a");
                                i--;
                                i.notifyAll();
                            }
                            i.wait();

                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }


                }

            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (i){
                        try{
                            if(i == 0){
                                System.out.println("b");
                                i++;
                                i.notifyAll();
                            }
                            i.wait();


                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }


                }

            }
        });


        thread.run();
        thread1.run();
    }
}
