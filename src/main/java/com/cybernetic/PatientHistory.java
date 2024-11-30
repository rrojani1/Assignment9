package com.cybernetic;

import java.util.Stack;

public class PatientHistory {
    private Stack<String> medicalHistory;

    public PatientHistory() {
        medicalHistory = new Stack<>();
    }

    /**
     * Add a new medical event to the patient's history.
     *
     * @param event The medical event to be added.
     */
    public void addMedicalEvent(String event) {
        //throw new UnsupportedOperationException("Method not implemented");
        medicalHistory.push(event);
    }

    /**
     * View the most recent medical event without removing it from the stack.
     *
     * @return The most recent medical event.
     */
    public String viewLatestEvent() {
        //throw new UnsupportedOperationException("Method not implemented");
        if (!medicalHistory.isEmpty()) {
            return medicalHistory.peek();
        }
        return "No medical history available.";

    }

    /**
     * Remove and return the most recent medical event from the stack.
     *
     * @return The most recent medical event.
     */
    public String removeMostRecentEvent() {
        //throw new UnsupportedOperationException("Method not implemented");

        if (!medicalHistory.isEmpty()) {
            return medicalHistory.pop();
        }
        return "No medical history available.";
    }

    /**
     * Check if the patient's medical history is empty.
     *
     * @return True if the medical history is empty, false otherwise.
     */
    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Method not implemented");

        return medicalHistory.isEmpty();
    }

    public void printHistory() {
        if (medicalHistory.isEmpty()) {
            System.out.println("No medical history available.");
            return;
        }
        System.out.println("Medical History:");
        for (String event : medicalHistory) {
            System.out.println("- " + event);
        }
    }
}