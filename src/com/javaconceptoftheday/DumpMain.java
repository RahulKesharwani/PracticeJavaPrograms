package com.javaconceptoftheday;

public class DumpMain {
	public static void main(String[] args) {
		int n = 9;
		for(int i=0; i<n;i++){
			for(int j=(n-i); j>0; j-- ){
				System.out.print(j + " ");
			}
			for(int j=1; j<=n; j++ ){
				System.out.print(j + " ");
			}
			System.out.println();
			for(int k = i; k>0;k--)
				System.out.print(" ");
		}
	}
}
