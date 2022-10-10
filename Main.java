package org.greatlearning.iitr.lab.driver;

import java.util.Scanner;

import org.greatlearning.iitr.lab.services.MergeSortImplementation;
import org.greatlearning.iitr.lab.services.NotesCount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSortImplementation mergeSortImplementattion=new MergeSortImplementation();
		NotesCount noteCount=new NotesCount();
		System.out.println("enter the size of currency denominations");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] notes=new int[size];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<size;i++)
		{
			notes[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want tom pay");
		int amounts=sc.nextInt();
		mergeSortImplementattion.sort(notes,0,notes.length-1);
		noteCount.notesCount(notes,amounts);
	}

}
