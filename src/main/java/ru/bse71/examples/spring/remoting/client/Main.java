package ru.bse71.examples.spring.remoting.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.bse71.examples.spring.remoting.common.TimeConverter;

public class Main {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("client_config.xml");

    final TimeConverter timeConverter = (TimeConverter) ctx.getBean("timeConverter");

    System.out.println(timeConverter.convertToSeconds(5, 6));
  }

}
