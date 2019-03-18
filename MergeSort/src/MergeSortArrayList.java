import java.util.*;
public class MergeSortArrayList {

        public static void main(String args[]){
                ArrayList<Integer> arrL=new ArrayList<Integer>();
                arrL.add(47);
                arrL.add(17);
                arrL.add(23);
                arrL.add(67);
                arrL.add(21);
                System.out.println("Vector original List:");
                System.out.println(arrL);
                int vector[]=new int[arrL.size()];
                for(int i=0;i<vector.length;i++) {
                	vector[i]=arrL.get(i);
                }
                System.out.println("Vector original:");
                imprimirVector(vector);
                System.out.println("\nVector ordenado:");
                ordenacionMergeSort(vector);
                imprimirVector(vector);
                
        }
        
        public static void ordenacionMergeSort(int vec[]){
            if(vec.length<=1) return;
            int mitad= vec.length/2;
            int izq[]=Arrays.copyOfRange(vec, 0, mitad);
            int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
            ordenacionMergeSort(izq);
            ordenacionMergeSort(der);       
            combinarVector(vec, izq, der);
    }
    
    public static void combinarVector(int v[], int izq[],int der[]){
            int i=0;
            int j=0;
            for(int k=0;k<v.length;k++){
                    if(i>=izq.length){
                            v[k]=der[j];
                            j++;
                            continue;
                    }
                    if(j>=der.length){
                            v[k]=izq[i];
                            i++;
                            continue;
                    }
                    if(izq[i]<der[j]){
                            v[k]=izq[i];
                            i++;
                    }else{
                            v[k]=der[j];
                            j++;
                    }
            }
    }
        
        public static void imprimirVector(int vec[]){
            for(int i=0;i<vec.length;i++){
                    System.out.print(vec[i]+" ");
            }
    }
        
}