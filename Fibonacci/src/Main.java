public class Main {
    public static void main(String[] args) {
   /*
   Modify the Fibonacci application to store the sequence into an array and print the list of
   values at the end.
    */

        //number of elements to generate in a sequence
        int limit = 10;

        int[] sequence = new int[limit];

        //create first 2 sequence elements
        sequence[0] = 1;
        sequence[1] = 1;

        //create the Fibonacci sequence and store it into an array
        for(int i=2; i < limit; i++){

            sequence[i] = sequence[i-1] + sequence[i-2];
        }

        //print the Fibonacci sequence numbers
        System.out.println("Fibonacci Sequence upto " + limit);
        for (int i = 0; i < limit; i++) {
            System.out.print(sequence[i] + " ");
        }

        //Calculate the average value of an array elements
        double sum=0.0;
        for(int i=0; i < sequence.length ; i++){
            sum +=  sequence[i];
        }
        double average = sum/sequence.length;
        System.out.println("\nAverage value of array elements is : " + average);
    }
}
