package Task_19;



public class Begin {
    public static void main(String[] args) {
        stringText str = new stringText( "Computer programming is a process that leads from an original" +
                " formulation of a computing problem to executable computer programs. Programming involves activities " +
                "such as analysis, developing understanding, generating algorithms, verification of requirements of " +
                "algorithms including their correctness and resources consumption, and implementation " +
                "of algorithms in a target programming language. Source code is written in one or more programming " +
                "languages. The purpose of programming is to find a sequence of instructions that will automate" +
                " performing a specific task or solving a given problem. The process of programming thus often " +
                "requires expertise in many different subjects, including knowledge of the application domain," +
                " specialized algorithms, and formal logic.");
        str.mostFrequentLetter();
        str.findLetterTense();
        str.countPunctuation();
        str.findLength();
        System.out.println();
        str.countWord("the");
        str.replaceChar(3);









    }



}
