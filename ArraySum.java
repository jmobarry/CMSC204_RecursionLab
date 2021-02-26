/**
 * @author John Mobarry
 */
public class ArraySum {

    private int result;

    public int sumOfArray(Integer[] a ,int index){

        if(index < 0){ result = 0;}
        else{
            result = a[index] + sumOfArray(a, index -1);
        }

        return result;
    }
}
