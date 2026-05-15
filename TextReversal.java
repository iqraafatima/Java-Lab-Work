import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatterP1 implements AutoCloseable {
private SimpleDateFormat sdf;

public DateFormatterP1(String pattern) {
sdf = new SimpleDateFormat(pattern);
sdf.setLenient(false);
}

public Date parse(String dateStr) throws Exception {
return sdf.parse(dateStr);
}

public void close() {
System.out.println("Formatter closed");
}
}

public class TextReversal {
public static void main(String[] args) {
try (DateFormatterP1 df = new DateFormatterP1("yyyy-MM-dd")) {
Date date = df.parse("2024-12-25");
System.out.println("Parsed Date: " + date);
} catch (Exception e) {
System.out.println("Exception: " + e.getMessage());
}
}
}
