package com.cybernetic;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingList {
    private Queue<Patient> waitingList;

    public PatientWaitingList() {
        waitingList = new LinkedList<>();
    }


    /**
     * Add a new patient to the end of the waiting list.
     * @param patient The patient to be added to the waiting list.
     */
    public void addPatient(Patient patient) {
        //throw new UnsupportedOperationException("Method not implemented");
        waitingList.offer(patient);
    }

    /**
     * Remove and return the next patient from the front of the waiting list.
     * @return The next patient in the waiting list.
     */
    public Patient removeNextPatient() {
        //throw new UnsupportedOperationException("Method not implemented");
        return waitingList.poll();
    }

    /**
     * Check if the patient waiting list is empty.
     * @return True if the waiting list is empty, false otherwise.
     */
    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Method not implemented");
        return waitingList.isEmpty();

    }

    /**
     * Print the current state of the patient waiting list.
     */
    public void printWaitingList() {
       // throw new UnsupportedOperationException("Method not implemented");
        if (waitingList.isEmpty()) {
            System.out.println("Waiting list is empty.");
            return;
        }
        System.out.println("Current Waiting Queue:");
        int position = 1;
        for (Patient patient : waitingList) {
            System.out.print(position + ".[ " + patient.getName() + " ] ");
            if (position < waitingList.size()) {
                System.out.print("<--- ");
            }
            position++;
        }
        System.out.println();
    }
    }

