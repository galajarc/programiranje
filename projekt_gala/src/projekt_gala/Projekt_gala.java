package projekt_gala;

import java.util.Scanner;
public class Projekt_gala {
    static int n;
    static double sum;
    static double sum1;
    static double stdev;
   
    
	public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
		System.out.print("Vnesite začetno leto: ");
		int lz = sc.nextInt();
		System.out.print("Vnesito končno leto: ");
		int lk = sc.nextInt();
		n = (lk-lz) +1;
            Podatki []p = new Podatki[n];
            for (int i=0;i<p.length;i++){
                p[i].beri();
            }
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Vnesite začetno leto: ");
		int lz = sc.nextInt();
		System.out.print("Vnesito končno leto: ");
		int lk = sc.nextInt();
		n = (lk-lz) +1;
		double t[] = new double[n]; //naredi tabelo, ki je dolga toliko kolikor je razpon let.
		for (int i=0;i<t.length;i++){
			System.out.print("Vnesite maksimalni pretok: ");
			t[i] = sc.nextDouble(); //uporabnik dodaja podatke v tabelo.
			sum += t[i]; //računa sum za pomoč pri izračunu povprečja.
		}
		double povp = sum/n; //izračuna x povprečno (srednja vrednost).
		double t1[] = new double[t.length];
		for (int i=0;i<t1.length;i++){
			t1[i]= Math.pow((t[i]-povp),2); //v tabelo zapiše (x[i]-xpovp)^2
			System.out.println(t1[i]); //izpiše vrednost (x[i]-xpovp)^2
                        sum1 += t1[i];
		}
                double stdev = Math.sqrt ((1/n)*sum1);
                System.out.print (stdev);
                System.out.print (1/n);
	}*/ new Podatki[];
    }
