package org.comp455.a01dfa;

public interface Runner {
  /** Resets the machine to the initial state */
  void reset();

  /** Gets the current state of the machine */
  int getCurrentState();

  /** Transitions the machine according to a given symbol */
  void transition(char symbol);

  /** Transitions the machine according to a sequence of symbols provided as a String */
  void transition(String symbols);

  /** Returns true if and only if the machine is currently in an accepting state */
  boolean isInAcceptState();

  /**
   * Returns true if and only if the machine accepts the given String of symbols. This method should
   * reset the machine before applying the symbols
   */
  boolean accepts(String symbols);
}
