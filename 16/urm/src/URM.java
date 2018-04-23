package urm;

public class URM {

  // Executes the next instruction
  public void step() {
    // TODO: implement the steo of the URM
  }
  
  // Returns the current value of the PC
  public int getPC() {
    return pc;
  }
  
  // Returns the registers
  public Registers getRegisters() {
    return registers;
  }
  
  // Returns the program
  public Program getProgram() {
    return program;
  }
  
  private int pc = 1;
  private Program program;
  private Registers registers;
}
