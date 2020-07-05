package spring_01.t3;

public class HelloWorld implements HelloWorldImpl{
    private String messages;

    public HelloWorld(String messages) {
        this.messages = messages;
    }

    @Override
    public void printMessage() {
        System.out.println("Your Message : " + messages);
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
