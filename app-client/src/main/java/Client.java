import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.val;

@Slf4j
public class Client {

    public static String GREETING = "Hello World";

    public static void main(String[] args) {
        System.out.println("main");
        log.info("main8");
        log.info("{}", Libs01.add2(22, 33));
        val data = new MyData("A");
        log.info(data.toString());
        log.info("data={}", data);
        log.info("{}", data.getNumber());
    }

    @Data
    public static class MyData {

        private final String required;
        private int number;
    }

}
