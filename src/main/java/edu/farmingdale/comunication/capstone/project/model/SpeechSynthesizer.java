package edu.farmingdale.comunication.capstone.project.model;

import com.microsoft.cognitiveservices.speech.*;

public class SpeechSynthesizer {
    private static final String API_KEY = "7ibYrSgXmO0LROJ0iQaKdAdYNgz8GxBa51E8hvMTmmwI3OqdfFEQJQQJ99BDACYeBjFXJ3w3AAAYACOGLYt";
    private static final String REGION = "eastus";

    private SpeechSynthesizer synthesizer;
    private SpeechConfig speechConfig;

    public SpeechSynthesizer() {
        // Initialize the Speech Configuration with API Key and Region
        speechConfig = SpeechConfig.fromSubscription(API_KEY, REGION);

        // Optionally, set properties such as voice (default is "en-US-JessaNeural")
        speechConfig.setSpeechSynthesisVoiceName("en-US-JessaNeural");

        // Create the synthesizer
       // synthesizer = new SpeechSynthesizer(speechConfig);
    }
    public void synthesizeText(String text) {
        // Synthesize the input text into speech and play it
        if (text == null || text.isEmpty()) {
            System.out.println("Input text is empty.");
            return;
        }

        // Start speech synthesis
       // SpeechSynthesisResult result = synthesizer.SpeakTextAsync(text).get();

        // Check the result
        //if (result.getReason() == SpeechSynthesisResultReason.SynthesizingAudioCompleted) {
          //  System.out.println("Successfully synthesized the text.");
       // } else {
       //     System.out.println("Speech synthesis failed: " + result.getErrorDetails());
       // }
    }
}
