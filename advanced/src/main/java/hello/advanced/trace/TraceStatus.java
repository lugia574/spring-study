package hello.advanced.trace;

public class TraceStatus {

    private TraceId tarceId;
    private Long startTimeMs;
    private String message;

    public TraceStatus(TraceId tarceId, Long startTimeMs, String message) {
        this.startTimeMs = startTimeMs;
        this.tarceId = tarceId;
        this.message = message;
    }

    public TraceId getTarceId() {
        return tarceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
