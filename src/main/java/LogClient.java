public interface LogClient {
    /* start a process*/
    void start(String processId);

    /* end a process */
    void end(String processId);
    /* print all processes sort by start time*/
    void poll();

}
