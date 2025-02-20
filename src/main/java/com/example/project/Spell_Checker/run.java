package com.example.project.Spell_Checker;

public class run {
    public static void main(String[] args) {
         SpellChecker checker = new SpellChecker();
        boolean result = checker.binarySpellCheck("frost");
        int loopCount = checker.getLoopCounter();
        System.out.println(result + " " +loopCount);
    }
}
