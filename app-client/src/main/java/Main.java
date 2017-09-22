import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.val;

@Slf4j
@Data
public class Main {

    public static void main(String[] args) {
        System.out.println("main");
        log.info("main8");
        log.info("{}", Libs01.add2(22, 33));
        val data = new Client.MyData("A");
        log.info(data.toString());
        log.info("data={}", data);
        log.info("{}", data.getNumber());
        Main m = new Main("B", 123);
    }
    private final String required;
    private final int number;
}
