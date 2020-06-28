public class FindGeneWhile {

    public static String findGene(String dna){
        int startIndex = dna.indexOf("ATG");
        int currIndex = dna.indexOf("TAA", startIndex+3);
        while (currIndex!=-1){
            if ((currIndex-startIndex)%3 == 0){
                return dna.substring(startIndex, currIndex+3);
            }
            else{
                currIndex = dna.indexOf("TAA",currIndex+3);

            }
        }

        return "";
    }
    public static void testFindGeneSimple(){
        String dna = "AATGCGTAATTAATCG";
        System.out.println("Dna strand is "+ dna);
        String gene = findGene(dna);
        System.out.println("Gene strand is "+ gene);

        dna = "AAATGCCCTAACTAGATTAAGAAACC";
       // dna = dna.toLowerCase();
        System.out.println("Dna strand is "+ dna);
        gene = findGene(dna);
        System.out.println("Gene strand is "+ gene);

        dna = "ATCTATGCGTAATATGGT";
        System.out.println("Dna strand is "+ dna);
        gene = findGene(dna);
        System.out.println("Gene strand is "+ gene);

        dna = "ATCTATCGTAATATGGT";
        System.out.println("Dna strand is "+ dna);
        gene = findGene(dna);
        System.out.println("Gene strand is "+ gene);


    }
    public static void main(String[] args) {
        testFindGeneSimple();
    }
}
