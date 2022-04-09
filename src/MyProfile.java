public class MyProfile {
    public static void main(String[] args) {

        String myName = "Uliana. ";
        int myAge = 30;

        String messageOne = "My name is ";
        String messageTwo = "I am ";
        String messageThree = " years old.";
        System.out.println(messageOne + myName + messageTwo + myAge + messageThree);

        String resultMessage = messageOne + myName + messageTwo + myAge + messageThree;
        System.out.println(resultMessage);

        myAge++;
        resultMessage = messageOne + myName + messageTwo + myAge + messageThree;
        System.out.println(resultMessage);

        myAge *= 2;
        resultMessage = messageOne + myName + messageTwo + myAge + messageThree;
        System.out.println(resultMessage);

    }
}
