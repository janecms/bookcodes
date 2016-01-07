package app11a.dao;

public class DBUtil {
    public static String fixSqlFieldValue(String value) {
        if (value == null) {
            return null;
        }
        int length = value.length();
        StringBuilder fixedValue = new StringBuilder((int) (length * 1.1));
        for (int i = 0; i < length; i++) {
            char c = value.charAt(i);
            if (c == '\'') {
                fixedValue.append("''");
            } else {
                fixedValue.append(c);
            }
        }
        return fixedValue.toString();
    }
}
