import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("nameValidator")
public class NameValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
        String name = (String)value;
        char[] chars = name.toCharArray();
        boolean numbers = true;

        for(char c: chars){
            if(Character.isDigit(c)){
                numbers = false;
            }
            if(!numbers){
                String messageText = "Only letters are allowed";
                throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,messageText,messageText));
            }
        }
    }
}
