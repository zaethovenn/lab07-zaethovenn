package labseven.experiment;

import labseven.data.ResultsTable;
import labseven.list.SinglyLinkedList;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Janyl Jumadinova
 */

public interface Campaign {

  /** Require that any Campaign implementer can run an SinglyLinkedList's
   *  method in an experiment. */
  public ResultsTable run(SinglyLinkedList<String> list, int campaignLength, String operation);

}
