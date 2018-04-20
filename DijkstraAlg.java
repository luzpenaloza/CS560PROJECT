/**
 * 
 */
package shortestPath;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

/**
 * @author Owner
 *
 */
class DijkstraAlg {
	int currentVertex;
	int w;
	int MAXV;
	int start = 226;
	int MAXINT = 9999;
	int weight;
	int dist;
	Boolean[] inTree; 
	Integer[] distance; 
	Integer[] parent; 

	/**
		 * 
		 */
	public DijkstraAlg() {
		Populator validEntries = new Populator();
		List<Integer> pNumList = validEntries.getPositionNumberList();
		List<Integer> cList = validEntries.getCostList();
		List<Double> eWeightList = validEntries.getEdgeWeightList();
		AdjacencyChecker aCheck = new AdjacencyChecker();
		MAXV = pNumList.size();
		inTree = new Boolean[MAXV + 1];
		distance = new Integer[MAXV + 1];
		parent = new Integer[MAXV + 1];
		initialize();
		currentVertex = start;
		
		while (!inTree[currentVertex]) {
			inTree[currentVertex] = Boolean.TRUE;
			// 24 p = g-> edges[v] ;
			Graph gr = new Graph();
			// 25 while ( p != NULL )
			// 26 {
			// 27 w = p->y ;
			// 28 weight = p->weight ;

			aCheck.getAdjacencyList().forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
		}

	}

	void initialize() {
		Arrays.fill(inTree, Boolean.FALSE);
		Arrays.fill(distance, MAXINT);
		Arrays.fill(parent, -1);
		distance[start] = 0;
	}

	void relax() {

	}
}
