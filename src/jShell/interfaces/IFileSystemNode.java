// **********************************************************
// Assignment2:
// Student1:
// UTORID user_name: benhaimr
// UT Student #: 1006139830
// Author: Raz Ben Haim
//
// Student2:
// UTORID user_name: sharm697
// UT Student #: 1002352465
// Author: Sankalp Sharma
//
// Student3:
// UTORID user_name: voitovyc
// UT Student #: 1005735563
// Author: Oleksandr Voitovych
//
// Student4:
// UTORID user_name: meharch6
// UT Student #: 1003963570
// Author: Kevin Meharchand
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC B07 and understand the consequences.
// *********************************************************

package jShell.interfaces;

/**
 * Interface for abstract file system node class
 * 
 * @author Sasha (Oleksandr)
 */

public interface IFileSystemNode {

  /**
   * Returns name of FileSystemNode
   * 
   * @return String the name of node
   */
  public String getName();

  /**
   * Abstract method for checking whether a child exists in the FileSystemNode Actually implemented in
   * the Directory subclass
   * 
   */
  public abstract boolean ifChildExists(String name);

  /**
   * Sets the name of this FileSystemNode object
   * 
   * @param filename the name of the FileSystemNode that is to be created
   */
  public void setName(String name);

  public IPath getPath();

  public IFileSystemNode clone();

}
