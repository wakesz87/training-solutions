package week16d01;

import java.time.Duration;
import java.time.LocalDateTime;

public class Rental {
    private String name;
    private CanoeType canoeType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Rental(String name, CanoeType canoeType, LocalDateTime startTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        LocalDateTime closing = endTime;
        if (closing == null) {
            closing = LocalDateTime.now();
        }
        return Duration.between(startTime, closing).toHours();
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "name='" + name + '\'' +
                ", canoeType=" + canoeType +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
