package workFiles;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      int i = 0;
      String path = "src\\workFiles\\Loader.yaml";
      AbstractLoggerConfigurationLoad abstractLoggerConfigurationLoad =
          new FileLoggerConfigurationLoader();
      FileLoggerConfiguration fileLoggerConfiguration =
          (FileLoggerConfiguration) abstractLoggerConfigurationLoad.load(path);
      AbstractLogger abstractLogger = new FileLogger(fileLoggerConfiguration);
      while (i++ < 15) {
        abstractLogger.debug("DEBUG");
        abstractLogger.info("INFO");
      }

    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }

  }
}
