import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class oblig1 {



    //Oppgave 1

        //Her viser jeg hvor mange ombyttinger det blir på en random liste og hvordan listen ser ut.
        //ombyttinger(randPerm(12));

        //Gjennomsnittet på antall ombyttinger i bubblesort er alltid n(n-1)/4
        //double gjennomsnitt = 6*(6-1)/4; //for en liste med 6 tall.

        // Antall ombyttninger vil være minst når verdiene i tabellen står i stigende rekkefølge.
        // Antallet ombyttninger vil være størst når verdiene i tabellen står i synkende rekkefølge.



    public static void bytt(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for (int k = n - 1; k > 0; k--){
            int i = r.nextInt(k+1);
            bytt(a,k,i);
        }

       

        return a;
    }

  static int maks(int[] a) {
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen er tom.");
        }

        int begin = 0;
        int end = a.length - 1;

        for (int i = begin; i < end; ++i) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }

        }
        int max = a[a.length - 1];
        return max;

    }

    public static int ombyttinger(int[] a) {
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen er tom.");
        }
        int begin = 0;
        int end = a.length - 1;
        int ombyttinger = 0;

        for (int i = begin; i < end; ++i) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                ombyttinger++;
            }

        }

        return ombyttinger;

    }



    //Oppgave 2


        //int [] a = {2,1,4,6,5,8};
      //  antallUlikeSortert(a);


    public static int antallUlikeSortert(int[] a){

        int differentValues = 0;

        if (a.length < 1) {
            return 0;
        } 
        else {
            differentValues = 1;

            for (int i = 0; i < a.length - 1; ++i){
                if (a[i] > a[i + 1]){
                    throw new IllegalStateException("Tabellen er ikke sortert stigende.");
                }
                if (a[i] != a[i + 1]){
                    differentValues++;
                }
            }
        }

        return differentValues;

    }

    //Oppgave 3



    //int[] a = {4,5,2,1,11,9,5,32};
       // antallUlikeUsortert(a);



    public static int antallUlikeUsortert(int[] a) {

        int temp;
        int differentValues = 0;

        if (a.length > 1) {
            differentValues = 1;

            for (int i = 0; i < a.length; ++i) {
                for (int j = i + 1; j < a.length; ++j) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for (int k = 0; k < a.length - 1; ++k){
                if (a[k] != a[k + 1]){
                    differentValues++;
                }
            }
        }
        for (int i = 0; i< a.length; ++i){
            System.out.print(a[i] + " ");
        }
        return differentValues;
    }


    //Oppgave 4


      public static void kvikkSortering(int[] a, int begin, int end) {

        if (a == null || a.length == 0) {
            return;
        }

        if (begin >= end) {
            return;
        }
        int middle = begin + (end - begin) / 2;
        int pivot = a[middle];

        int i = begin, j = end;
        while (i <= j) {

            while (a[i] < pivot) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }

            if (i <= j) {
                bytte(a, i, j);
                i++;
                j--;
            }
        }

        if (begin < j) {
            kvikkSortering(a, begin, j);
        }
        if (end > i) {
            kvikkSortering(a, i, end);
        }
    }
    
    public static void bytte(int array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }



  public static void delsortering(int[] a) {

        if (a.length < 1) {
            return;
        }
      
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            while ((a[left] % 2 == 1 && left < right)) {
                left++;
            }
            while (a[right] % 2 == 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        if (a[left] % 2 == 0) {
            kvikkSortering(a, 0, left - 1);
            kvikkSortering(a, left, a.length-1 );
        }
        else {
            kvikkSortering(a, 0, left);
            kvikkSortering(a, left + 1, a.length-1 );
        }
    }


    //Oppgave 5



        //char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H', 'I', 'J'};

        //rotasjon(a);



    public static void rotasjon(char[] a) {

        int n = 3;

        for (int i = 0; i < n; ++i){
            char lastValue = a[a.length - 1];

            for (int j = a.length - 1; j > 0; --j) {
                a[j] = a[j - 1];
            }
            a[0] = lastValue;
        }

       

    }


    //Oppgave 7
    
    // fikk ikke til denne oppgaven

  
}
