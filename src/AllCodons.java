public class AllCodons {
    public static int findStopCodon(String dnaStr, int startIndex, String stopCodon){
        int currIndex = dnaStr.indexOf(stopCodon,startIndex+3);
        while (currIndex!=-1){
            int diff = currIndex-startIndex;
            if (diff%3==0){
                return  currIndex;
            }
            else{
                currIndex = dnaStr.indexOf(stopCodon,currIndex+1);
            }
        }
        return dnaStr.length();
    }
    public static void testFindStop(){
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
        int dex = findStopCodon(dna,0,"TAA");
        if (dex!=9)
            System.out.println("error on 9");
        dex = findStopCodon(dna,9,"TAA");
        if (dex!=21)
            System.out.println("error on 21");
        dex = findStopCodon(dna,1,"TAA");
        if (dex!=26)
            System.out.println("error on 26");
        dex = findStopCodon(dna,0,"TAG");
        if (dex!=26)
            System.out.println("error on 26 TAG");
        System.out.println("Tests finished");
    }
    public static void main(String[] args) {
        testFindStop();

    }

}
