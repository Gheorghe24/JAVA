package lab5;

import lab5.task1.Task;

public class Main {

    private static final int TASK_NO = 6;

    private static Task[] taskList;

    private static void test1() {
        // TODO: uncomment the lines below
//        taskList = new Task[TASK_NO];
//
//        taskList[0] = new OutTask("First message task");
//        taskList[1] = new RandomOutTask();
//        taskList[2] = new CounterOutTask();
//        taskList[3] = new OutTask("Second message task");
//        taskList[4] = new CounterOutTask();
//        taskList[5] = new RandomOutTask();
//
//        for (Task task : taskList) {
//            task.execute();
//        }
    }

    static private void test2() {
    // TODO: uncomment the lines below
//        System.out.println("----> Queue");
//        Queue q = new Queue();
//        for(Task task : taskList) {
//            q.push(task);
//        }
//        q.pop();
//        q.pop();
//        for (Task task : q.getTasks()) {
//            task.execute();
//        }
//
//        System.out.println("----> Stack");
//        Stack s = new Stack();
//        for(Task task : taskList) {
//            s.push(task);
//        }
//        s.pop();
//        s.pop();
//        for (Task task : s.getTasks()) {
//            task.execute();
//        }
//
//        System.out.println("----> Testare metoda transferFrom");
//        q.transferFrom(s);
//
//        for (Task task : q.getTasks()) {
//            task.execute();
//        }
//
//        System.out.println(s.isEmpty()); //trebuie sa afiseze true
    }

    static private void test3() {
        // TODO: uncomment the lines below
//        Operation op = new Operation(13);
//        op.div(0);
//        op.div(1);
//        System.out.println(op.getNumber()); //13
//        op.mult(2);
//        System.out.println(op.getNumber());  //26
//        op.minus(3);
//        System.out.println(op.getNumber());  //23
//        op.plus(7);
//        System.out.println(op.getNumber()); //30
    }


    private static void test4() {
        // TODO: uncomment the lines below
//        Song song1 = new Song("Bad", 101, "Michael Jackson");
//        Song song2 = new Song("Dangerous", 19, "Michael Jackson");
//        Song song3 = new Song("Heal the world", 53, "Composer");
//        Song song4 = new Song("Thriller", 82, "Michael Jackson" );
//        Song song5 = new Song("Beat it", 83, "Michel Jakson");
//        Song song6 = new Song("Smooth Criminal", 77, "Composer");
//
//        DangerousAlbum dangerous = new DangerousAlbum();
//        dangerous.addSong(song2);
//        dangerous.addSong(song3);
//        dangerous.addSong(song6);
//        System.out.println(dangerous);
//
//        ThrillerAlbum thriller = new ThrillerAlbum();
//        thriller.addSong(song4);
//        thriller.addSong(song6);
//        thriller.addSong(song5);
//        System.out.println(thriller);
//
//        BadAlbum bad = new BadAlbum();
//        bad.addSong(song1);
//        bad.addSong(song6);
//        System.out.println(bad);
    }

    public static void main(String[] args) {
        test1();
        System.out.println("------\tTEST EX 1 FINISHED\t------");

        test2();
        System.out.println("------\tTEST EX 2 FINISHED\t------");

        test3();
        System.out.println("------\tTEST EX 3 FINISHED\t------");

        test4();
        System.out.println("------\tTEST EX 4 FINISHED\t------");
    }
}
