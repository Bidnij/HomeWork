import java.util.Random;


public class DisplayFunc {

    public static Random number = new Random();
    public static final int numbRandOne = number.nextInt(100);
    public static final int numbRandTwo = number.nextInt(100);
    public static final int numbRandThree = number.nextInt(5);
    public static final int numbRandFour = number.nextInt(4) + 1;
    public static final int numbRandFive = number.nextInt(100) - 50;
    public static final int numbRandSix = number.nextInt(200) - 100;
    public static final int timeHour = number.nextInt(24);
    public static Random randomweakday = new Random();
    public static final boolean weakday = randomweakday.nextBoolean();
    public static final boolean vacation = randomweakday.nextBoolean();
    public static final String word = "Helloworld";
    public static final String word2 = "hitexttext";
    public static final String word3 = "mixtext";
    public static final boolean randBoolOne = number.nextBoolean();
    public static final boolean randBoolTwo = number.nextBoolean();


    public static void main(String[] args) {
        System.out.println("Diff 21 = " + Diff21.diffResolution(numbRandOne));
        System.out.println("Near Hundred = " + NearHundred.nearHundredSolution(numbRandOne));
        SleepIn.sleapInInfo();
        MissingChar.misingCharResolution();
        BackAround.backAroundResolution();
        System.out.println("StartHi = " + StartHi.startHiResolution(word2));
        System.out.println("HasTeen = " + HasTeen.hasTeenResolution(numbRandOne, numbRandTwo, numbRandThree));
        System.out.println("MixStart = " + StartHi.startHiResolution(word3));
        System.out.println("Close10 " + Close10.close10(numbRandOne, numbRandThree));
        System.out.println("StringE = " + StringE.stringESolution(word));
        System.out.println("EveryNth = " + EveryNth.everyNthSolution(word, numbRandFour));
        System.out.println("monkeyTrouble = " + MonkeyTrouble.monkeyTroubleResolution(randBoolOne, randBoolTwo));
        System.out.println("ParrotTrouble = " + ParrotTrouble.parrotTroubleResolution(randBoolOne, timeHour));
        System.out.println("PosNeg = " + PosNeg.posNegSolution(numbRandFive, numbRandSix, randBoolOne));
        System.out.println("FrontBack = " + FrontBack.frontBackSolution(word));
        System.out.println("Or35 = " + Or35.or35Solution(numbRandOne));
        System.out.println("IcyHot = " + IcyHot.icyHotSolution(numbRandFive, numbRandSix));
        System.out.println("LoneTeen = " + LoneTeen.loneTeenSolution(numbRandOne, numbRandTwo));
        System.out.println("StartOz = " + StartOz.startOzSolution(word));
        System.out.println("In3050 = " + In3050.in3050Solution(numbRandOne, numbRandTwo));
        System.out.println("LastDigit = " + LastDigit.lastDigitSolution(numbRandOne, numbRandTwo));
        System.out.println("SumDouble = " + SumDouble.sumDoubleSolution(numbRandOne, numbRandTwo));
        System.out.println("Makes10 = " + Makes10.makes10Solution(numbRandOne, numbRandTwo));
        System.out.println("NotString = " + NotString.notStringSolution(word));
        System.out.println("Front3 = " + Front3.front3Solution(word));
        System.out.println("Front22 = " + Front22.front22Solution(word));
        System.out.println("In1020 = " + In1020.in1020Solution(numbRandOne, numbRandTwo));
        System.out.println("DelDel = " + DelDel.delDelSolution(word));
        System.out.println("IntMax = " + IntMax.intMaxSolution(numbRandOne,numbRandTwo,numbRandFive));
        System.out.println("Max1020 = " + Max1020.max1020Solution(numbRandOne, numbRandTwo));
        System.out.println("EndUp = " + EndUp.endUpSolution(word));
        System.out.println("HelloName = " + HelloName.helloNameSolution(word3));
        System.out.println("MakeAbba = " + MakeAbba.makeAbbaSolution(word, word3));
        System.out.println("MakeTags = " + MakeTags.makeTagsSolution(word3, word));
        System.out.println("MakeOutWord = " + MakeOutWord.makeOutWordSolution("<<>>", word));
        System.out.println("ExtraEnd = " + ExtraEnd.extraEndSolution(word));
        System.out.println("FirstTwo = " + FirstTwo.firstTwo(word));



    }


}
