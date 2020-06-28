public class FindGeneSimpleAndTest {

    public static String findGeneSimple(String dna){
        //start codon is ATG
        //stop codon is TAA
        String result = "";
        int startIndex =dna.indexOf("ATG");
        if (startIndex == -1){
            return  "";
        }
        int stopIndex = dna.indexOf("TAA",startIndex+3);
        if(stopIndex ==-1){
            return "";
        }
        result = dna.substring(startIndex,stopIndex+3);
        return result;
    }
    public static void testFindGeneSimple(){
        String dna = "AATGCTAACTAGCTGACTAAT";
        System.out.println("Dna strand is "+ dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene strand is "+ gene);

        dna = "AAATGCCCTAACTAGATTAAGAAACC";
        dna = dna.toLowerCase();
        System.out.println("Dna strand is "+ dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene strand is "+ gene);

        dna = "ATCTATGCGTAATATGGT";
        System.out.println("Dna strand is "+ dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene strand is "+ gene);

        dna = "ATCTATCGTAATATGGT";
        System.out.println("Dna strand is "+ dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene strand is "+ gene);

    }
    public static void main(String[] args) {
        testFindGeneSimple();

    }


}
