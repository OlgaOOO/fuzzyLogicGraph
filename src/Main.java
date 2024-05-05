import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class Main {
    //TODO test
//    public static void main(String[] args) {
//        // Load from 'FCL' file
//        String fileName = "/home/olga/Документы/ВГТУ/2 семестр/Недикова ТН - Нечёткие множества и нейронные сети/курсовая/fuzzyLogicTest/src/tipper.fcl";
//        FIS fis = FIS.load(fileName,true);
//        // Error while loading?
//        if( fis == null ) {
//            System.err.println("Can't load file: '"
//                    + fileName + "'");
//            return;
//        }
//
//        // Show
//        FunctionBlock functionBlock = fis.getFunctionBlock(null);
//        JFuzzyChart.get().chart(functionBlock);
//
//        // Set inputs
//        fis.setVariable("service", 8);
//        fis.setVariable("food", 7);
//
//        // Evaluate
//        fis.evaluate();
//
//        // Show output variable's chart
//        System.out.println("defuzzify:  " + fis.getVariable("tip").defuzzify());
//    }
    public static void main(String[] args) {
        // Load from 'FCL' file
        String fileName = "/home/olga/Документы/ВГТУ/2 семестр/Недикова ТН - Нечёткие множества и нейронные сети/курсовая/fuzzyLogicTest/src/" +
                "ruls.fcl";
        FIS fis = FIS.load(fileName,true);
        // Error while loading?
        if( fis == null ) {
            System.err.println("Can't load file: '"
                    + fileName + "'");
            return;
        }

        // Show
        FunctionBlock functionBlock = fis.getFunctionBlock(null);
        JFuzzyChart.get().chart(functionBlock);

        fis.setVariable("target", 1);
        fis.setVariable("months", 1);
        fis.setVariable("risk", 1);
        fis.setVariable("percent", 8);
        fis.evaluate();
        System.out.println("Скорый:  " + fis.getVariable("depositRecommendation").defuzzify());


        fis.setVariable("target", 4);
        fis.setVariable("months", 7);
        fis.setVariable("risk", 4);
        fis.setVariable("percent", 14);
        fis.evaluate();
        System.out.println("Трёхмесячный:  " + fis.getVariable("depositRecommendation").defuzzify());


        fis.setVariable("target", 7);
        fis.setVariable("months", 12);
        fis.setVariable("risk", 6);
        fis.setVariable("percent", 18);
        fis.evaluate();
        System.out.println("Годовой:  " + fis.getVariable("depositRecommendation").defuzzify());


        fis.setVariable("target", 8);
        fis.setVariable("months", 18);
        fis.setVariable("risk", 7);
        fis.setVariable("percent", 21);
        fis.evaluate();
        System.out.println("Полуторагодовой:  " + fis.getVariable("depositRecommendation").defuzzify());


        fis.setVariable("target", 10);
        fis.setVariable("months", 36);
        fis.setVariable("risk", 10);
        fis.setVariable("percent", 27);
        fis.evaluate();
        System.out.println("Долгосрочный:  " + fis.getVariable("depositRecommendation").defuzzify());
    }
}