package queueticketing.inttestb;

import java.util.ArrayList;

public class Queue {

    protected ArrayList<Integer> queue;
    private int index;
    private int issued;
    private int serving;

    public Queue() {
        this.queue = new ArrayList<>();
        this.index = 0;
        this.issued = 1000;
        this.serving = 0;
    }

    //Getter for index
    public int getIndex(){ return index; }

    //Getter for last issued ticket number
    public int getIssued() { return issued; }

    //Getter for latest serving ticket number
    public int getServing() { return serving; }

    //Issues ticket (FIFO enqueue)
    public void issueTicket() {
        issued = issued + 1;
        queue.add(issued);
        index++;
    }

    //Serves ticket (FIFO dequeue)
    public void serveTicket() {
        serving = queue.get(0);
        queue.remove(0);
        index--;
    }

}

