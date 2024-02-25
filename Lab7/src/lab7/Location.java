package lab7;

import java.util.Objects;

public class Location {
  private final File file;
  private final int rank;

  public Location(File file, int rank) {
    this.file = file;
    this.rank = rank;
  }

  public File getFile() {
    return file;
  }

  public int rank() {
    return rank;
  }

  // Implementing the isValidLocation method
  public boolean isValidLocation() {
    return rank >= 1 && rank <= 8 && file.ordinal() >= 0 && file.ordinal() < 8;
  }

  @Override
  public boolean equals(Object a) {
    if (this == a)
      return true;
    if (!(a instanceof Location))
      return false;

    Location location = (Location) a;
    return file == location.file &&
        Objects.equals(rank, location.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, rank);
  }

  @Override
  public String toString() {
    return "{" + "file=" + file + ", rank=" + rank + "}";
  }

  public static boolean isValidLocation(File file, int rank) {
    return new Location(file, rank).isValidLocation();
  }
}
