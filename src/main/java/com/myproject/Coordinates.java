package main.java.com.myproject;

import java.util.Objects;

public class Coordinates {
    public final File file; // горизонталь
    public final Integer rank; // вертикаль

    public Coordinates(main.java.com.myproject.File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Coordinates that = (Coordinates) object;

        if (!file.equals(that.file)) return false;
        return rank.equals(that.rank);
    }

    @Override
    public int hashCode() {
        int result = file.hashCode();
        result = 31 * result + rank.hashCode();
        return result;
    }
}
