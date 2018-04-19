/**
 * 
 */
package shortestPath;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Collection;
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
	double currentWeight;
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
		int pNumIndex = 0;
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
		// int[] aCheckPrim = ((Collection<Integer>)
		// aCheck.getAdjacencyList()).stream().mapToInt(Integer::intValue).toArray();
		for (int i = 0; i < 233; i++) {
			// System.out.println(aCheck.getAdjacencyList().get(i));
			if (aCheck.getAdjacencyList().get(i) != null) {
				// System.out.println(aCheck.getAdjacencyList().get(i));

				// }
				// System.out.println(aCheck.getAdjacencyList().containsKey(validEntries));
			}
			// int j = 0;
			// System.out.println(pNumList.indexOf(currentVertex));

			while (!inTree[currentVertex]) {
				/*
				 * 21 while ( !intree[v] ) 22 { 23 intree[v] = TRUE ; //21 While
				 * the current vertex is not in the tree, //23 place the current
				 * vertex in the tree
				 */
				// j++;
				inTree[currentVertex] = Boolean.TRUE;
				// System.out.println(aCheck.getAdjacencyList().get(38));

				// }
				// System.out.println(pNumIndex);
				// System.out.println(pNumList.);
				/*
				 * 24 p = g-> edges[v] ; 25 while ( p != NULL ) 26 { 27 w = p->y
				 * ; 28 weight = p->weight ; //24 get the adjacency list for the
				 * current vertex. //25 while there are unvisited adjacent
				 * neighbors, //27 Visit the next unvisited neighbor and get its
				 * vertex //28 Set weight equal to the edge weight of the
				 * currently visited adjacent neighbor //29-33 relax() //34 Go
				 * to the next unvisited neighbor (may be redundant.)
				 */
				// int j = 0;
				pNumIndex = pNumList.indexOf(currentVertex);

				// while (aCheck.getAdjacencyList().get(j) != null) {
				for (int j = 0; j < aCheck.getAdjacencyList().get(currentVertex).size(); j++) {
					if (aCheck.getAdjacencyList().get(currentVertex).get(j) != null) {
						// System.out.println(aCheck.getAdjacencyList().get(currentVertex).get(j));
						currentWeight = eWeightList.get(pNumIndex);
						//System.out.println(currentWeight);
						relax();
					}
				}
				/*
				 * 36 v = 1 ; 37 dist = MAXINT ; 38 for ( i = 1 ; i <=
				 * g->nvertices ; i++ ) 39 if ( !intree[i] && (dist >
				 * distance[i]) ) 40 { 41 dist = distance[i] ; 42 v = i ; 43 }
				 * 44 } //36 Set the current vertex equal to 1
				 * 
				 * //37 Set the current shortest distance equal to MAXINT
				 * 
				 * //38 For index i from 1 to the number of vertices in the
				 * graph
				 * 
				 * //39 If the value located in the intree array at the position
				 * of index i is FALSE AND the current distance is greater than
				 * the value of the distance array located in the position of
				 * index i
				 * 
				 * //41 Then set the current distance equal to value of the
				 * distance array located in the position of
				 * 
				 * //42 Also, set the value of the current vertex equal to index
				 * i.
				 */

				aCheck.getAdjacencyList()
						.forEach((k, v) -> System.out.println("Position Number: " + k + " Adjacent Vertices: " + v));
				System.out.println(aCheck.getAdjacencyList().values());
				System.out.println(aCheck.getAdjacencyList().get(i));

				// for (int k = 1; k <
				// aCheck.getAdjacencyList().values().size(); k++) {
				// System.out.println("A check: " + aCheckCount++ + " " +
				// aCheck.getAdjacencyList().get(k));
				// }
				// System.out.println(aCheck.getAdjacencyList().values().size());
			}

		}
	}

	void initialize() {
		Arrays.fill(inTree, Boolean.FALSE);
		Arrays.fill(distance, MAXINT);
		Arrays.fill(parent, -1);
		distance[start] = 0;
	}

	void relax() {
		/*
		 * 29 >>> if ( distance[w] > (distance[v] + weight) ) 30 { 31 >>>
		 * distance[w] = distance[v] + weight ; 32 parent[w] = v ; 33 }
		 * 
		 * 
		 * // 29 If the value of the distance array located in the position of
		 * the vertex of the currently visited adjacent neighbor is greater than
		 * the sum of the value of the distance array located in the position of
		 * the current vertex and weight,
		 * 
		 * //31 then set value of the distance array located in the position of
		 * the vertex of the currently visited adjacent neighbor equal the sum
		 * of the value of the distance array located in the position of the
		 * current vertex and weight.
		 * 
		 * // 32 Also, place the current vertex in the location of the parent
		 * array which corresponds to the vertex of the currently visited
		 * adjacent neighbor.
		 */
	}

	void findMin() {
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
