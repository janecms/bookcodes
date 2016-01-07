package app08e.validator;
import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class StrongPasswordValidator extends FieldValidatorSupport {

    private int minLength = -1;
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
    public int getMinLength() {
        return minLength;
    }
    public void validate(Object object) throws ValidationException {
        String fieldName = getFieldName();
        String value = (String) getFieldValue(fieldName, object);
        if (value == null || value.length() <= 0) {
            // use a required validator for these
            return;
        }
        if ((minLength > -1) && (value.length() < minLength)) {
            addFieldError(fieldName, object);
        } else if (!isPasswordStrong(value)) {
            addFieldError(fieldName, object);
        }
    }
    
    private static final String GROUP_1 = "abcdefghijklmnopqrstuvwxyz";
    private static final String GROUP_2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String GROUP_3 = "0123456789";
    protected boolean isPasswordStrong(String password) {
        boolean ok1 = false;
        boolean ok2 = false;
        boolean ok3 = false;
        int length = password.length();
        for (int i = 0; i < length; i++) {
            if (ok1 && ok2 && ok3) {
                break;
            }
            String character = password.substring(i, i + 1);
            System.out.println("character:" + character);
            if (GROUP_1.contains(character)) {
                ok1 = true;
                continue;
            }
            if (GROUP_2.contains(character)) {
                ok2 = true;
                continue;
            }
            if (GROUP_3.contains(character)) {
                ok3 = true;
            }
        }
        return (ok1 && ok2 && ok3);
    }    
}
