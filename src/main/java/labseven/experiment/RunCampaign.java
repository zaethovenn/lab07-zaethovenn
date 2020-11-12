package labseven.experiment;

import labseven.data.ResultsTable;
import labseven.list.SinglyLinkedList;

import java.util.Random;

/**
 * A RunCampaign class that can run an experiment with a computer.
 *
 * @author Janyl Jumadinova
 * @author Add Your Name Here
 */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 10;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  /** Run a provided operation in an experiment campaign for specified rounds. */
  public ResultsTable run(SinglyLinkedList<String> list, int campaignLength, String operation) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    //String operation = "toString";
    ResultsTable results = new ResultsTable(campaignLength);
    if (operation.equals("toString")) {
      System.out.println("Starting a campaign of experiments with " + operation + " ...");
      while (campaignRound < campaignLength) {
        // populate the SinglyLinkedList with the data
        // create a new list so that the data is not cummulative
        list = new SinglyLinkedList<String>();
        populateList(list, currentInputSize);
        // run the experiment on the toString method
        long timeBefore = System.currentTimeMillis();
        String textualRepresentation = list.toString();
        long timeAfter = System.currentTimeMillis();
        long timeElapsed = timeAfter - timeBefore;
        // store the result and produce the debugging information
        results.addResult((long)currentInputSize, timeElapsed);
        System.out.println(IDENTATION + "Running round " + campaignRound
            + " with input size " + currentInputSize);
        currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
        campaignRound++;
      }
      System.out.println("... Finishing a campaign of experiments with " + operation);
      return results;
    } else { // recursive
      System.out.println("Starting a campaign of experiments with " + operation + " ...");
      while (campaignRound < campaignLength) {
        // TODO: populate the SinglyLinkedList with the data
        // TODO: run the experiment on your recursive method
        // TODO: store the result and produce the debugging information
        // TODO: increase the size and go to the next campaignRound
      }
      System.out.println("... Finishing a campaign of experiments with " + operation);
      return results;
    }
  }

  /** Populate the SinglyLinkedList with the specified amount of data. */
  public void populateList(SinglyLinkedList<String> list, int requestedSize) {
    for (int i = 0; i < requestedSize; i++) {
      list.addLast(Integer.toString(i));
    }
  }

}
