package collections;

import java.time.LocalDateTime;
import java.util.Objects;

public class Example1 {
    private String name;
    private LocalDateTime dateTime;

    public Example1(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example1 example1 = (Example1) o;
        return Objects.equals(name, example1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Example1{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
