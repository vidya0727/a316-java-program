public class TaskManager {

    public static void main(String[] args) {

        Thread task = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println("Task Count: " + i);

                try {
                    Thread.sleep(1000); // 1-second delay
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }

        });

        task.start();
    }
}
