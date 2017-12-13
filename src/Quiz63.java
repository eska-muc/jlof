import jlof.core.LOF;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * See Selftest 6.3 of course Big Data Analytics (https://open.hpi.de/courses/bigdata2017/)
 */
public class Quiz63 {

    public static void main(String args[]) {

        ArrayList<double[]> data = new ArrayList<double[]>();
        data.add(new double[]{2,2});
        data.add(new double[]{2,5});
        data.add(new double[]{2,8});
        data.add(new double[]{3,7});
        data.add(new double[]{4,5});
        data.add(new double[]{4,9});
        data.add(new double[]{6,4});
        data.add(new double[]{8,4});
        data.add(new double[]{8,5});
        data.add(new double[]{9,5});
        data.add(new double[]{9,4});
        data.add(new double[]{9,3});

        LOF model = new LOF(data,LOF.Distance.MANHATTAN);
        int kNN = 3;

        double[] scores = model.getTrainingScores(kNN);
        for(int i = 0; i < scores.length; i++){
            System.out.println(i+1+"\t"+Arrays.toString(data.get(i)) + "\t" + scores[i]);
        }
    }
}