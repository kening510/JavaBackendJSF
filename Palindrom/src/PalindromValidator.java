import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("PalindromValidator")
public class PalindromValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
        String word = (String) value;
        char[] chars = word.toCharArray();

        if(!isPalindrome(chars)){

                String messageText = "This word is not a palindrom.";
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, messageText, messageText));
        }

    }


    public boolean isPalindrome(char[] sentence) {

        int end = sentence.length - 1;

        for (int start = 0; start < end; start++) {//++start b4
            final char s = sentence[start];

			/*only for extra assignment!!!!!!!!!!!!!!!
			 * if (!Character.isLetterOrDigit(s)) {
				++end; // <-- we only want to increment the start, not decrement
						// the end
				continue;
			}*/

            final char e = sentence[end];

			/*only for extra assignment!!!!!!!!!!!!!!!
			 * if (!Character.isLetterOrDigit(e)) {
				--start; // <-- we only want to decrement the end, not increment
							// the start
				continue;
			}
			*/

            if (Character.toLowerCase(s) != Character.toLowerCase(e))
                return false;

            end--;//--end b4
        }

        return true;
    }
}
