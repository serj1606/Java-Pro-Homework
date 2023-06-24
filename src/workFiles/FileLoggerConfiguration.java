package workFiles;

public class FileLoggerConfiguration extends AbstractLoggerConfiguration{
  public String path;
  public LoggingLevel level;
  public int size;
  public String format;

  public void setPath(String path) {
    this.path = path;
  }

  public void setLevel(LoggingLevel level) {
    this.level = level;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setFormat(String format) {
    this.format = format;
  }
}
