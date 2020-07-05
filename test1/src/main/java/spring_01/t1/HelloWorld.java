package spring_01.t1;

public class HelloWorld {
    private String message;

    public void printMessage(){
        System.out.println(String.format("your message: %s",message));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
