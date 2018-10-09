package me.chanjar.javadebug;

import static java.time.Duration.ofSeconds;

public class App {
  public static void main(String[] args) throws InterruptedException {
    int count = 0;
    while (true) {
      count++;
      System.out.println("count: " + count);
      Thread.sleep(ofSeconds(2L).toMillis());
    }

  }
}
