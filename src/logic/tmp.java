package logic;

import static logic.BCM.*;

/**
 *
 * @author Kuba
 */
public class tmp {

    public static void main(String[] args) {
        BCM bcm = new BCM();

        setA(10);
        setB(9.9);
        setC(0.1);
        setD(0.1);
        setE(9.9);
        setF(10);

        setBudget(50000);
        setCapacity(20);

        setHybrydizationFactor(0.5);
        setMutationFactor(0.05);

        setIterations(1000);
        setNumberOfIndividualsInIteration(100);

        bcm.generateProjects();
    }

}