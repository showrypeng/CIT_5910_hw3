import java.util.*;
import static java.lang.Math.sin;
import static java.lang.Math.PI;

public class Needle {
    private Random generator;

    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {
        int hits = 0;

        for (int i = 1; i <= totalDrops; i++){
            double y_low = generator.nextDouble(0,2);
            double alpha = generator.nextDouble(0,PI);
            double y_high = y_low + sin(alpha);

            if (y_high >= 2){
                hits += 1;
            }
        }

        if (hits==0){
            System.out.println("Oops! No hits!");
            return 0.0;
        }

        return (double) totalDrops/hits;
    }
}
