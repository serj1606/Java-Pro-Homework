package workFiles;

public abstract class AbstractLoggerConfiguration {
  public LoggingLevel level;

  public void setLevel(LoggingLevel level) {
    this.level = level;
  }

  public AbstractLoggerConfiguration() {
  }
}
