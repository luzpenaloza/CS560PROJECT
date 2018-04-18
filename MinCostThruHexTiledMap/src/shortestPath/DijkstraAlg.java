/**
 * 
 */
package shortestPath;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Owner
 *
 */
class DijkstraAlg {
	int currentVertex;
	int w;
	int MAXV = 233;
	int start = 226;
	int MAXINT = 9999;
	int weight;
	int dist;
	Boolean[] inTree;
	Integer[] distance;
	Integer[] parent;
	AdjacencyChecker aCheck;

	/**
		 * 
		 */
	public DijkstraAlg() {
		Populator validEntries = new Populator();
		List<Integer> pNumList = validEntries.getPositionNumberList();
		List<Integer> cList = validEntries.getCostList();
		List<Double> eWeightList = validEntries.getEdgeWeightList();
		aCheck = new AdjacencyChecker();
		// MAXV = pNumList.size();
		inTree = new Boolean[MAXV + 1];
		distance = new Integer[MAXV + 1];
		parent = new Integer[MAXV + 1];
		initialize();
		currentVertex = start;
		int aCheckCount = 0;
		while (!inTree[currentVertex]) {
			inTree[currentVertex] = Boolean.TRUE;
			// 24 p = g-> edges[v] ;
			// 25 while ( p != NULL )
			// 26 {
			// 27 w = p->y ;
			// 28 weight = p->weight ;

			aCheck.getAdjacencyList()
					.forEach((k, v) -> System.out.println("Position Number: " + k + " Adjacent Vertices: " + v));
			 System.out.println(aCheck.getAdjacencyList().values());
			//System.out.println(			aCheck.getAdjacencyList().get(i));

			 for (int i = 1; i < aCheck.getAdjacencyList().values().size(); i++) {
				System.out.println("A check: " + aCheckCount++ + " " + aCheck.getAdjacencyList().get(i));
			}
			System.out.println(aCheck.getAdjacencyList().values().size());
		}

	}

	void initialize() {
		Arrays.fill(inTree, Boolean.FALSE);
		Arrays.fill(distance, MAXINT);
		Arrays.fill(parent, -1);
		distance[start] = 0;
	}

	void relax() {
		// 39 if ( !intree[i] && (dist > distance[i]) )
		// 40 {
		// 41 dist = distance[i] ;
		// 42 v = i ;
		// 43 }
		// 44 }
		// 45 }
	}

	void findMax() {
		Map.Entry<Integer, List<Integer>> maxEntry = null;
		for (int i = 0; i < aCheck.getAdjacencyList().values().size(); i++) {
			aCheck.getAdjacencyList().get(i);
		}
		for (Map.Entry<Integer, List<Integer>> entry : aCheck.getAdjacencyList().entrySet()) {
			// if (maxEntry == null || ((Boolean)
			// entry.getValue()).compareTo(maxEntry.getValue()) > 0)
			// {
			// maxEntry = entry;
			// }
			// Math.max(entry.getValue());
		}

	}
}
