package edu.farmingdale.comunication.capstone.project.model;

public class SpeechSynthesizer {
    private static final String API_KEY = "7ibYrSgXmO0LROJ0iQaKdAdYNgz8GxBa51E8hvMTmmwI3OqdfFEQJQQJ99BDACYeBjFXJ3w3AAAYACOGLYt5";
    private static final String REGION = "eastus";

    public static void speak(String text) {
        try {
            SpeechConfig config = SpeechConfig.fromSubscription(API_KEY, REGION);
            SpeechSynthesizer synthesizer = new SpeechSynthesizer(config);
            synthesizer.SpeakText(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
