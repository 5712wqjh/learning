import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		Function<Object, String> now = n -> {
			return new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��").format(new Date());
		};
		System.out.println(now.apply(null));
	}
}
