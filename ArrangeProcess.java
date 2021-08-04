// Arranging processes depending on their priority, size and time

import java.util.Scanner;

public class ArrangeProcess {
	public static void main(String[] args) {
		int[] id = new int[3];
		int[] size = new int[3];
		int[] priority = new int[3];
		int[] time = new int[3];
		Scanner sc = new Scanner(System.in);
		int container;
		
		for (int x = 0; x < id.length; x++) {
			System.out.print("\nProcess ID: ");
			id[x] = sc.nextInt();			
			
			System.out.print("Size: ");
			size[x] = sc.nextInt();			
			
			System.out.print("Priority: ");
			priority[x] = sc.nextInt();			
			
			System.out.print("Arrival Time: ");
			time[x] = sc.nextInt();
		}
		
		for (int x = 0; x < id.length; x++) {
			for (int y = x + 1; y < id.length; y++) {
				if (priority[x] > priority[y]) {
					container = id[x];
					id[x] = id[y];
					id[y] = container;
				} else if (priority[x] == priority[y]) {
					if (size[x] < size[y]) {
						container = id[x];
						id[x] = id[y];
						id[y] = container;
					} else if (size[x] == size[y]) {
						if (time[x] > time[y]) {
							container = id[x];
							id[x] = id[y];
							id[y] = container;
						} 
					}
				}
			}
		}

		System.out.println("\nProcess Arrangement (ID)s:");

		for (int x = 0; x < id.length; x++)
			System.out.print(id[x] + "\n");	
	}
}