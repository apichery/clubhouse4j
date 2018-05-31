package io.clubhouse.api.v3beta;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;

public class RequestLimiter {
    public static ArrayDeque<Instant> requestPermits = new ArrayDeque<>();

    public static void askPermit() {
        synchronized (requestPermits) {
            Instant now = Instant.now();
            if (requestPermits.size() >= 400) {
                Instant first = requestPermits.getFirst();
                Duration duration = Duration.between(first, now);
                if (duration.getSeconds() < 60) {
                    try {
                        System.out.println("Throttling... for " + duration.getSeconds() + " seconds");
                        Thread.sleep(duration.getSeconds() * 1000L);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException("Interrupted while throttling requests", e);
                    }
                }
                requestPermits.removeFirst();
            }
            requestPermits.add(now);
        }
    }
}
