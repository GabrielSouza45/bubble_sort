public class BubbleSort {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        for (int i = 0; i< vetor.length; i++){
            vetor[i] = (int) (Math.random()*vetor.length);
            System.out.println(vetor[i]);
        }
        sort(vetor);

        System.out.println();
        for (int v: vetor){
            System.out.println(v);
        }
    }

    private static void sort(int[] vetor) {

        for (int i=0; i< vetor.length; i++){
            for (int j=i+1; j< vetor.length; j++){
                int val1 = vetor[i];
                int val2 = vetor[j];
                if (val1 > val2) {
                    vetor[i] = vetor[j];
                    vetor[j] = val1;
                }

            }
        }

    }
}
