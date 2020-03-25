import jdk.jfr.Percentage;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "hcontroller")
@RequestScoped

public class HelloController implements Serializable {
    private String hello;

    public String getHello(){
        return hello;
    }
    public void setHello(String hello){
        this.hello=hello;
    }
    public String getGoodbye(){
        return "bye bye!";
    }

    @PostConstruct
    public void init(){
        hello="hello world!";
    }
}
