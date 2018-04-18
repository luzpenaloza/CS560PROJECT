/**
 * 
 */
package shortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Owner
 *
 */
class AdjacencyChecker {
	HashMap<Integer,List<Integer>> adjacencyList;
	/**
	 * 
	 */
	public AdjacencyChecker() {
		Populator validEntries = new Populator();
		List<Integer> pNumList = validEntries.getPositionNumberList();
		//List<Integer> cList = validEntries.getCostList();
		//List<Double> eWeightList = validEntries.getEdgeWeightList();
		adjacencyList = new HashMap<Integer,List<Integer>>();
		
		for(int i=0;i<pNumList.size();i++) {
			int val = pNumList.get(i);
		
			List<Integer> list = new ArrayList<Integer>();
			
			if(pNumList.contains(val+7)) {
				list.add(val+7);
			}
			if(pNumList.contains(val-7)) {
				list.add(val-7);
			}
			if(pNumList.contains(val-8)) {
				list.add(val-8);
			}
			if(pNumList.contains(val+8)) {
				list.add(val+8);
			}
			if(pNumList.contains(val-15)) {
				list.add(val-15);
			}
			if(pNumList.contains(val+15)) {
				list.add(val+15);
			}
			
			adjacencyList.put(val, list);
		}
		
	//	System.out.println("Valid Position Numbers: " + pNumList);
		//System.out.println("Valid Costs: " + cList);
		//System.out.println("Valid Edge Weights: " + eWeightList);
		//System.out.println("Adjacency List: "+adjacencyList.toString());
	}

	public HashMap<Integer,List<Integer>> getAdjacencyList() {
		return adjacencyList;
	}

}
