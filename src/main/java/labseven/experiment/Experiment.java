package labseven.experiment;

import labseven.data.ResultsTable;
import labseven.list.SinglyLinkedList;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds for different methods of SinglyLinkedList.
 *
 * @author Janyl Jumadinova
 * @author Add Your Name Here
 */

public class Experiment {

  /** The length of the campaign for the textual representation construction. */
  private static final int TOSTRING_CAMPAIGN = 15;

  /** Run the toString experiment. */
  public static void runExperiments(String operation) {
    RunCampaign runComputationCampaign = new RunCampaign();
    // create the new instance of a SinglyLinkedList
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    // create the new ResultsTable by running to the campaign
    // of experiments for the toString method in a SinglyLinkedList
    ResultsTable resultsTable =
        runComputationCampaign.run(list, TOSTRING_CAMPAIGN, operation);
    // display the results in table format
    System.out.println();
    System.out.println("Results of an experiment campaign");
    System.out.println(resultsTable.toString());
    System.out.println();
  }

  /** Run the experiment campaigns for an algorithm in a SinglyLinkedList. */
  public static void main(String[] args) {
    // call the method that runs the experiment
    runExperiments("toString");
    // TODO: Call the method that will run the experiment for your recursive method
  }

}
