public class Worker  {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback ;


    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker() {

    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            try {

                if (i == 33) {
                    errorCallback.onError();
                }

                callback.onDone("Task " + i + " is done");

            } catch (NullPointerException e) {
                System.out.println("Task " + i + " is error");
            }
        }
        }

    }

