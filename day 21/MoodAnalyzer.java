public class MoodAnalyzer {
    private String message;

    /**
     * We have created this parameterized constructor and passing message.
     *
     * @param message
     */
    public MoodAnalyzer(String message) throws MoodAnalyzerException {
        this.message = message;
    }

    // we have also created a default constructor.
    public MoodAnalyzer() {

    }

    /**
     * getters and setter for the mood message.
     *
     * @return - message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method will compute if the mood is happy or sad.
     * 1. We will convert the message to lower case and check it the string contains happy or sad word in it.
     * Accordingly we will return Happy or Sad mood.
     * 2. We have used the try & catch block to check if user enters null value.
     * 3. If null value found than the NullPointerException will be triggered & it will return Invalid Mood.
     *
     * @param message -  We will pass the string message from the main method.
     * @return - We will return the mood Happy or Sad
     */
    public String analyseMood() throws MoodAnalyzerException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else if (message.toLowerCase().contains("happy")) {
                return "HAPPY";
            } else {
                return "ANY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException("Exception found");
        }
    }
}
