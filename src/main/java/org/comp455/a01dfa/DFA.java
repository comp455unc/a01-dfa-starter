package org.comp455.a01dfa;

public interface DFA {
  /** Returns a (finite!) array of the symbols recognized by this machine */
  char[] getAlphabet();

  /** Returns a (finite!) array of the states in this machine */
  int[] getStates();

  /** Returns the initial state of this machine */
  int getStartState();

  /** Returns an array of the accepting states */
  int[] getAcceptingStates();

  /** Given a current state and an input symbol, returns the next state of this machine */
  int getTransition(int state, char symbol);

  /**
   * Given a symbol, this method simply looks up the symbol's index in the alphabet. If the
   * symbol doesn't appear in the alphabet, an IllegalArgumentException is thrown
   *
   * <p>You don't have to modify this method for the assignment, but you will need to use it when
   * writing code for the getTransition() method
   */
  default int lookup(char symbol) {
    char[] alphabet = getAlphabet();
    for (int i = 0; i < alphabet.length; i++) {
      if (symbol == alphabet[i]) {
        return i;
      }
    }
    throw new IllegalArgumentException("Symbol not in alphabet");
  }
}
