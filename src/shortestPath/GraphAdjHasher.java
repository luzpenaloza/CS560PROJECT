/**
 * 
 */
package shortestPath;

import java.util.HashMap;
import java.util.List;

/**
 * @author Owner
 *
 */
class GraphAdjHasher {

	/**
	 * 
	 */
	public GraphAdjHasher() {
		Populator validEntries = new Populator();
		List<Integer> pNumList = validEntries.getPositionNumberList();
		List<Integer> cList = validEntries.getCostList();
		List<Double> eWeightList = validEntries.getEdgeWeightList();
		AdjacencyChecker aCheck = new AdjacencyChecker();
		HashMap<Integer,List<Integer>> aList = aCheck.getAdjacencyList(); 
		System.out.println("Valid Position Numbers: " + pNumList);
		System.out.println("Valid Costs: " + cList);
		System.out.println("Valid Edge Weights: " + eWeightList);
		System.out.println("Adjacency List: "+aList.toString());

		//HashMap<Integer,List<Integer>> adjacencyList = new HashMap<Integer,List<Integer>>();

	
	}

}
