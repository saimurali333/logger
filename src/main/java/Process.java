public class Process {
    private final String id;
    private final Long startTime;
    private Long endTime;

    public Process(String id, Long startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public Long getStartTime() {
        return startTime;
    }
}
