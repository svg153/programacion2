package urm;

import java.util.ArrayList;

public class Program {
  // Creates the empty program
  public Program() {
  }

  // Adds a new instruction
  public void add(Instruction instruction) {
    int i =  instructions.size();
    instructions.add(i, instruction);
  }

  // Reads the instruction at the given line
  public Instruction read(int line) {
    return instructions.get(line - 1);
  }

  // Representation of the program
  private ArrayList<Instruction> instructions = new ArrayList<Instruction>();
}
