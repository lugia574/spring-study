package hello.advanced.trace.hellotarce;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

public class HelloTraceV1Test {
    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello@@@@@");
        trace.end(status);

    }

    @Test
    void begin_excetion() {
        HelloTraceV1 tarce = new HelloTraceV1();
        TraceStatus status = tarce.begin("hhe");
        tarce.exception(status, new IllegalStateException());
    }
}
