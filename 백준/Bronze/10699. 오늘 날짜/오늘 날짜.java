import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) throws IOException {
        
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(now);

    }
}