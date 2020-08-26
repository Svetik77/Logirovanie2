package logirovanie;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {

	@Override
	public boolean isLoggable(LogRecord record) {
		System.out.println(getClass().getClassLoader().getResource("logging.properties"));

	    return record.getLoggerName().indexOf("com") != -1;

	}

}
